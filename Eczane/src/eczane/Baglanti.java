/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eczane;

import java.awt.List;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Baglanti {
    
    public Connection getConnection(){
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433;database=Eczane","chn","123");
            return  connection;
        } catch (SQLException ex) {
            Logger.getLogger(Ana_Sayfa.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Bağlantı Başarısız..");
            return null;
        }
        
    }
    
    public void Ekle(String ad,float fiyat,String resimYolu) throws SQLException{
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_Ilac(Adi,Fiyat,Resim)"
                 + "values(?,?,?) ");
        
        ps.setString(1, ad);
        ps.setFloat(2, fiyat);
        ps.setString(3, resimYolu);
        ps.executeUpdate();
        

    }
    public void Guncelle(ilac entity) throws SQLException{
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("Update tbl_Ilac set Fiyat = ?,Resim =?,Adi =? where ID = ?" );
        ps.setFloat(1, entity.getFiyat());
        ps.setString(2, entity.getResim());
        ps.setString(3, entity.getAdi());
        ps.setInt(4, entity.getId());
        ps.executeUpdate();
        

    }
    
    public void Sil(int id) throws SQLException{
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM tbl_Ilac WHERE ID = ?" );
        ps.setInt(1, id);
        ps.executeUpdate();
        

    }
    
    public ArrayList<ilac> İlaclariGetir() {
        ArrayList<ilac> ilaclar  = new ArrayList<ilac>();
            Connection con = getConnection();
            String query = "SELECT * FROM tbl_Ilac";
            
            Statement st;
            ResultSet rs;
            
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            ilac ilac;
            
            while(rs.next())
            {
                ilac = new ilac(rs.getInt("ID"),rs.getString("Adi"),Float.parseFloat(rs.getString("Fiyat")),rs.getString("Resim"));
                ilaclar.add(ilac);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ana_Sayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ilaclar; 
        

    }
    
}
