package com.company;

/**
 * Created by gcl713 on 2017/9/9.
 */
class A{
    public void fun1(){
        System.out.println("A -->public void fun1(){}");
    }
    public void fun2(){
        this.fun1();
    }
}

class B extends A{
    public void fun1(){
        System.out.println("B -->public void fun2() {}");
    }
    public void fun3(){
        System.out.println("B-->fun3");
    }
}

public class AA{
    /*public static void main(String[] args){
        B bb=new B();                                  //子类实例化
        A aa=bb;                                       //向上转型，子类-->父类
        aa.fun1();                                     //被子类覆写的方法
    }*/
    public static void main(String[] args)
    {
        A a=new B();                                   //向上转型
        B b=(B)a;                                      //向下转型
        b.fun1();
        b.fun3();
        b.fun2();
    }
}
