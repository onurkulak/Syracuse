
package UserInterface.PlayGame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.swing.*;
import javax.imageio.ImageIO;

public class SicilyLayerPanel extends JPanel{
    final Random rand = new Random();
    private BufferedImage background,army;
    JPanel panel = new JPanel();
    JLabel title = new JLabel("Sicily",SwingConstants.CENTER);
    String[] resourceS = {"Barley icon","Copper icon","Dye icon","Flax icon","Gold and silver","Grape icon","Iron ore icon","Marble icon","Olive icon","Salt icon",
        "Sheep icon","Timber icon","Wheat icon","Barley icon","Sheep icon","Wheat icon"};
    BufferedImage[] images = new BufferedImage[resourceS.length];
    final int[] resource = new int[resourceS.length];
    int[] SourceXY = {217, 214,506, 214,449, 366,542, 439,1058,617,727, 423,894, 504,932, 200,961, 109,952, 401,1078, 180,931, 621};
    int[] ArmyXY = {215, 129,432, 195,360, 328,593, 467,674, 410,848, 458,248, 267,887, 194,1017, 85,1171, 99,997, 462,1053, 277,1101, 508,961, 659,1046, 665};
    public SicilyLayerPanel(){
        setLayout(null);
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);   
        title.setBackground(new Color(255, 255, 204, 150));
        title.setOpaque(true);
        title.setBounds(210, 30, 920, 40);
        
        panel.setBackground(new Color(255, 255, 204, 150));
        panel.setBounds(210,85,920,630);
        panel.setLayout(null);
        
        for(int i = 0  ; i < resourceS.length ; i++)
            resource[i] = rand.nextInt(resourceS.length-1) + 0;
        
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/sicily.gif"));
             army = ImageIO.read(getClass().getResource("/file/g1.png"));} 
        catch (IOException ex) {ex.printStackTrace();}
    
        page.drawImage(background, 0, 0, this);
        for(int i = 0  ; i < resourceS.length ; i++){
            System.out.println(resourceS[i]);
            try {images[i] = ImageIO.read(getClass().getResource("/file/"+resourceS[resource[i]]+".png"));} 
            catch (IOException ex) {ex.printStackTrace();}
        }
        for(int i = 0 ; i < SourceXY.length ; i=i+2)
            page.drawImage(images[i/2], SourceXY[i], SourceXY[i+1], this);
        
        for(int i = 0 ; i < ArmyXY.length ; i=i+2){
            page.drawImage(army, ArmyXY[i], ArmyXY[i+1], this);
            page.drawString("1000", ArmyXY[i]+5, ArmyXY[i+1]+45);
        }
    }
    void randomSources(){
    }
}
