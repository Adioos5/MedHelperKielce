

import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HealthMapWindow extends JFrame {

    private JPanel panel;
    private JButton nearestHospitals;
    
    public HealthMapWindow() throws URISyntaxException, IOException {

        setBounds(500, 50, 360, 640);
        setTitle("Med Helper Kielce");
        setResizable(false);
        
        ImageIcon someIcon = new ImageIcon("images/path3039.png");

        nearestHospitals = new JButton("");
        nearestHospitals.setBounds(0,510,355,100);
        nearestHospitals.setIcon(someIcon);
        
        panel = new WindowsGraphics("health map");
        panel.add(nearestHospitals);
        panel.setLayout(null);
    }

    public void run() {
        add(panel);
        setVisible(true);

    }
}
