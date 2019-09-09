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
import tr.software.hamdidamar.entity.PersonelContract;
import tr.software.hamdidamar.interfaces.dataaccesslayerInterfaces;

/**
 *
 * @author hmdmr
 */
public class PersonelDAL extends ObjectHelper implements dataaccesslayerInterfaces<PersonelContract>{

    @Override
    public void Insert(PersonelContract entity) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Tbl_Personel(PersonelAdSoyad,PersonelMail))"
                    + "VALUES('"+entity.getPersonelAdSoyad()+"','"+entity.getPersonelMail()+"')");
                    statement.close();
                    connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonelDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<PersonelContract> GetAll() {
        List<PersonelContract> dataPersonelcontracts = new ArrayList<PersonelContract>();
        
        Connection connection = getConnection();
        PersonelContract contract;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Tbl_Personel");
            while (resultSet.next()) {
                contract = new PersonelContract();
                contract.setPersonelId(resultSet.getInt("PersonelId"));
                contract.setPersonelAdSoyad(resultSet.getString("PersonelAdSoyad"));
                contract.setPersonelMail(resultSet.getString("PersonelMail"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonelDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataPersonelcontracts;
    }

    @Override
    public PersonelContract Delete(PersonelContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(PersonelContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonelContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
