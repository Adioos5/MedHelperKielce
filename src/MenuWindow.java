
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuWindow extends JFrame{

    private JButton firstHelp;
    private JButton healthMap;
    private JButton settings;
    private URL url;
    BufferedImage img;
    
    public MenuWindow() {
            
        ImageIcon img = new ImageIcon("images/mazeBackground.jpg");
       
        
        setBounds(500,100,400,550);
        setTitle("Med Helper Kielce");
        
        firstHelp = new JButton("Pierwsza pomoc");
        healthMap = new JButton("Mapa zdrowia");
       
        
        healthMap.setBounds(50,200,300,100);
        firstHelp.setBounds(50,350,300,100);
      
        healthMap.setIcon(img);
        firstHelp.setIcon(img);
        
        firstHelp.addActionListener(new MenuWindowMechanics(firstHelp,healthMap,settings));
        healthMap.addActionListener(new MenuWindowMechanics(firstHelp,healthMap,settings));
       
        
        setLayout(null);//!!!
        
        add(firstHelp);
        add(healthMap);
       
        
        setVisible(true);
    }
   
}
