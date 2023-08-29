import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
public class fourCorners extends JFrame implements MouseListener{
    private int xPos;
    private int yPos;
    private myPanel panel;
    public fourCorners(){
        panel = new myPanel();
        this.addMouseListener(this);
        this.setSize(1000,1000);
        this.setVisible(true);
        this.setResizable(false);
        this.add(panel);
    }
    public void constantPos(MouseEvent e){
        xPos = e.getX();
        yPos = e.getY();
        if (xPos<500&&yPos<500){
            panel.drawOther1();
            panel.repaint();
        }
        if (xPos<1000&&yPos<1000&&xPos>500&&yPos>500){
            panel.drawOther4();
            panel.repaint();
        }
        if (xPos<500&&yPos>500){
            panel.drawOther3();
            panel.repaint();
        }
        if (yPos<500&&xPos>500){
            panel.drawOther2();
            panel.repaint();
        }
    }
    public void mouseClicked(MouseEvent e) {  
        xPos = e.getX();
        yPos = e.getY();
        if (xPos<500&&yPos<500){
            panel.drawOther1();
            panel.repaint();
        }
        if (xPos<1000&&yPos<1000&&xPos>500&&yPos>500){
            panel.drawOther4();
            panel.repaint();
        }
        if (xPos<500&&yPos>500){
            panel.drawOther3();
            panel.repaint();
        }
        if (yPos<500&&xPos>500){
            panel.drawOther2();
            panel.repaint();
        }
        panel.drawOther1();
        System.out.println("Mouse Clicked"+" "+e.getX()+xPos);
        panel.repaint();  
    }  
    public void mouseEntered(MouseEvent e) {  
        //System.out.println("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        //System.out.println("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        //System.out.println("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        //System.out.println("Mouse Released");  
    }
}
