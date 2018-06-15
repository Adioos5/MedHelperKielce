
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuWindow extends JFrame{

    private JButton firstHelp;
    private JButton healthMap;
    private JButton settings;
    
    public MenuWindow() {
        
        setBounds(500,100,400,550);
        setTitle("Med Helper Kielce");
        
        firstHelp = new JButton("Pierwsza pomoc");
        healthMap = new JButton("");
       
        
        healthMap.setBounds(50,200,300,100);
        firstHelp.setBounds(50,350,300,100);
      
        healthMap.setBackground(Color.CYAN);
        
        firstHelp.addActionListener(new MenuWindowMechanics(firstHelp,healthMap,settings));
        healthMap.addActionListener(new MenuWindowMechanics(firstHelp,healthMap,settings));
       
        
        setLayout(null);//!!!
        
        add(firstHelp);
        add(healthMap);
       
        
        setVisible(true);
    }
   
}
