import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import menu.MenuWindow;

public class EntryPoint {

    
    public static void main(String[] args) throws URISyntaxException, IOException {
        
        MenuWindow mw = new MenuWindow();
        mw.run();
    }

}
