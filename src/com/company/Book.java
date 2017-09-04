package com.company;

/**
 * Created by gcl713 on 2017/7/31.
 */
public class Book
{
    private String title;
    private float price;
    private Person person;
    public Book(String title,float price)
    {
        this.setTitle(title);
        this.setPrice(price);
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t)
    {
        title=t;
    }
    public float getPrice()
    {
        return price;
    }
    public void setPrice(float p)
    {
        price=p;
    }
    public Person getPerson()
    {
        return person;
    }
    public void setPerson(Person person)
    {
        this.person=person;
    }
}
