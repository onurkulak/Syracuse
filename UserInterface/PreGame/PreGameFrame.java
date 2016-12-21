package UserInterface.PreGame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PreGameFrame extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;

    JLabel title = new JLabel("Syracuse");
    JButton newGame = new JButton("New Game");
    JButton quit = new JButton("Quit");
    JButton viewSicilopedia = new JButton("View Sicilopedia");
    JButton viewTrophies = new JButton("View Trophies");
    JButton loadGame = new JButton("Load Game");
    JButton menu1 = new JButton("Return");
    JButton menu2 = new JButton("Return");
    JButton menu3 = new JButton("Return");
    JButton menu4 = new JButton("Return");

    CardLayout layout = new CardLayout();

    final JPanel panel = new JPanel();
    MainMenuPanel menu = new MainMenuPanel(); 
    SicilopediaPanel sicilopediaP = new SicilopediaPanel();
    TrophiesPanel trophiesP = new TrophiesPanel();
    SettingsPanel settingsP = new SettingsPanel();
    LoadGamePanel loadGameP = new LoadGamePanel();
    
    Box box = Box.createVerticalBox();
    
    public PreGameFrame() {
        
        panel.setLayout(layout);
        addButtons();
        addMouseListener (new DotsListener());
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setTitle("Syracuse");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); 
        setVisible(true);
    }

    private void addButtons() {
        
        title.setFont(new java.awt.Font("Serif",Font.BOLD,40));
        title.setForeground(Color.YELLOW);
        
        newGame.addActionListener(this);
        loadGame.addActionListener(this);
        viewSicilopedia.addActionListener(this);
        viewTrophies.addActionListener(this);
        quit.addActionListener(this);
        menu1.addActionListener(this);
        menu2.addActionListener(this);
        menu3.addActionListener(this);
        menu4.addActionListener(this);

        // vertical box for menu
        box.add(Box.createVerticalStrut(200));
        box.add(title);
        box.add(Box.createVerticalStrut(50));
        box.add(newGame);
        box.add(Box.createVerticalStrut(10));
        box.add(viewSicilopedia);
        box.add(Box.createVerticalStrut(10));
        box.add(viewTrophies);
        box.add(Box.createVerticalStrut(10));
        box.add(loadGame);
        box.add(Box.createVerticalStrut(10));
        box.add(quit);
        menu.add(box);
        
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        newGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        viewSicilopedia.setAlignmentX(Component.CENTER_ALIGNMENT);
        viewTrophies.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        quit.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Layouts need to be null to put components on the specific locations
        settingsP.setLayout(null);
        trophiesP.setLayout(null);
        sicilopediaP.setLayout(null);
        loadGameP.setLayout(null);
          
        //return buttons
        menu1.setBounds(906,580,80,30);
        menu2.setBounds(1050,670,80,30);
        menu3.setBounds(1220,720,80,30);
        menu4.setBounds(1050,670,80,30);
      
        settingsP.add(menu1);
        trophiesP.add(menu2);
        sicilopediaP.add(menu3);
        loadGameP.add(menu4);
        

        //adding children to parent Panel
        panel.add(menu,"Menu");
        panel.add(trophiesP,"Trophies");
        panel.add(settingsP,"Settings");
        panel.add(sicilopediaP,"Sicilopedia");
        panel.add(loadGameP,"LoadGame");

        add(panel);
        layout.show(panel,"Menu");
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {

        Object source = event.getSource();

        if (source == quit) 
            System.exit(0);
        else if (source == viewTrophies) 
            layout.show(panel, "Trophies");
        else if (source == viewSicilopedia)
            layout.show(panel, "Sicilopedia");
        else if (source == newGame)
            layout.show(panel, "Settings");
        else if (source == loadGame)
            layout.show(panel, "LoadGame");
        else if (source == menu1)
            layout.show(panel, "Menu");
        else if (source == menu2)
            layout.show(panel, "Menu");
        else if (source == menu3)
            layout.show(panel, "Menu");
        else if (source == menu4)
            layout.show(panel, "Menu");
    }
    //Getting X and Y coordinates
    protected class DotsListener implements MouseListener
   {
      public void mousePressed (MouseEvent event)
      {
          
         int a=event.getX();
         int b=event.getY();
			System.out.println(a+" "+b);
      }
      public void mouseClicked (MouseEvent event) {}
      public void mouseReleased (MouseEvent event) {}
      public void mouseEntered (MouseEvent event) {}
      public void mouseExited (MouseEvent event) {}
   }

}
