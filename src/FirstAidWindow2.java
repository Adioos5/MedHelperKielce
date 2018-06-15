import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstAidWindow2 extends JFrame {
	
	private JPanel menuPanel;
	    private JButton okB;
	    private JButton noOkB;
	    
	    public FirstAidWindow2() throws URISyntaxException, IOException {
	    	
	    	ImageIcon okButtonIcon = new ImageIcon("images/jest ok.png");
	    	ImageIcon noOkButtonIcon = new ImageIcon("images/nie jest ok.png");
	    	
	        setResizable(false);
	        setBounds(500, 50, 360, 640);
	       okB = new JButton("");
	       okB.setBounds(30, 300, 300, 100);
	        okB.setIcon(okButtonIcon);
	        noOkB = new JButton("");
	        noOkB.setBounds(30, 450, 300, 100);
	        noOkB.setIcon(noOkButtonIcon);
	        
	        menuPanel = new WindowsGraphics("firstAidTwo");
	        menuPanel.add(okB);
	        menuPanel.add(noOkB);
	        menuPanel.setLayout(null);
	        add(menuPanel);
	        
	        
	    }
	    public void run(){
	    	setVisible(true);
	    }
	   

	}	

