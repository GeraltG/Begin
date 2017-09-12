package com.company;

/**
 * Created by gcl713 on 2017/9/12.
 */

interface A{
    public void printInfo();
}

class X{
    public void fun1(){
        this.fun2(new A()
        {
            public void printInfo(){
                System.out.println("adwsfsadfsa");
            }
        });
    }

    public void fun2(A a){
        a.printInfo();
    }
}

public class InnerDemo {
    public static void main(String args[]){
        new X().fun1();
    }
}
