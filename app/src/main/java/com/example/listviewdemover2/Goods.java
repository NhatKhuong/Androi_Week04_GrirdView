package com.example.listviewdemover2;

public class Goods {
    private String description;
    private int ratingcount;
    private double price;
    private double discount;
    private int imgGoods;

    public Goods(String description, int ratingcount, double price, double discount, int imgGoods) {
        this.description = description;
        this.ratingcount = ratingcount;
        this.price = price;
        this.discount = discount;
        this.imgGoods = imgGoods;
    }

    public String getDescription() {
        return description;
    }

    public int getRatingcount() {
        return ratingcount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getImgGoods() {
        return imgGoods;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRatingcount(int ratingcount) {
        this.ratingcount = ratingcount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setImgGoods(int imgGoods) {
        this.imgGoods = imgGoods;
    }
}
