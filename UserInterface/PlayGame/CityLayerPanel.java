
package UserInterface.PlayGame;
import UserInterface.PreGame.SettingsPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class CityLayerPanel extends JPanel implements ActionListener{
    int currentLayerNumber=0;
    int count = 0;
    int ROAD = 0;
    MyLabel label;
    private BufferedImage up,down,left,right,sandWatch;
    Point location = new Point(0,0);
    final int cityHeight = 704, cityWidth = 1136;
    //compose building types buttons
    JButton[] typeButtons = new JButton[8];
    JButton basic = new JButton("Basic");
    JButton production = new JButton("Production");
    JButton storage = new JButton("Storage");
    JButton happiness = new JButton("Happiness");
    JButton science = new JButton("Science");
    JButton military = new JButton("Military");
    JButton unique = new JButton("Unique");
    JButton wonders = new JButton("Wonders");
    //compose building types panels and scrollpanes
    JPanel[] buildings = new TransparentPanel[8];
    JScrollPane[] scrollers = new JScrollPane[8];
    JPanel basicP = new TransparentPanel();
    JScrollPane scroller1 = new JScrollPane(basicP);
    JPanel productionP = new TransparentPanel();
    JScrollPane scroller2 = new JScrollPane(productionP);
    JPanel storageP = new TransparentPanel();
    JScrollPane scroller3 = new JScrollPane(storageP);
    JPanel happinessP = new TransparentPanel();
    JScrollPane scroller4 = new JScrollPane(happinessP);
    JPanel scienceP = new TransparentPanel();
    JScrollPane scroller5 = new JScrollPane(scienceP);
    JPanel militaryP = new TransparentPanel();
    JScrollPane scroller6 = new JScrollPane(militaryP);
    JPanel uniqueP = new TransparentPanel();
    JScrollPane scroller7 = new JScrollPane(uniqueP);
    JPanel wondersP = new TransparentPanel();
    JScrollPane scroller8 = new JScrollPane(wondersP);
    //compose building types labels
    JLabel[] labels = new JLabel[8];
    JLabel basicL = new JLabel("Basics");
    JLabel productionL = new JLabel("Production");
    JLabel storageL = new JLabel("Storage");
    JLabel happinessL = new JLabel("Happiness");
    JLabel scienceL = new JLabel("Science");
    JLabel militaryL = new JLabel("Military");
    JLabel uniqueL = new JLabel("Unique");
    JLabel wondersL = new JLabel("Wonders");
    
    JPanel[] layers = new JPanel[9];
    JPanel currentLayer = new JPanel();
    MouseHandler mh  = new MouseHandler();
    JButton upButton = new JButton();
    JButton downButton = new JButton();
    JButton leftButton = new JButton();
    JButton rightButton = new JButton();
    JButton fixButton = new JButton("Build!");
    JButton nextTerm = new JButton();
    
    private String[] buildingsS = {"Roads","Roads2","House","Mansion","Granary","Palace","Docks","Fishery","Shrines","Temples","Theatre","Library","Academy",
                "Observatory","Mill","Bakery","Slave Trader","Salt Merchant","Fabric Workshop","Tailor","Jeweler","Cheese Merchant","Pig Farm",
                "Butchery","Marble-Cutters","Lumber Merchants","Olive Presser","Oil Merchant","Grape Juice Distillery","Grape Juice Merchant",
                "Metal Merchant","Armory","Weapon Maker","Glass Maker","Pottery Maker","Stable","Archery Range","Siege Workshop","Barrack",
                "General’s Headquarters","Shipyard","Lighthouse","Courthouse","Agora","Public Bath","Monuments","Claw of Archimedes",
                "Forge","The Great Lighthouse","The Colossus","The Parthenon","The Statue of Zeus"};
    private BufferedImage buildingImage[] = new BufferedImage[buildingsS.length];
    JLabel[] buildingsIcons = new MyLabel[buildingsS.length];
    JLabel[] buildingsNames = new JLabel[buildingsS.length];
    final JTextArea expT = new JTextArea("Selected Building");
    JButton upgrade = new JButton("Upgrade");
    JButton delete = new JButton("Delete");
    int helpFix = 0; // used to control fixButton and drag building feature
    int helpDelete = 0;
    public CityLayerPanel(){
        
        setLayout(null);
        setBackground(new Color(255, 255, 200));
        
        try {up = ImageIO.read(getClass().getResource("/file/up.jpg"));} 
        catch (IOException ex) {} 
        try {down = ImageIO.read(getClass().getResource("/file/down.jpg"));} 
        catch (IOException ex) {}    
        try {left = ImageIO.read(getClass().getResource("/file/left.jpg"));} 
        catch (IOException ex) {}    
        try {right = ImageIO.read(getClass().getResource("/file/right.jpg"));} 
        catch (IOException ex) {}    
        try {sandWatch = ImageIO.read(getClass().getResource("/file/term.jpg"));} 
        catch (IOException ex) {}   
        
        upButton.setIcon(new ImageIcon(up));
        upButton.setBounds(35,625,30,30);
        upButton.addActionListener(this);
        downButton.setIcon(new ImageIcon(down));
        downButton.setBounds(35,655,30,30);
        downButton.addActionListener(this);
        leftButton.setIcon(new ImageIcon(left));
        leftButton.setBounds(5,640,30,30);
        leftButton.addActionListener(this);
        rightButton.setIcon(new ImageIcon(right));
        rightButton.setBounds(65,640,30,30);
        rightButton.addActionListener(this);
        
        nextTerm.setIcon(new ImageIcon(sandWatch));
        nextTerm.setBounds(25,694,50,50);
        nextTerm.addActionListener(this);
        
        expT.setFont(new Font("Serif", Font.BOLD, 15));
        expT.setForeground(Color.BLACK);
        expT.setBackground(new Color(255, 255, 100));
        expT.setLineWrap(true);
        expT.setWrapStyleWord(true);
        expT.setOpaque(true);
        expT.setEditable(false);
        expT.setBounds(118,709,824,50);
        
        fixButton.setBounds(952,709,100,50);
        fixButton.addActionListener(this);
        upgrade.setBounds(946+108,709,100,50);
        upgrade.addActionListener(this);
        delete.setBounds(1046+108,709,100,50);
        delete.addActionListener(this);
        composeLayers();
        composeBuildingsTypePanels();
        
        add(upButton);
        add(downButton);
        add(leftButton);
        add(rightButton);
        add(basic);
        add(production);
        add(storage);
        add(happiness);
        add(science);
        add(military);
        add(unique);
        add(wonders);
        add(currentLayer);
        add(expT);
        add(delete);
        add(upgrade);
        add(fixButton);
        add(nextTerm);
        
    }
    //Listening button actions
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if(source == basic)
            addPanel("Basics");
        if(source == production)
            addPanel("Production");
        if(source == storage)
            addPanel("Storage");
        if(source == happiness)
            addPanel("Happiness");
        if(source == science)
            addPanel("Science");
        if(source == military)
            addPanel("Military");
        if(source == unique)
            addPanel("Unique");
        if(source == wonders)
            addPanel("Wonders");
        if(source == fixButton)
            helpFix = 0;
        if(source == delete){
            if(helpDelete == 0)
                helpDelete = 1;
            else 
                helpDelete = 0;
        }
        if(source == upButton) {
            for(int i = 3 ; i < 9 ; i++){
                if(currentLayer==layers[i]){
                    currentLayer=layers[i-3];
                    currentLayerNumber = i-3;
                    remove(layers[i-3]);
                    layers[i].setVisible(false);
                    add(currentLayer);
                    currentLayer.setVisible(true);
                    return;
                }
            }
        }
        if(source == downButton) {
            for(int i = 0 ; i < 6 ; i++){
                if(currentLayer==layers[i]){
                    currentLayer=layers[i+3];
                    currentLayerNumber = i+3;
                    remove(layers[i+3]);
                    layers[i].setVisible(false);
                    add(currentLayer);
                    currentLayer.setVisible(true);
                    return;
                }
            }
        }
        if(source == leftButton) {
            for(int i = 0 ; i < 9 ; i++){
                if((i+3)%3!=0){
                    if(currentLayer==layers[i]){
                        currentLayer=layers[i-1];
                        currentLayerNumber = i-1;
                        remove(layers[i-1]);
                        layers[i].setVisible(false);
                        add(currentLayer);
                        currentLayer.setVisible(true);
                        return;
                    }
                }
            }
        }
        if(source == rightButton) {
            for(int i = 0 ; i < 9 ; i++){
                if((i+1)%3!=0){
                    if(currentLayer==layers[i]){
                        currentLayer=layers[i+1];
                        currentLayerNumber = i+1;
                        remove(layers[i+1]);
                        layers[i].setVisible(false);
                        add(currentLayer);
                        currentLayer.setVisible(true);
                        return;
                    }
                }
            }
        }
    }
    //There are 9 city layers in the game
    void composeLayers(){
        for(int n = 0 ; n < 9 ; n++){
            layers[n] = new MyPanel(n);
            layers[n].setLayout(null);
            layers[n].setBounds(118,0,cityWidth,cityHeight);
        }
        currentLayer = layers[0];
    }
    //Building type panels are showed when related buttons are clicked and disappear
    void addPanel(String type){
        for(int i = 0 ; i < 8 ; i++){
            if((labels[i].getName()).equals(type)){
                int k = i;
                for(int j = i+1 ; j < 8 ; j++)
                    typeButtons[j].setBounds(typeButtons[k].getX(),typeButtons[k].getY()+200+25*(j-k),108,25);
                
                if (scrollers[i].isVisible()){
                    scrollers[i].setVisible(false);
                    for(int j = i+1 ; j < 8 ; j++)
                        typeButtons[j].setBounds(typeButtons[j-1].getX(),typeButtons[j-1].getY()+25,108,25);
                }
                else if (scrollers[0].isVisible() | scrollers[1].isVisible() | scrollers[2].isVisible() | scrollers[3].isVisible() 
                        | scrollers[4].isVisible() | scrollers[5].isVisible() | scrollers[6].isVisible() | scrollers[7].isVisible() ){
                                      
                    for(int j = 0 ; j <8 ; j++) scrollers[j].setVisible(false);
                    for(int j = 0 ; j < 8 ; j++)
                        typeButtons[j].setBounds(0,150+j*25,108,25);
                    
                    scrollers[i].setBounds(typeButtons[i].getX(),typeButtons[i].getY()+25,108,200);
                    for(int j = i+1 ; j < 8 ; j++)
                        typeButtons[j].setBounds(typeButtons[k].getX(),typeButtons[k].getY()+200+25*(j-k),108,25);
                    scrollers[i].setVisible(true);      
                }
                else{
                    scrollers[i].setBounds(typeButtons[i].getX(),typeButtons[i].getY()+25,108,200);
                    scrollers[i].setVisible(true);
                }
            }
        }
    }
    //Building type panels are composed
    void composeBuildingsTypePanels(){
        
        typeButtons[0] = basic;
        typeButtons[1] = production;
        typeButtons[2] = storage;
        typeButtons[3] = happiness;
        typeButtons[4] = science;
        typeButtons[5] = military;
        typeButtons[6] = unique;
        typeButtons[7] = wonders;
        for(int i = 0 ; i < 8 ; i++){
            typeButtons[i].setBounds(0,150+i*25,108,25);
            typeButtons[i].addActionListener(this);
        }
        
        buildings[0] = basicP;
        buildings[1] = productionP;
        buildings[2] = storageP;
        buildings[3] = happinessP;
        buildings[4] = scienceP;
        buildings[5] = militaryP;
        buildings[6] = uniqueP;
        buildings[7] = wondersP;
        
        scrollers[0] = scroller1;
        scrollers[1] = scroller2;
        scrollers[2] = scroller3;
        scrollers[3] = scroller4;
        scrollers[4] = scroller5;
        scrollers[5] = scroller6;
        scrollers[6] = scroller7;
        scrollers[7] = scroller8;
        
        labels[0] = basicL;
        labels[1] = productionL;
        labels[2] = storageL;
        labels[3] = happinessL;
        labels[4] = scienceL;
        labels[5] = militaryL;
        labels[6] = uniqueL;
        labels[7] = wondersL;   
        
        labels[0].setName("Basics");
        labels[1].setName("Production");
        labels[2].setName("Storage");
        labels[3].setName("Happiness");
        labels[4].setName("Science");
        labels[5].setName("Military");
        labels[6].setName("Unique");
        labels[7].setName("Wonders"); 
        
        
        int xx = 0, yy = 100;
        for(int i = 0; i <8 ; i++){
            labels[i].setFont(new java.awt.Font("Serif",Font.BOLD,15));
            buildings[i].setBounds(xx,yy+i*25,108,200);
            buildings[i].setBackground(new Color(255, 255, 204, 220));
            buildings[i].add(labels[i]);
            scrollers[i].setOpaque(false);
            scrollers[i].getViewport().setOpaque(false);
            add(scrollers[i]);
            scrollers[i].setVisible(false);
        }        
        for(int i = 0 ; i<buildingsS.length ; i++){
            try {buildingImage[i] = ImageIO.read(getClass().getResource("/file/"+buildingsS[i]+".jpg"));} 
            catch (IOException ex) {} 
            buildingsIcons[i] = new MyLabel();
            buildingsIcons[i].setName(buildingsS[i]);
            buildingsIcons[i].setSize(buildingImage[i].getWidth(), buildingImage[i].getHeight());
            buildingsIcons[i].addMouseListener(mh);
            buildingsIcons[i].addMouseMotionListener(mh);
            buildingsIcons[i].setIcon(new ImageIcon(buildingImage[i]));
            buildingsNames[i] = new JLabel(buildingsS[i]);
            if(i<10){
                buildings[0].setLayout(new GridLayout(21,1));
                buildings[0].add(buildingsNames[i]);
                buildings[0].add(buildingsIcons[i]);
            }
            else if(i>=10&&i<20){
                buildings[1].add(buildingsNames[i]);
                buildings[1].add(buildingsIcons[i]);
                buildings[1].setLayout(new GridLayout(21,1));
            }
            else if(i>=20&&i<30){
                buildings[2].add(buildingsNames[i]);
                buildings[2].add(buildingsIcons[i]);
                buildings[2].setLayout(new GridLayout(21,1));
            }
            else if(i>=30&&i<40){
                buildings[3].add(buildingsNames[i]);
                buildings[3].add(buildingsIcons[i]);
                buildings[3].setLayout(new GridLayout(21,1));
            }
            else{
                buildings[4].add(buildingsNames[i]);
                buildings[4].add(buildingsIcons[i]);
                buildings[4].setLayout(new GridLayout(25,1));
            }
        }        
    }
    String getExplanation(String head, String tail){
        String exp="",result = "";
        /*try{
            BufferedReader fw = new BufferedReader(new FileReader(new File(myPath+"a.txt")));
            boolean partB = false;
            exp = fw.readLine();
            words = exp.split(":");
            while(words[0] != null) {
                if (words[0].equals(head)) {
                    partB = true;
                } else if (words[0].equals(tail)) {
                    partB = false;
                }
                if (partB) {
                    result += exp;
                }
                exp = fw.readLine();
                words = exp.split(":");
            }
        }
        catch(Exception e){

        }*/
        return result;
    }
    //Provides building types panel to be transparent
    private class TransparentPanel extends JPanel {
        {
            setOpaque(false);
        }
            @Override
        public void paintComponent(Graphics g) {
            g.setColor(getBackground());
            Rectangle r = g.getClipBounds();
            g.fillRect(r.x, r.y, r.width, r.height);
            super.paintComponent(g);
        }
    }
    private class MyPanel extends JPanel {
        int nn;
        public MyPanel(int n){
            nn = n;
        }
            @Override
            public void paintComponent(Graphics page){
                super.paintComponent(page);
                for (int i = 0; i < cityHeight/16 ; i++) {
                    for (int j = 0; j < cityWidth/16; j++) {
                        page.setColor(Color.green);
                        page.fillRect(16*j, 16*i, 16,16);
                        page.setColor(Color.black);
                        page.drawString("L="+nn, 10, 10);
                        page.setColor(Color.cyan);
                        if(nn==0|nn==3|nn==6)
                            if(j<cityWidth/128)
                                page.fillRect(16*j, 16*i, 16,16);
                        if(nn==5|nn==8)
                            if(j>7*cityWidth/128)
                                page.fillRect(16*j, 16*i, 16,16);
                        if(nn==6|nn==7|nn==8)
                            if(i>7*cityHeight/128)
                                page.fillRect(16*j, 16*i, 16,16);
                    }
                }               
                page.setColor(Color.red);   
                if(location.getX()==175.0&&location.getY()==287.0)
                    page.drawRect(label.getX()-1,label.getY()-1,label.getWidth()+1,label.getHeight()+1);
                else{
                    page.setColor(Color.WHITE);
                    if(helpFix==1)
                        page.drawRect(label.getX()-1,label.getY()-1,label.getWidth()+1,label.getHeight()+1);
                }
            }
    }    
    private class MyLabel extends JLabel {
        Boolean draggable = true;
        String type = "";
        int count = 0;
        public MyLabel(){
        }
        void setDraggable(Boolean drag){
            draggable  = drag;
        }
        void setType(String t){
           type = t;
        }
        void setCount(int n){
           count = n;
        }
        Boolean isDraggable(){
            return draggable;       
        }
    }
     @Override
     public void paintComponent(Graphics page) {
        super.paintComponent(page);
        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                page.setColor(Color.green);
                page.fillRect(20*j+20, 20*i+555, 20,20);
                
                    page.setColor(Color.cyan);
                    page.fillRect(21, 556, 3,59);
                    page.fillRect(21, 611, 59,4);
                    page.fillRect(76, 576, 4,39);
                
                page.setColor(Color.black);
                page.drawRect(20*j+20, 20*i+555, 20,20);
                page.drawString(""+(3*i+j), 20*j+25, 20*i+570);
            }
        }
        page.drawImage(SettingsPanel.getActiveProfile(), 0, 0, this);
        page.setColor(Color.black);
        page.drawString("Date:****", 15, 760);
        page.setColor(Color.red);
        for(int i = 0 ; i < 9 ; i++){
            if(i==currentLayerNumber){
                page.fillOval(20*(currentLayerNumber%3)+25+8, 20*(currentLayerNumber/3)+567,5,5);
            }
        }
        repaint();
     }
        //All mouse event handled
        protected class MouseHandler extends MouseAdapter {
            private Point offset;
            @Override
            //When mouse pressed if it is in the type panel, newBuilding method is calles so that it produces a new building
            public void mousePressed(MouseEvent e) {
                label = (MyLabel) e.getComponent();
                for(int i = 0 ; i <8 ; i++)
                    if(label.getParent()==buildings[i])
                        newBuilding(e);
                    offset = e.getPoint();
            }
            public MouseHandler(){
            }
            //Buildings can be carried if they are not in the type panel
            @Override
            public void mouseDragged(MouseEvent e) {
                label = (MyLabel) e.getComponent();
                JLabel lbl = new JLabel(new ImageIcon(iconToImage(label.getIcon())));
                for(int i = 0 ; i < 9 ; i++)
                    if(label.getParent()==layers[i]){
                            if(helpFix==0){
                                label.setDraggable(false);
                                helpFix=1;
                            }
                    }  
                if(!label.isDraggable())
                    return;
                for(int i = 0 ; i < 8 ; i++)
                    if(label.getParent()==buildings[i])
                        return;
                int x1 = e.getPoint().x - offset.x;
                int y1 = e.getPoint().y - offset.y;
                Component component = e.getComponent();
                location = component.getLocation();
                location.x += x1;
                location.y += y1;
                if(location.x%16 != 0)
                    location.x -= location.x%16+1; 
                if(location.y%16 != 0)
                    location.y -= location.y%16+1; 
                if(ROAD==1)
                    if(label.type== buildingsS[0]| label.type==buildingsS[1])  
                        newRoad(e,(int)location.getX(),(int)location.getY());
                component.setLocation(location);
                System.out.println(location.getX()+" "+location.getY());
                currentLayer.revalidate();
                currentLayer.repaint();
            }
            @Override
            public void mouseClicked(MouseEvent event){
                ROAD  = 0;
                label = (MyLabel) event.getComponent();
                expT.setText(label.type);
                for(int i = 0 ; i < buildingsS.length ; i++){
                    if(label == buildingsIcons[i]){
                        expT.setText(buildingsIcons[i].getName());
                    }
                }
                for(int i = 0 ; i < 9 ; i++)
                    if(label.getParent()==layers[i]){
                        if(helpDelete==1){
                            layers[i].remove(label);
                            layers[i].revalidate();
                            layers[i].repaint();
                        }
                    }
                if (event.getClickCount() == 2)
                    if(ROAD==0)
                        ROAD = 1;
                    else
                        ROAD = 0;
                System.out.println(ROAD);
            }
            MyLabel newBuilding(MouseEvent e){
                count++;
                label = (MyLabel) e.getComponent();
                MyLabel newLabel = new MyLabel();
                newLabel.setIcon(new ImageIcon(iconToImage(label.getIcon())));
                newLabel.addMouseListener(mh);
                newLabel.addMouseMotionListener(mh);
                newLabel.setBounds(new Rectangle(new Point(200, 300), newLabel.getPreferredSize()));
                newLabel.setCount(count);
                newLabel.setType(label.getName());
                currentLayer.add(newLabel);
                currentLayer.revalidate();
                currentLayer.repaint();
                helpFix = 1;
                helpDelete = 0;
                return newLabel;
            }
            MyLabel newRoad(MouseEvent e, int X, int Y){
                label = (MyLabel) e.getComponent();
                MyLabel newLabel = new MyLabel();
                newLabel.setIcon(new ImageIcon(iconToImage(label.getIcon())));
                newLabel.addMouseListener(mh);
                newLabel.addMouseMotionListener(mh);
                newLabel.setBounds(new Rectangle(new Point(X, Y), newLabel.getPreferredSize()));
                newLabel.setCount(count);
                newLabel.setType(label.getName());
                currentLayer.add(newLabel);
                currentLayer.revalidate();
                currentLayer.repaint();
                helpFix = 1;
                helpDelete = 0;
                return newLabel;
            }
            void buildBuilding(MouseEvent e){
              
            }
        }
        private Image iconToImage(Icon icon)
        {
            if(icon instanceof ImageIcon)
            {
                return ((ImageIcon) icon).getImage();
            }
            else
            {
                BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
                icon.paintIcon(null, image.getGraphics(), 0, 0);
                return image;
            }
        }
}

