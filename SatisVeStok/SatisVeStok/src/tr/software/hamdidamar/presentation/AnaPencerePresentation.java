/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.software.hamdidamar.presentation;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import tr.software.hamdidamar.interfaces.presentationInterfaces;
import tr.software.hamdidamar.utilities.MenuPresentation;

/**
 *
 * @author hmdmr
 */
public class AnaPencerePresentation extends JFrame implements presentationInterfaces{

    public AnaPencerePresentation() {
        initPencere();
    }
    
    @Override
    public void initPencere() {
        //JTabbedPane tabs = initTabs();
        JMenuBar menuBar = initBar();
        
        //add(tabs);
        setJMenuBar(menuBar);
        
        setTitle("Satış Ve Stok Programı");
        setSize(600, 250);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel();
        return panel;
    }

    @Override
    public JMenuBar initBar() {
        JMenuBar bar = MenuPresentation.initBar();
        
       return bar;
    }

    @Override
    public JTabbedPane initTabs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
