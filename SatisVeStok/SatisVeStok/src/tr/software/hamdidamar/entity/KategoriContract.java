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
public class KategoriContract {
    
    private int KategoriId;
    private String  KategoriAd;
    private int KategoriParentId;

    /**
     * @return the KategoriId
     */
    public int getKategoriId() {
        return KategoriId;
    }

    /**
     * @param KategoriId the KategoriId to set
     */
    public void setKategoriId(int KategoriId) {
        this.KategoriId = KategoriId;
    }

    /**
     * @return the KategoriAd
     */
    public String getKategoriAd() {
        return KategoriAd;
    }

    /**
     * @param KategoriAd the KategoriAd to set
     */
    public void setKategoriAd(String KategoriAd) {
        this.KategoriAd = KategoriAd;
    }

    /**
     * @return the KategoriParentId
     */
    public int getKategoriParentId() {
        return KategoriParentId;
    }

    /**
     * @param KategoriParentId the KategoriParentId to set
     */
    public void setKategoriParentId(int KategoriParentId) {
        this.KategoriParentId = KategoriParentId;
    }

    @Override
    public String toString() {
        return KategoriId + " " + KategoriAd + " " + KategoriParentId ;
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
