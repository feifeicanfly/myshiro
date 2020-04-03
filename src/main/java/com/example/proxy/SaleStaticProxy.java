package com.example.proxy;

/**
 * @description: TODO<静态代理类>
 * @author: Zhuojc
 * @create: 2020-04-03 14:50
 */
public class SaleStaticProxy implements SaleIntf{
    private SaleIntf shop;

    public SaleStaticProxy(SaleIntf shop){
        this.shop=shop;
    }
    @Override
    public void doSomething(){
        System.out.println("---静态代理执行前");
        shop.doSomething();
        System.out.println("静态代理执行后---");
    }
}