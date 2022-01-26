import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class GUI
{
    public static void main(String[] args)
    {
    	//Menu gets Created 
        JFrame startup = new JFrame("Main Menu");
        startup.setSize(400, 400);
        startup.setVisible(true);
        
        //panel for props of menu
        JPanel panelM = new JPanel();
        panelM.setLayout(null);
        
        //panelM gets added to startup
        startup.add(panelM);
        
        //Button for Startmenu gets defined and placed onto panel
        JButton start = new JButton("May the Force be with you!");
        panelM.add(start);
        start.setBounds(100, 200, 200, 20);
        
        //textfield for name gets created and placed onto panel for props
        JTextField NameField = new JTextField("Insert your name here!");
        panelM.add(NameField);
        NameField.setBounds(100, 160, 200, 20);
        
        //stuff
    	JFrame CC = new JFrame();
        JPanel panelCC = new JPanel();
        JLabel Anzeige = new JLabel("Du hast zur Zeit " + util.credits + " credits.");
        CC.setSize(800, 800);
        panelCC.setLayout(null);
       
 
        // Button FaG gets created
        JButton FaG = new JButton("Forge a Credit");
 
        // Button FaG wgets added to panelCC and positioned
        panelCC.add(FaG);
        FaG.setBounds(325, 390, 150, 20);
        
        // Label gets added to PanelCC and positioned
        panelCC.add(Anzeige);
        Anzeige.setBounds(325, 420, 250, 20);
        
        //panelCC gets added to CC
        CC.add(panelCC);
       
        //start up game, switch window, name factory
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	CC.setTitle("This is " + util.playername + " 's Credit Forge.");
            	CC.setVisible(true);
            	startup.setVisible(false);
            	util.playername = NameField.getText();
            	System.out.println(util.playername);
            	
            }
        });
        
        //basic credit mechanism
        FaG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	util.credits = util.credits + 1;
            	
            }
        });
        
    }
}