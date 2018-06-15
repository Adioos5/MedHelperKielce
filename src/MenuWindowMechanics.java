

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;

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
            FirstHelpWindow faw = null;
            try {
                faw = new FirstHelpWindow();
            } catch (URISyntaxException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            faw.run();
        }

    }

}
