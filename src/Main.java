
//import com.sun.glass.events.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EvMcQ5970
 */
public class Main extends javax.swing.JFrame {
    
    //Variables
    int cardNum = 0;
    
    int chur = 5;
    int pop = 5;
    int army = 5;
    int mon = 5;
    
    int save1Dat = 0, save2Dat = 0, save3Dat = 0, save4Dat = 0;
    
    // Special conditions
    
    
    //Constructors
    Game thisGame = new Game(cardNum, chur, pop, army, mon);
    Write save = new Write();//chur, army, pop, mon, cardNum, "src\\data\\slotx"
    Read load = new Read();
    
    //Arrays
    //Option 1
    int[] chur1 = {0,
                0,
                2,
                1,
                2,
                -1,
                2,
                0,
                2,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0};
    int[] pop1 = {0,
                1,
                0,
                -1,
                1,
                0,
                2,
                1,
                1,
                0,
                2,
                3,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0};
    int[] army1 = {0,
                0,
                -1,
                0,
                0,
                -2,
                2,
                2,
                0,
                -2,
                1,
                -1,
                -10,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0};
    int[] mon1 = {0,
                -1,
                0,
                0,
                -1,
                0,
                -2,
                -2,
                0,
                0,
                -2,
                -1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0};
    
    //Option 2
    int[] chur2 = {0,
                -1,
                -3,
                -1,
                -1,
                1,
                -1,
                0,
                -1,
                -1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0};
    int[] pop2 = {0,
                -1,
                0,
                1,
                -2,
                1,
                -2,
                -1,
                -2,
                0,
                -1,
                -3,
                -1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0};
    int[] army2 = {0,
                0,
                2,
                0,
                0,
                0,
                -1,
                -1,
                0,
                0,
                -1,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0};
    int[] mon2 = {0,
                0,
                2,
                0,
                1,
                -1,
                0,
                0,
                1,
                0,
                1,
                2,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0};
    
    //Conversations
    String[] toYou = {"Intro",
                    "My Queen, the peasants are complaining about a food shortage."
                    , "My Queen, we wish to mine a nearby mountain, but the church says it is holy ground.",
                    "My Queen, the church believes there is a witch amongst your subjects",
                    "Your Majesty! There is a plague sweeping our Kingdom! Should we help the sick or dispose of them?",
                    "My Queen, our scout has spotted an army heading to attack us! Should we fight back or try to negotiate?",
                    "My Queen, the kingdom is running out of food!! Should buy more from neighbouring villages and kingdoms or let the peasants starve?",
                    "A group of skilled hunters are looking to be hired by you, My Queen, to bring good quality food to our kingdom!",
                    "We believe there are a group of witches that are hiding in our Kingdom. My Queen, shall we burn them at the stake or use them for their power?",
                    "A general in your army has been cheating on his wife!",
                    "The castle is throwing a feast for the new year, how would you like the food?",
                    "The civilians are demanding that taxes be lowered!",
                    "An enemy army has approached your castle and are offering us a giant wooden horse. Should we accept?",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ", " ", " ", " "};
    String[] ans1 = {"Got it",
                    "Increase funding for farmers.",
                    "Leave it be! Do you wish to anger the Gods?",
                    "Burn the witch!",
                    "Help them, of course!",
                    "To arms!",
                    "We need to overcome this crisis. Buy all the food we can afford.",
                    "Hire them! I've always wanted fresh food.",
                    "Hunt them down and kill them, obviously!",
                    "Unacceptible! I don't need people like that fighting for me.",
                    "Only the best for our people.",
                    "Perhaps we have been too hard on them...",
                    "OH GOOD, I LOVE HORSES!",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ", " ", " ", " ", " ", " ",
                    " ", " ", " ", " "};
    String[] ans2 = {"Cool",
                    "Who cares?",
                    "Ignore the church, we need those metals.",
                    "Don't you touch them!",
                    "Don't risk it.",
                    "Hold it, let's see if they'll listen to reason.",
                    "Let the lower class starve, they aren't important anyways.",
                    "Turn them down, I am satisfied with my meals as they are.",
                    "We'd be fools to give up such power.",
                    "Don't bring your stupid gossip to me!",
                    "Anything will do.",
                    "Who are they to demand anything?",
                    "I already have, like, 14 horses I don't need any more.",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ",
                    " ", " ", " ", " ", " ", " ", " ", " ",
                    " ", " ", " ", " "};
    
    
    
    
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        NGLabel = new javax.swing.JLabel();
        DatLabel = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();
        DatBackLabel = new javax.swing.JLabel();
        ToMenuLabel = new javax.swing.JLabel();
        stat1 = new javax.swing.JLabel();
        stat2 = new javax.swing.JLabel();
        stat3 = new javax.swing.JLabel();
        stat4 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        op1 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        op2 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        BGData = new javax.swing.JLabel();
        BGMenu = new javax.swing.JLabel();
        BGGame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenLogo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(450, 40, 230, 210);

        TitleLabel.setFont(new java.awt.Font("Plantagenet Cherokee", 3, 44)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(156, 239, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("God  Save  the  Queen");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(320, 270, 490, 50);

        NGLabel.setFont(new java.awt.Font("Pristina", 3, 38)); // NOI18N
        NGLabel.setForeground(new java.awt.Color(202, 239, 242));
        NGLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NGLabel.setText("New Game");
        NGLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NGLabelMouseClicked(evt);
            }
        });
        getContentPane().add(NGLabel);
        NGLabel.setBounds(480, 350, 170, 70);

