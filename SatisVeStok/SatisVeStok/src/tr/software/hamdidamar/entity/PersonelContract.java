/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.entity;

/**
 *
 * @author hmdmr
 */
public class PersonelContract {
    
    private int PersonelId;
    private String PersonelAdSoyad;
    private String PersonelMail;

    /**
     * @return the PersonelId
     */
    public int getPersonelId() {
        return PersonelId;
    }

    /**
     * @param PersonelId the PersonelId to set
     */
    public void setPersonelId(int PersonelId) {
        this.PersonelId = PersonelId;
    }

    /**
     * @return the PersonelAdSoyad
     */
    public String getPersonelAdSoyad() {
        return PersonelAdSoyad;
    }

    /**
     * @param PersonelAdSoyad the PersonelAdSoyad to set
     */
    public void setPersonelAdSoyad(String PersonelAdSoyad) {
        this.PersonelAdSoyad = PersonelAdSoyad;
    }

    /**
     * @return the PersonelMail
     */
    public String getPersonelMail() {
        return PersonelMail;
    }

    /**
     * @param PersonelMail the PersonelMail to set
     */
    public void setPersonelMail(String PersonelMail) {
        this.PersonelMail = PersonelMail;
    }
    
    @Override
    public String toString() {
        return PersonelId + " " + PersonelAdSoyad + " " + PersonelMail;
        //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
