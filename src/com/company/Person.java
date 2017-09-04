package com.company;

/**
 * Created by gcl713 on 2017/7/18.
 */
public class Person
{
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.setName(name);
        this.setAge(age);
    }
    public boolean compare(Person per)
    {
        Person p1=this;
        Person p2=per;
        if (p1==p2)
        {
            return true;
        }
        if (p1.name.equals(p2.name) && p1.age==p2.age)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age=a;
    }

}


