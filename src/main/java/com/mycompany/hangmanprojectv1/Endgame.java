/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hangmanprojectv1;

import java.util.*;
import java.io.*;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
    /**
     * Creates new form Endgame
     * @throws java.io.IOException
     */
    public Endgame() throws IOException {
        
           
        initComponents();
            ArrayList<HighScores> sortedScores = new ArrayList<>();
        PrintWriter clear = new PrintWriter(new FileWriter("HighScores.txt"));
        int maxLength = 3;
        int total = score + score1;
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
    "New High Score!",
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
       firstScore4.setText(first + " " + highscore);
       firstScore.setText(name2 + " " + score2);
       firstScore1.setText(name3 + " " + score3);
       firstScore2.setText(name4 + " " + score4);
       firstScore3.setText(name5 + " " + score5);
       
     
         
    }
     

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        End = new javax.swing.JButton();
        firstScore = new javax.swing.JLabel();
        firstScore1 = new javax.swing.JLabel();
        firstScore2 = new javax.swing.JLabel();
        firstScore3 = new javax.swing.JLabel();
        firstScore4 = new javax.swing.JLabel();
        yourScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Highscores");

        End.setText("End");
        End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndActionPerformed(evt);
            }
        });

        firstScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstScore.setText("ABC...00000");

        firstScore1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstScore1.setText("ABC...00000");

        firstScore2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstScore2.setText("ABC...00000");

        firstScore3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstScore3.setText("ABC...00000");

        firstScore4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstScore4.setText("ABC...00000");

        yourScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        yourScore.setText("Score: ");
        yourScore.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(End)
                        .addGap(155, 155, 155)
                        .addComponent(yourScore, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 201, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstScore4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstScore, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstScore3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(184, 184, 184))))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstScore4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstScore, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstScore3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(End, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yourScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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
    private javax.swing.JLabel yourScore;
    // End of variables declaration//GEN-END:variables
}
