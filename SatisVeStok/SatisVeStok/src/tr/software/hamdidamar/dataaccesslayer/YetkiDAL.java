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
import tr.software.hamdidamar.entity.YetkiContract;
import tr.software.hamdidamar.interfaces.dataaccesslayerInterfaces;

/**
 *
 * @author hmdmr
 */
public class YetkiDAL extends ObjectHelper implements dataaccesslayerInterfaces<YetkiContract>{

    @Override
    public void Insert(YetkiContract entity) {
        Connection connection = getConnection();
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Tbl_Yetki(YetkiAd)"
                    +"VALUES('"+entity.getYetkiAd()+"')");
            statement.close();
            statement.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(YetkiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<YetkiContract> GetAll() {
        List<YetkiContract> dataYetkicontracts = new ArrayList<YetkiContract>();
        
        Connection connection = getConnection();
        YetkiContract contract;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Tbl_Yetki");
            while (resultSet.next()) {
                contract = new YetkiContract();
                contract.setYetkiId(resultSet.getInt("YetkiId"));
                contract.setYetkiAd(resultSet.getString("YetkiAd"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(YetkiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dataYetkicontracts;
    }

    @Override
    public YetkiContract Delete(YetkiContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(YetkiContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<YetkiContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
