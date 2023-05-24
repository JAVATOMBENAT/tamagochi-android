package com.example.myapplication;

public class Consomable {
    private String name;
    private double price;

    private String imgName;
    public Consomable(String name , double price, String imgName)
    {
        this.name = name;
        this.price = price;
        this.imgName = imgName;

    }
    public String getName()
    {
        return this.name;
    }
    public double getPrice ()
    {
        return this.price;
    }

    public String getImgName(){return this.imgName; }
}