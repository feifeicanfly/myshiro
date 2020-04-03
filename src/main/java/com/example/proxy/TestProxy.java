package com.example.proxy;

import java.lang.reflect.Proxy;

/**
 * @description: TODO<尽量简短描述其作用>
 * @author: Zhuojc
 * @create: 2020-04-03 14:55
 */
public class TestProxy {
  public static void main(String[] args) {
    testStaticProxy();
    testDynamicProxy();
  }

  //静态代理
  public static void testStaticProxy(){
    SaleStaticProxy proxy=new SaleStaticProxy(new Shop());
    proxy.doSomething();
  }

  //动态代理
  public static  void testDynamicProxy(){
    //创建中介类实例
    SaleDynamicProxy inter=new SaleDynamicProxy(new Shop());

    //将JDK动态代理生成的class文件保存到本地
    //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
    System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

    //获取代理类实例SaleIntf
    SaleIntf saleIntf = (SaleIntf)(Proxy.newProxyInstance(SaleIntf.class.getClassLoader(), new Class[] {SaleIntf.class}, inter));

    //通过代理类对象调用代理类方法，实际上会转到invoke方法调用
    saleIntf.doSomething();
  }
}