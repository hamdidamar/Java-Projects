/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.software.hamdidamar.interfaces.coreInterfaces;

/**
 *
 * @author hmdmr
 */
public class ObjectHelper extends CoreFields implements coreInterfaces{

   
    static{
        try {
            Class.forName("com.mysql.jdbo.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjectHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Connection getConnection() {
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
        } catch (SQLException ex) {
            Logger.getLogger(ObjectHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    
    
}
