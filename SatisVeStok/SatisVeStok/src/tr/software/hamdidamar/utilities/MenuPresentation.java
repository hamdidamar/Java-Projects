/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.utilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.embed.swing.SwingNode;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 *
 * @author hmdmr
 */
public class MenuPresentation {
    
    
    public static JMenuBar initBar() {
        JMenuBar bar = new JMenuBar();
        
        //Dosya Menüsü
        JMenu dosyaMenu = new JMenu("Dosya");
        bar.add(dosyaMenu);
        JMenuItem cikisItem = new JMenuItem("Çıkış");
        dosyaMenu.add(cikisItem);
        
        //Ürün Menüsü
        JMenu urunMenu = new JMenu("Ürün");
        bar.add(urunMenu);
        JMenuItem urunEkleItem = new JMenuItem("Ürün Ekle");
        urunMenu.add(urunEkleItem);
        JMenuItem kategoriEkleItem = new JMenuItem("Kategori Ekle");
        urunMenu.add(kategoriEkleItem);
        urunMenu.addSeparator();
        JMenuItem urunDuzenleItem = new JMenuItem("Ürün Düzenle");
        urunMenu.add(urunDuzenleItem);
        JMenuItem kategoriDuzenleItem = new JMenuItem("Kategori Düzenle");
        urunMenu.add(kategoriDuzenleItem);
        
        urunEkleItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                       new  UrunEklePrensentation();
                    }
                });
                
            }
        });
        
        kategoriEkleItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new KategoriEklePresentation();
            }
        });
    
        return bar;
    }

}
