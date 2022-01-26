import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class GUI
{
    public static void main(String[] args)
    {
        JFrame CC = new JFrame();
        CC.setTitle("Craving Credits");
        JPanel panel = new JPanel();
        JLabel Anzeige = new JLabel("Du hast zur Zeit " + util.credits + " credits.");
        CC.setSize(800, 800);
        panel.setLayout(null);
 
        // Button FaG wird erstellt
        JButton FaG = new JButton("Forge a Credit");
 
        // Button FaG wird dem Panel hinzugefügt und positioniert
        panel.add(FaG);
        FaG.setBounds(325, 390, 150, 20);
        
        // Label wird dem Panel hinzugefügt und positioniert
        panel.add(Anzeige);
        Anzeige.setBounds(325, 420, 250, 20);
        
        CC.add(panel);
 
        CC.setVisible(true);
        
        FaG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	util.credits = util.credits + 1;
            	Anzeige.setText("Du hast zur Zeit " + String.valueOf(util.credits) + " credits.");
            	
            }
        });
    }
}