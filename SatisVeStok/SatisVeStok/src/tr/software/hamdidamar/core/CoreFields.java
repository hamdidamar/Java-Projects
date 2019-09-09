/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.core;

/**
 *
 * @author hmdmr
 */
public class CoreFields {
    
    private final String userName="hamdidamar";
    private final String password="";
    private final String url="jdbc:mysql://localhost:3306/dbostokvesatis?useUnicode=true&characterEncoding=utf8";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
 
}
