package com.company;

/**
 * Created by gcl713 on 2017/9/21.
 */
class MyThread implements Runnable{
    public void run(){
        for (int i=0;i<3;i++)
        {
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}
public class ThreadAliveDemo01 {
    public static void main(String[] args){
        MyThread mt=new MyThread();
        Thread t=new Thread(mt,"A");
        System.out.println("before"+t.isAlive());
        t.start();
        System.out.println("after"+t.isAlive());
        for (int i=0;i<3;i++){
            System.out.println(i);
        }
        System.out.println("after"+t.isAlive());
    }
}
