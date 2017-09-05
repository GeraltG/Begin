package com.company;

/**
 * Created by gcl713 on 2017/9/5.
 */
public class Demo01 {
    public static void main(String args[])
    {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        s1.print();
        s2.print();
        s3.print();
    }
}
