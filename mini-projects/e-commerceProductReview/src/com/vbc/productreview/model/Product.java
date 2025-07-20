package com.vbc.productreview.model;

// Product model class with fields and Use toString() helps convert object data into a clean string for meaningful output
public class Product {

    public int id;
    public String name;
    public double price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
