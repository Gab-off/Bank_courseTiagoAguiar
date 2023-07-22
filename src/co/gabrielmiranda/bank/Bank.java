package co.gabrielmiranda.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String ag;
    private List<Account> accounts;
    private int lastAccount = 1;

    public Bank(String ag) {
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public Account generateAccount(String name) {
        Account account = new Account(ag, "" + lastAccount, name);
        lastAccount++;
        return account;
    }

}
