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
public class YetkiContract {
    
    private int YetkiId;
    private String YetkiAd;

    /**
     * @return the YetkiId
     */
    public int getYetkiId() {
        return YetkiId;
    }

    /**
     * @param YetkiId the YetkiId to set
     */
    public void setYetkiId(int YetkiId) {
        this.YetkiId = YetkiId;
    }

    /**
     * @return the YetkiAd
     */
    public String getYetkiAd() {
        return YetkiAd;
    }

    /**
     * @param YetkiAd the YetkiAd to set
     */
    public void setYetkiAd(String YetkiAd) {
        this.YetkiAd = YetkiAd;
    }

    @Override
    public String toString() {
        return YetkiId + " " + YetkiAd;
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
