package com.company;

/**
 * Created by gcl713 on 2017/9/16.
 */

class Math{
    public int div(int i,int j) throws Exception{
        int temp=i/j;
        return temp;
    }
}


//在主方法使用try...catch...语句进行异常捕获
/*public class ThrowsDemo01 {
    public static void main(String[] args){
        Math m=new Math();
        try{
            System.out.println(m.div(10,2));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}*/

public class ThrowsDemo01{
    public static void main(String[] args) throws Exception{
        Math m=new Math();
        System.out.println(m.div(10,0));
    }
}
