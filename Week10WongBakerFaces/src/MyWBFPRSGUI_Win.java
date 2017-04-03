import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Class        : MyWBFPRSGUI_Window
 * Project 10    : Wong-Baker faces Pain Rating Scale
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-30
 * Last Mod.    : 2017-03-31
 * Due Date     : 2017-04-06
 */

public class MyWBFPRSGUI_Win extends JFrame implements ActionListener{
    
    // Declare constant variable. 
    private static final String NO_HURT = "0";
    private static final String HURTS_LITTLE_BIT = "2";
    private static final String HURTS_LITTLE_MORE = "4";
    private static final String HURTS_EVEN_MORE = "6";
    private static final String HURTS_WHOLE_LOT = "8";
    private static final String HURTS_WORST = "10";

    private static final String WINDOW_TITLE = "Wong-Baker Faces Pain Rating Scale";
    
    // Declare Container 
    private Container contentPane;
    
    // Declare JButton
    private JButton noHurtButton;
    private JButton hurtsLittleBitButton;
    private JButton hurtsLittleMoreButton;
    private JButton hurtsEvenMoreButton;
    private JButton hurtsWholeLotButton;
    private JButton hurtsWorstButton;
    
    // Declare JPanel
    private NoHurtPanel noHurtPanel;
    private HurtsLittleBitPanel hurtsLittleBitPanel;
    private HurtsLittleMorePanel hurtsLittleMorePanel;
    private HurtsEvenMorePanel hurtsEvenMorePanel;
    private HurtsWholeLotPanel hurtsWholeLotPanel;
    private HurtsWorstPanel hurtsWorstPanel;
    

