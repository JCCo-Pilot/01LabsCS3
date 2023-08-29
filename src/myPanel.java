import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;
public class myPanel extends JPanel{
    private BufferedImage image11;
    private BufferedImage image12;
    private BufferedImage image21;
    private BufferedImage image22;
    private BufferedImage image31;
    private BufferedImage image32;
    private BufferedImage image41;
    private BufferedImage image42;
    private Graphics graph;
    public myPanel(){
        try{
            image11 = ImageIO.read(new File("astros.png"));
            image12 = ImageIO.read(new File("astros2.png")); 
            image21 = ImageIO.read(new File("fcb.png")); 
            image22 = ImageIO.read(new File("fcb2.png")); 
            image31 = ImageIO.read(new File("chelsea.png")); 
            image32 = ImageIO.read(new File("chelsea2.png")); 
            image41 = ImageIO.read(new File("mancity.png")); 
            image42 = ImageIO.read(new File("mancity2.png"));  
        }
        catch(Exception E ){
            System.out.println("error");
            return;
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        graph = g;
        g.drawImage(image11,0,0,500,500,null);
        g.drawImage(image21,500,0,500,500,null);
        g.drawImage(image31,0,500,500,500,null);
        g.drawImage(image41,500,500,500,500,null);
        //drawOther1();
    }
    public void drawOther1(){
        graph.drawImage(image12,0,0,500,500,null);
    }
}
