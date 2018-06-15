package menu;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import firstHelp.FirstHelpWindow;
import healthMap.HealthMapWindow;

public class MenuWindowMechanics implements ActionListener {

    private JButton firstAid;
    private JButton healthMap;

    public MenuWindowMechanics(JButton firstAid, JButton healthMap) {
        this.firstAid = firstAid;
        this.healthMap = healthMap;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == healthMap) {
        System.out.println("Mapa zdrowia");    
            
        }
        
        if (e.getSource() == firstAid) {
            System.out.println("Otworzenie pierwszej pomocy");
            FirstHelpWindow faw;
            faw = new FirstHelpWindow();
            faw.run();
        }
        
        
        
    }

}
