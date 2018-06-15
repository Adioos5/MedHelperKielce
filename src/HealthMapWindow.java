

import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HealthMapWindow extends JFrame {

    JPanel panel;

    public HealthMapWindow() throws URISyntaxException, IOException {

        panel = new WindowsGraphics("health map");
        setBounds(500, 50, 360, 640);
        setTitle("Med Helper Kielce");
        setResizable(false);
        add(panel);
    }

    public void run() {
        setVisible(true);

    }
}
