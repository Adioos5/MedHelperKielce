
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuWindow extends JFrame{

    private JButton firstHelp;
    private JButton healthMap;
    
   
    private JPanel mainPanel;
    private JPanel menuPanel;
    
    public MenuWindow() {
            
        ImageIcon firstHelpBackground = new ImageIcon("images/text3353.png");
        ImageIcon healthMapBackground = new ImageIcon("images/mapa zdr.png");
        
        menuPanel = new JPanel();
        
        setBounds(500,100,360,640);
        setTitle("Med Helper Kielce");
        
        firstHelp = new JButton("");
        healthMap = new JButton("");
       
        
        healthMap.setBounds(30,300,300,100);
        firstHelp.setBounds(30,450,300,100);

       
        firstHelp.setIcon(firstHelpBackground);
        healthMap.setIcon(healthMapBackground);
        
        firstHelp.addActionListener(new MenuWindowMechanics(firstHelp,healthMap));
        healthMap.addActionListener(new MenuWindowMechanics(firstHelp,healthMap));
        
        menuPanel.add(firstHelp);
        menuPanel.add(healthMap);
        menuPanel.setLayout(null);
        
        setResizable(false);
    }
    public void run() {
        mainPanel = menuPanel;
        add(mainPanel);
        setVisible(true);
        
    }
}
