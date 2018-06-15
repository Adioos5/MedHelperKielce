package healthMap;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import menu.MenuWindow;
import menu.MenuWindowBackgroundGraphics;

public class HealthMapWindow extends JFrame {

    JPanel panel;

    public HealthMapWindow() throws URISyntaxException, IOException {

        panel = new MenuWindowBackgroundGraphics();
        setBounds(500, 50, 360, 640);
        setTitle("Med Helper Kielce");
        setResizable(false);
        add(panel);
    }

    public void run() {
        setVisible(true);

    }
}
