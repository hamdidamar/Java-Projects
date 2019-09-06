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
public class MusteriContract {
    
    private int MusteriId;
    private String MusteriAdSoyad;
    private String MusteriTelefon;
    private String MusteriAdres;
    private int MusteriSehirId;

    /**
     * @return the MusteriId
     */
    public int getMusteriId() {
        return MusteriId;
    }

    /**
     * @param MusteriId the MusteriId to set
     */
    public void setMusteriId(int MusteriId) {
        this.MusteriId = MusteriId;
    }

    /**
     * @return the MusteriAdSoyad
     */
    public String getMusteriAdSoyad() {
        return MusteriAdSoyad;
    }

    /**
     * @param MusteriAdSoyad the MusteriAdSoyad to set
     */
    public void setMusteriAdSoyad(String MusteriAdSoyad) {
        this.MusteriAdSoyad = MusteriAdSoyad;
    }

    /**
     * @return the MusteriTelefon
     */
    public String getMusteriTelefon() {
        return MusteriTelefon;
    }

    /**
     * @param MusteriTelefon the MusteriTelefon to set
     */
    public void setMusteriTelefon(String MusteriTelefon) {
        this.MusteriTelefon = MusteriTelefon;
    }

    /**
     * @return the MusteriAdres
     */
    public String getMusteriAdres() {
        return MusteriAdres;
    }

    /**
     * @param MusteriAdres the MusteriAdres to set
     */
    public void setMusteriAdres(String MusteriAdres) {
        this.MusteriAdres = MusteriAdres;
    }

    /**
     * @return the MusteriSehirId
     */
    public int getMusteriSehirId() {
        return MusteriSehirId;
    }

    /**
     * @param MusteriSehirId the MusteriSehirId to set
     */
    public void setMusteriSehirId(int MusteriSehirId) {
        this.MusteriSehirId = MusteriSehirId;
    }

    @Override
    public String toString() {
        return MusteriId + " " + MusteriAdSoyad + " " + MusteriTelefon + " " + MusteriSehirId + " " + MusteriAdres;
    }
    
    
}
