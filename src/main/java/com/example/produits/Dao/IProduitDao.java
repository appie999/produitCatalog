package com.example.produits.Dao;

import com.example.produits.model.Produit;

import java.sql.SQLException;
import java.util.List;

public interface IProduitDao {
    public Produit save(Produit p) throws SQLException;
    public List<Produit> produitsParMC(String MC);
    public Produit getProduit(Long id);
    public Produit update(Produit p);
    public void delete(long id);
}
