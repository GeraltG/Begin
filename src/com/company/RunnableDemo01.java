package com.company;

/**
 * Created by gcl713 on 2017/9/19.
 */

class MyTheard implements Runnable{
    private String name;
    public MyTheard(String name){
        this.name=name;
    }
    public void run(){
        for (int i=0;i<10;i++)
        {
            System.out.println(name);
        }
    }
}

public class RunnableDemo01 {
    public static void main(String[] args){
        MyTheard my1=new MyTheard("A");
        MyTheard my2=new MyTheard("B");
        Thread t1=new Thread(my1);
        Thread t2=new Thread(my2);
        t1.start();
        t2.start();
    }
}
