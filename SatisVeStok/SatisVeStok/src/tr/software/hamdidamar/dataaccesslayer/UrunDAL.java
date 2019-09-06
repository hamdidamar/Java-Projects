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
public class UrunDAL<UrunContract> extends ObjectHelper implements dataaccesslayerInterfaces<UrunContract> {

    @Override
    public void Insert(UrunContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UrunContract> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UrunContract Delete(UrunContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(UrunContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UrunContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
