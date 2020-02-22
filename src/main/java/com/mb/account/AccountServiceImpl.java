package com.mb.account;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public void addAccount(Account account) {
        System.out.println("addAccount: " + account);
        accounts.add(account);
    }

    @Override
    public void removeAccount(Account account) {
        System.out.println("removeAccount: " + account);
        accounts.remove(account);
    }

    @Override
    public long getSize() {
        System.out.println("getSize: " + accounts.size());
        return accounts.size();
    }
}
