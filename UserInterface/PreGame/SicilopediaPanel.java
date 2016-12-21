
package UserInterface.PreGame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.event.*;
import javax.swing.tree.*;

public class SicilopediaPanel extends JPanel{
    private BufferedImage background;
    DefaultTreeModel treeModel;
    JPanel content =  new TransparentPanel();
    JPanel explanation = new TransparentPanel();
    JLabel title = new JLabel("Sicilopedia",SwingConstants.CENTER);
    String[] words;
    
    private String[] files = { "About Game", "Buildings", "Manufactured Goods", "Wonders", "Raw Resources", "Units",
      "General Traits", "Civilizations"};
    
    private String[] buildingsS = {"Roads","House","Mansion","Granary","Palace","Docks","Fishery","Shrines","Temples","Theatre","Library","Academy",
                "Observatory","Mill","Bakery","Slave Trader","Salt Merchant","Fabric Workshop","Tailor","Jeweler","Cheese Merchant","Pig Farm",
                "Butchery","Marble-Cutters","Lumber Merchants","Olive Presser","Oil Merchant","Grape Juice Distillery","Grape Juice Merchant",
                "Metal Merchant","Armory","Weapon Maker","Glass Maker","Pottery Maker","Stable","Archery Range","Siege Workshop","Barrack",
                "General’s Headquarters","Shipyard","Lighthouse","Courthouse","Agora","Public Bath","Monuments","Claw of Archimedes"}; 
    
    private String[] wondersS = {"The Great Lighthouse","The Colossus","The Parthenon","The Statue of Zeus"};
    
    private String[] manufacturedGoodsS = {"Flour","Bread","Meat","Salted Meat","Salted Fish","Cheese","Olive Oil","Glass","Pottery","Wool","Fabric",
            "Dyed Fabric","Clothes","Grape Juice","Lumber","Processed Marble","Accessories","Armour","Iron","Spears-Arrows","Sword","Horses","Pigs","Slave"};
    
    private String[] rawResourcesS = {"Fish","Sheep","Wheat","Barley","Olive","Flax","Marble","Dye","Grape","Gold and Silver","Copper","Iron Ore",
            "Timber","Ivory","Salt"};
    
    private String[] unitsS = {"Hoplites","Slingers","Peltasts","Toxotes","Phalangites","Hetairoi","Onager","Manipulus","Equites","Numidian Cavalry",
            "War Elephants","Balearic Slingers","Libyan Infantries","Tarantine cavalry","Mercenary Hoplite","War Chariots"}; 
        
    final JTextArea expT = new JTextArea(getExplanation("Syracuse",buildingsS[0]));
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Syracuse");
        DefaultMutableTreeNode aboutGame = new DefaultMutableTreeNode(files[0]); 
        DefaultMutableTreeNode buildings = new DefaultMutableTreeNode(files[1]);
        DefaultMutableTreeNode manufacturedGoods = new DefaultMutableTreeNode(files[2]);
        DefaultMutableTreeNode wonders = new DefaultMutableTreeNode(files[3]);
        DefaultMutableTreeNode rawResources = new DefaultMutableTreeNode(files[4]);
        DefaultMutableTreeNode units = new DefaultMutableTreeNode(files[5]);
        DefaultMutableTreeNode generalTraits = new DefaultMutableTreeNode(files[6]);
        DefaultMutableTreeNode civilizations = new DefaultMutableTreeNode(files[7]);
    final JTree tree;
    public SicilopediaPanel(){
        
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);
        title.setBackground(new Color(255, 255, 204, 180));
        title.setOpaque(true);
        title.setBounds(40, 20, 1260, 40);
        
        treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);
        tree.setOpaque(false);
        tree.setBounds(0,0,260,650);
        
        treeModel.insertNodeInto(aboutGame,root, 0);
        treeModel.insertNodeInto(buildings,root, 1);
        treeModel.insertNodeInto(manufacturedGoods,root, 2);
        treeModel.insertNodeInto(wonders,root, 3);
        treeModel.insertNodeInto(rawResources,root, 4);
        treeModel.insertNodeInto(units,root, 5);
        treeModel.insertNodeInto(generalTraits,root, 6);
        treeModel.insertNodeInto(civilizations,root, 7);
        
        setExplanation();
        
        for(int i = 0; i<buildingsS.length; i++)
            buildings.add(new DefaultMutableTreeNode(buildingsS[i]));
        
        for(int i = 0; i<wondersS.length; i++)
            wonders.add(new DefaultMutableTreeNode(wondersS[i]));
        
        for(int i = 0; i<manufacturedGoodsS.length; i++)
            manufacturedGoods.add(new DefaultMutableTreeNode(manufacturedGoodsS[i]));
        
        for(int i = 0; i<rawResourcesS.length; i++)
            rawResources.add(new DefaultMutableTreeNode(rawResourcesS[i])); 
        
        for(int i = 0; i<unitsS.length; i++)
            units.add(new DefaultMutableTreeNode(unitsS[i]));
        
        content.setBackground(new Color(255, 255, 204, 150));
        content.setBounds(40,70,260,650);
        content.setLayout(null);
        JScrollPane scroller = new JScrollPane(tree);
        scroller.setOpaque(false);
        scroller.getViewport().setOpaque(false);
        scroller.setBounds(0,0,260,650);
        content.add(scroller);
        
        explanation.setBackground(new Color(255, 255, 204,150));
        explanation.setBounds(325,70,975,650);
        explanation.setLayout(null);          
        expT.setFont(new Font("Serif", Font.BOLD, 18));
        expT.setForeground(Color.BLACK);
        expT.setLineWrap(true);
        expT.setWrapStyleWord(true);
        expT.setOpaque(false);
        expT.setEditable(false);
        expT.setBounds(160,90,650,470);
        explanation.add(expT);
                
        add(content);
        add(explanation);
        add(title); 
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/k.jpg"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 0, this);
    }
    String getExplanation(String head, String tail){
        String exp="",result = "";
        try{
            InputStreamReader reader =  new InputStreamReader(this.getClass().getResourceAsStream("/file/a.txt"));
            BufferedReader fw = new BufferedReader(reader);
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

        }
        return result;
    }
    void setExplanation(){
        final int a = buildingsS.length;
        final int b = buildingsS.length+wondersS.length;
        final int c = buildingsS.length+wondersS.length+manufacturedGoodsS.length;
        final int d = buildingsS.length+wondersS.length+manufacturedGoodsS.length+rawResourcesS.length;
        final int e = buildingsS.length+wondersS.length+manufacturedGoodsS.length+rawResourcesS.length+unitsS.length;
        final int f = buildingsS.length+wondersS.length+manufacturedGoodsS.length+rawResourcesS.length+unitsS.length+files.length;
        
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent event) {

                
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                tree.getLastSelectedPathComponent();

                if (node == null) expT.setText(getExplanation("Syracuse",buildingsS[0]));
                
                Object nodeInfo = node.getUserObject();
                for(int i = 0 ; i<a; i++){
                    if(buildingsS[i].equals(nodeInfo.toString())){
                        if(i==a-1)
                            expT.setText(getExplanation(buildingsS[i],wondersS[0]));
                        else 
                            expT.setText(getExplanation(buildingsS[i],buildingsS[i+1]));
                    }           
                }
                for(int i = a ; i<b; i++){
                    if(wondersS[i-a].equals(nodeInfo.toString())){
                        if(i==b-1)
                            expT.setText(getExplanation(wondersS[i-a],manufacturedGoodsS[0]));
                        else
                            expT.setText(getExplanation(wondersS[i-a],wondersS[i+1-a]));
                    }           
                }
                for(int i = b ; i<c; i++){
                    if(manufacturedGoodsS[i-b].equals(nodeInfo.toString())){
                        if(i==c-1)
                            expT.setText(getExplanation(manufacturedGoodsS[i-b],rawResourcesS[0]));
                        else
                            expT.setText(getExplanation(manufacturedGoodsS[i-b],manufacturedGoodsS[i+1-b]));
                    }           
                }
                for(int i = c ; i<d; i++){
                    if(rawResourcesS[i-c].equals(nodeInfo.toString())){
                        if(i==d-1)
                            expT.setText(getExplanation(rawResourcesS[i-c],unitsS[0]));
                        else
                            expT.setText(getExplanation(rawResourcesS[i-c],rawResourcesS[i+1-c]));
                    }           
                }
                for(int i = d ; i<e; i++){
                    if(unitsS[i-d].equals(nodeInfo.toString())){
                        if(i==e-1)
                            expT.setText(getExplanation(unitsS[i-d],files[0]));
                        else
                            expT.setText(getExplanation(unitsS[i-d],unitsS[i+1-d]));
                    }           
                }
                for(int i = e ; i<f; i++){
                    if(files[i-e].equals(nodeInfo.toString())){
                        if(i==f-1)
                            expT.setText(getExplanation(files[i-e],"Syracuse"));
                        else
                            expT.setText(getExplanation(files[i-e],files[i+1-e]));
                    }           
                }
                if("Syracuse".equals(nodeInfo.toString()))
                        expT.setText(getExplanation("Syracuse",buildingsS[0]));
            }
        });
        
    }
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
}