package com.mb.account;

public interface AccountService {

    void addAccount(Account account);

    void removeAccount(Account account);

    long getSize();
}
