package com.company;

import java.util.Objects;


public class Main
{
    public static void main(String[] args)
    {
        Person per1=new Person();
        Person per2=new Person();
        System.out.println(per1);
        per1.getInfo();
        System.out.println("--------------------------------");
        System.out.println(per2);
        per2.getInfo();
    }


}
