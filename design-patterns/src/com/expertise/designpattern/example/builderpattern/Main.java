package com.expertise.designpattern.example.builderpattern;

public class Main {
    public static void main(String[] args) {
        LoanApplication loan = new LoanApplication.Builder("Vishal Chothe", 50000)
                .tenureMonths(24)
                .interestRate(9.5)
                .employmentType("Self-Employed")
                .documentProof("PAN Card")
                .build();

        System.out.println(loan);
    }
}
