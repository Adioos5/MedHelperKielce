

import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstHelpWindow extends JFrame {
	

    private JPanel menuPanel;
    
    public FirstHelpWindow() throws URISyntaxException, IOException {

        setResizable(false);
        setBounds(500, 50, 360, 640);
       
        menuPanel = new WindowsGraphics("first help");
      
        add(menuPanel);
        
    }
    public void run(){
    	setVisible(true);
    }
   

}	
