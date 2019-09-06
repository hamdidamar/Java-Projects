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
public class AccountContract {
    
    private int AccountId;
    private int AccountYetkiId;
    private int AccountPersonelId;
    private String AccountSifre;

    /**
     * @return the AccountId
     */
    public int getAccountId() {
        return AccountId;
    }

    /**
     * @param AccountId the AccountId to set
     */
    public void setAccountId(int AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * @return the AccountYetkiId
     */
    public int getAccountYetkiId() {
        return AccountYetkiId;
    }

    /**
     * @param AccountYetkiId the AccountYetkiId to set
     */
    public void setAccountYetkiId(int AccountYetkiId) {
        this.AccountYetkiId = AccountYetkiId;
    }

    /**
     * @return the AccountPersonelId
     */
    public int getAccountPersonelId() {
        return AccountPersonelId;
    }

    /**
     * @param AccountPersonelId the AccountPersonelId to set
     */
    public void setAccountPersonelId(int AccountPersonelId) {
        this.AccountPersonelId = AccountPersonelId;
    }

    /**
     * @return the AccountSifre
     */
    public String getAccountSifre() {
        return AccountSifre;
    }

    /**
     * @param AccountSifre the AccountSifre to set
     */
    public void setAccountSifre(String AccountSifre) {
        this.AccountSifre = AccountSifre;
    }

    @Override
    public String toString() {
        return AccountId + " " + AccountYetkiId + " " + AccountPersonelId + " " + AccountSifre;
    }
    
    
}
