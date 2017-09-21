package com.company;

/**
 * Created by gcl713 on 2017/9/21.
 */
class MyTheard implements Runnable{
    public void run(){
        System.out.println("1,进入run方法");
        try{
            Thread.sleep(10000);
            System.out.println("2.已完成休眠");
        }catch(Exception e){
            System.out.println("3.休眠终止");
            return;
        }
        System.out.println("正常结束");
    }
}

public class ThreadInterruptDemo {
    public static void main(String[] args){
        MyTheard mt=new MyTheard();
        Thread t=new Thread(mt,"xiancheng");
        t.start();
        try{
            Thread.sleep(2000);
        }catch(Exception e){
        }
        t.interrupt();
    }
}
