package com.example.produits.model;

import java.io.Serializable;

public class Produit implements Serializable {

    private Long id;
    private String designation;
    private double price;
    private int quantity;

    public Produit() {
    }
    public Produit(Long id, String designation, double price, int quantity) {
        this.id = id;
        this.designation = designation;
        this.price = price;
        this.quantity = quantity;
    }

    public Produit(String laptopHp, int i, int i1) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}