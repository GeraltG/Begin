package com.company;

/**
 * Created by gcl713 on 2017/9/19.
 */

class MyThread implements Runnable{
    private int ticket =5;
    public void run(){
        for (int i=0;i<100;i++)
        {
            if (ticket>0){
                System.out.println(ticket-- );
            }
        }
    }
}

public class ThreadDemo02 {
    public static void main(String[] args){
        MyThread my=new MyThread();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();

    }
}
