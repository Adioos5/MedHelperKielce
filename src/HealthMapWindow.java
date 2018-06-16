

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HealthMapWindow extends JFrame {

    private WindowsGraphics panel;
    private JButton nearestHospitals;
    private JButton toolBarButton;
    private int screenElementsLocation = 0;
    public HealthMapWindow() throws URISyntaxException, IOException {

        setBounds(500, 50, 360, 640);
        setTitle("Med Helper Kielce");
        setResizable(false);
        
        ImageIcon someIcon = new ImageIcon("images/path3039.png");
        ImageIcon toolBarIcon = new ImageIcon("images/rect3130-8.png");
        
        toolBarButton = new JButton("");
        toolBarButton.setBounds(screenElementsLocation + 20,20,40,40);
        toolBarButton.setIcon(toolBarIcon);
        toolBarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toolBarButton.setBounds(screenElementsLocation + 220,20,40,40);
                nearestHospitals.setBounds(screenElementsLocation + 200,510,355,100);
                panel.openToolBar();
                
            }
            
        });
        
        nearestHospitals = new JButton("");
        nearestHospitals.setBounds(screenElementsLocation,510,355,100);
        nearestHospitals.setIcon(someIcon);
        
        panel = new WindowsGraphics("health map");
        panel.add(nearestHospitals);
        panel.add(toolBarButton);
        
        panel.setLayout(null);
    }
    public int getScreenElementsLocation() {
        return screenElementsLocation;
    }

    public void run() {
        add(panel);
        setVisible(true);

    }
    public void openToolBar() {
        screenElementsLocation += 200;
    }
}
