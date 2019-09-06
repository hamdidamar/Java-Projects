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
public class PersonelDAL<PersonelContract> extends ObjectHelper implements dataaccesslayerInterfaces<PersonelContract>{

    @Override
    public void Insert(PersonelContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonelContract> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonelContract Delete(PersonelContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(PersonelContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonelContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
