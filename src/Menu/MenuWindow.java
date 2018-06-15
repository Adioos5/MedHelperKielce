package Menu;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuWindow extends JFrame{

    private JButton firstHelp;
    private JButton healthMap;
    private JButton settings;
    
    public MenuWindow() {
        setLocationRelativeTo(null);
        setSize(400,550);
        setTitle("Med Helper Kielce");
        
        firstHelp = new JButton("Pierwsza pomoc");
        healthMap = new JButton("Mapa zdrowia");
        settings = new JButton("Ustawienia");
        
        firstHelp.setBounds(110,200,150,50);
        healthMap.setBounds(110,300,150,50);
        settings.setBounds(110,400,150,50);
        
        firstHelp.addActionListener(new MenuWindowMechanics(firstHelp,healthMap,settings));
        healthMap.addActionListener(new MenuWindowMechanics(firstHelp,healthMap,settings));
        settings.addActionListener(new MenuWindowMechanics(firstHelp,healthMap,settings));
        
        setLayout(null);//!!!
        
        add(firstHelp);
        add(healthMap);
        add(settings);
        
        setVisible(true);
    }
}
