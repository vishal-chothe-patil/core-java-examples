package com.vbc.productreview.service;


import com.vbc.productreview.model.Product;

import java.util.Scanner;

// ProductService class for taking product details from user input and to store product details
public class ProductService {
    Scanner scanner = new Scanner(System.in);

    public Product addProduct(){
        System.out.println("Enter Product Details: ");

        System.out.println("\nEnter Product ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("\nEnter Product Name: ");
        String name = scanner.nextLine();

        System.out.println("\nEnter Product Price: ");
        double price = scanner.nextDouble();

        // Creating Product objects to store product details
        Product product = new Product();
        product.id = id;
        product.name = name;
        product.price = price;

        return product;
    }
}
