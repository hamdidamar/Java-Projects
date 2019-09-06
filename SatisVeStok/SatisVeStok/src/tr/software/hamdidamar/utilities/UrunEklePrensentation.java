/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.utilities;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import tr.software.hamdidamar.interfaces.presentationInterfaces;


public class UrunEklePrensentation extends JDialog implements presentationInterfaces{

    public UrunEklePrensentation() {
        initPencere();
    }

    @Override
    public void initPencere() {
        JPanel panel = initPanel();
        
        panel.setBorder(BorderFactory.createTitledBorder("Ürün Kayıt Alanı"));
        add(panel);
        setTitle("Ürün Ekle");
        pack();
        setModalityType(DEFAULT_MODALITY_TYPE);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2)); //Tarih Eklenince 5,2 olacak
        JLabel LblUrunAd = new JLabel("Urun Ad:",JLabel.RIGHT);
        panel.add(LblUrunAd);
        JTextField UrunAdField = new JTextField(10);
        panel.add(UrunAdField);
        JLabel LblUrunKategori = new JLabel("Urun Kategori:",JLabel.RIGHT);
        panel.add(LblUrunKategori);
        JComboBox UrunKategoriBox = new JComboBox();
        panel.add(UrunKategoriBox);
        //Tarih Eklemesi Yapılacak
        //JLabel LblUrunTarih = new JLabel("Urun Tarih:",JLabel.RIGHT);
        //panel.add(LblUrunTarih);
        //JDateChooser UrunTarihDate = new JDateChooser();
        //panel.add(UrunTarihDate);
        JLabel LblUrunFiyat = new JLabel("Urun Fiyat:",JLabel.RIGHT);
        panel.add(LblUrunFiyat);
        JTextField UrunFiyatField = new JTextField(10);
        panel.add(UrunFiyatField);
        
        JButton UrunEkleButton = new JButton("Ürün Ekle");
        panel.add(UrunEkleButton);
        
        JButton UrunIptalButton = new JButton("Ürün İptal");
        panel.add(UrunIptalButton);
        
        return panel;
    }

    @Override
    public JMenuBar initBar() {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTabbedPane initTabs() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
