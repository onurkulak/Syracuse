

package UserInterface.PlayGame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.table.*;
import javax.swing.text.TableView.TableRow;

public class MercenaryPanel extends JPanel{
    private BufferedImage background;
    JPanel panel = new TransparentPanel();
    JLabel title = new JLabel("Available Mercenary Armies",SwingConstants.CENTER);
    JButton hire = new JButton("Hire Mercenaries");
    JButton cancel = new JButton("Cancel Changes");
    JLabel totalCost = new JLabel("",SwingConstants.CENTER);
    String[] columnNames = {"Leader","Abilities","Popularity","Force", "Cost", "Monthly Wage", "Select"};
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
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {"", "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)}};
    
    JTable table = new JTable(data, columnNames); 
    public MercenaryPanel(){
        setLayout(null);
        int cost = 0;
        
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);
        title.setBounds(100, 30, 1065, 40); 
        title.setBackground(new Color(255, 255, 204, 150));
        title.setOpaque(true); 
          
        panel.setBackground(new Color(255, 255, 204, 0));
        panel.setOpaque(false);
        panel.setBounds(100, 100, 1065, 690);
        panel.setLayout(null);
        
        totalCost.setText("Total Cost: "+cost);   
        totalCost.setFont(new java.awt.Font("Serif",Font.BOLD,25));
        totalCost.setForeground(Color.BLACK);
        totalCost.setBackground(new Color(255, 255, 204, 150));
        totalCost.setOpaque(true);
        totalCost.setBounds(0, 550, 335, 40); 
           
        hire.setFont(new java.awt.Font("Serif",Font.BOLD,25));
        hire.setForeground(Color.BLACK);
        hire.setBounds(365, 550, 335, 40);
           
        cancel.setFont(new java.awt.Font("Serif",Font.BOLD,25));
        cancel.setForeground(Color.BLACK);
        cancel.setBounds(730, 550, 335, 40);
        
        table.setOpaque(false);
        table.setBackground(new Color(255, 255, 204, 150));
        table.setModel(model);
        
        for (int i = 0; i < columnNames.length; i++) 
            table.setRowHeight(i, 50);
        table.setFont(new Font("Serif", Font.BOLD, 15));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);
        table.getColumnModel().getColumn(5).setPreferredWidth(150);
        table.getColumnModel().getColumn(6).setPreferredWidth(150);
       
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBackground(new Color(255, 255, 204, 150));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBounds(0,0,1065,530);
        
        panel.add(totalCost);
        panel.add(cancel);
        panel.add(hire);
        panel.add(scroll);
        add(panel);
        add(title); 
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/e.jpg"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 0, this);
    }    
    TableModel model = new AbstractTableModel(){

        public int getColumnCount() {return columnNames.length;}

          public String getColumnName(int column) {return columnNames[column];}

          public int getRowCount() {return data.length;}

          public Object getValueAt(int row, int column) {return data[row][column];}

          public Class getColumnClass(int column) {return (getValueAt(0, column).getClass());}

          public void setValueAt(Object value, int row, int column) {data[row][column] = value;fireTableCellUpdated(row, column);}

          public boolean isCellEditable(int row, int column) {return (true);}
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
}
