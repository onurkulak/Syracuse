
package UserInterface.PreGame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;

public class LoadGamePanel extends JPanel{
    private BufferedImage background;
    JPanel panel = new JPanel();
    JLabel title = new JLabel("Load Game",SwingConstants.CENTER);
    
    public LoadGamePanel(){
        
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);   
        title.setBackground(new Color(255, 255, 204, 150));
        title.setOpaque(true);
        title.setBounds(210, 30, 920, 40);
        
        panel.setBackground(new Color(255, 255, 204, 150));
        panel.setBounds(210,85,920,630);
        panel.setLayout(null);
        
        add(panel);
        add(title); 
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/i.jpg"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 0, this);
    }
}

