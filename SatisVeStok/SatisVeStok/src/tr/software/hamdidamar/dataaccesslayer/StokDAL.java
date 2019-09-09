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
import tr.software.hamdidamar.entity.StokContract;
import tr.software.hamdidamar.interfaces.dataaccesslayerInterfaces;

/**
 *
 * @author hmdmr
 */
public class StokDAL extends ObjectHelper implements dataaccesslayerInterfaces<StokContract>{

    @Override
    public void Insert(StokContract entity) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Stok(StokPersonelId,StokUrunId,StokAdet,StokTarih))"
                    + "VALUES("+entity.getStokPersonelId()+","+entity.getStokUrunId()+","+entity.getStokAdet()+",'"+entity.getStokTarih()+"')");
                    statement.close();
                    connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StokDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<StokContract> GetAll() {
       List<StokContract> dataStokcontracts = new ArrayList<StokContract>();
        
        Connection connection = getConnection();
        StokContract contract;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Tbl_Stok");
            while (resultSet.next()) {
                contract = new StokContract();
                contract.setStokId(resultSet.getInt("StokId"));
                contract.setStokPersonelId(resultSet.getInt("StokPersonelId"));
                contract.setStokUrunId(resultSet.getInt("StokUrunId"));
                contract.setStokAdet(resultSet.getInt("StokAdet"));
                contract.setStokTarih(resultSet.getDate("StokTarih"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StokDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataStokcontracts;
    }

    @Override
    public StokContract Delete(StokContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(StokContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StokContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
