package com.example.reflect;

import com.example.entity.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description: TODO<尽量简短描述其作用>
 * @author: Zhuojc
 * @create: 2020-04-03 09:48
 */
public class TestReflect {
  public static void main(String[] args) throws  Exception{
      Student s=new Student();
      Class c=s.getClass();
      System.out.println(c);

      //打印所有方法
      Method[] methods=c.getDeclaredMethods();
      for(Method m:methods){
          System.out.println(m);
      }

      //调用具体的方法
      Method m1=c.getDeclaredMethod("m1");
      m1.setAccessible(true);
      m1.invoke(s,null);


      //打印所有公共的属性(获取不了私有的属性)
      Field[] fields=c.getFields();
      for(Field f:fields){
          //System.out.println(f);
      }

      //获取私有属性
      Field field=c.getDeclaredField("name");
      field.setAccessible(true);
      field.set(s,"那么");

      System.out.println(s);
  }
}