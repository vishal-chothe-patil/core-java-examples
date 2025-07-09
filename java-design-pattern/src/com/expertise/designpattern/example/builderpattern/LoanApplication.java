package com.expertise.designpattern.example.builderpattern;

public class LoanApplication {
    // required fields
    private final String applicantName;
    private final double amount;

    // optional fields
    private final int tenureMonths;
    private final double interestRate;
    private final String employmentType;
    private final String documentProof;

    // Private constructor to enforce use of builder
    private LoanApplication(Builder builder) {
        this.applicantName = builder.applicantName;
        this.amount = builder.amount;
        this.tenureMonths = builder.tenureMonths;
        this.interestRate = builder.interestRate;
        this.employmentType = builder.employmentType;
        this.documentProof = builder.documentProof;
    }

    // Getters (if needed)
    public String getApplicantName() {
        return applicantName;
    }

    public double getAmount() {
        return amount;
    }

    public int getTenureMonths() {
        return tenureMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public String getDocumentProof() {
        return documentProof;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "applicantName='" + applicantName + '\'' +
                ", amount=" + amount +
                ", tenureMonths=" + tenureMonths +
                ", interestRate=" + interestRate +
                ", employmentType='" + employmentType + '\'' +
                ", documentProof='" + documentProof + '\'' +
                '}';
    }

    // Static inner builder class
    public static class Builder {
        private final String applicantName;
        private final double amount;
        private int tenureMonths = 12;         // default
        private double interestRate = 10.5;     // default
        private String employmentType = "Salaried";
        private String documentProof = "Aadhaar";

        public Builder(String applicantName, double amount) {
            this.applicantName = applicantName;
            this.amount = amount;
        }

        public Builder tenureMonths(int tenureMonths) {
            this.tenureMonths = tenureMonths;
            return this;
        }

        public Builder interestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder employmentType(String employmentType) {
            this.employmentType = employmentType;
            return this;
        }

        public Builder documentProof(String documentProof) {
            this.documentProof = documentProof;
            return this;
        }

        public LoanApplication build() {
            return new LoanApplication(this);
        }
    }
}
