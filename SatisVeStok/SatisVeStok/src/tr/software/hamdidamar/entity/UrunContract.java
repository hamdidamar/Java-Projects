/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.entity;

import java.util.Date;

/**
 *
 * @author hmdmr
 */
public class UrunContract {
    
    private int UrunId;
    private String UrunAd;
    private int UrunKategoriId;
    private Date UrunTarih;
    private float UrunFiyat;

    /**
     * @return the UrunId
     */
    public int getUrunId() {
        return UrunId;
    }

    /**
     * @param UrunId the UrunId to set
     */
    public void setUrunId(int UrunId) {
        this.UrunId = UrunId;
    }

    /**
     * @return the UrunAd
     */
    public String getUrunAd() {
        return UrunAd;
    }

    /**
     * @param UrunAd the UrunAd to set
     */
    public void setUrunAd(String UrunAd) {
        this.UrunAd = UrunAd;
    }

    /**
     * @return the UrunKategoriId
     */
    public int getUrunKategoriId() {
        return UrunKategoriId;
    }

    /**
     * @param UrunKategoriId the UrunKategoriId to set
     */
    public void setUrunKategoriId(int UrunKategoriId) {
        this.UrunKategoriId = UrunKategoriId;
    }

    /**
     * @return the UrunTarih
     */
    public Date getUrunTarih() {
        return UrunTarih;
    }

    /**
     * @param UrunTarih the UrunTarih to set
     */
    public void setUrunTarih(Date UrunTarih) {
        this.UrunTarih = UrunTarih;
    }
    /**
     * @return the UrunFiyat
     */
    public float getUrunFiyat() {
        return UrunFiyat;
    }

    /**
     * @param UrunFiyat the UrunFiyat to set
     */
    public void setUrunFiyat(float UrunFiyat) {
        this.UrunFiyat = UrunFiyat;
    }
    @Override
    public String toString() {
        return UrunId + " " + UrunAd + " " + UrunKategoriId + " " + UrunTarih + " " +UrunFiyat;
        //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
