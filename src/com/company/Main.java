package com.company;

import java.util.Objects;


public class Main
{
    public static void main(String[] args)
    {
        Person per1=new Person("张三",30);
        Person per2=new Person("张三",30);
        if (per1.compare(per2))
        {
            System.out.println("两个相等");
        }
        else
        {
            System.out.println("buxiasngsadgfasdfas");
        }
    }


}
