package com.company;

/**
 * Created by gcl713 on 2017/9/9.
 */
interface A {
    void print();
}

abstract class AC{
    public abstract void print();
}

class AS extends AC implements A{
    public void print()
    {
        System.out.println("hello world");
    }
}

public class AA{
    public static void main(String args[])
    {
        AS as=new AS();
        as.print();
    }
}
