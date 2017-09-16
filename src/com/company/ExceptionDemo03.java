package com.company;


import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by gcl713 on 2017/9/15.
 */
public class ExceptionDemo03 {
    public static void main(String[] args){
        System.out.println("***********************************");
        int i=0;
        int j=0;
        try{
            String str1=args[0];
            String str2=args[1];
            i=Integer.parseInt(str1);
            j=Integer.parseInt(str2);
            int temp=i/j;
            System.out.println("result"+temp);
            System.out.println("**************************************");
        }catch (ArithmeticException e){
            System.out.print("AR"+e);
        }
        catch (NumberFormatException e){
            System.out.print("NU"+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("OU"+e);
        }catch (Exception e){
            System.out.print("oth"+e);
        }
    }
}
