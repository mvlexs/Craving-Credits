import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 13.01.2022
 * @author 
 */

public class counterframe extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
    private ImageIcon jButton1Icon = new ImageIcon(getClass().getResource("images/index-removebg-preview.png"));
  private int credits;
  private JLabel credit_display = new JLabel();
  // Ende Attribute
  
  public counterframe() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 613; 
    int frameHeight = 611;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("counterframe");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(96, 40, 107, 160);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setIcon(jButton1Icon);

    jButton1.setBorderPainted(false);
    jButton1.setContentAreaFilled(false);
    cp.add(jButton1);
    credit_display.setBounds(128, 216, 75, 20);
    credit_display.setText("");
    credit_display.setHorizontalAlignment(SwingConstants.RIGHT);
    cp.add(credit_display);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    cp.add(jButton1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public counterframe
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new counterframe();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    credits = credits + 1;
    credit_display.setText(String.valueOf(credits));
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class counterframe

