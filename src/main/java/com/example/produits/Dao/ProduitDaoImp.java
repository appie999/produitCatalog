package com.example.produits.Dao;

import com.example.produits.model.Produit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProduitDaoImp implements IProduitDao {
    @Override
    public Produit save(Produit p) throws SQLException {
        Connection connection = SingletonConnection.getConnection();
        String sql = "insert into produit(designation,prix,quantity) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, p.getDesignation());
        preparedStatement.setDouble(2, p.getPrice());
        preparedStatement.setInt(3, p.getQuantity());
        preparedStatement.executeUpdate();
        PreparedStatement preparedStatement2 = connection.prepareStatement("select MAX(ID) AS MAXID from produit");
        ResultSet res = preparedStatement2.executeQuery();
        if (res.next()) {
            p.setId(res.getLong("MAXID"));
        }
        preparedStatement.close();
        return null;
    }

    @Override
    public List<Produit> produitsParMC(String MC) {
        return List.of();
    }

    @Override
    public Produit getProduit(Long id) {
        Connection connection = SingletonConnection.getConnection();
        String sql = "select * from produits where ID=?";

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
