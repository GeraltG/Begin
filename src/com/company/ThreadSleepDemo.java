package com.company;

/**
 * Created by gcl713 on 2017/9/21.
 */

class MyTheard implements Runnable{
    public void run(){
        for (int i=0;i<5;i++)
        {
            try{
                Thread.sleep(500);
            }catch (Exception e){}
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args){
        MyTheard mt=new MyTheard();
        new Thread(mt,"xaincheng").start();
    }
}
