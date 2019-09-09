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
import tr.software.hamdidamar.entity.MusteriContract;
import tr.software.hamdidamar.interfaces.dataaccesslayerInterfaces;

/**
 *
 * @author hmdmr
 */
public class MusteriDAL extends ObjectHelper implements dataaccesslayerInterfaces<MusteriContract>{

    @Override
    public void Insert(MusteriContract entity) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Tbl_Musteri(MusteriAdSoyad,MusteriTelefon,MusteriAdres,MusteriSehirId))"
                    + "VALUES('"+entity.getMusteriAdSoyad()+"','"+entity.getMusteriTelefon()+"','"+entity.getMusteriAdres()+"',"+entity.getMusteriSehirId()+")");
                    statement.close();
                    connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MusteriDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<MusteriContract> GetAll() {
        List<MusteriContract> dataMusteriContracts = new ArrayList<MusteriContract>();
        
        Connection connection = getConnection();
        MusteriContract contract;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Tbl_Musteri");
            while (resultSet.next()) {
                contract = new MusteriContract();
                contract.setMusteriId(resultSet.getInt("MusteriId"));
                contract.setMusteriAdSoyad(resultSet.getString("MusteriAdSoyad"));
                contract.setMusteriTelefon(resultSet.getString("MusteriTelefon"));
                contract.setMusteriAdres(resultSet.getString("setMusteriAdres"));
                contract.setMusteriSehirId(resultSet.getInt("setMusteriSehirId"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dataMusteriContracts;
    }

    @Override
    public MusteriContract Delete(MusteriContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(MusteriContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MusteriContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
