package com.vbc.productreview.ui;

import com.vbc.productreview.model.Product;
import com.vbc.productreview.model.Review;
import com.vbc.productreview.model.User;
import com.vbc.productreview.service.ProductService;
import com.vbc.productreview.service.ReviewService;
import com.vbc.productreview.service.UserService;

// ProductReviewSystemDemo class to call particular service, capture and display details via console
public class ProductReviewSystemDemo {

    public static void main(String[] args) {
        // Creating object and call particular service
        UserService userService = new UserService();
        User user = userService.addUser();

        ProductService productService = new ProductService();
        Product product = productService.addProduct();

        ReviewService reviewService = new ReviewService();
        Review review = reviewService.addReview();

        // Displaying the User, Product, Review Details on console
        System.out.println("User Details : "+user);
        System.out.println("Product Details : "+product);
        System.out.println("Review Details : "+review);
    }

}
