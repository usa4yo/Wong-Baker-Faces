import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Class        : MyWBFPRSGUI_Window
 * Project 10    : Wong-Baker faces Pain Rating Scale
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-30
 * Last Mod.    : 2017-03-31
 * Due Date     : 2017-04-06
 */

public class MyWBFPRSGUI_Win1 extends JFrame implements ActionListener{
    
    // Declare constant variable. 
    private static final String NO_HURT = "0";
    private static final String HURTS_LITTLE_BIT = "2";
    private static final String HURTS_LITTLE_MORE = "4";
    private static final String HURTS_EVEN_MORE = "6";
    private static final String HURTS_WHOLE_LOT = "8";
    private static final String HURTS_WORST = "10";
    
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;

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
    

    public MyWBFPRSGUI_Win1() {
        // Calling  parents constructor...
        super();
        
        // Set the Title and the Size of the Window
        this.setTitle(WINDOW_TITLE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
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
        
        // Turn off all buttons            
        this.noHurtButton.setVisible(true);
        this.hurtsLittleBitButton.setVisible(true);
        this.hurtsLittleMoreButton.setVisible(true);
        this.hurtsEvenMoreButton.setVisible(true);
        this.hurtsWholeLotButton.setVisible(true);
        this.hurtsWorstButton.setVisible(true);

        // Turn off all panels
        this.noHurtPanel.setVisible(false);
        this.hurtsLittleBitPanel.setVisible(false);            
        this.hurtsLittleMorePanel.setVisible(false);
        this.hurtsEvenMorePanel.setVisible(false);
        this.hurtsWholeLotPanel.setVisible(false);
        this.hurtsWorstPanel.setVisible(false); 
        
        switch (command) {
            case NO_HURT:
                // Turn on/off the button            
                this.noHurtButton.setVisible(false);

                // Turn on/off the panel
                this.noHurtPanel.setVisible(true);

                break;
                
            case HURTS_LITTLE_BIT:
                // Turn on/off the buttons            
                this.hurtsLittleBitButton.setVisible(false);

                // Turn on/off the panels            
                this.hurtsLittleBitPanel.setVisible(true);
                
                break;
                
            case HURTS_LITTLE_MORE:
                // Turn on/off the buttons            
                this.hurtsLittleMoreButton.setVisible(false);

                // Turn on/off the panels
                this.hurtsLittleMorePanel.setVisible(true);
                
                break;
                
            case HURTS_EVEN_MORE:
                // Turn on/off the buttons
                this.hurtsEvenMoreButton.setVisible(false);

                // Turn on/off the panels
                this.hurtsEvenMorePanel.setVisible(true);
                
                break;
                
            case HURTS_WHOLE_LOT:
                // Turn on/off the buttons
                this.hurtsWholeLotButton.setVisible(false);

                // Turn on/off the panels
                this.hurtsWholeLotPanel.setVisible(true);
                
                break;
                
            case HURTS_WORST:
                // Turn on/off the buttons
                this.hurtsWorstButton.setVisible(false);

                // Turn on/off the panels
                this.hurtsWorstPanel.setVisible(true);
                
                break;
            
            default:
                System.out.println("A problem occured. Please try again...");

                break;

        }   // Ending bracket of switch
        
    }   // Ending bracket of actionPerformed method

}   // Ending bracket of MyWBFPRSGUI_Window class
