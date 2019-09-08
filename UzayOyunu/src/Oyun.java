
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates{

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
public class Oyun extends  JPanel implements KeyListener,ActionListener{
    Timer timer = new Timer(2, this);
    private int gecen_sure = 0 ;
    private int harcanan_ates = 0;
    
    private BufferedImage image;
    
    private ArrayList<Ates> atesler = new ArrayList<Ates>();
    
    private int atesdirY = 1;
    private int topX = 0;
    private int topdirX = 2;
    private int uzaygemisiX = 0;
    private int diruzayX = 20;

    
    public boolean KontrolEt(){
    
        for(Ates ates: atesler){
        
            if (new Rectangle(ates.getX(),ates.getY(),10,20).intersects(new Rectangle(topX ,0,20,20))) {
            
                return true;
            }
        }
        return false;
    }
    
    public Oyun() {
        
        try {
            image = ImageIO.read(new FileImageInputStream(new File("uzay_gemisi.png")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.BLACK);
        
        timer.start();
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        gecen_sure +=5;
         g.setColor(Color.blue);
        
        g.fillOval(topX, 0, 20, 20);
        
        g.drawImage(image, uzaygemisiX, 490,image.getWidth()/3,image.getHeight()/3,this);
        
        for (Ates ates: atesler) {
            if (ates.getY() < 0) {
                
                atesler.remove(ates);
            }
        }
        g.setColor(Color.red);
        for (Ates ates: atesler) {
            
            g.fillRect(ates.getX(), ates.getY(), 10, 20);
            
        }
        if (KontrolEt()) {
            
            timer.stop();
            String message ="***********Tebrikler Kazandın***********\n"+
                    "Harcanan Ateş Sayısı:"+harcanan_ates+
                    "\nGeçen Süre:"+gecen_sure /1000.0 +"saniye";
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
            
        }
        
    }

   

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_LEFT) {
            if (uzaygemisiX <= 0) {
                uzaygemisiX = 0;
            }
            else{
                uzaygemisiX -= diruzayX;
            }
        }
        else if (c == KeyEvent.VK_RIGHT) {
            if (uzaygemisiX >= 720) {
                uzaygemisiX = uzaygemisiX;
            }
            else{
                uzaygemisiX += diruzayX;
            }
        }
        else if (c == KeyEvent.VK_SPACE) {
            atesler.add(new Ates(uzaygemisiX + 10, 490));
            atesler.add(new Ates(uzaygemisiX + 55, 490));
            harcanan_ates++;
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(Ates ates: atesler){
        
            ates.setY(ates.getY() - atesdirY);
            
        }
        
        
        
        topX += topdirX;
        
        if (topX >= 775) {
            topdirX = -topdirX;
        }
        if (topX <= 0) {
            topdirX = -topdirX;
            
        }
        repaint();
    }
    
    
}
