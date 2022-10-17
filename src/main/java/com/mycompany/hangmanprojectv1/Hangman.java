/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hangmanprojectv1;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;

/***************************************************************  
*  file: Hangman.java  
*  authors:Ethan Murguia, Tony Diaz, Anthony Roman, Nathan Elias, Sebastian Cursaro
*  class: CS 2450 – Programming Graphical User Interface 
*  
*  assignment: Swing Project Version 1.0  
*  date last modified: 9/21/2022  
*  
*  purpose: This JFrame displays the Main game and allows the user to play hangman 
*  with a score counter and displays the time and allows for the user to play as many games 
*  until either the time runs out or they lose. 
* 
****************************************************************/  

//Method: Displayword
//purpose: randomly selects a word from the array list 

//Method: locateLetter
//purpose: finds out if the selected letter corresponds with the word
// if it does than it displays that letter to the screen.

//Method: clock 
//Purpose: displays a clock that reads and displays the exact time 

// Method: buttons 
// Purpose: displays a button for each letter and will display the letter to the screen if 
// the letter appears, if not it adds a limb to the hangman until the user wins or loses 
// a skip button is implemented that takes the user to the endscreen. 

//Method: endGame
//Purpose: When the player completes this game this method changes to the final screen with
//the players points displayed.

//Method: paintBody
//Purpose: draws the hangman body based on the number guess the player has left.

//Method: paint
//Purpose: draws the lines to show how many letters are in the word and where letters will go
//depending on the size of the word.

public class Hangman extends javax.swing.JFrame {
    

    /**
     * Creates new form Hangman
     */
    int guesses = 6;
    public Hangman() throws IOException {
        
        initComponents();
        //NewJFrame12.setPreferredSize(new Dimension(400,300));
        word.setVisible(false);
        posOne.setVisible(false);
        posTwo.setVisible(false);
        posThree.setVisible(false);
        posFour.setVisible(false);
        posFive.setVisible(false);
        posSix.setVisible(false);
        posSeven.setVisible(false);
        posEight.setVisible(false);
      //jTextField1.setVisible(false);
        Score.setText("Score: " + points);
       
      
        
        //showDate();
        clock(); //creates date and time in jpanel
        paint(base);//paints the gallows
        
        
        
        displayWord(t);//displays randomly generated word
        while(guesses!=6){
        paintBody(body);
        }
        
        
        
    }
    
    String t;
    int length;
    char characters[];
    int wordGuessed = 0;
    int points = 100;
    static String choosenWord;
    static char choosenLetter;
    public void displayWord(String t){
        String[] wordList = new String[]{"abstract", "cemetary", "nurse", "pharmacy", "climbing"}; 
        Random randomNumbers = new Random ();
        int wordNumber = randomNumbers.nextInt (5);
     
        //System.out.println(wordList[wordNumber]);
        String l = wordList[wordNumber];
        choosenWord = l;
        length = l.length();
        word.setText(wordList[wordNumber]);//to be commented out later
        characters = new char[length];
        for(int i =0; i<characters.length;i++){
            characters[i] = l.charAt(i);
         //   System.out.println(characters[i]);
        }
    }
    
    public void endGame() throws IOException {
        Endgame.score = points;
        this.dispose();
        Buttons obj = new Buttons();
        obj.setVisible(true);
        
    }
    
    public void charactersOf(String t){
        
        
    }
    Graphics base,body;

    /**
     *
     * @param base
     */
    @Override
   public final void paint(Graphics base){
       
       base = game.getGraphics();
       game.paintComponents(base);//set graphic Object
       base.setColor(Color.BLACK);
       base.fillRect(100,200,300,05);
       
       base.fillRect(150, 50, 05, 150);
       base.fillRect(150, 50, 100, 05);
       base.fillRect(250, 50, 05, 25);
       
       if(length == 5){
           System.out.println("5");
           
           base.fillRect(50,275,25,05);
           base.fillRect(100,275,25,05);
           base.fillRect(150,275,25,05);
           base.fillRect(200,275,25,05);
           base.fillRect(250,275,25,05);
           
       }
       else{
           System.out.println("8");
           base.fillRect(50,275,25,05);
           base.fillRect(100,275,25,05);
           base.fillRect(150,275,25,05);
           base.fillRect(200,275,25,05);
           base.fillRect(250,275,25,05);
           base.fillRect(300,275,25,05);
           base.fillRect(350,275,25,05);
           base.fillRect(400,275,25,05);
         //  base.fillRect(450,275,25,05);
       }
       
           
       
       
       /*post = game.getGraphics();
       game.paintComponents(post);//set graphic Object
       post.setColor(Color.BLACK);
       post.fillRect(100,225,05,100);*/
        
       
        }
   public void paintBody(Graphics body) throws IOException{
      
       body = game.getGraphics();
       game.paintComponents(body);//set graphic Object
       body.setColor(Color.BLACK);
       
       if(guesses ==5){
           body.drawOval(230,75,50,50);
          // body.fillOval(230,75,50,50);
         //jTextField1.setVisible(true);
           Score.setText("Score: " + points);
           }
           if(guesses ==4){
           body.fillRect(250, 125, 05,40);
       
            Score.setText("Score: " + points);
           }
           if(guesses ==3){
           body.fillRect(225, 125, 30, 05);
      
            Score.setText("Score: " + points);
           }
           if(guesses ==2){
       body.fillRect(250, 125, 30, 05);
  
        Score.setText("Score: " + points);
           }
           if(guesses ==1){
       body.fillRect(225, 165, 30, 05);
      
        Score.setText("Score: " + points);
           }
           if(guesses ==0){
       body.fillRect(250, 165, 30, 05);
       Endgame.score = 40; 
       this.dispose();
        Buttons obj = new Buttons();
        obj.setVisible(true);
             
           }
   
       
   }

