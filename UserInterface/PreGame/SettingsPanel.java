
package UserInterface.PreGame;
import UserInterface.PlayGame.PlayGameFrame;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SettingsPanel extends JPanel implements ActionListener{
    private BufferedImage background;
    private BufferedImage[] profiles = new BufferedImage[9];
    static BufferedImage activeProfile ;
    JPanel panel = new JPanel();        
    JLabel title = new JLabel("Settings");
    JLabel MD = new JLabel("<html>Select Military Difficulty<br>(will affect your battle calculation)</html>");
    JLabel ED = new JLabel("<html>Select Economic Difficulty<br>(will affect your resource outputs)</html>");
    JRadioButton option1 = new JRadioButton("Easy");
    JRadioButton option2 = new JRadioButton("Normal");
    JRadioButton option3 = new JRadioButton("Hard");
    JRadioButton option4 = new JRadioButton("Easy");
    JRadioButton option5 = new JRadioButton("Normal");
    JRadioButton option6 = new JRadioButton("Hard");
    ButtonGroup MDgroup = new ButtonGroup();
    ButtonGroup EDgroup = new ButtonGroup();
    JLabel playername = new JLabel("Player Name:");
    JTextField  name = new JTextField(15);
    JButton buttonImg = new JButton();
    JButton newGameButton = new JButton("Start New Game");
            
    
    public SettingsPanel(){
        
        addPanel();
        setLayout(null);
        
    }
    private void addPanel() {
        
        panel.setBackground(new Color(100, 134, 145, 123));
        panel.setBounds(360,140,640,480);
        panel.setLayout(null);
        
        try {
            profiles[0] = ImageIO.read(getClass().getResource("/file/x1.jpg"));
            profiles[1] = ImageIO.read(getClass().getResource("/file/x2.jpg"));
            profiles[2] = ImageIO.read(getClass().getResource("/file/x3.jpg"));
            profiles[3] = ImageIO.read(getClass().getResource("/file/x4.jpg"));
            profiles[4] = ImageIO.read(getClass().getResource("/file/x5.jpg"));
            profiles[5] = ImageIO.read(getClass().getResource("/file/x6.jpg"));
            profiles[6] = ImageIO.read(getClass().getResource("/file/x7.jpg"));
            profiles[7] = ImageIO.read(getClass().getResource("/file/x8.jpg"));
            profiles[8] = ImageIO.read(getClass().getResource("/file/x9.jpg"));} 
        catch (IOException ex) {ex.printStackTrace(); } 
        
        activeProfile = profiles[0];
        buttonImg.setBounds(820,300,160,200);
        buttonImg.setIcon(new ImageIcon(activeProfile));
        buttonImg.addActionListener(this);
        
        newGameButton.setBounds(820,515,160,30);
        newGameButton.addActionListener(this);
                
        title.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD,30));
        title.setForeground(Color.BLACK);
        title.setBounds(593, 140, 240, 40);
        
        name.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD,15));
        name.setForeground(Color.BLACK);
        name.setBounds(820, 270, 100, 25);
        
        playername.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD,15));
        playername.setForeground(Color.BLACK);
        playername.setBounds(820, 244, 100, 25);
        
        MD.setFont(new java.awt.Font("Comic Sans MS",Font.PLAIN,20));
        MD.setForeground(Color.BLACK);
        MD.setBounds(386,219,5000,50);
        
        MDgroup.add(option1);
        MDgroup.add(option2);
        MDgroup.add(option3);
        option2.setSelected(true);
        
        ED.setFont(new java.awt.Font("Comic Sans MS",Font.PLAIN,20));
        ED.setForeground(Color.BLACK);
        ED.setBounds(386,399,5000,70);
        
        EDgroup.add(option4);
        EDgroup.add(option5);
        EDgroup.add(option6);
        option5.setSelected(true);
        
        option1.setBounds(415,286,100,40);  option1.setOpaque(false);   option1.setForeground(Color.BLACK);
        option2.setBounds(415,316,100,40);  option2.setOpaque(false);   option2.setForeground(Color.BLACK);
        option3.setBounds(415,346,100,40);  option3.setOpaque(false);   option3.setForeground(Color.BLACK);
        
        option4.setBounds(415,464,100,40);  option4.setOpaque(false);   option4.setForeground(Color.BLACK);
        option5.setBounds(415,494,100,40);  option5.setOpaque(false);   option5.setForeground(Color.BLACK);
        option6.setBounds(415,524,100,40);  option6.setOpaque(false);   option6.setForeground(Color.BLACK);
        
        add(title);
        add(name);
        add(playername);
        add(MD);
        add(ED);
        add(option1);
        add(option2);
        add(option3);
        add(option4);
        add(option5);
        add(option6);
        add(buttonImg);
        add(newGameButton);
        add(panel);
        
    }
    
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        
        //background image
        try {
            background = ImageIO.read(getClass().getResource("/file/g.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        page.drawImage(background, 0, 0, this);
        //drawing line
	Graphics2D g2 = (Graphics2D) page;
	g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.BLACK);
	page.drawLine(442, 200, 884, 200);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {

        Object source = event.getSource();   
        
        if (source == buttonImg) {
           int i = 0;
           while(i < 9) {
               if(bufferedImagesEqual(activeProfile,profiles[8])){
                   activeProfile=profiles[0];
                   buttonImg.setIcon(new ImageIcon(activeProfile));
                   break;
               }
               else if(bufferedImagesEqual(activeProfile,profiles[i])){
                   activeProfile=profiles[i+1];
                   buttonImg.setIcon(new ImageIcon(activeProfile));
                   break;
               }
               i++;
               if(i==8) i=0;
           } 
        }
        if(source == newGameButton){
            ((Window) getRootPane().getParent()).dispose();
            PlayGameFrame playGame = new PlayGameFrame();
        }
   }
    boolean bufferedImagesEqual(BufferedImage img1, BufferedImage img2) {
        if (img1.getWidth() == img2.getWidth() && img1.getHeight() == img2.getHeight()) {
            for (int x = 0; x < img1.getWidth(); x++) {
                for (int y = 0; y < img1.getHeight(); y++) {
                    if (img1.getRGB(x, y) != img2.getRGB(x, y))
                        return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    public static BufferedImage getActiveProfile(){
        return resizeImage(activeProfile, 108,150); 
    }
    public static BufferedImage resizeImage(BufferedImage image, int width, int height) {
         int type=0;
        type = image.getType() == 0? BufferedImage.TYPE_INT_ARGB : image.getType();
        BufferedImage resizedImage = new BufferedImage(width, height,type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(image, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
     }
}
