
package UserInterface.PlayGame;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import UserInterface.PreGame.PreGameFrame;

public class PlayGameFrame extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    private BufferedImage[] menuIcons = new BufferedImage[11];
    CardLayout layout = new CardLayout();
    final JPanel panel = new JPanel(); 
    CityLayerPanel cityP = new CityLayerPanel();
    SicilyLayerPanel sicilyP = new SicilyLayerPanel();
    GrandMapPanel grandP = new GrandMapPanel();
    RecruitmentPanel recruitmentP = new RecruitmentPanel();
    ProductionStoragePanel proStoreP = new ProductionStoragePanel();
    PopulationHappinessPanel popHappP = new PopulationHappinessPanel();
    MercenaryPanel mercenaryP = new MercenaryPanel();
    CivicsPanel civicsP = new CivicsPanel();
    DiplomacyPanel diplomacyP = new DiplomacyPanel();   
    AvailableGeneralsPanel generalsP = new AvailableGeneralsPanel();
    TradePanel tradeP = new TradePanel();
    
    JPanel menu[] = new JPanel[11];
    JButton cityB[] = new JButton[11];
    JButton sicilyB[] = new JButton[11];
    JButton grandB[] = new JButton[11];
    JButton recruitmentB[] = new JButton[11];
    JButton proStoreB[] = new JButton[11];
    JButton popHappB[] = new JButton[11];
    JButton mercenaryB[] = new JButton[11];
    JButton civicsB[] = new JButton[11];
    JButton diplomacyB[] = new JButton[11];
    JButton generalsB[] = new JButton[11];
    JButton tradeB[] = new JButton[11];
    JButton quit[] = new JButton[11];
    
    
    public PlayGameFrame(){
        
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
        
        try {
            menuIcons[0] = ImageIO.read(getClass().getResource("/file/city.jpg"));
            menuIcons[1] = ImageIO.read(getClass().getResource("/file/sicilyButton.gif"));
            menuIcons[2] = ImageIO.read(getClass().getResource("/file/grand.jpg"));
            menuIcons[3] = ImageIO.read(getClass().getResource("/file/general.jpg"));
            menuIcons[4] = ImageIO.read(getClass().getResource("/file/diplomacy.jpg"));
            menuIcons[5] = ImageIO.read(getClass().getResource("/file/civics.jpg"));
            menuIcons[6] = ImageIO.read(getClass().getResource("/file/trade.jpg"));
            menuIcons[7] = ImageIO.read(getClass().getResource("/file/recruitment.jpg"));
            menuIcons[8] = ImageIO.read(getClass().getResource("/file/mercenary.jpg"));
            menuIcons[9] = ImageIO.read(getClass().getResource("/file/population.jpg"));
            menuIcons[10] = ImageIO.read(getClass().getResource("/file/product.jpg"));
        } 
        catch (IOException ex) {
            ex.printStackTrace(); 
        } 
 
        for(int i = 0 ; i<11 ; i++){
            cityB[i] = new JButton();
            sicilyB[i] = new JButton(); 
            grandB[i] = new JButton();
            recruitmentB[i] = new JButton(); 
            proStoreB[i] = new JButton();
            tradeB[i] = new JButton(); 
            diplomacyB[i] = new JButton();
            civicsB[i] = new JButton(); 
            mercenaryB[i] = new JButton();
            generalsB[i] = new JButton();
            popHappB[i] = new JButton();
            quit[i] = new JButton("Quit");
            
            int a =10;
            cityB[i].setBounds(1270,a,60,60);
            sicilyB[i].setBounds(1270,a+65,60,60);
            grandB[i].setBounds(1270,a+130,60,60);
            recruitmentB[i].setBounds(1270,a+195,60,60);
            proStoreB[i].setBounds(1270,a+260,60,60);
            popHappB[i].setBounds(1270,a+325,60,60);
            mercenaryB[i].setBounds(1270,a+390,60,60);
            civicsB[i].setBounds(1270,a+455,60,60);
            diplomacyB[i].setBounds(1270,a+520,60,60);
            generalsB[i].setBounds(1270,a+585,60,60);
            tradeB[i].setBounds(1270,a+650,60,60);
            quit[i].setBounds(1270,a+715,60,20);
            
            cityB[i].setIcon(new ImageIcon(menuIcons[0]));
            sicilyB[i].setIcon(new ImageIcon(menuIcons[1]));
            grandB[i].setIcon(new ImageIcon(menuIcons[2]));
            recruitmentB[i].setIcon(new ImageIcon(menuIcons[7]));
            proStoreB[i].setIcon(new ImageIcon(menuIcons[10]));
            tradeB[i].setIcon(new ImageIcon(menuIcons[6]));
            diplomacyB[i].setIcon(new ImageIcon(menuIcons[4]));
            civicsB[i].setIcon(new ImageIcon(menuIcons[5]));
            mercenaryB[i].setIcon(new ImageIcon(menuIcons[8]));
            generalsB[i].setIcon(new ImageIcon(menuIcons[3]));
            popHappB[i].setIcon(new ImageIcon(menuIcons[9]));
            
            cityB[i].addActionListener(this);
            sicilyB[i].addActionListener(this);
            grandB[i].addActionListener(this);
            recruitmentB[i].addActionListener(this);
            proStoreB[i].addActionListener(this);
            popHappB[i].addActionListener(this);
            mercenaryB[i].addActionListener(this);
            civicsB[i].addActionListener(this);
            diplomacyB[i].addActionListener(this);
            generalsB[i].addActionListener(this);
            tradeB[i].addActionListener(this);
            quit[i].addActionListener(this);
        }
        
        for(int i = 0 ; i<11 ; i++){
            menu[i] = new JPanel();
            menu[i].add(cityB[i]);
            menu[i].add(sicilyB[i]);
            menu[i].add(grandB[i]);
            menu[i].add(recruitmentB[i]);
            menu[i].add(proStoreB[i]);
            menu[i].add(popHappB[i]);
            menu[i].add(mercenaryB[i]);
            menu[i].add(civicsB[i]);
            menu[i].add(diplomacyB[i]);
            menu[i].add(generalsB[i]);
            menu[i].add(tradeB[i]);
            menu[i].add(quit[i]);
            menu[i].setLayout(null);
            menu[i].setOpaque(false);
            menu[i].setBounds(0,0,1450,900);
        }
        
        cityP.add(menu[0]);
        sicilyP.add(menu[1]);
        grandP.add(menu[2]);
        recruitmentP.add(menu[3]);
        proStoreP.add(menu[4]);
        popHappP.add(menu[5]);
        mercenaryP.add(menu[6]);
        civicsP.add(menu[7]);
        diplomacyP.add(menu[8]);
        generalsP.add(menu[9]);
        tradeP.add(menu[10]);     

        //adding children to parent Panel
        panel.add(cityP,"City");
        panel.add(sicilyP,"Sicily");
        panel.add(grandP,"Grand");
        panel.add(recruitmentP,"Recruitment");
        panel.add(proStoreP,"ProStore");
        panel.add(popHappP,"PopHapp");
        panel.add(mercenaryP,"Mercenary");
        panel.add(civicsP,"Civics");
        panel.add(diplomacyP,"Diplomacy");
        panel.add(generalsP,"Generals");
        panel.add(tradeP,"Trade");
        

        add(panel);
        layout.show(panel,"City");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
       Object source = event.getSource();
       for(int i = 0 ; i < 11 ; i++){
            if (source == cityB[i]) 
                layout.show(panel, "City");
            else if (source == sicilyB[i]) 
                layout.show(panel, "Sicily");
            else if (source == grandB[i]) 
                layout.show(panel, "Grand");
            else if (source == recruitmentB[i]) 
                layout.show(panel, "Recruitment");
            else if (source == proStoreB[i]) 
                layout.show(panel, "ProStore");
            else if (source == popHappB[i]) 
                layout.show(panel, "PopHapp");
            else if (source == mercenaryB[i]) 
                layout.show(panel, "Mercenary");
            else if (source == civicsB[i]) 
                layout.show(panel, "Civics");
            else if (source == diplomacyB[i]) 
                layout.show(panel, "Diplomacy");
            else if (source == generalsB[i]) 
                layout.show(panel, "Generals");
            else if (source == tradeB[i]) 
                layout.show(panel, "Trade");
            else if (source == quit[i]){
                Object[] options = {"Save","Don't Save","Cancel"};
                int n = JOptionPane.showOptionDialog(null,
                            "What do you want to do?",
                            "Choose an option!",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.DEFAULT_OPTION,
                            null,
                            options,
                            options[1]);
                if(n==0){  
                    dispose();
                    PreGameFrame frame = new PreGameFrame();
                }else if(n==1){
                    dispose();
                    PreGameFrame frame = new PreGameFrame();
                }else if(n==2){
                 
                }
            }
       }
        
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