  public void locateLetter(int i){
        int placement = i+1; 
        switch(placement){
           case 1:
              
               // System.out.println("a is in place 1");
              //  System.out.println(wordGuessed);
                posOne.setText(choosenLetter + " ");
                posOne.setVisible(true);
                repaint();
               break; 
           case 2: 
               
             //  System.out.println("a is in place 2");
             //  System.out.println(wordGuessed);
                posTwo.setText(choosenLetter + " ");
                posTwo.setVisible(true);
                repaint();
               break; 
           case 3:
              
               // System.out.println("a is in place 3");
              //  System.out.println(wordGuessed);
                posThree.setText(choosenLetter + " ");
                posThree.setVisible(true);
                repaint();
               break; 
           case 4: 
              
              // System.out.println("a is in place 4");
              // System.out.println(wordGuessed);
                posFour.setText(choosenLetter + " ");
                posFour.setVisible(true);
                repaint();
               break; 
           case 5:
              
              //  System.out.println("a is in place 5");
              //  System.out.println(wordGuessed);
                posFive.setText(choosenLetter + " ");
                posFive.setVisible(true);
                repaint();
               break; 
           case 6: 
              
              // System.out.println("a is in place 6");
              // System.out.println(wordGuessed);
                posSix.setText(choosenLetter + " ");
                posSix.setVisible(true);
                repaint();
               break; 
           case 7:
               
              //  System.out.println("a is in place 7");
              //  System.out.println(wordGuessed);
                posSeven.setText(choosenLetter + " ");
                posSeven.setVisible(true);
                repaint();
               break; 
           case 8: 
              
              // System.out.println("a is in place 8");
              // System.out.println(wordGuessed);
                posEight.setText(choosenLetter + " ");
                posEight.setVisible(true);
                repaint();
               break; 
               
           //default: System.out.println("a is not in word");
                    
        }
    }
    
    
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
        void clock(){
        
        Thread watch = new Thread()
        {
            public void run()
                {
                try {
                    for(;;){
                    Calendar cal = new GregorianCalendar();
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
        
                    int second=cal.get(Calendar.SECOND);
                    int minute =cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    clock.setText("Date: " + month + "/" + day + "/"+year+" Time "+hour+":"+minute+";"+second+" ");
                    
                    sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            
            
        };
        watch.start();
            
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        game = new javax.swing.JPanel();
        aButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        vButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        word = new javax.swing.JLabel();
        skipButton = new javax.swing.JButton();
        Score = new javax.swing.JLabel();
        posOne = new javax.swing.JLabel();
        posTwo = new javax.swing.JLabel();
        posThree = new javax.swing.JLabel();
        posFour = new javax.swing.JLabel();
        posFive = new javax.swing.JLabel();
        posSix = new javax.swing.JLabel();
        posSeven = new javax.swing.JLabel();
        posEight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frame");

        game.setBackground(new java.awt.Color(204, 204, 204));
        game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aButton.setText("A");
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });
        game.add(aButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 43, -1));

        bButton.setText("B");
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });
        game.add(bButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 40, -1));

        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });
        game.add(cButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 40, -1));

        dButton.setText("D");
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });
        game.add(dButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 40, -1));

        eButton.setText("E");
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });
        game.add(eButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 40, -1));

        fButton.setText("F");
        fButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonActionPerformed(evt);
            }
        });
        game.add(fButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 40, -1));

        gButton.setText("G");
        gButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButtonActionPerformed(evt);
            }
        });
        game.add(gButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 40, -1));

        hButton.setText("H");
        hButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hButtonActionPerformed(evt);
            }
        });
        game.add(hButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 40, -1));

        iButton.setText("I");
        iButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iButtonActionPerformed(evt);
            }
        });
        game.add(iButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 40, -1));

        jButton.setText("J");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        game.add(jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 40, -1));

        kButton.setText("K");
        kButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonActionPerformed(evt);
            }
        });
        game.add(kButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 40, -1));

        lButton.setText("L");
        lButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButtonActionPerformed(evt);
            }
        });
        game.add(lButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 41, -1));

        mButton.setText("M");
        mButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonActionPerformed(evt);
            }
        });
        game.add(mButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 41, -1));

        nButton.setText("N");
        nButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nButtonActionPerformed(evt);
            }
        });
        game.add(nButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 40, -1));

        oButton.setText("O");
        oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });
        game.add(oButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 42, -1));

        pButton.setText("P");
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });
        game.add(pButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 40, -1));

        qButton.setText("Q");
        qButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qButtonActionPerformed(evt);
            }
        });
        game.add(qButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 40, -1));

        rButton.setText("R");
        rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonActionPerformed(evt);
            }
        });
        game.add(rButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 40, -1));

        sButton.setText("S");
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });
        game.add(sButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 40, -1));

        tButton.setText("T");
        tButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtonActionPerformed(evt);
            }
        });
        game.add(tButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 40, -1));

        uButton.setText("U");
        uButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uButtonActionPerformed(evt);
            }
        });
        game.add(uButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 40, -1));

        vButton.setText("V");
        vButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vButtonActionPerformed(evt);
            }
        });
        game.add(vButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 40, -1));

        wButton.setText("W");
        wButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wButtonActionPerformed(evt);
            }
        });
        game.add(wButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 40, -1));

        xButton.setText("X");
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });
        game.add(xButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 40, -1));

        yButton.setText("Y");
        yButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yButtonActionPerformed(evt);
            }
        });
        game.add(yButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 41, -1));

        zButton.setText("Z");
        zButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zButtonActionPerformed(evt);
            }
        });
        game.add(zButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 41, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Hangman");
        game.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 130, 38));

        clock.setText("Time");
        game.add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 6, -1, -1));

        word.setText("jLabel2");
        game.add(word, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        skipButton.setText("Skip");
        skipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipButtonActionPerformed(evt);
            }
        });
        game.add(skipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        Score.setText("Points:");
        game.add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 6, 60, 32));

        posOne.setBackground(new java.awt.Color(255, 255, 255));
        posOne.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posOne.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        posOne.setText("A");
        game.add(posOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 37, -1));

        posTwo.setBackground(new java.awt.Color(255, 255, 255));
        posTwo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posTwo.setText("posTwo");
        game.add(posTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 37, -1));

        posThree.setBackground(new java.awt.Color(255, 255, 255));
        posThree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posThree.setText("posOne");
        game.add(posThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 37, -1));

        posFour.setBackground(new java.awt.Color(255, 255, 255));
        posFour.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posFour.setText("posOne");
        game.add(posFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 37, -1));

        posFive.setBackground(new java.awt.Color(255, 255, 255));
        posFive.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posFive.setText("posOne");
        game.add(posFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 37, -1));

        posSix.setBackground(new java.awt.Color(255, 255, 255));
        posSix.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posSix.setText("posOne");
        game.add(posSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 37, -1));

        posSeven.setBackground(new java.awt.Color(255, 255, 255));
        posSeven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posSeven.setText("posOne");
        game.add(posSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 37, -1));

        posEight.setBackground(new java.awt.Color(255, 255, 255));
        posEight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posEight.setText("posOne");
        game.add(posEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 37, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {
    
    
    if (c == 'g') {
          int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
              try {
                  endGame();
              } catch (IOException ex) {
                  Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        else if (length == 8 && wordGuessed == 8) {
              try {
                  endGame();
              } catch (IOException ex) {
                  Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        else {
            
        }
        contains = true;
        gButton.setEnabled(false);
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    gButton.setEnabled(false);

    // do something
}
    }//GEN-LAST:event_gButtonActionPerformed

    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'd') {
       int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        dButton.setEnabled(false);
              wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
           try {
               endGame();
           } catch (IOException ex) {
               Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        else if (length == 8 && wordGuessed == 8) {
           try {
               endGame();
           } catch (IOException ex) {
               Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    dButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_dButtonActionPerformed

    private void nButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'n') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        nButton.setEnabled(false);
                wordGuessed++;
                
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }   
    
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    nButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_nButtonActionPerformed

    private void kButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'k') {
          int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
       kButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
              try {
                  endGame();
              } catch (IOException ex) {
                  Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        else if (length == 8 && wordGuessed == 8) {
              try {
                  endGame();
              } catch (IOException ex) {
                  Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    kButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_kButtonActionPerformed

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aButtonActionPerformed
        // TODO add your handling code here:
    boolean contains = false;

for (char c : characters) {

    if (c == 'a') {
       int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
            wordGuessed++;
       }
        contains = true;
        aButton.setEnabled(false);
             
        if (length == 5 && wordGuessed == 5) {
           try {
               endGame();
           } catch (IOException ex) {
               Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        else if (length == 8 && wordGuessed == 8) {
           try {
               endGame();
           } catch (IOException ex) {
               Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
        try {
            paintBody(body);
        } catch (IOException ex) {
            Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
        }
    aButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_aButtonActionPerformed

    private void vButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'v') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        vButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    vButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_vButtonActionPerformed

    private void uButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'u') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        uButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    uButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_uButtonActionPerformed

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'b') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        bButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    bButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_bButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'c') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        cButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    cButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_cButtonActionPerformed

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'e') {
        int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
            wordGuessed++;
       }
        contains = true;
        eButton.setEnabled(false);
           
        if (length == 5 && wordGuessed == 5) {
            try {
                endGame();
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (length == 8 && wordGuessed == 8) {
            try {
                endGame();
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    eButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_eButtonActionPerformed

    private void fButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'f') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        fButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    fButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_fButtonActionPerformed

    private void hButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'h') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        hButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    hButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_hButtonActionPerformed

    private void iButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'i') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
            wordGuessed++;
       }
        contains = true;
        iButton.setEnabled(false);
                
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    iButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_iButtonActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'j') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        jButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    jButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_jButtonActionPerformed

    private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'l') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        lButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    lButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_lButtonActionPerformed

    private void mButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'm') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        mButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    mButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_mButtonActionPerformed

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'o') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        oButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    oButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_oButtonActionPerformed

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'p') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        pButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
     pButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_pButtonActionPerformed

    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'q') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        qButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    qButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_qButtonActionPerformed

    private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'r') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        rButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    rButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_rButtonActionPerformed

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 's') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        sButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    sButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_sButtonActionPerformed

    private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 't') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
            wordGuessed++;
       }
        contains = true;
        tButton.setEnabled(false);
                
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    tButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_tButtonActionPerformed

    private void wButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'w') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        wButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    wButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_wButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'x') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        xButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                // do something
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    xButton.setEnabled(false);
}
    }//GEN-LAST:event_xButtonActionPerformed

    private void yButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'y') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
        yButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
    yButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_yButtonActionPerformed

    private void zButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zButtonActionPerformed
        // TODO add your handling code here:
        boolean contains = false;

