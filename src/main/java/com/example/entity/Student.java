package com.example.entity;

import lombok.Data;

/**
 * @description: TODO<简单的实体类>
 * @author: Zhuojc
 * @create: 2020-04-03 09:46
 */
@Data
public class Student {
    private String name;
    private Long  serial;
    private int age;
    private boolean access;

    public  String name1="name1";

    private void m1(){
        System.out.println("私有");
    }

    public  void m2(){
        System.out.println("公有");
    }
}