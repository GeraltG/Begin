package com.company;

/**
 * Created by gcl713 on 2017/9/11.
 */

abstract class A{
    public abstract void print();
}

class B extends A{
    public void print(){
        System.out.println("sadfsa");
    }
}

public class Demo06 {
    public static void main(String[] args){
        A a=new B();
        a.print();
    }
}
