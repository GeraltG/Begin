package com.company;

/**
 * Created by gcl713 on 2017/9/9.
 */

class A{
    public void fun1()
    {
        System.out.println("aaaaaaafun1");
    }
    public void fun2()
    {
        this.fun1();
    }
}

class B extends A{
    public void fun1()
    {
        System.out.println("bbbbbbbbbbbbbbfun1");
    }
    public void fun3()
    {
        System.out.println("bbbbbbbbbbbbbbbbfun3");
    }
}

class C extends A{
    public void fun1(){
        System.out.println("cccccccccccccccccccccfun1");
    }
    public void fun5() {
        System.out.println("ccccccccccccccccccccccccccccccfun5");
    }
}

public class Demo05 {
    public static void main(String[] args)
    {
        fun(new B());
        fun(new C());
    }
    public static void fun(B b)
    {
        b.fun1();
    }
    public static void fun(C c)
    {
        c.fun1();
    }
}
