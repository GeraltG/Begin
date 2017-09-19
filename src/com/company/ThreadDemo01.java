package com.company;

/**
 * Created by gcl713 on 2017/9/19.
 */
class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name=name;
    }
    public void run(){
        for (int i=0;i<10;i++)
        {
            System.out.println(name);
        }
    }
}
public class ThreadDemo01 {
    public static void main(String[] args){
        MyThread mt1=new MyThread("A");
        MyThread mt2=new MyThread("B");
        mt1.start();
        mt2.start();
    }
}
