package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: TODO<动态代理：中介类>
 * @author: Zhuojc
 * @create: 2020-04-03 14:58
 */
public class SaleDynamicProxy implements InvocationHandler {
    private Object obj;

    public SaleDynamicProxy(Object obj){
        this.obj=obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---动态代理执行前");
        Object  result=method.invoke(obj,args);
        System.out.println("动态代理执行后---");
        return result;
    }
}