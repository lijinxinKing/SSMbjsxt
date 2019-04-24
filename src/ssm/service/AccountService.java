package ssm.service;

import ssm.pojo.Account;

import java.util.List;

public interface AccountService {
    int ACCOUNT_PASSWORD_NOT_MATCH = 1;
    int ACCOUNT_BALANCE_NOT_ENOUGH = 2;
    int ACCOUNT_NAME_NOT_MATCH = 3;
    int ACCOUNT_TRANF_FAILED = 4;
    int ACCOUNT_TRANF_SUCCED = 5;
    int transfer(Account in,Account out);
}
