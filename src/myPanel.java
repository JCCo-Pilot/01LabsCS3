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
    private int one;
    private int two;
    private int three;
    private int four;
    private Graphics graph;
    public myPanel(){
        one = 0;
        two = 0;
        three = 0;
        four = 0;
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
        if (one ==0){
            g.drawImage(image11,0,0,500,500,null);
        }
        if (two==0){
            g.drawImage(image21,500,0,500,500,null);
        }
        if (three==0){
            g.drawImage(image31,0,500,500,500,null);
        }
        if (four==0){
            g.drawImage(image41,500,500,500,500,null);
        }
        if (one ==1){
            g.drawImage(image12,0,0,500,500,null);
        }
        if (two==1){
            g.drawImage(image22,500,0,500,500,null);
        }
        if (three==1){
            g.drawImage(image32,0,500,500,500,null);
        }
        if (four==1){
            g.drawImage(image42,500,500,500,500,null);
        }   
    }
    public void drawOther1(){
        if (one ==0){
            one = 1;
        }
        if (one ==1){
            one =0;
        }
    }
    public void drawOther2(){
        if (two == 0){
            two = 1;
        }
        if (two ==1){
            two = 0;
        }
    }
    public void drawOther3(){
        if (three == 0){
            three = 1;
        }
        if (three ==1){
            three = 0;
        }
    }
    public void drawOther4(){
        if (four == 0){
            four = 1;
        }
        if (four ==1){
            four = 0;
        }
    }
}
