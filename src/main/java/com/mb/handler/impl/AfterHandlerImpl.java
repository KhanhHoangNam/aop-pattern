package com.mb.handler.impl;

import com.mb.handler.AfterHandler;

import java.lang.reflect.Method;

/**
 * This class provides an implementation of business logic which will be
 * executed after the actual method execution.
 */
public class AfterHandlerImpl extends AfterHandler {
    @Override
    public void handlerAfter(Object proxy, Method method, Object[] args) {
        // Provide your own cross cutting concern
        System.out.println("Handling after actual method execution");
        System.out.println("---");
    }
}
