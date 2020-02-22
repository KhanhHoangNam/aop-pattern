package com.mb.handler;

import java.lang.reflect.Method;

public abstract class AfterHandler extends AbstractHandler {
    /**
     * Handles the execution of method;
     * @param proxy proxy
     * @param method method
     * @param args args
     */
    public abstract void handlerAfter(Object proxy, Method method, Object[] args);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(getTargetObject(), args);
        handlerAfter(proxy, method, args);
        return result;
    }
}
