package com.mb;

import com.mb.account.Account;
import com.mb.account.AccountService;
import com.mb.account.AccountServiceImpl;
import com.mb.handler.AbstractHandler;
import com.mb.handler.ProxyFactory;
import com.mb.handler.impl.AfterHandlerImpl;
import com.mb.handler.impl.BeforeHandlerImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author khanhhm.os
 * This class to verify an AOP example using JDK proxy.
 */
public class AspectOrientedProgrammingInJdkExample {
    public static void main(String[] args) {
        List<AbstractHandler> handlers = new ArrayList<>();
        handlers.add(new BeforeHandlerImpl());
        handlers.add(new AfterHandlerImpl());

        AccountService proxy = (AccountService) ProxyFactory.getProxy(new AccountServiceImpl(), handlers);
        Account account = new Account("KhanhHN", "USD", 1000000);
        proxy.addAccount(account);
        proxy.getSize();
        proxy.removeAccount(account);
        proxy.getSize();
    }
}
