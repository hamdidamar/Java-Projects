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
public class YetkiDAL<YetkiContract> extends ObjectHelper implements dataaccesslayerInterfaces<YetkiContract>{

    @Override
    public void Insert(YetkiContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<YetkiContract> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public YetkiContract Delete(YetkiContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(YetkiContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<YetkiContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
