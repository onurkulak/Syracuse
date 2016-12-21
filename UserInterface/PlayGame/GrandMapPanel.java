
package UserInterface.PlayGame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;

public class GrandMapPanel extends JPanel{
    private BufferedImage background,source,army;
    JPanel[] countries = new JPanel[5];
    JPanel panel = new JPanel();
    JScrollPane info = new JScrollPane(panel);
    JLabel title = new JLabel("Grand Map",SwingConstants.CENTER);
    
    public GrandMapPanel(){
        setLayout(null);
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);   
        title.setBackground(new Color(255, 255, 204, 150));
        title.setOpaque(true);
        title.setBounds(210, 30, 920, 40);
        
        for(int i = 0 ; i < 5 ; i++){
            countries[i] = new JPanel();
            countries[i].setBackground(new Color(255, 255, 204));
            countries[i].setBounds(i*210,0,205,250);
            countries[i].setLayout(null);
            add(countries[i]);
        }
        panel.setBackground(new Color(255, 255, 204));
        panel.setBounds(1055,0,205,250);
        panel.setLayout(null);
        info.setBackground(new Color(255, 255, 204));
        info.setBounds(1055,0,205,250);
        info.setLayout(null);
        add(info); 
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/grand.png"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 260, this);
    }
}
