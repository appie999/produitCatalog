package com.example.produits.Dao;

import com.example.produits.model.Produit;

import java.util.List;

public class ProduitDaoImp implements IProduitDao {
    @Override
    public Produit save(Produit p) {
        return null;
    }

    @Override
    public List<Produit> produitsParMC(String MC) {
        return List.of();
    }

    @Override
    public Produit getProduit(Long id) {
        return null;
    }

    @Override
    public Produit update(Produit p) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
