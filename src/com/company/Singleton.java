package com.company;

/**
 * Created by gcl713 on 2017/9/5.
 */
public class Singleton
{
    static Singleton instance=new Singleton();
    private Singleton() {}
    public void print() {
        System.out.println("Hello World!");
    }
    public static Singleton getInstance()
    {
        return instance;
    }
}
