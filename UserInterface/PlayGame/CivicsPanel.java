
package UserInterface.PlayGame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;

public class CivicsPanel extends JPanel implements ActionListener{
    private BufferedImage background;
    JLabel title = new JLabel("Civics",SwingConstants.CENTER);
    JPanel panel = new JPanel();
    JLabel governmentH = new JLabel("Government");
    JLabel economyH = new JLabel("Economy");
    JLabel militaryH = new JLabel("Military");
    JRadioButton option1 = new JRadioButton("Tyranny");
    JRadioButton option2 = new JRadioButton("Oligarchy");
    JRadioButton option3 = new JRadioButton("Democracy");
    JRadioButton option4 = new JRadioButton("Trade Economy");
    JRadioButton option5 = new JRadioButton("Agrainism");
    JRadioButton option6 = new JRadioButton("Guilds");
    JRadioButton option7 = new JRadioButton("Militia");
    JRadioButton option8 = new JRadioButton("Mercenaries");
    JRadioButton option9 = new JRadioButton("Standing Army");
    ButtonGroup governmentGroup = new ButtonGroup();
    ButtonGroup economyGroup = new ButtonGroup();
    ButtonGroup militaryGroup = new ButtonGroup();
    String tyrannyS = "Tyranny";
    String oligarchyS = "Oligarchy";
    String democracyS = "Democracy";
    String tradeEconomyS = "Trade Economy";
    String agrainismS = "Agrainism";
    String guildsS = "Guilds";
    String militiaS = "Militia";
    String mercenariesS = "Mercenaries";
    String standingArmyS = "Standing Army";
    JTextArea governmentT = new JTextArea(tyrannyS);
    JTextArea economyT = new JTextArea(tradeEconomyS);
    JTextArea militaryT = new JTextArea(militiaS);
    
    public CivicsPanel(){
        setLayout(null);
        int x = 230;
        int y = 40;
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);   
        title.setBackground(new Color(255, 255, 204, 150));
        title.setOpaque(true);
        title.setBounds(210, 30, 920, 40);
        
        panel.setBackground(new Color(255, 255, 204, 150));
        panel.setBounds(210,85,920,630);
        panel.setLayout(null);
        
        governmentH.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD,20));
        governmentH.setForeground(Color.BLACK);
        governmentH.setBounds(x, y+80, 240, 40);
        
        economyH.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD,20));
        economyH.setForeground(Color.BLACK);
        economyH.setBounds(x+350, y+80, 240, 40);
        
        militaryH.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD,20));
        militaryH.setForeground(Color.BLACK);
        militaryH.setBounds(x+700, y+80, 240, 40);
        
        governmentGroup.add(option1);   option1.setBounds(x, y+140, 100,40);  option1.setOpaque(false);   option1.setForeground(Color.BLACK);
        governmentGroup.add(option2);   option2.setBounds(x, y+170, 100,40);  option2.setOpaque(false);   option2.setForeground(Color.BLACK);
        governmentGroup.add(option3);   option3.setBounds(x, y+200, 100,40);  option3.setOpaque(false);   option3.setForeground(Color.BLACK);
        option1.setSelected(true);
        
        economyGroup.add(option4);  option4.setBounds(x+350, y+140, 200,40);  option4.setOpaque(false);   option4.setForeground(Color.BLACK);
        economyGroup.add(option5);  option5.setBounds(x+350, y+170, 100,40);  option5.setOpaque(false);   option5.setForeground(Color.BLACK);
        economyGroup.add(option6);  option6.setBounds(x+350, y+200, 100,40);  option6.setOpaque(false);   option6.setForeground(Color.BLACK);
        option4.setSelected(true);
        
        militaryGroup.add(option7); option7.setBounds(x+700, y+140, 100,40);  option7.setOpaque(false);   option7.setForeground(Color.BLACK);
        militaryGroup.add(option8); option8.setBounds(x+700, y+170, 100,40);  option8.setOpaque(false);   option8.setForeground(Color.BLACK);
        militaryGroup.add(option9); option9.setBounds(x+700, y+200, 200,40);  option9.setOpaque(false);   option9.setForeground(Color.BLACK);
        option7.setSelected(true);
        
        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);
        option4.addActionListener(this);
        option5.addActionListener(this);
        option6.addActionListener(this);
        option7.addActionListener(this);
        option8.addActionListener(this);
        option9.addActionListener(this);
        
        governmentT.setFont(new Font("Serif", Font.ITALIC, 16));
        governmentT.setLineWrap(true);
        governmentT.setWrapStyleWord(true);
        governmentT.setBounds(x,y+300,200,400);
        governmentT.setOpaque(false);
        governmentT.setEditable(true);
        
        economyT.setFont(new Font("Serif", Font.ITALIC, 16));
        economyT.setLineWrap(true);
        economyT.setWrapStyleWord(true);
        economyT.setBounds(x+350,y+300,200,300);
        economyT.setOpaque(false);
        governmentT.setEditable(true);
        
        militaryT.setFont(new Font("Serif", Font.ITALIC, 16));
        militaryT.setLineWrap(true);
        militaryT.setWrapStyleWord(true);
        militaryT.setBounds(x+700,y+300,200,300);
        militaryT.setOpaque(false);
        governmentT.setEditable(true);
        
        add(option1);
        add(option2);
        add(option3);
        add(option4);
        add(option5);
        add(option6);
        add(option7);
        add(option8);
        add(option9);
        add(governmentT);
        add(economyT);
        add(militaryT);       
        add(governmentH);
        add(economyH);
        add(militaryH);
        add(panel);
        add(title); 
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/m.jpg"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 0, this);
    }

   @Override
    public void actionPerformed(ActionEvent event) {
        
        Object source = event.getSource();
            
        if(source == option1)
            governmentT.setText(tyrannyS);
        else if(source == option2){System.out.println("here");option2.setSelected(true);if(option2.isSelected())
            governmentT.setText(oligarchyS);}
        else if(source == option3)
            governmentT.setText(democracyS);
        if(source == option4)
            economyT.setText(tradeEconomyS);
        else if(source == option5)
            economyT.setText(agrainismS);
        else if(source == option6)
            economyT.setText(guildsS);
        if(source == option7)
            militaryT.setText(militiaS);
        else if(source == option8)
            militaryT.setText(mercenariesS);
        else if(source == option9)
            militaryT.setText(standingArmyS);
        
    }

}
