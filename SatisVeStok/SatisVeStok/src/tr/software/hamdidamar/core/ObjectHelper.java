package tr.software.hamdidamar.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.software.hamdidamar.interfaces.coreInterfaces;
import java.sql.*;

public class ObjectHelper extends CoreFields implements coreInterfaces{

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Bağlantı Driver Hatası");
        }
    }
    
    @Override
    public Connection getConnection() {
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
        } catch (SQLException ex) {
            System.out.println("Bağlantı Hatası...");
        }
        return connection;
    }

}
