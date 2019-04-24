package ssm.service.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import ssm.pojo.Account;
import ssm.service.AccountService;

import java.io.IOException;
import java.io.InputStream;

public class AccountServiceImpl implements AccountService {

    @Override
    public int transfer(Account in, Account out) {

        try
        {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is);
            SqlSession session =  factory.openSession();

            Account accOutSelect = session.selectOne("a.m.selByPas", out);
            if(accOutSelect!=null){
                // 判断余额
                if(accOutSelect.getBalance()>=out.getBalance()){
                   Account accInSelect =  session.selectOne("a.m.selByName",in);
                   if(accInSelect!=null){

                       out.setBalance(-out.getBalance());
                       int index = session.update("a.m.updBalanceByAccno", out);
                       index  += session.update("a.m.updBalanceByAccno", in);
                       if(index == 2){
                           session.commit();
                           session.close();
                           return ACCOUNT_TRANF_SUCCED;
                       }else {
                           session.rollback();
                           session.close();
                           return ACCOUNT_TRANF_FAILED;
                       }
                   }else {
                       System.out.println("账户密码不匹配");
                       return ACCOUNT_NAME_NOT_MATCH;
                   }
                }else
                {
                    System.out.println("余额不足");
                    return ACCOUNT_BALANCE_NOT_ENOUGH;
                }
            }else {
                System.out.println("账户密码不匹配");
                return ACCOUNT_PASSWORD_NOT_MATCH;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
