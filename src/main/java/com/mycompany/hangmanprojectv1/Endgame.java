/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hangmanprojectv1;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.util.*;
import java.io.*;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
/***************************************************************  
*  file: Endgame.java  
*  authors:Ethan Murguia, Tony Diaz, Anthony Roman, Nathan Elias, Sebastian Cursaro
*  class: CS 2450 – Programming Graphical User Interface 
*  
*  assignment: Swing Project Version 1.0  
*  date last modified: 9/21/2022  
*  
*  purpose: This JFrame displays the high scores screen, the users score, and an option to go back 
*  to the main screen.
****************************************************************/

//Method: end button
//Purpose: takes the user back to the main screen upon clicking allowing them to play again

public class Endgame extends javax.swing.JFrame {
    private JFormattedTextField test; 
    static int score;
    static int score1;
    static int score2;
    Font Galaxus; 
    /**
     * Creates new form Endgame
     * @throws java.io.IOException
     */
    public Endgame() throws IOException {
        try{
           Galaxus = Font.createFont(Font.TRUETYPE_FONT, new File("Galaxus-z8Mow.ttf")).deriveFont(45f); 
           GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment(); 
           ge.registerFont(Galaxus); 
        }
           catch(IOException | FontFormatException e){
           }
               
        initComponents();
            ArrayList<HighScores> sortedScores = new ArrayList<>();
        PrintWriter clear = new PrintWriter(new FileWriter("HighScores.txt"));
        int maxLength = 3;
        
                
        int total = score + score1 + score2;
       yourScore.setText("Score: " + total);
        JTextField newHighScore = new JTextField(maxLength);
        setLocationRelativeTo(null);
        
        PlainDocument doc = new PlainDocument();
doc.setDocumentFilter(new DocumentFilter() {
    @Override
    public void insertString(DocumentFilter.FilterBypass omit,
                             int offset,
                             String name,
                             AttributeSet newAttribute)
    throws BadLocationException {
        int newLength =
            omit.getDocument().getLength() + name.length();
        if (newLength <= maxLength) {
            super.insertString(omit, offset, name, newAttribute);
        }
    }

    @Override
    public void replace(DocumentFilter.FilterBypass omit,
                        int offset,
                        int length,
                        String name,
                        AttributeSet newAttribute)
    throws BadLocationException {
        int newLength =
            omit.getDocument().getLength() - length + name.length();
        if (newLength <= maxLength) {
            super.replace(omit, offset, length, name, newAttribute);
        }
    }
});
newHighScore.setDocument(doc);
        
        
                JFrame frame = new JFrame();
        
         int result = JOptionPane.showOptionDialog(frame, new Object[] {
        "Enter Initials",
        newHighScore
    },
    "Name Enterer",
    JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null, null, null);

         
         int userScore = total; //total points from hangman instead of 100
        String username = (result == JOptionPane.OK_OPTION ? newHighScore.getText() : null);
        
         
     

     
     Scanner fileScanner = new Scanner(saveScore(username, userScore)); 
        
            while(fileScanner.hasNext()){
                if(fileScanner.hasNextLine())
                {
                    sortedScores.add(new HighScores(fileScanner.next(), fileScanner.nextInt())); 
                }
                else
                {
                    fileScanner.next(); 
                }
                
            }
            Collections.sort(sortedScores, new SortByScore());
            for (int i = sortedScores.size()-1; i>-1; i--)
            {
                finalScores(sortedScores.get(i)); 
            }
            
            String name2= "ABC";
        String name3= "ABC";
        String name4= "ABC";
        String name5= "ABC";
        String first = ""; 
        
        int highscore = 0; 
        int score2 = 0;
        int score3 = 0;
        int score4 = 0;
        int score5 = 0;
                
        File inputFile = new File("HighScores.txt");
       Scanner openedFile = new Scanner(inputFile);
       try {
       first = openedFile.next();
       highscore = openedFile.nextInt();
       name2 = openedFile.next();
       score2 = openedFile.nextInt();
       name3 = openedFile.next();
       score3 = openedFile.nextInt();
       name4 = openedFile.next();
       score4 = openedFile.nextInt();
       name5 = openedFile.next();
       score5 = openedFile.nextInt();
       }
       catch (Exception e) {
           
       }
       firstScore4.setText(first);
       jLabel3.setText("" + highscore);
       firstScore.setText(name2);
       jLabel4.setText("" + score2);
       firstScore1.setText(name3);
       jLabel5.setText("" + score3);
       firstScore2.setText(name4);
       jLabel6.setText("" + score4);
       firstScore3.setText(name5);
       jLabel2.setText("" + score5);
       
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        End = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        firstScore = new javax.swing.JLabel();
        firstScore1 = new javax.swing.JLabel();
        firstScore2 = new javax.swing.JLabel();
        firstScore3 = new javax.swing.JLabel();
        firstScore4 = new javax.swing.JLabel();
        yourScore = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 405));

        End.setBackground(new java.awt.Color(0, 0, 0));
        End.setForeground(new java.awt.Color(192, 225, 12));
        End.setText("End");
        End.setToolTipText("Ends the game");
        End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndActionPerformed(evt);
            }
        });

        jLabel1.setFont(Galaxus);
        jLabel1.setForeground(new java.awt.Color(214, 214, 1));
        jLabel1.setText("TOP 5 SCORES");

        firstScore.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        firstScore.setForeground(new java.awt.Color(250, 41, 41));
        firstScore.setText("ABC");

        firstScore1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        firstScore1.setForeground(new java.awt.Color(16, 212, 206));
        firstScore1.setText("ABC");

        firstScore2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        firstScore2.setForeground(new java.awt.Color(174, 39, 212));
        firstScore2.setText("ABC");

        firstScore3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        firstScore3.setForeground(new java.awt.Color(48, 3, 243));
        firstScore3.setText("ABC");

        firstScore4.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        firstScore4.setForeground(new java.awt.Color(0, 211, 35));
        firstScore4.setText("ABC");

        yourScore.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        yourScore.setForeground(new java.awt.Color(137, 149, 14));
        yourScore.setText("Score: ");
        yourScore.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 3, 243));
        jLabel2.setText("00000");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 211, 35));
        jLabel3.setText("00000");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 41, 41));
        jLabel4.setText("00000");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 212, 206));
        jLabel5.setText("00000");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(174, 39, 212));
        jLabel6.setText("00000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(End)
                        .addGap(90, 90, 90)
                        .addComponent(yourScore, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(158, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(firstScore3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(firstScore2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstScore1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstScore4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstScore4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstScore)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstScore3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourScore, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(End))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndActionPerformed
        this.dispose();
        Mainscreen obj = new Mainscreen();
        obj.setVisible(true);
    }//GEN-LAST:event_EndActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) throws IOException {
   
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
            java.util.logging.Logger.getLogger(Endgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Endgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Endgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Endgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        String username; 
        int userScore; 
        int maxLength = 3;
        int total = score + score1;
        ArrayList<HighScores> sortedScores = new ArrayList<>();
        PrintWriter clear = new PrintWriter(new FileWriter("HighScores.txt"));
        JTextField newHighScore = new JTextField(maxLength);
        
        

PlainDocument doc = new PlainDocument();
doc.setDocumentFilter(new DocumentFilter() {
    @Override
    public void insertString(DocumentFilter.FilterBypass omit,
                             int offset,
                             String name,
                             AttributeSet newAttribute)
    throws BadLocationException {
        int newLength =
            omit.getDocument().getLength() + name.length();
        if (newLength <= maxLength) {
            super.insertString(omit, offset, name, newAttribute);
        }
    }

    @Override
    public void replace(DocumentFilter.FilterBypass omit,
                        int offset,
                        int length,
                        String name,
                        AttributeSet newAttribute)
    throws BadLocationException {
        int newLength =
            omit.getDocument().getLength() - length + name.length();
        if (newLength <= maxLength) {
            super.replace(omit, offset, length, name, newAttribute);
        }
    }
});
newHighScore.setDocument(doc);
        
        
        
        JFrame frame = new JFrame();
        
         int result = JOptionPane.showOptionDialog(frame, new Object[] {
        "Enter Initials",
        newHighScore
    },
    "New High Score!",
    JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null, null, null);
    
          
        userScore = total; //total points from hangman instead of 100
        username = (result == JOptionPane.OK_OPTION ? newHighScore.getText() : null);
        
         
     

     
     Scanner fileScanner = new Scanner(saveScore(username, userScore)); 
        
            while(fileScanner.hasNext()){
                if(fileScanner.hasNextLine())
                {
                    sortedScores.add(new HighScores(fileScanner.next(), fileScanner.nextInt())); 
                }
                else
                {
                    fileScanner.next(); 
                }
                
            }
            Collections.sort(sortedScores, new SortByScore());
            for (int i = sortedScores.size()-1; i>-1; i--)
            {
                finalScores(sortedScores.get(i)); 
            }
            
                  Endgame test = new Endgame(); 
      test.firstScore3.setText(username + " " + userScore);
            
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new Endgame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Endgame.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            }
        });
                    
            
           
    }
    
    
    public static File finalScores(HighScores Score)throws FileNotFoundException, IOException
    {
        try (PrintWriter orderedScores = new PrintWriter(new FileWriter("Highscores.txt", true))) {
            orderedScores.println(Score);
        } 
        File readable = new File("Highscores.txt"); 
        return readable; 
    }
    
    public static File saveScore(String name, int score ) throws FileNotFoundException, IOException{
        try (PrintWriter highScores = new PrintWriter(new FileWriter("scores.txt", true))) {
            highScores.println(name + " " + score);
        } 
        
        File readable = new File("scores.txt"); 
        return readable; 
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton End;
    private javax.swing.JLabel firstScore;
    private javax.swing.JLabel firstScore1;
    private javax.swing.JLabel firstScore2;
    private javax.swing.JLabel firstScore3;
    private javax.swing.JLabel firstScore4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel yourScore;
    // End of variables declaration//GEN-END:variables
}
