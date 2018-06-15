package menu;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MenuWindowBackgroundGraphics extends JPanel {
    
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 360, 640);
        
    }
}