for (char c : characters) {

    if (c == 'z') {
         int i = 0;
       choosenLetter = c;
    while(choosenWord.indexOf(choosenLetter, i) != -1){
            //System.out.println("a appears in: "+ chosenWord.indexOf(letter, i));
            locateLetter(choosenWord.indexOf(choosenLetter, i));
            i = choosenWord.indexOf(choosenLetter, i) + 1;
       }
        contains = true;
	 zButton.setEnabled(false);
                wordGuessed++;
        if (length == 5 && wordGuessed == 5) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else if (length == 8 && wordGuessed == 8) {
             try {
                 endGame();
             } catch (IOException ex) {
                 Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else {
            
        }
        break;
    }
}
if (!contains) {
    guesses--;
    points = points -10;
            try {
                paintBody(body);
            } catch (IOException ex) {
                Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
            }
     zButton.setEnabled(false);
    // do something
}
    }//GEN-LAST:event_zButtonActionPerformed

    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        // TODO add your handling code here:
        Endgame.score = 0;
        this.dispose();
        Buttons obj = new Buttons();
        obj.setVisible(true);
       
        
    }//GEN-LAST:event_skipButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Hangman().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Score;
    private javax.swing.JButton aButton;
    private javax.swing.JButton bButton;
    private javax.swing.JButton cButton;
    private javax.swing.JLabel clock;
    private javax.swing.JButton dButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton fButton;
    private javax.swing.JButton gButton;
    private javax.swing.JPanel game;
    private javax.swing.JButton hButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kButton;
    private javax.swing.JButton lButton;
    private javax.swing.JButton mButton;
    private javax.swing.JButton nButton;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pButton;
    private javax.swing.JLabel posEight;
    private javax.swing.JLabel posFive;
    private javax.swing.JLabel posFour;
    private javax.swing.JLabel posOne;
    private javax.swing.JLabel posSeven;
    private javax.swing.JLabel posSix;
    private javax.swing.JLabel posThree;
    private javax.swing.JLabel posTwo;
    private javax.swing.JButton qButton;
    private javax.swing.JButton rButton;
    private javax.swing.JButton sButton;
    private javax.swing.JButton skipButton;
    private javax.swing.JButton tButton;
    private javax.swing.JButton uButton;
    private javax.swing.JButton vButton;
    private javax.swing.JButton wButton;
    private javax.swing.JLabel word;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
    // End of variables declaration//GEN-END:variables
}
