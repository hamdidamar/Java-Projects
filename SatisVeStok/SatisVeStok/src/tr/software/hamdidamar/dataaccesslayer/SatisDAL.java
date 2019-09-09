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
import tr.software.hamdidamar.entity.SatisContract;
import tr.software.hamdidamar.interfaces.dataaccesslayerInterfaces;

/**
 *
 * @author hmdmr
 */
public class SatisDAL extends ObjectHelper implements dataaccesslayerInterfaces<SatisContract>{

    @Override
    public void Insert(SatisContract entity) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Tbl_Satis(SatisMusteriId,SatisPersonelId,SatisUrunId,SatisAdet,SatisTarih))"
                    + "VALUES("+entity.getSatisMusteriId()+","+entity.getSatisPersonelId()+","+entity.getSatisUrunId()+","+entity.getSatisAdet()+",'"+entity.getSatisTarih()+"')");
                    statement.close();
                    connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SatisDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<SatisContract> GetAll() {
        List<SatisContract> dataSatiscontracts = new ArrayList<SatisContract>();
        
        Connection connection = getConnection();
        SatisContract contract;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Tbl_Satis");
            while (resultSet.next()) {
                contract = new SatisContract();
                contract.setSatisId(resultSet.getInt("SatisId"));
                contract.setSatisMusteriId(resultSet.getInt("SatisMusteriId"));
                contract.setSatisPersonelId(resultSet.getInt("SatisPersonelId"));
                contract.setSatisUrunId(resultSet.getInt("SatisUrunId"));
                contract.setSatisAdet(resultSet.getInt("SatisAdet"));
                contract.setSatisTarih(resultSet.getDate("SatisTarih"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SatisDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataSatiscontracts;
    }

    @Override
    public SatisContract Delete(SatisContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(SatisContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SatisContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
