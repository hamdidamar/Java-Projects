/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eczane;

/**
 *
 * @author ASUS
 */
public class ilac {
    private int id;
    private String adi;
    private float fiyat;
    private String resim;

    public ilac(int id, String adi, float fiyat, String resim) {
        this.id = id;
        this.adi = adi;
        this.fiyat = fiyat;
        this.resim = resim;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    
    
}
