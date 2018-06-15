

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstHelpWindow1 extends JFrame{
	

    private JPanel menuPanel;
    private JButton nextB;
    
 
    public FirstHelpWindow1() throws URISyntaxException, IOException {
    	
    	ImageIcon nextButtonIcon = new ImageIcon("images/flowRoot2438.png");
        setResizable(false);
        setBounds(500, 50, 360, 640);
       nextB = new JButton("");
       nextB.setBounds(30, 300, 300, 100);
        nextB.setIcon(nextButtonIcon);
        nextB.addActionListener(new MenuWindowMechanics(null, null, nextB));
        menuPanel = new WindowsGraphics("firstAidOne");
        menuPanel.add(nextB);
        menuPanel.setLayout(null);
        add(menuPanel);
        
        
    }

            
        
    public void run(){
    	setVisible(true);
    }
   

}	
