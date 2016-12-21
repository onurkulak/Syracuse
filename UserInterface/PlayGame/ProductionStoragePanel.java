

package UserInterface.PlayGame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

public class ProductionStoragePanel extends JPanel{
    private BufferedImage background;
    JPanel panel = new TransparentPanel();
    JPanel panel2 = new TransparentPanel();
    JLabel store = new JLabel("Storage");
    JLabel level = new JLabel("Production&Consumption Levels");
    JLabel levels = new JLabel("      Do Not Produce       Produce Enough to Meet The Demand        "
            + "Produce at Maximum, Give People       Produce at Maximum, Store");
    JLabel title = new JLabel("Production-Storage",SwingConstants.CENTER);
    String[] columnNames = {"Resource Name","Amount in Storage","Expected Production","Expected Consumption","Expected Amount in Storage"};
    Object[][] data = {
        {"Thales of Sard, 42", "<html>Strategic: 8<br>Tactical: 7</html>", "73","<html>Hoplite: 800<br>Cavalry: 1400</html>",
            "X Denarii", "Y Denarii", new Boolean(false)},
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
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)}};
    
    private String[] manufacturedGoodsS = {"Flour","Bread","Meat","Salted Meat","Salted Fish","Cheese","Olive Oil","Glass","Pottery","Wool","Fabric",
            "Dyed Fabric","Clothes","Grape Juice","Lumber","Processed Marble","Accessories","Armour","Iron","Spears-Arrows","Sword","Horses","Pigs","Slave"};
    JSlider slider[] = new JSlider[manufacturedGoodsS.length];
    
    JPanel cont = new TransparentPanel();
    JTable table = new JTable(data, columnNames);
    
    public ProductionStoragePanel(){
        setLayout(null);
        
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);   
        title.setBackground(new Color(255, 255, 204, 150));
        title.setOpaque(true);
        title.setBounds(210, 20, 920, 40);
        
        store.setFont(new java.awt.Font("Serif",Font.BOLD,20));
        store.setForeground(Color.BLACK);   
        store.setOpaque(true);
        store.setBackground(new Color(255, 255, 204, 150));
        store.setBounds(210, 100, 80, 25);
        
        level.setFont(new java.awt.Font("Serif",Font.BOLD,20));
        level.setForeground(Color.BLACK);   
        level.setOpaque(true);
        level.setBackground(new Color(255, 255, 204, 150));
        level.setBounds(210, 440, 280, 25);
        
        levels.setFont(new java.awt.Font("Serif",Font.BOLD,16));
        levels.setForeground(Color.BLACK);   
        levels.setOpaque(false);
        levels.setBounds(0, 7, 920, 25);
        
        panel.setBackground(new Color(255, 255, 204, 100));
        panel.setBounds(210,130,920,270);
        panel.setLayout(null);
        
        panel2.setBackground(new Color(255, 255, 204, 150));
        panel2.setBounds(210,470,920,270);
        panel2.setLayout(null);
        
        table.setOpaque(false);
        table.setBackground(new Color(255, 255, 204, 100));
        table.setModel(model);
        
        for (int i = 0; i < columnNames.length; i++) 
            table.setRowHeight(i, 50);
        table.setFont(new Font("Serif", Font.BOLD, 15));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(180);
        table.getColumnModel().getColumn(1).setPreferredWidth(180);
        table.getColumnModel().getColumn(2).setPreferredWidth(180);
        table.getColumnModel().getColumn(3).setPreferredWidth(180);
        table.getColumnModel().getColumn(4).setPreferredWidth(180);
        
        JScrollPane scroll = new JScrollPane(table);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBounds(0,0,920,270);
        
        cont.setLayout(new GridLayout(manufacturedGoodsS.length,1));   
        cont.setBackground(new Color(255, 255, 204, 50));
        cont.setOpaque(true);
        for (int i = 0; i < manufacturedGoodsS.length; i++){
            slider[i] = new JSlider();
            slider[i].setBorder(BorderFactory.createTitledBorder(manufacturedGoodsS[i]));   
            slider[i].setBackground(new Color(255, 255, 204));
            //slider[i].setOpaque(false);
            cont.add(slider[i]);
        }
        
        JScrollPane scroll2 = new JScrollPane(cont,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        

        scroll2.setBackground(new Color(255, 255, 204, 100));
        scroll2.setBounds(0,40,920,270);
        
        panel2.add(levels);
        panel2.add(scroll2);
        panel.add(scroll);
        add(store);
        add(level);
        add(panel);
        add(panel2);
        add(title); 
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/a.jpg"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 0, this);
    }
    DefaultTableModel model = new DefaultTableModel(data, columnNames){

          public boolean isCellEditable(int row, int column) {fireTableCellUpdated(row, column);return (false);}
    };
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
    public void stateChanged(ChangeEvent e) {
        if (slider == e.getSource()) {
            // Do funky stuff
        }
    }
    /*JScrollPane SP = new JScrollPaneImk(cont,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS){
        {
            setOpaque(false);
            getViewport().setOpaque(false);
        }
            @Override
        public void paintComponent(Graphics g) {
            g.setColor(getBackground());
            Rectangle r = g.getClipBounds();
            g.fillRect(r.x, r.y, r.width, r.height);
            super.paintComponent(g);
        }        
    };*/
}
