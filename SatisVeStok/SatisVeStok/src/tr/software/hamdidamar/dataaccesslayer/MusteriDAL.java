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
public class MusteriDAL<MusteriContract> extends ObjectHelper implements dataaccesslayerInterfaces<MusteriContract>{

    @Override
    public void Insert(MusteriContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MusteriContract> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MusteriContract Delete(MusteriContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(MusteriContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MusteriContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
