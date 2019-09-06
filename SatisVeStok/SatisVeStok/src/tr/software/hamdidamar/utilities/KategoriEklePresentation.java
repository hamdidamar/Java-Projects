/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.utilities;

import static java.awt.Dialog.DEFAULT_MODALITY_TYPE;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import tr.software.hamdidamar.interfaces.presentationInterfaces;

/**
 *
 * @author hmdmr
 */
public class KategoriEklePresentation extends JDialog implements presentationInterfaces{

    public KategoriEklePresentation() {
        initPencere();
    }

    @Override
    public void initPencere() {
        JPanel panel = initPanel();
        
        panel.setBorder(BorderFactory.createTitledBorder("Kategori Kayıt Alanı"));
        add(panel);
        setTitle("Kategori Ekle");
        pack();
        setModalityType(DEFAULT_MODALITY_TYPE);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JLabel LblKategoriAd = new JLabel("Kategori Ad:",JLabel.RIGHT);
        panel.add(LblKategoriAd);
        JTextField KategoriAdField = new JTextField(10);
        panel.add(KategoriAdField);
        
        JButton KategoriEkleButton = new JButton("Kategori Ekle");
        panel.add(KategoriEkleButton);
        
        JButton KategoriIptalButton = new JButton("Kategori İptal");
        panel.add(KategoriIptalButton);
        
        return  panel;
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
