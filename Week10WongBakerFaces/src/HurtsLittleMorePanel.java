import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Class        : HurtsLittleMorePanel
 * Project 10    : Wong-Baker faces Pain Rating Scale
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-30
 * Last Mod.    : 2017-03-31
 * Due Date     : 2017-04-06
 */

public class HurtsLittleMorePanel extends JPanel{
    public HurtsLittleMorePanel (){
        
        // Set panel dimension and background color
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.BLACK);
    
    }   //Ending bracket of NOHurtPanel Method
    
    public void paintComponent (Graphics g){
        
        super.paintComponent(g);

        // Face background
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(100, 95, 100, 120);
        
        // eye brows 
        g.setColor(Color.BLACK); 
        g.drawArc(105, 143, 60, 60, 65, 50); 
        g.drawArc(135, 143, 60, 60, 65, 50);
        
        //eyes 
        g.setColor(Color.WHITE); 
        g.fillOval(124, 150, 20, 8); 
        g.fillOval(156, 150, 20, 8); 
        g.setColor(Color.BLACK); 
        g.fillOval(130, 150, 8, 8); 
        g.fillOval(162, 150, 8, 8); 

        //nose210 
        g.setColor(Color.BLACK); 
        g.drawLine(145, 170, 155, 170);
        
        //mouth 
        g.setColor(Color.BLACK); 
        g.drawArc(135,  180,  30, 15, -45, -80);
        
    
    }   //Ending bracket of paintComponent method
    
}   // Ending bracket of HurtsLittleMorePanel class
