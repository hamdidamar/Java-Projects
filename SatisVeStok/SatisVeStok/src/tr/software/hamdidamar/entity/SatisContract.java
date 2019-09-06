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
public class SatisContract {
    
    private int SatisId;
    private int SatisMusteriId;
    private int SatisPersonelId;
    private int SatisUrunId;
    private int SatisAdet;
    private Date SatisTarih;

    /**
     * @return the SatisId
     */
    public int getSatisId() {
        return SatisId;
    }

    /**
     * @param SatisId the SatisId to set
     */
    public void setSatisId(int SatisId) {
        this.SatisId = SatisId;
    }

    /**
     * @return the SatisMusteriId
     */
    public int getSatisMusteriId() {
        return SatisMusteriId;
    }

    /**
     * @param SatisMusteriId the SatisMusteriId to set
     */
    public void setSatisMusteriId(int SatisMusteriId) {
        this.SatisMusteriId = SatisMusteriId;
    }

    /**
     * @return the SatisPersonelId
     */
    public int getSatisPersonelId() {
        return SatisPersonelId;
    }

    /**
     * @param SatisPersonelId the SatisPersonelId to set
     */
    public void setSatisPersonelId(int SatisPersonelId) {
        this.SatisPersonelId = SatisPersonelId;
    }

    /**
     * @return the SatisUrunId
     */
    public int getSatisUrunId() {
        return SatisUrunId;
    }

    /**
     * @param SatisUrunId the SatisUrunId to set
     */
    public void setSatisUrunId(int SatisUrunId) {
        this.SatisUrunId = SatisUrunId;
    }

    /**
     * @return the SatisAdet
     */
    public int getSatisAdet() {
        return SatisAdet;
    }

    /**
     * @param SatisAdet the SatisAdet to set
     */
    public void setSatisAdet(int SatisAdet) {
        this.SatisAdet = SatisAdet;
    }

    /**
     * @return the SatisTarih
     */
    public Date getSatisTarih() {
        return SatisTarih;
    }

    /**
     * @param SatisTarih the SatisTarih to set
     */
    public void setSatisTarih(Date SatisTarih) {
        this.SatisTarih = SatisTarih;
    }

    @Override
    public String toString() {
        return SatisId + " " + SatisMusteriId + " " + SatisPersonelId + " " + SatisUrunId + " " + SatisAdet + " " + SatisTarih;
    }
    
    
}
