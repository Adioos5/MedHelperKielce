package firstHelp;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import menu.MenuWindowBackgroundGraphics;
import menu.MenuWindowMechanics;

public class FirstHelpWindow extends JFrame {
	

    private JLabel text1;
    private JPanel menuPanel;
    
    public FirstHelpWindow() {
        
 
   

        setBounds(500, 50, 360, 640);
        setTitle("Med Helper Kielce");
        


        
        add(text1);
        setResizable(false);
        
       
      
      
        
        
    }
    public void run(){
    	setVisible(true);
    }
   

}	
