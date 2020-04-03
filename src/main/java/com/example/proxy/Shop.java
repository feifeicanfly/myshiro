package com.example.proxy;

/**
 * @description: TODO<委托类：店家>
 * @author: Zhuojc
 * @create: 2020-04-03 14:43
 */
public class Shop implements SaleIntf {
    @Override
    public void doSomething(){
        System.out.println("我是委托，我要销售");
    }
}