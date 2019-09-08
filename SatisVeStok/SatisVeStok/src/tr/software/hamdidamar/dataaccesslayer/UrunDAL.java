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
import tr.software.hamdidamar.interfaces.dataaccesslayerInterfaces;
import org.omg.IOP.ENCODING_CDR_ENCAPS;


/**
 *
 * @author hmdmr
 */
public class UrunDAL<UrunContract> extends ObjectHelper implements dataaccesslayerInterfaces<UrunContract> {

    @Override
    public void Insert(UrunContract entity) {
       
        Connection connection = getConnection();
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Tbl_Urun(UrunAd,UrunKategoriId,UrunTarih,UrunFiyat)"
                    +"VALUES('"+entity.getUrunAd()+"',"+entity.getKategoriId()+",'"+entity.getUrunTarih()+"',"+entity.getFiyat()+")");
            statement.close();
            statement.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(UrunDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<UrunContract> GetAll() {
        List<UrunContract> dataUruncontracts = new ArrayList<UrunContract>();
        
        Connection connection = getConnection();
        UrunContract contract;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Tbl_Urun");
            while (resultSet.next()) {
                contract = new UrunContract();
                contract.setUrunId(resultSet.getInt("UrunId"));
                contract.setUrunAd(resultSet.getString("UrunAd"));
                contract.setUrunKategoriId(resultSet.getString("UrunKategoriId"));
                contract.setUrunTarih(resultSet.getString("UrunTarih"));
                contract.setUrunFiyat(resultSet.getString("UrunFiyat"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UrunDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dataUruncontracts;
    }

    @Override
    public UrunContract Delete(UrunContract entity) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(UrunContract entity) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UrunContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
