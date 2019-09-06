/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.interfaces;

import java.util.List;

/**
 *
 * @author hmdmr
 */
public interface dataaccesslayerInterfaces<T> {
    
     void Insert(T entity);
     List<T> GetAll();
     T Delete(T entity);
     void Update(T entity);
     List<T> GetById(int id);
    
    
}
