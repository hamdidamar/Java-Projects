/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.dataaccesslayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.software.hamdidamar.core.ObjectHelper;
import tr.software.hamdidamar.entity.KategoriContract;
import tr.software.hamdidamar.interfaces.dataaccesslayerInterfaces;


public class KategoriDAL extends ObjectHelper implements dataaccesslayerInterfaces<KategoriContract>{

    @Override
    public void Insert(KategoriContract entity) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Tbl_Kategori(KategoriAd,KategoriParentId))"
                    + "VALUES('"+entity.getKategoriAd()+"',"+entity.getKategoriParentId()+")");
                    statement.close();
                    connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(KategoriDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<KategoriContract> GetAll() {
        List<KategoriContract> dataKategoricontracts = new ArrayList<KategoriContract>();
        
        Connection connection = getConnection();
        KategoriContract contract;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Tbl_Kategori");
            while (resultSet.next()) {
                contract = new KategoriContract();
                contract.setKategoriId(resultSet.getInt("KategoriId"));
                contract.setKategoriAd(resultSet.getString("KategoriAd"));
                contract.setKategoriParentId(resultSet.getInt("KategoriParentId"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dataKategoricontracts;
    }

    @Override
    public KategoriContract Delete(KategoriContract entity) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(KategoriContract entity) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KategoriContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
