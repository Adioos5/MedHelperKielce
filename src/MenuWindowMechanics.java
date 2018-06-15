

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JButton;

import javax.swing.JButton;

public class MenuWindowMechanics implements ActionListener {

    private JButton firstHelp;
    private JButton healthMap;
  

    public MenuWindowMechanics(JButton firstHelp, JButton healthMap, JButton settings) {
        this.firstHelp = firstHelp;
        this.healthMap = healthMap;
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == healthMap) {
            System.out.println("Mapa zdrowia");
        }
        
        if (e.getSource() == firstHelp) {
            System.out.println("Otworzenie pierwszej pomocy");
        }
        
        
        
    }

}
