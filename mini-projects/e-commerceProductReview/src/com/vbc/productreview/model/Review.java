package com.vbc.productreview.model;

// Review model class with fields and Use toString() helps convert object data into a clean string for meaningful output
public class Review {

    public int id;
    public String heading;
    public String description;
    public int rating;

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
