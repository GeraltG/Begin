package com.company;

/**
 * Created by gcl713 on 2017/9/21.
 */
class Mythread implements Runnable{
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}

public class ThreadNmaeDemo01 {
    public static void main(String[] args){
        Mythread my=new Mythread();
        new Thread(my).start();
        new Thread(my,"A").start();
        new Thread(my,"B").start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
