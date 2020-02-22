package com.mb.handler.impl;

import com.mb.handler.BeforeHandler;

import java.lang.reflect.Method;

/**
 * This class provides implementation before actual execution of method.
 */
public class BeforeHandlerImpl extends BeforeHandler {
    @Override
    public void handleBefore(Object proxy, Method method, Object[] args) {
        // Provide your own cross cutting concern
        System.out.println("Handling before actual method execution");
    }
}
