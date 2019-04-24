package ssm.servlet;

import ssm.pojo.Account;
import ssm.service.AccountService;
import ssm.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/transfer")
public class TransferServlet extends HttpServlet {
    private AccountService accountService = new AccountServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account account = new Account();
        account.setAccno(Integer.parseInt(req.getParameter("accOutAccNo")));

        Account accIn = new Account();
        accountService.transfer(accIn, account);

    }
}
