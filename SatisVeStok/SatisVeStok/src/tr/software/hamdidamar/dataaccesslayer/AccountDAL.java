/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.dataaccesslayer;

import java.util.List;
import tr.software.hamdidamar.core.ObjectHelper;
import tr.software.hamdidamar.interfaces.dataaccesslayerInterfaces;

/**
 *
 * @author hmdmr
 */
public class AccountDAL<AccountContract> extends ObjectHelper implements dataaccesslayerInterfaces<AccountContract>{

    @Override
    public void Insert(AccountContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AccountContract> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccountContract Delete(AccountContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(AccountContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AccountContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
