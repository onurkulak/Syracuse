

package UserInterface.PlayGame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.*;
import javax.swing.text.TableView.TableRow;

public class RecruitmentPanel extends JPanel implements TableModelListener{
    private BufferedImage background;
    JButton apply = new JButton("Apply");
    JButton cancel = new JButton("Cancel");
    JPanel panel = new JPanel();
    JPanel available = new JPanel();
    JPanel total = new JPanel();
    JLabel totalL = new JLabel("Total");
    JLabel availableL = new JLabel("Available");
    JPanel unit = new TransparentPanel();
    JTextArea expT = new JTextArea();
    JLabel title = new JLabel("Recruitment",SwingConstants.CENTER);
    String[] units = {"Hoplites","Slingers","Peltasts","Toxotes","Phalangites","Hetairoi","Onager","Manipulus","Equites","Numidian Cavalry",
            "War Elephants","Balearic Slingers","Libyan Infantries","Tarantine cavalry","Mercenary Hoplite","War Chariots"}; 
    String[] columnNames = {"Unit","Money Cost","Sword Req.","Spear-Arrow Req.", "Armor Req.", "Horse Req.", "Trainig Time"};
    Object[][] data = {
        {units[0], "Smith", new Integer(5),new Integer(5),"Snowboarding", new Integer(5), new Boolean(false)},
        {units[1], "Doe",new Integer(5),new Integer(5),"Rowing", new Integer(3), new Boolean(true)},
        {units[2], "Black", new Integer(5),new Integer(5),"Knitting", new Integer(2), new Boolean(false)},
        {units[3], "White",new Integer(5),new Integer(5),"Speed reading", new Integer(20), new Boolean(true)},
        {units[4], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[5], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[6], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[7], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[8], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[9], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[10], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[11], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[12], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[13], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[14], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)},
        {units[15], "Brown",new Integer(5),new Integer(5),"Pool", new Integer(10), new Boolean(false)}
    };
    SpinnerModel model=new SpinnerNumberModel(0,0,10,1) ;              
    JTable table = new JTable(data, columnNames);
    JTableHeader header = table.getTableHeader();
    JSpinner[] spinners = new JSpinner[16];
    
    public RecruitmentPanel(){
        int x=120, y=70;
        setLayout(null);
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);
        title.setBounds(120, 30, 1000, 30);
        title.setBackground(new Color(255, 255, 204, 180));
        title.setOpaque(true);
        
        for(int i = 0 ; i < 16 ; i++){ 
            spinners[i] = new JSpinner(new SpinnerNumberModel(0,0,100,1));
            spinners[i].setSize(60,25);
            //spinners[i].setBackground(new Color(255, 255, 204, 150));
            spinners[i].setOpaque(false);
            spinners[i].getEditor().setOpaque(false);
            panel.add(spinners[i]);
        }
        
        panel.setBackground(new Color(255, 255, 204, 150));
        panel.setBounds(1120,y+30,80,400);
        panel.setLayout(new GridLayout(16,1));
        
        header.setOpaque(false);
        header.setBounds(x,y,1000,25);
        header.setBackground(new Color(255, 255, 204, 150));

        
        table.setOpaque(false);
        table.setBounds(x,y+30,1000,400);
        table.setBackground(new Color(255, 255, 204, 150));
        table.setModel(Tmodel);
        table.getModel().addTableModelListener(this);
        
        TableRow row = null;
        for (int i = 0; i < units.length; i++) 
            table.setRowHeight(i, 25);
        table.setFont(new Font("Serif", Font.BOLD, 20));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        
        available.setBounds(x+810,510,190,230);
        available.setBackground(new Color(255, 255, 204, 150));
        available.add(availableL);
        
        total.setBounds(x+610,510,190,230);
        total.setBackground(new Color(255, 255, 204, 150));
        total.add(totalL);
        
        unit.setBounds(x,510,600,230);
        unit.setBackground(new Color(255, 255, 204, 150));
        
        apply.setBounds(1120,510,80,30);   
        cancel.setBounds(1120,540,80,30);
                  
        expT.setFont(new Font("Serif", Font.BOLD, 18));
        expT.setForeground(Color.BLACK);
        expT.setLineWrap(true);
        expT.setWrapStyleWord(true);
        expT.setOpaque(false);
        expT.setEditable(false);
        expT.setBounds(10,10,590,220);
        unit.setLayout(null);
        unit.add(expT);
        
        add(cancel);
        add(apply);
        add(total);
        add(unit);
        add(available);
        add(table);
        add(header);
        add(panel);
        add(title); 
        
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/i.jpg"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 0, this);
        page.setFont(new Font("Serif", Font.BOLD, 20));
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = Tmodel.getValueAt(row, column);
                
        for(int i = 0 ; i<units.length; i++)
           if(units[i].equals(data.toString()))
               expT.setText(units[i]);
           
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
            
        DefaultTableModel Tmodel = new DefaultTableModel(data, columnNames){

          public boolean isCellEditable(int row, int column) {fireTableCellUpdated(row, column);return (false);}
    };

}

