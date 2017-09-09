package com.company;

/**
 * Created by gcl713 on 2017/9/9.
 */
abstract class A {
    public static final String FLAG="CHINA";
    private String name="lihua";
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public abstract void print();
}
