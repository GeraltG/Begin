package com.company;

/**
 * Created by gcl713 on 2017/9/5.
 */
public class Demo02 {
    public static void main(String args[])
    {
            Outer out=new Outer();
            Outer.Inner in=out.new Inner();
            in.print();
    }
}
