package com.company;

/**
 * Created by gcl713 on 2017/9/12.
 */
public class ExceptionDemo02 {
    public static void main(String[] args){
        System.out.println("************************************");
        int i=0;
        int j=0;
        try{
            String str1=args[0];
            String str2=args[1];
            i=Integer.parseInt(str1);
            j=Integer.parseInt(str2);
            int temp=i/j;
            System.out.println("Result"+temp);
            System.out.println("----------------");
        }catch(ArithmeticException e)
        {
            System.out.println(e+"算数异常");
        }
        catch(NumberFormatException e){
            System.out.println(e+"数字转换异常");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e+"数组越界异常");
        }
        System.out.println("*********************************");
    }

}
