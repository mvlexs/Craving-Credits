  import javax.swing.*;
  import java.awt.*;
  import java.util.Timer;
  import java.util.TimerTask;
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
        JLabel Anzeige = new JLabel("Du hast zur Zeit 0 credits.");   
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
        
        //button für Upgrades wird erzeugt 
        JButton UPG = new JButton("zu den Upgrades!");
        
        //Button für Upgrades gets added and positioned
        panelCC.add(UPG);
        UPG.setBounds(325, 450, 150, 20);
        
    //Upgrade Frame etc mit platzieren 
    JFrame DD = new JFrame();
    JPanel panelDD = new JPanel();
    JLabel Nummer1 = new JLabel("");
    DD.setSize(400, 400);
    DD.setBounds(790,0,500,800);
    panelDD.setLayout(null);
        
    //Upgrade.preis wird festgelegt 
    //Upgrade.preis1 = 
    Upgrade.Anzahlpreis1 = 1;
    
    
    //Nummer 1 Label wird auf panelDD gemacht dazu der passende Button 
     panelDD.add(Nummer1);
       Nummer1.setBounds(100, 100, 150, 20);
       JButton erstesUpgrade= new JButton("100");
       panelDD.add(erstesUpgrade);
       erstesUpgrade.setBounds(100,130,100,30);
           
       //ich weiß nicht warum aber ohne geht es nicht 
       DD.add(panelDD);
    
           //cps hochzählen 
          erstesUpgrade.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
          util.cps= util.cps +0.5;
          Upgrade.Anzahlpreis1=Upgrade.Anzahlpreis1+1;
          util.credits = util.credits - ((Upgrade.Anzahlpreis1-1)*100);
          }
        });       
          //das neue Feld öffnen (Upgrades)
           UPG.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
          DD.setTitle(util.playername +"'s Upgrades");
          DD.setVisible(true);
          Nummer1.setText("Fingerprint");
          }
        });
       
        //start up game, switch window, name factory
        start.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
              util.playername = NameField.getText();
              CC.setTitle("This is " + util.playername + "'s Credit Forge.");
              CC.setVisible(true);
              startup.setVisible(false);  
            }
        });
        
        //basic credit mechanism
        FaG.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        util.credits = util.credits + 1;
        Anzeige.setText("Du hast zur Zeit " + util.credits + " credits.");
        
        }
    });
     //private Timer timer1 = new Timer(1000, null);
        //TImer erstellen 
        Timer CookieTimer = new Timer();
        CookieTimer.scheduleAtFixedRate(new TimerTask(){
          @Override
          public void run () {
            util.credits= util.credits + util.cps;
            Anzeige.setText("Du hast zur Zeit " + util.credits + " credits.");
            erstesUpgrade.setText(""+Upgrade.Anzahlpreis1*100+"");         //Upgrade.Anzahlpreis
            if (util.credits >= Upgrade.Anzahlpreis1*100) {
          erstesUpgrade.setEnabled(true);
          }  else {
          erstesUpgrade.setEnabled(false);
          }
          }
        },1000,1000);
    
        Timer updateGui = new Timer();
        updateGui.scheduleAtFixedRate(new TimerTask(){
          @Override
          public void run () {
            Anzeige.setText("Du hast zur Zeit " + util.credits + " credits.");
            erstesUpgrade.setText(""+Upgrade.Anzahlpreis1*100+"");         //Upgrade.Anzahlpreis
            if (util.credits >= Upgrade.Anzahlpreis1*100) {
          erstesUpgrade.setEnabled(true);
          }  else {
          erstesUpgrade.setEnabled(false);
          }
          }
        },100,100);
          
    }
    }
