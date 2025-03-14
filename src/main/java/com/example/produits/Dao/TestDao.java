package com.example.produits.Dao;

import com.example.produits.model.Produit;

import java.sql.SQLException;

public class TestDao {
    public static void main(String[] args) throws SQLException {
        ProduitDaoImp dao = new ProduitDaoImp();
        Produit produit1 = dao.save(new Produit("laptop HP",22,40));
        Produit produit2 = dao.save(new Produit("dell",50,20));
        System.out.println(produit1.toString());
        System.out.println(produit2.toString());
    }

}