        DatLabel.setFont(new java.awt.Font("Pristina", 3, 28)); // NOI18N
        DatLabel.setForeground(new java.awt.Color(191, 226, 229));
        DatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatLabel.setText("Save / Load");
        DatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatLabelMouseClicked(evt);
            }
        });
        getContentPane().add(DatLabel);
        DatLabel.setBounds(480, 440, 160, 50);

        ExitLabel.setFont(new java.awt.Font("Pristina", 3, 28)); // NOI18N
        ExitLabel.setForeground(new java.awt.Color(181, 214, 216));
        ExitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitLabel.setText("Exit");
        ExitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ExitLabel);
        ExitLabel.setBounds(520, 520, 80, 40);

        DatBackLabel.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        DatBackLabel.setForeground(new java.awt.Color(202, 239, 242));
        DatBackLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatBackLabel.setText("Back");
        DatBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatBackLabelMouseClicked(evt);
            }
        });
        getContentPane().add(DatBackLabel);
        DatBackLabel.setBounds(1070, 560, 90, 40);

        ToMenuLabel.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        ToMenuLabel.setForeground(new java.awt.Color(202, 239, 242));
        ToMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ToMenuLabel.setText("Main Menu");
        ToMenuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToMenuLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ToMenuLabel);
        ToMenuLabel.setBounds(990, 560, 170, 40);

        stat1.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        stat1.setForeground(new java.awt.Color(156, 239, 255));
        stat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat1.setText("5");
        getContentPane().add(stat1);
        stat1.setBounds(380, 50, 18, 44);

        stat2.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        stat2.setForeground(new java.awt.Color(156, 239, 255));
        stat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat2.setText("5");
        getContentPane().add(stat2);
        stat2.setBounds(510, 50, 18, 44);

        stat3.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        stat3.setForeground(new java.awt.Color(156, 239, 255));
        stat3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat3.setText("5");
        getContentPane().add(stat3);
        stat3.setBounds(640, 50, 18, 44);

        stat4.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        stat4.setForeground(new java.awt.Color(156, 239, 255));
        stat4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat4.setText("5");
        getContentPane().add(stat4);
        stat4.setBounds(750, 50, 18, 44);

        text.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        text.setForeground(new java.awt.Color(202, 239, 242));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Intro\n");
        text.setToolTipText("");
        getContentPane().add(text);
        text.setBounds(340, 170, 460, 100);

        op1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        op1.setForeground(new java.awt.Color(202, 239, 242));
        op1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        op1.setText("Got it");
        op1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                op1KeyPressed(evt);
            }
        });
        getContentPane().add(op1);
        op1.setBounds(350, 270, 110, 180);

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrownIconSmall.png"))); // NOI18N
        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
        });
        getContentPane().add(img1);
        img1.setBounds(330, 460, 142, 89);

        op2.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        op2.setForeground(new java.awt.Color(202, 239, 242));
        op2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        op2.setText("Cool");
        getContentPane().add(op2);
        op2.setBounds(670, 270, 110, 180);

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrownIconSmall.png"))); // NOI18N
        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img2MouseClicked(evt);
            }
        });
        getContentPane().add(img2);
        img2.setBounds(650, 460, 142, 89);

        s1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("Save");
        getContentPane().add(s1);
        s1.setBounds(40, 200, 50, 40);

        s2.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("Save");
        getContentPane().add(s2);
        s2.setBounds(100, 200, 50, 40);

        s3.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("Save");
        getContentPane().add(s3);
        s3.setBounds(160, 200, 50, 40);

        s4.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("Save");
        getContentPane().add(s4);
        s4.setBounds(230, 200, 50, 40);

        l1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Load");
        getContentPane().add(l1);
        l1.setBounds(40, 250, 50, 40);

        l2.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Load");
        getContentPane().add(l2);
        l2.setBounds(100, 250, 50, 40);

        l3.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Load");
        getContentPane().add(l3);
        l3.setBounds(160, 250, 50, 40);

        l4.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("Load");
        getContentPane().add(l4);
        l4.setBounds(220, 250, 50, 40);

        BGData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenData.jpg"))); // NOI18N
        getContentPane().add(BGData);
        BGData.setBounds(0, 0, 1200, 650);

        BGMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenMenu.jpg"))); // NOI18N
        getContentPane().add(BGMenu);
        BGMenu.setBounds(0, 0, 1200, 650);

        BGGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenGame.jpg"))); // NOI18N
        getContentPane().add(BGGame);
        BGGame.setBounds(0, 0, 1200, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Startup method
    
    
    private void op1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_op1KeyPressed
        // TODO add your handling code here:

//        if (evt.getKeyCode()==KeyEvent.VK_LEFT){
//            
//            System.out.println("TO THE LEFT");
//            
//        }
//        public void KeyPressed(KeyEvent e) {
//            
//        }
        
        
        
    }//GEN-LAST:event_op1KeyPressed

    
    
    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        // TODO add your handling code here:
        
        System.out.println("Left");
        
        //Assignment      
        assignLeft();
        
        //Check values (OutOfBounds, cardNum, Misc conditions)
        //Continue if nothing flags
        checkAndContinue();
        
    }//GEN-LAST:event_img1MouseClicked
    
    
    
    
    
    private void img2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseClicked
        // TODO add your handling code here:
        
        System.out.println("Right");
        
        //Assignment
        assignRight();
        
        //Check values (OutOfBounds, cardNum, Misc conditions)
        //Continue if nothing flags
        checkAndContinue();
        
        
    }//GEN-LAST:event_img2MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        //Making everything invisible at start
        //Backgrounds
        BGData.setVisible(false);
        
        //In-Game Stuff
        stat1.setVisible(false);
        stat2.setVisible(false);
        stat3.setVisible(false);
        stat4.setVisible(false);
        text.setVisible(false);
        op1.setVisible(false);
        op2.setVisible(false);
        img1.setVisible(false);
        img2.setVisible(false);
        ToMenuLabel.setVisible(false);
        //Data stuff
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        DatBackLabel.setVisible(false);
        
        //System.out.println("Salad\n kills");
        
    }//GEN-LAST:event_formWindowActivated

    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_ExitLabelMouseClicked

    private void DatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatLabelMouseClicked
        // TODO add your handling code here:
        
        //Set elements visible
        BGData.setVisible(true);
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        DatBackLabel.setVisible(true);
        
        //Disable other things
        logo.setVisible(false);
        TitleLabel.setVisible(false);
        DatLabel.setVisible(false);
        ExitLabel.setVisible(false);
        NGLabel.setVisible(false);

        
    }//GEN-LAST:event_DatLabelMouseClicked

    private void DatBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatBackLabelMouseClicked
        // TODO add your handling code here:
        
        //Enable other things
        logo.setVisible(true);
        TitleLabel.setVisible(true);
        DatLabel.setVisible(true);
        ExitLabel.setVisible(true);
        NGLabel.setVisible(true);
        
        //Set elements invisible
        BGData.setVisible(false);
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        DatBackLabel.setVisible(false);
        
    }//GEN-LAST:event_DatBackLabelMouseClicked

    private void NGLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NGLabelMouseClicked
        // TODO add your handling code here:
        
        //Change label
        NGLabel.setText("Continue");
        
        //Enable elements
        img1.setVisible(true);
        img2.setVisible(true);
        op1.setVisible(true);
        op2.setVisible(true);
        stat1.setVisible(true);
        stat2.setVisible(true);
        stat3.setVisible(true);
        stat4.setVisible(true);
        text.setVisible(true);
        ToMenuLabel.setVisible(true);
        
        //Disable other things
        logo.setVisible(false);
        TitleLabel.setVisible(false);
        DatLabel.setVisible(false);
        ExitLabel.setVisible(false);
        NGLabel.setVisible(false);  
        BGMenu.setVisible(false);
        
    }//GEN-LAST:event_NGLabelMouseClicked

    private void ToMenuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToMenuLabelMouseClicked
        // TODO add your handling code here:
        
        //Disable elements
        img1.setVisible(false);
        img2.setVisible(false);
        op1.setVisible(false);
        op2.setVisible(false);
        stat1.setVisible(false);
        stat2.setVisible(false);
        stat3.setVisible(false);
        stat4.setVisible(false);
        text.setVisible(false);
        ToMenuLabel.setVisible(false);
        
        //Enable other things
        logo.setVisible(true);
        TitleLabel.setVisible(true);
        DatLabel.setVisible(true);
        ExitLabel.setVisible(true);
        NGLabel.setVisible(true);  
        BGMenu.setVisible(true);
        
    }//GEN-LAST:event_ToMenuLabelMouseClicked
    
    
    
    
    public void assignLeft(){
        
        //New values
        chur = thisGame.assignChur(chur, chur1[cardNum]);
        pop = thisGame.assignPop(pop, pop1[cardNum]);
        army = thisGame.assignArmy(army, army1[cardNum]);
        mon = thisGame.assignMon(mon, mon1[cardNum]);
        
        //Change in gui
        stat1.setText("" + chur);
        stat2.setText("" + pop);
        stat3.setText("" + army);
        stat4.setText("" + mon);
        
        
    }
    
    public void assignRight(){
        
        //New values
        chur = thisGame.assignChur(chur, chur2[cardNum]);
        pop = thisGame.assignPop(pop, pop2[cardNum]);
        army = thisGame.assignArmy(army, army2[cardNum]);
        mon = thisGame.assignMon(mon, mon2[cardNum]);
        
        //Change in gui
        stat1.setText("" + chur);
        stat2.setText("" + pop);
        stat3.setText("" + army);
        stat4.setText("" + mon);
        
    }
    
    public void checkAndContinue(){
    
    //Different game enders
        if (chur >= 10){
            // Church thinks you're a saint, you're not, you starve
            text.setText("The church, believing you to be a saint, has you"
                    + " undergo ");
            op1.setText("");
            op2.setText("");
            
        } else if (pop >= 10) {
            // Fans storm castle and you are trampled
            text.setText("");
            op1.setText("");
            op2.setText("");
            
        } else if (army >= 10) {
            // Army grows restless, you are overthrown and beheaded
            text.setText("");
            op1.setText("");
            op2.setText("");
            
            
        } else if (mon >= 10) {
            // Invaded by other nation, they were attracted to your great wealth
            text.setText("");
            op1.setText("");
            op2.setText("");
            
        } else if (chur <= 0) {
            // You are deemed a heretic, and burned at the stake
            text.setText("");
            op1.setText("");
            op2.setText("");
            
        } else if (pop <= 0) {
            // People hate you, you are dragged out of your castle and stoned
            text.setText("");
            op1.setText("");
            op2.setText("");
            
        } else if(army <= 0) {
            // Other nation takes advantage of weakness, you are pillaged
            text.setText("");
            op1.setText("");
            op2.setText("");
            
        } else if (mon <= 0) {
            // Starving and cold, your subjects die off one by one
            text.setText("Starving and cold, your subjects die off one by"
                    + " one until you yourself succumb to famine");
            op1.setText("");
            op2.setText("");
            
        } else if (cardNum >= 30) {
            //You win! Having reached the end of your life you die a good ruler
            
            
        } else {
            //Advance
            
            advance();
            
        }
    
    
}
    
    
    public void advance(){
        
        cardNum++;
        text.setText(toYou[cardNum]);
        op1.setText(ans1[cardNum]);
        op2.setText(ans2[cardNum]);
        
    }
    
    
    public void save(){
        
        save.writeTest(chur, army, pop, mon, cardNum, "src\\data\\slot1");
        
    }
    
    public void load(){
        
        //Set NGLabel to ("Continue")
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGData;
    private javax.swing.JLabel BGGame;
    private javax.swing.JLabel BGMenu;
    private javax.swing.JLabel DatBackLabel;
    private javax.swing.JLabel DatLabel;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JLabel NGLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel ToMenuLabel;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op2;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel stat1;
    private javax.swing.JLabel stat2;
    private javax.swing.JLabel stat3;
    private javax.swing.JLabel stat4;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
