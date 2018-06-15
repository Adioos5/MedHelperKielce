package menu;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuWindow extends JFrame {

    private JButton firstAid;
    private JButton healthMap;

   
    private JPanel menuPanel;

    public MenuWindow() {

        ImageIcon firstHelpBackground = new ImageIcon("images/text3353.png");
        ImageIcon healthMapBackground = new ImageIcon("images/mapa zdr.png");

        menuPanel = new MenuWindowBackgroundGraphics();

        setBounds(500, 50, 360, 640);
        setTitle("Med Helper Kielce");

        firstAid = new JButton("");
        healthMap = new JButton("");

        healthMap.setBounds(30, 300, 300, 100);
        firstAid.setBounds(30, 450, 300, 100);

        firstAid.setIcon(firstHelpBackground);
        healthMap.setIcon(healthMapBackground);

        firstAid.addActionListener(new MenuWindowMechanics(firstAid, healthMap));
        healthMap.addActionListener(new MenuWindowMechanics(firstAid, healthMap));

        menuPanel.add(firstAid);
        menuPanel.add(healthMap);
        menuPanel.setLayout(null);
        
        setResizable(false);
    }

    public void run() {
       
        add(menuPanel);
        setVisible(true);

    }

  
}