    public MyWBFPRSGUI_Win() {
        // Calling  parents constructor...
        super();
        
        // Set the Title and the Size of the Window
        this.setTitle(WINDOW_TITLE);
        this.setSize(400, 400);
        
        // Make sure the Window is close when we exit
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.contentPane = this.getContentPane();
        this.contentPane.setLayout(new FlowLayout());
        
        // Create object for each button
        this.noHurtButton = new JButton(NO_HURT);
        this.hurtsLittleBitButton = new JButton(HURTS_LITTLE_BIT);
        this.hurtsLittleMoreButton = new JButton(HURTS_LITTLE_MORE);
        this.hurtsEvenMoreButton = new JButton(HURTS_EVEN_MORE);
        this.hurtsWholeLotButton = new JButton(HURTS_WHOLE_LOT);
        this.hurtsWorstButton = new JButton(HURTS_WORST);
        
        // Create object for each panel        
        this.noHurtPanel = new NoHurtPanel();
        this.hurtsLittleBitPanel = new HurtsLittleBitPanel();
        this.hurtsLittleMorePanel = new HurtsLittleMorePanel();
        this.hurtsEvenMorePanel = new HurtsEvenMorePanel();
        this.hurtsWholeLotPanel = new HurtsWholeLotPanel();
        this.hurtsWorstPanel = new HurtsWorstPanel();
        
        // Add button to Action Listener
        this.noHurtButton.addActionListener(this);
        this.hurtsLittleBitButton.addActionListener(this);
        this.hurtsLittleMoreButton.addActionListener(this);
        this.hurtsEvenMoreButton.addActionListener(this);
        this.hurtsWholeLotButton.addActionListener(this);
        this.hurtsWorstButton.addActionListener(this);
        
        // Add button to the contentPane
        this.contentPane.add(noHurtButton);
        this.contentPane.add(hurtsLittleBitButton);
        this.contentPane.add(hurtsLittleMoreButton);
        this.contentPane.add(hurtsEvenMoreButton);
        this.contentPane.add(hurtsWholeLotButton);
        this.contentPane.add(hurtsWorstButton);

        // Add panel to the contentPane        
        this.contentPane.add(noHurtPanel);
        this.contentPane.add(hurtsLittleBitPanel);
        this.contentPane.add(hurtsLittleMorePanel);
        this.contentPane.add(hurtsEvenMorePanel);
        this.contentPane.add(hurtsWholeLotPanel);        
        this.contentPane.add(hurtsWorstPanel);        

        // Initially make all panel invisible        
        this.noHurtPanel.setVisible(false);
        this.hurtsLittleBitPanel.setVisible(false);
        this.hurtsLittleMorePanel.setVisible(false);
        this.hurtsEvenMorePanel.setVisible(false);        
        this.hurtsWholeLotPanel.setVisible(false);
        this.hurtsWorstPanel.setVisible(false);        
        
        
    }   // Ending bracket of MyWBFPRSGUI_Window constructor

    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        
        // Check if button ZERO has been press
        if (NO_HURT.equals(command)){
            // Turn on/off the buttons            
            this.noHurtButton.setVisible(false);
            this.hurtsLittleBitButton.setVisible(true);
            this.hurtsLittleMoreButton.setVisible(true);
            this.hurtsEvenMoreButton.setVisible(true);
            this.hurtsWholeLotButton.setVisible(true);
            this.hurtsWorstButton.setVisible(true);

            // Turn on/off the panels
            this.noHurtPanel.setVisible(true);
            this.hurtsLittleBitPanel.setVisible(false);            
            this.hurtsLittleMorePanel.setVisible(false);
            this.hurtsEvenMorePanel.setVisible(false);
            this.hurtsWholeLotPanel.setVisible(false);
            this.hurtsWorstPanel.setVisible(false); 

        // Check if button TWO has been press            
        } else if (HURTS_LITTLE_BIT.equals(command)){
            // Turn on/off the buttons            
            this.noHurtButton.setVisible(true);
            this.hurtsLittleBitButton.setVisible(false);
            this.hurtsLittleMoreButton.setVisible(true);
            this.hurtsEvenMoreButton.setVisible(true);
            this.hurtsWholeLotButton.setVisible(true);
            this.hurtsWorstButton.setVisible(true);

            // Turn on/off the panels            
            this.noHurtPanel.setVisible(false);
            this.hurtsLittleBitPanel.setVisible(true);            
            this.hurtsLittleMorePanel.setVisible(false);
            this.hurtsEvenMorePanel.setVisible(false);
            this.hurtsWholeLotPanel.setVisible(false);
            this.hurtsWorstPanel.setVisible(false); 

        // Check if button FOUR has been press            
        } else if (HURTS_LITTLE_MORE.equals(command)){
            // Turn on/off the buttons            
            this.noHurtButton.setVisible(true);
            this.hurtsLittleBitButton.setVisible(true);
            this.hurtsLittleMoreButton.setVisible(false);
            this.hurtsEvenMoreButton.setVisible(true);
            this.hurtsWholeLotButton.setVisible(true);
            this.hurtsWorstButton.setVisible(true);

            // Turn on/off the panels
            this.noHurtPanel.setVisible(false);
            this.hurtsLittleBitPanel.setVisible(false);            
            this.hurtsLittleMorePanel.setVisible(true);
            this.hurtsEvenMorePanel.setVisible(false);
            this.hurtsWholeLotPanel.setVisible(false);
            this.hurtsWorstPanel.setVisible(false); 

        // Check if button SIX has been press            
        } else if (HURTS_EVEN_MORE.equals(command)){
            // Turn on/off the buttons
            this.noHurtButton.setVisible(true);
            this.hurtsLittleBitButton.setVisible(true);
            this.hurtsLittleMoreButton.setVisible(true);
            this.hurtsEvenMoreButton.setVisible(false);
            this.hurtsWholeLotButton.setVisible(true);
            this.hurtsWorstButton.setVisible(true);

            // Turn on/off the panels
            this.noHurtPanel.setVisible(false);
            this.hurtsLittleBitPanel.setVisible(false);            
            this.hurtsLittleMorePanel.setVisible(false);
            this.hurtsEvenMorePanel.setVisible(true);
            this.hurtsWholeLotPanel.setVisible(false);
            this.hurtsWorstPanel.setVisible(false); 

        // Check if button EIGHT has been press            
        } else if (HURTS_WHOLE_LOT.equals(command)){
            // Turn on/off the buttons
            this.noHurtButton.setVisible(true);
            this.hurtsLittleBitButton.setVisible(true);
            this.hurtsLittleMoreButton.setVisible(true);
            this.hurtsEvenMoreButton.setVisible(true);
            this.hurtsWholeLotButton.setVisible(false);
            this.hurtsWorstButton.setVisible(true);

            // Turn on/off the panels
            this.noHurtPanel.setVisible(false);
            this.hurtsLittleBitPanel.setVisible(false);            
            this.hurtsLittleMorePanel.setVisible(false);
            this.hurtsEvenMorePanel.setVisible(false);
            this.hurtsWholeLotPanel.setVisible(true);
            this.hurtsWorstPanel.setVisible(false); 

        // Check if button TEN has been press            
        } else if (HURTS_WORST.equals(command)){
            // Turn on/off the buttons
            this.noHurtButton.setVisible(true);
            this.hurtsLittleBitButton.setVisible(true);
            this.hurtsLittleMoreButton.setVisible(true);
            this.hurtsEvenMoreButton.setVisible(true);
            this.hurtsWholeLotButton.setVisible(true);
            this.hurtsWorstButton.setVisible(false);

            // Turn on/off the panels
            this.noHurtPanel.setVisible(false);
            this.hurtsLittleBitPanel.setVisible(false);            
            this.hurtsLittleMorePanel.setVisible(false);
            this.hurtsEvenMorePanel.setVisible(false);
            this.hurtsWholeLotPanel.setVisible(false);
            this.hurtsWorstPanel.setVisible(true);        

        }   // Ending bracket of if statement
        
    }   // Ending bracket of actionPerformed method

}   // Ending bracket of MyWBFPRSGUI_Window class
