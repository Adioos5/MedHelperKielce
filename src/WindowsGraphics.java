

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

    private BufferedImage imgAidOne;
    private BufferedImage imgAidTwo;
    private int screenElementsLocation = 0;
    private BufferedImage googleMap;

    private String windowType;
    
    public WindowsGraphics(String windowType) throws URISyntaxException, IOException {       
        img = ImageIO.read(new File("images/tlo.png"));
        img2 = ImageIO.read(new File("images/text2029.png"));

        imgAidOne = ImageIO.read(new File("images/FirstAidBackgroundOne.png"));
        imgAidTwo = ImageIO.read(new File("images/FirstAidBackgroundTwo.png"));

        googleMap = ImageIO.read(new File("images/Mapa.png"));

        this.windowType = windowType;
    }

    public void paint(Graphics g) {
        if(windowType.equals("menu")) {
            g.drawImage(img, 0, 0, 360, 640, null, null);
            g.drawImage(img2, 30, 100, 300, 100, null, null);
            
        }
    
        if(windowType.equals("health map")) {
            g.drawImage(img, 0, 0, 360, 640, null, null);
            g.drawImage(googleMap, screenElementsLocation, 0, 360, 540, null, null);
        }
        if(windowType.equals("firstAidOne")) {
        	g.drawImage(imgAidOne, 0, 0, 360, 640, null, null);
        }
        if(windowType.equals("firstAidTwo")) {
        	g.drawImage(imgAidTwo, 0, 0, 360, 640, null, null);
        }
    }
    
    public void openToolBar() {
        screenElementsLocation += 200;
        repaint();
    }
}
