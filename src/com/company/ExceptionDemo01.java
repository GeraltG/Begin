package com.company;

/**
 * Created by gcl713 on 2017/9/12.
 */
public class ExceptionDemo01 {
    public static void main(String[] args){
        System.out.println("*****************************************************");
        int i=10;
        int j=0;
        try{
            int temp=i/j;
            System.out.println("result"+temp);
            System.out.println("------------");
        }catch(ArithmeticException e){
            System.out.println("异常出现"+e);
        }finally {
            System.out.println("whaterver ");
        }
        System.out.println("*******************************************");
    }
}
