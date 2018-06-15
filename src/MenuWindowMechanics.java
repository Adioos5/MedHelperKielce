

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JButton;

import javax.swing.JButton;

public class MenuWindowMechanics implements ActionListener {

    private JButton firstHelp;
    private JButton healthMap;
    private JButton settings;

    public MenuWindowMechanics(JButton firstHelp, JButton healthMap, JButton settings) {
        this.firstHelp = firstHelp;
        this.healthMap = healthMap;
        this.settings = settings;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == firstHelp) {

        }
        if (e.getSource() == healthMap) {

        }
        if (e.getSource() == settings) {

        }
        
    }

}
