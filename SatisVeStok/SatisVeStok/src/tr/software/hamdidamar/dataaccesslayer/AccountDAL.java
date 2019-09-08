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

/**
 *
 * @author hmdmr
 */
public class AccountDAL<AccountContract> extends ObjectHelper implements dataaccesslayerInterfaces<AccountContract>{

    @Override
    public void Insert(AccountContract entity) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Tbl_Account(AccountYetkiId,AccountPersonelId,AccountSifre))"
                    + "VALUES("+entity.getAccountYetkiId()+","+entity.getAccountPersonelId()+",'"+entity.getAccountSifre()+"')");
                    statement.close();
                    connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<AccountContract> GetAll() {
        List<AccountContract> dataAccountcontracts = new ArrayList<AccountContract>();
        
        Connection connection = getConnection();
        AccountContract contract;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Tbl_Kategori");
            while (resultSet.next()) {
                contract = new AccountContract();
                contract.setAccountId(resultSet.getInt("AccountId"));
                contract.getAccountYetkiId(resultSet.getInt("AccountYetkiId"));
                contract.getAccountPersonelId(resultSet.getInt("AccountPersonelId"));
                contract.getAccountSifre(resultSet.getString("AccountSifre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dataAccountcontracts;
    }

    @Override
    public AccountContract Delete(AccountContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(AccountContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AccountContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
