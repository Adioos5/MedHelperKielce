

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class WindowsGraphics extends JPanel {

    private BufferedImage img;
    private BufferedImage img2;
    private String windowType;
    
    public WindowsGraphics(String windowType) throws URISyntaxException, IOException {       
        img = ImageIO.read(new File("images/tlo.png"));
        img2 = ImageIO.read(new File("images/text2029.png"));
        this.windowType = windowType;
    }

    public void paint(Graphics g) {
        if(windowType.equals("menu")) {
            g.drawImage(img, 0, 0, 360, 640, null, null);
            g.drawImage(img2, 30, 100, 300, 100, null, null);
            
        }
        if(windowType.equals("first help")) {
            g.drawImage(img, 0, 0, 360, 640, null, null);
        }
        if(windowType.equals("health map")) {
            g.drawImage(img, 0, 0, 360, 640, null, null);
        }
    }
}
