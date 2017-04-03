import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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

public class MyWBFPRSGUI_Window extends JFrame implements ActionListener{
    
    // Declare constant variable. 
    private static final String NO_HURT = "0";
    private static final String HURTS_LITTLE_BIT = "2";
    private static final String HURTS_LITTLE_MORE = "4";
    private static final String HURTS_EVEN_MORE = "6";
    private static final String HURTS_WHOLE_LOT = "8";
    private static final String HURTS_WORST = "10";
    
    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_HEIGHT = 300;

    private static final String WINDOW_TITLE = "Wong-Baker Faces Pain Rating Scale";
    
    // Declare Container 
    private Container contentPane;
    private JLabel painFaces;
    
    // Declare JButton
    private JButton noHurtButton;
    private JButton hurtsLittleBitButton;
    private JButton hurtsLittleMoreButton;
    private JButton hurtsEvenMoreButton;
    private JButton hurtsWholeLotButton;
    private JButton hurtsWorstButton;
    
    // Declare ImageIcon
    private ImageIcon noHurt;
    private ImageIcon hurtsLittleBit;
    private ImageIcon hurtsLittleMore;
    private ImageIcon hurtsEvenMore;
    private ImageIcon hurtsWholeLot;
    private ImageIcon hurtsWorst;
    

    public MyWBFPRSGUI_Window() {
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
        
        // Create object for each ImageIcon       
        this.noHurt = new ImageIcon("PainFace0.jpg");
        this.hurtsLittleBit = new ImageIcon ("PainFace2.jpg");
        this.hurtsLittleMore = new ImageIcon ("PainFace4.jpg");
        this.hurtsEvenMore = new ImageIcon ("PainFace6.jpg");
        this.hurtsWholeLot = new ImageIcon ("PainFace8.jpg");
        this.hurtsWorst = new ImageIcon ("PainFace10.jpg");
        
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

        painFaces = new JLabel();
        contentPane.add(painFaces);
        painFaces.setHorizontalAlignment(JLabel.CENTER);
        painFaces.setVerticalAlignment(JLabel.CENTER);
        
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

        
        switch (command) {
            case NO_HURT:
                // Turn on/off the button            
                this.noHurtButton.setVisible(false);

                // set Icon
                painFaces.setIcon(noHurt);
                contentPane.setBackground(Color.WHITE);

                break;
                
            case HURTS_LITTLE_BIT:
                // Turn on/off the buttons            
                this.hurtsLittleBitButton.setVisible(false);

                // set Icon
                painFaces.setIcon(hurtsLittleBit);
                contentPane.setBackground(Color.YELLOW);
                
                break;
                
            case HURTS_LITTLE_MORE:
                // Turn on/off the buttons            
                this.hurtsLittleMoreButton.setVisible(false);

                // set Icon
                painFaces.setIcon(hurtsLittleMore);
                contentPane.setBackground(Color.ORANGE);
                
                break;
                
            case HURTS_EVEN_MORE:
                // Turn on/off the buttons
                this.hurtsEvenMoreButton.setVisible(false);

                // set Icon
                painFaces.setIcon(hurtsEvenMore);
                contentPane.setBackground(Color.PINK);
                
                break;
                
            case HURTS_WHOLE_LOT:
                // Turn on/off the buttons
                this.hurtsWholeLotButton.setVisible(false);

                // set Icon
                painFaces.setIcon(hurtsWholeLot);
                contentPane.setBackground(Color.ORANGE);
                
                break;
                
            case HURTS_WORST:
                // Turn on/off the buttons
                this.hurtsWorstButton.setVisible(false);

                // set Icon
                painFaces.setIcon(hurtsWorst);
                contentPane.setBackground(Color.RED);
                
                break;
            
            default:
                System.out.println("A problem occured. Please try again...");

                break;

        }   // Ending bracket of switch
        
    }   // Ending bracket of actionPerformed method

}   // Ending bracket of MyWBFPRSGUI_Window class
