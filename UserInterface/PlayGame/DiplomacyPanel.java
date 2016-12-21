
package UserInterface.PlayGame;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.BadLocationException;
import javax.swing.text.TableView.TableRow;
import javax.swing.text.Utilities;

public class DiplomacyPanel extends JPanel implements ActionListener{
    private BufferedImage background,rom,cart;
    JPanel relPanel = new TransparentPanel();
    JPanel exPanel = new TransparentPanel();
    JPanel offerPanel = new TransparentPanel();
    JPanel demandPanel = new TransparentPanel();
    JPanel middlePanel = new TransparentPanel();
    JButton flag = new JButton();
    JLabel exLabel = new JLabel();
    JLabel title = new JLabel("Diplomacy",SwingConstants.CENTER);
    JLabel negRom = new JLabel("Negotiate with Roman",SwingConstants.CENTER);
    JLabel negCart = new JLabel("Negotiate with Carthage",SwingConstants.CENTER);
    JLabel relations = new JLabel();
    JTextArea relationsText = new JTextArea();
    JTextArea romOfferText = new JTextArea();
    JTextArea romDemandText = new JTextArea();
    JTextArea cartOfferText = new JTextArea();
    JTextArea cartDemandText = new JTextArea();
    int roman = 0, carthage = 0, antigonids = 0,seleucids=0,ptolemy=0;
    String romanS,antigonidsS, carthageS ,seleucidsS,ptolemyS; 
        String[] columnNames = {"Demand","Duration Left","Given By"};
    Object[][] data = {
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},
        {"Smith", new Integer(5),new Integer(5)},        
    };
    
    JTable table = new JTable(data, columnNames);
    JTableHeader header = table.getTableHeader();
    
    public DiplomacyPanel() {
        setLayout(null);
        title.setFont(new java.awt.Font("Serif",Font.BOLD,30));
        title.setForeground(Color.BLACK);   
        title.setBackground(new Color(255, 255, 204, 150));
        title.setOpaque(true);
        title.setBounds(0, 10, 1260, 35);
        
        negRom.setFont(new java.awt.Font("Serif",Font.BOLD,20));
        negRom.setForeground(Color.BLACK);   
        negRom.setBackground(new Color(255, 255, 204, 150));
        negRom.setOpaque(true);
        negRom.setBounds(340, 50, 920, 25);
        negRom.setVisible(true);
        
        negCart.setFont(new java.awt.Font("Serif",Font.BOLD,20));
        negCart.setForeground(Color.BLACK);   
        negCart.setBackground(new Color(255, 255, 204, 150));
        negCart.setOpaque(true);
        negCart.setBounds(340, 50, 920, 25);
        negCart.setVisible(false);
        
        relationsText.setFont(new java.awt.Font("Serif",Font.BOLD,15));
        relationsText.setForeground(Color.BLACK);   
        relationsText.setLineWrap(false);
        relationsText.setWrapStyleWord(true);
        relationsText.setOpaque(false);
        relationsText.setEditable(false);
        relationsText.setBounds(30, 0, 330, 130);
        relationsText.setText("Relations \nRoman Republic : "+roman+" ("+romanS+") \nCarthage Empire : "+carthage+" ("+carthageS+") \n"
                + "Antigonids : "+antigonids+" ("+antigonidsS+") \nSeleucids : "+seleucids+" ("+seleucidsS+") \nPtolemy : "+ptolemy+" ("+ptolemyS+")");
        
        romOfferText.setFont(new java.awt.Font("Serif",Font.BOLD,15));
        romOfferText.setForeground(Color.BLACK);   
        romOfferText.setLineWrap(false);
        romOfferText.setWrapStyleWord(true);
        romOfferText.setOpaque(false);
        romOfferText.setEditable(false);
        romOfferText.setBounds(30, 20, 220, 630);
        romOfferText.setText("Offers:\n\n\nMoney\nCarthage Empire\nMoney per Turns\nProvince\nTrade Exceptions\nCancel Trade with Carthage\nDeclare War on Carthage\nSend Aid");
        romOfferText.setVisible(true);
        
        cartOfferText.setFont(new java.awt.Font("Serif",Font.BOLD,15));
        cartOfferText.setForeground(Color.BLACK);   
        cartOfferText.setLineWrap(false);
        cartOfferText.setWrapStyleWord(true);
        cartOfferText.setOpaque(false);
        cartOfferText.setEditable(false);
        cartOfferText.setBounds(30, 20, 220, 630);
        cartOfferText.setText("Offers:\n\n\nMoney\nCarthage Empire\nMoney per Turns\nProvince\nTrade Exceptions\nCancel Trade with Roman\nDeclare War on Roman\nSend Aid");        
        cartOfferText.setVisible(false);
        
        romDemandText.setFont(new java.awt.Font("Serif",Font.BOLD,15));
        romDemandText.setForeground(Color.BLACK);   
        romDemandText.setLineWrap(false);
        romDemandText.setWrapStyleWord(true);
        romDemandText.setOpaque(false);
        romDemandText.setEditable(false);
        romDemandText.setBounds(30, 20, 220, 630);
        romDemandText.setText("Demands:\n\n\nMoney\nCarthage Empire\nMoney per Turns\nProvince\nTrade Exceptions\nCancel Trade with Carthage\nDeclare War on Carthage\nSend Aid");
        romDemandText.setVisible(true);
        
        cartDemandText.setFont(new java.awt.Font("Serif",Font.BOLD,15));
        cartDemandText.setForeground(Color.BLACK);   
        cartDemandText.setLineWrap(false);
        cartDemandText.setWrapStyleWord(true);
        cartDemandText.setOpaque(false);
        cartDemandText.setEditable(false);
        cartDemandText.setBounds(30, 20, 220, 630);
        cartDemandText.setText("Demands:\n\n\nMoney\nCarthage Empire\nMoney per Turns\nProvince\nTrade Exceptions\nCancel Trade with Roman\nDeclare War on Roman\nSend Aid");
        cartDemandText.setVisible(false);
        
        relPanel.setBackground(new Color(255, 255, 204, 150));
        relPanel.setBounds(0, 50, 330, 130);
        relPanel.setLayout(null);     
         
        exPanel.setBackground(new Color(255, 255, 204, 150));
        exPanel.setBounds(0, 190, 330, 150);
        exPanel.setLayout(null); 
         
        middlePanel.setBackground(new Color(255, 255, 204, 150));
        middlePanel.setBounds(600, 80, 400, 640);
        middlePanel.setLayout(null);
         
        offerPanel.setBackground(new Color(255, 255, 204, 150));
        offerPanel.setBounds(340, 80, 250, 675);
        offerPanel.setLayout(null);
         
        demandPanel.setBackground(new Color(255, 255, 204, 150));
        demandPanel.setBounds(1010, 80, 250, 675);
        demandPanel.setLayout(null);
        
        try {
            rom = ImageIO.read(getClass().getResource("/file/roman.jpg"));
            cart = ImageIO.read(getClass().getResource("/file/carthage.jpg"));} 
        catch (IOException ex) {ex.printStackTrace(); }
        
        flag.setBounds(20,0,360,216);
        flag.setIcon(new ImageIcon(rom));
        flag.addActionListener(this);
        
        exLabel.setFont(new java.awt.Font("Serif",Font.BOLD,15));
        exLabel.setForeground(Color.BLACK); 
        exLabel.setBounds(30, 0, 330, 17);
        
        relationsText.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            if (e.getButton() != MouseEvent.BUTTON1) {
               return;
            }

            int offset = relationsText.viewToModel(e.getPoint());
            String[] words = relationsText.getText().split(" ");
            try {
               int rowStart = Utilities.getRowStart(relationsText, offset);
               int rowEnd = Utilities.getRowEnd(relationsText, offset);
               relationsText.setSelectionStart(rowStart);
               relationsText.setSelectionEnd(rowEnd);
               relationsText.setSelectionColor(Color.red);
               System.out.println(rowStart);
               if(rowStart == 10) exLabel.setText("");
               if(rowStart == 11) exLabel.setText("\tRelation with "+words[1]+" "+words[2]+" affected by:\n");
               if(rowStart == 38) exLabel.setText("\tRelation with "+words[6]+" "+words[7]+" affected by:\n");
               if(rowStart == 66) exLabel.setText("\tRelation with "+words[11]+" affected by:\n");
               if(rowStart == 89) exLabel.setText("\tRelation with "+words[15]+" affected by:\n");
               if(rowStart == 111) exLabel.setText("\tRelation with "+words[19]+" affected by:\n");

            } catch (BadLocationException e1) {
               e1.printStackTrace();
            }

         }
      });
        
        romOfferText.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            if (e.getButton() != MouseEvent.BUTTON1) {
               return;
            }

            int offset = romOfferText.viewToModel(e.getPoint());
            String[] words = romOfferText.getText().split(" ");
            try {
               int rowStart = Utilities.getRowStart(romOfferText, offset);
               int rowEnd = Utilities.getRowEnd(romOfferText, offset);
               romOfferText.setSelectionStart(rowStart);
               romOfferText.setSelectionEnd(rowEnd);
               romOfferText.setSelectionColor(Color.red);
               
               /*if(rowStart == 10) exLabel.setText("");
               if(rowStart == 11) exLabel.setText("\tRelation with "+words[1]+" "+words[2]+" affected by:\n");
               if(rowStart == 38) exLabel.setText("\tRelation with "+words[6]+" "+words[7]+" affected by:\n");
               if(rowStart == 66) exLabel.setText("\tRelation with "+words[11]+" affected by:\n");
               if(rowStart == 89) exLabel.setText("\tRelation with "+words[15]+" affected by:\n");
               if(rowStart == 111) exLabel.setText("\tRelation with "+words[19]+" affected by:\n");*/

            } catch (BadLocationException e1) {
               e1.printStackTrace();
            }

         }
      });

        romDemandText.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            if (e.getButton() != MouseEvent.BUTTON1) {
               return;
            }

            int offset = romDemandText.viewToModel(e.getPoint());
            String[] words = romDemandText.getText().split(" ");
            try {
               int rowStart = Utilities.getRowStart(romDemandText, offset);
               int rowEnd = Utilities.getRowEnd(romDemandText, offset);
               romDemandText.setSelectionStart(rowStart);
               romDemandText.setSelectionEnd(rowEnd);
               romDemandText.setSelectionColor(Color.red);
               
               /*if(rowStart == 10) exLabel.setText("");
               if(rowStart == 11) exLabel.setText("\tRelation with "+words[1]+" "+words[2]+" affected by:\n");
               if(rowStart == 38) exLabel.setText("\tRelation with "+words[6]+" "+words[7]+" affected by:\n");
               if(rowStart == 66) exLabel.setText("\tRelation with "+words[11]+" affected by:\n");
               if(rowStart == 89) exLabel.setText("\tRelation with "+words[15]+" affected by:\n");
               if(rowStart == 111) exLabel.setText("\tRelation with "+words[19]+" affected by:\n");*/

            } catch (BadLocationException e1) {
               e1.printStackTrace();
            }

         }
      });        

        cartOfferText.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            if (e.getButton() != MouseEvent.BUTTON1) {
               return;
            }

            int offset = cartOfferText.viewToModel(e.getPoint());
            String[] words = cartOfferText.getText().split(" ");
            try {
               int rowStart = Utilities.getRowStart(cartOfferText, offset);
               int rowEnd = Utilities.getRowEnd(cartOfferText, offset);
               cartOfferText.setSelectionStart(rowStart);
               cartOfferText.setSelectionEnd(rowEnd);
               cartOfferText.setSelectionColor(Color.red);
               
               /*if(rowStart == 10) exLabel.setText("");
               if(rowStart == 11) exLabel.setText("\tRelation with "+words[1]+" "+words[2]+" affected by:\n");
               if(rowStart == 38) exLabel.setText("\tRelation with "+words[6]+" "+words[7]+" affected by:\n");
               if(rowStart == 66) exLabel.setText("\tRelation with "+words[11]+" affected by:\n");
               if(rowStart == 89) exLabel.setText("\tRelation with "+words[15]+" affected by:\n");
               if(rowStart == 111) exLabel.setText("\tRelation with "+words[19]+" affected by:\n");*/

            } catch (BadLocationException e1) {
               e1.printStackTrace();
            }

         }
      });        
        
        cartDemandText.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            if (e.getButton() != MouseEvent.BUTTON1) {
               return;
            }

            int offset = cartDemandText.viewToModel(e.getPoint());
            String[] words = cartDemandText.getText().split(" ");
            try {
               int rowStart = Utilities.getRowStart(cartDemandText, offset);
               int rowEnd = Utilities.getRowEnd(cartDemandText, offset);
               cartDemandText.setSelectionStart(rowStart);
               cartDemandText.setSelectionEnd(rowEnd);
               cartDemandText.setSelectionColor(Color.red);
               
               /*if(rowStart == 10) exLabel.setText("");
               if(rowStart == 11) exLabel.setText("\tRelation with "+words[1]+" "+words[2]+" affected by:\n");
               if(rowStart == 38) exLabel.setText("\tRelation with "+words[6]+" "+words[7]+" affected by:\n");
               if(rowStart == 66) exLabel.setText("\tRelation with "+words[11]+" affected by:\n");
               if(rowStart == 89) exLabel.setText("\tRelation with "+words[15]+" affected by:\n");
               if(rowStart == 111) exLabel.setText("\tRelation with "+words[19]+" affected by:\n");*/

            } catch (BadLocationException e1) {
               e1.printStackTrace();
            }

         }
      });
        header.setOpaque(false);
        header.setBounds(0,350,330,25);
        header.setBackground(new Color(255, 255, 204, 150));

        
        table.setOpaque(false);
        table.setBounds(0,380,330,375);
        table.setBackground(new Color(255, 255, 204, 150));
        table.setModel(Tmodel);
        
        TableRow row = null;
        for (int i = 0; i < 15; i++) 
            table.setRowHeight(i, 25);
        table.setFont(new Font("Serif", Font.BOLD, 20));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        middlePanel.add(flag);
        exPanel.add(exLabel);
        offerPanel.add(romOfferText);
        demandPanel.add(romDemandText);
        offerPanel.add(cartOfferText);
        demandPanel.add(cartDemandText);
        relPanel.add(relationsText);
        add(middlePanel);
        add(demandPanel);
        add(offerPanel);
        add(exPanel);
        add(relPanel);
        add(title);
        add(header);
        add(table);
        add(negRom);
        add(negCart);
    }
    @Override public void paintComponent(Graphics page){ 
   	super.paintComponent(page);
        try {background = ImageIO.read(getClass().getResource("/file/h.jpg"));} 
        catch (IOException ex) {ex.printStackTrace();}
        page.drawImage(background, 0, 0, this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if(source==flag){
            if(negRom.isVisible()){
                negRom.setVisible(false);
                negCart.setVisible(true);
                romOfferText.setVisible(false);
                romDemandText.setVisible(false);
                cartOfferText.setVisible(true);
                cartDemandText.setVisible(true);
                flag.setIcon(new ImageIcon(cart));
            }
            else{
                negRom.setVisible(true);
                negCart.setVisible(false);
                romOfferText.setVisible(true);
                romDemandText.setVisible(true);
                cartOfferText.setVisible(false);
                cartDemandText.setVisible(false);
                flag.setIcon(new ImageIcon(rom));
            }
        }
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
