package com.company;

/**
 * Created by gcl713 on 2017/9/12.
 */

class Person{
    private String name;
    private String addr;
    private char sex;
    private int age;
    public Person(){};
    public Person(String name,String addr){
        this.name=name;
        this.addr=addr;
    }
    public Person(String name,String addr,char sex,int age) {
        this.name = name;
        this.addr = addr;
        this.sex = sex;
        this.age = age;
    }
    public void Print(){
        System.out.println("\t"+name+"\t"+addr+"\t"+sex+"\t"+age);
    }
}

class Student extends Person{
    double math;
    double english;
    public Student(double math,double english)
    {
        this.english=english;
        this.math=math;
    }
    public Student(String name,String addr,char sex,int age,double math,double english){
        super(name,addr,sex,age);
        this.math=math;
        this.english=english;
    }
    public Student(){};
    public void Print(){
        super.Print();
        System.out.println("\t"+math+"\t"+english);
    }
}

public class TestMain {
    public static void main(String args[]){
        Student s=new Student("a","a",'s',18,16,18);
        s.Print();

    }
}
