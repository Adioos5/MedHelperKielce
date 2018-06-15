

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;

public class MenuWindowMechanics implements ActionListener {

    private JButton firstAid;
    private JButton healthMap;
    private JButton nextB;

    public MenuWindowMechanics(JButton firstAid, JButton healthMap, JButton nextB) {
        this.firstAid = firstAid;
        this.healthMap = healthMap;
        this.nextB = nextB;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == healthMap) {
            System.out.println("Mapa zdrowia");
            HealthMapWindow hmw = null;
            try {
                hmw = new HealthMapWindow();
            } catch (URISyntaxException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
            hmw.run();
            
        }

        if (e.getSource() == firstAid) {
            System.out.println("Otworzenie pierwszej pomocy");
            FirstHelpWindow1 faw = null;
            try {
                faw = new FirstHelpWindow1();
            } catch (URISyntaxException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            faw.run();
        }
        if (e.getSource() == nextB) {
            FirstAidWindow2 FAW2 = null;
            try {
                FAW2 = new FirstAidWindow2();
            } catch (URISyntaxException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
            FAW2.run();}

    }

}
