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
public class StokContract {
    
    private int StokId;
    private int StokPersonelId;
    private int StokUrunId;
    private Date StokTarih;
    private int StokAdet;

    /**
     * @return the StokId
     */
    public int getStokId() {
        return StokId;
    }

    /**
     * @param StokId the StokId to set
     */
    public void setStokId(int StokId) {
        this.StokId = StokId;
    }

    /**
     * @return the StokPersonelId
     */
    public int getStokPersonelId() {
        return StokPersonelId;
    }

    /**
     * @param StokPersonelId the StokPersonelId to set
     */
    public void setStokPersonelId(int StokPersonelId) {
        this.StokPersonelId = StokPersonelId;
    }

    /**
     * @return the StokUrunId
     */
    public int getStokUrunId() {
        return StokUrunId;
    }

    /**
     * @param StokUrunId the StokUrunId to set
     */
    public void setStokUrunId(int StokUrunId) {
        this.StokUrunId = StokUrunId;
    }

    /**
     * @return the StokTarih
     */
    public Date getStokTarih() {
        return StokTarih;
    }

    /**
     * @param StokTarih the StokTarih to set
     */
    public void setStokTarih(Date StokTarih) {
        this.StokTarih = StokTarih;
    }

    /**
     * @return the StokAdet
     */
    public int getStokAdet() {
        return StokAdet;
    }

    /**
     * @param StokAdet the StokAdet to set
     */
    public void setStokAdet(int StokAdet) {
        this.StokAdet = StokAdet;
    }

    @Override
    public String toString() {
        return StokId + " " + StokPersonelId + " " + StokUrunId + " " + StokAdet + " " + StokTarih;
    }
    
    
}
