

package UserInterface.PlayGame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.text.TableView.TableRow;

public class TradePanel extends JPanel{
    private BufferedImage background;
    JButton acceptBuy = new JButton("Accept Offer");
    JButton acceptSell = new JButton("Accept Offer");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel title = new JLabel("Trade",SwingConstants.CENTER);
    String[] buyColumnNames = {"Type","Amount","Cost","Offering Faction", "Duration"};
    String[] sellColumnNames = {"Type","Amount","Cost","Offering Faction", "Duration"};
    Object[][] buyData = {
        {"", "Smith", new Integer(5),new Integer(5),"Snowboarding", new Integer(5), new Boolean(false)},
        {"", "Doe",new Integer(5),new Integer(5),"Rowing", new Integer(3), new Boolean(true)},
        {"", "Black", new Integer(5),new Integer(5),"Knitting", new Integer(2), new Boolean(false)},
        {"", "White",new Integer(5),new Integer(5),"Speed reading", new Integer(20), new Boolean(true)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)}};
    Object[][] sellData = {};              
    JTable buyTable = new JTable(buyData, buyColumnNames);              
    JTable sellTable = new JTable(sellData, sellColumnNames);
    
    public TradePanel(){
        
        setLayout(null);
        int x = 50, y = 70;
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.WHITE);
        title.setBounds(210, 30, 920, 30);
        title.setBackground(new Color(255, 255, 204, 180));
        
        panel.setBackground(new Color(255, 255, 204, 180));
        panel.setBounds(880,y,320,300);
        panel.setLayout(null);
        
        panel2.setBackground(new Color(255, 255, 204, 150));
        panel2.setBounds(880,y+330,320,300);
        panel2.setLayout(null);
        
        buyTable.setOpaque(false);
        buyTable.setBackground(new Color(255, 255, 204, 150));
        
        TableRow row = null;
        for (int i = 0; i < buyColumnNames.length; i++) 
            buyTable.setRowHeight(i, 25);
        buyTable.setFont(new Font("Serif", Font.BOLD, 20));
        buyTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        buyTable.getColumnModel().getColumn(0).setPreferredWidth(140);
        buyTable.getColumnModel().getColumn(1).setPreferredWidth(140);
        buyTable.getColumnModel().getColumn(2).setPreferredWidth(140);
        buyTable.getColumnModel().getColumn(3).setPreferredWidth(140);
        buyTable.getColumnModel().getColumn(4).setPreferredWidth(140);
        
        JScrollPane buyScroll = new JScrollPane(buyTable);
        buyScroll.setBackground(new Color(255, 255, 204, 150));
        buyScroll.setOpaque(false);
        buyScroll.getViewport().setOpaque(false);
        buyScroll.setBounds(x+70,y,700,300);
        
        sellTable.setOpaque(false);
        sellTable.setBackground(new Color(255, 255, 204, 150));
        
        TableRow row2 = null;
        for (int i = 0; i < sellColumnNames.length; i++) 
            sellTable.setRowHeight(i, 25);
        sellTable.setFont(new Font("Serif", Font.BOLD, 20));
        sellTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        sellTable.getColumnModel().getColumn(0).setPreferredWidth(140);
        sellTable.getColumnModel().getColumn(1).setPreferredWidth(140);
        sellTable.getColumnModel().getColumn(2).setPreferredWidth(140);
        sellTable.getColumnModel().getColumn(3).setPreferredWidth(140);
        sellTable.getColumnModel().getColumn(4).setPreferredWidth(140);
        
        JScrollPane sellScroll = new JScrollPane(sellTable);
        sellScroll.setBackground(new Color(255, 255, 204, 150));
        sellScroll.setOpaque(false);
        sellScroll.getViewport().setOpaque(false);
        sellScroll.setBounds(x+70,y+330,700,300);
        
        acceptBuy.setBounds(700,370,120,20);
        acceptSell.setBounds(700,700,120,20);
         
        add(panel);
        add(panel2);
        add(acceptSell);
        add(acceptBuy);
        add(sellScroll);
        add(buyScroll);
        add(title); 
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/j.jpg"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 0, this);
    }
}
