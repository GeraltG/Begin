package com.company;

/**
 * Created by gcl713 on 2017/9/5.
 */
public class Outer
{
    private String info ="hello world";
    class Inner {
        public void print()
        {
            System.out.println(info);
        }
    }
};


