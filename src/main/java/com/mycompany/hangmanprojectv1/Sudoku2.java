/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hangmanprojectv1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

/**
 *
 * @author Nathan Elias
 */

public class Sudoku2 extends javax.swing.JFrame {
int score = 540;
boolean firstSubmit;
int[][] userBoard = {{8,0,0,4,0,6,0,0,7},{0,0,0,0,0,0,4,0,0},{0,1,0,0,0,0,6,5,0},{5,0,9,0,3,0,7,8,0},{0,0,0,0,7,0,0,0,0},
            {0,4,8,0,2,0,1,0,3},{0,5,2,0,0,0,0,9,0},{0,0,1,0,0,0,0,0,0},{3,0,0,9,0,2,0,0,5}};
    /**
     * Creates new form Sudoku2
     */
    Graphics g;
    
    public Sudoku2() {
        this.firstSubmit = true;
        initComponents();
        clock();
        setLocationRelativeTo(null);
        SudokuScore.setText("Score: " + score);
         getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel"); //$NON-NLS-1$
        getRootPane().getActionMap().put("Cancel", new AbstractAction(){ //$NON-NLS-1$
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "Pop"); //$NON-NLS-1$
        getRootPane().getActionMap().put("Pop", new AbstractAction(){ //$NON-NLS-1$
            public void actionPerformed(ActionEvent z)
            {
                popUp obj2 = new popUp();
                obj2.setVisible(true);
                
            }
        });
        
        // on close window the close method is called
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) 
            {
                System.exit(0);
            }
        });
       
        
    }

  
    public boolean CheckBoard(int[][] checkBoard) {
        int[][] correctBoard = {{8,3,5,4,1,6,9,2,7},{2,9,6,8,5,7,4,3,1},{4,1,7,2,9,3,6,5,8},{5,6,9,1,3,4,7,8,2},{1,2,3,6,7,8,5,4,9},
            {7,4,8,5,2,9,1,6,3},{6,5,2,7,8,1,3,9,4},{9,8,1,3,4,5,2,7,6},{3,7,4,9,6,2,8,1,5}};
        // System.out.println("correctBoard");
        for (int row = 0; row < correctBoard.length; row++) {
             for (int col = 0; col < correctBoard[row].length; col++) {
               //  System.out.print(correctBoard[row][col]);
             }
            // System.out.println("");
        }
       // System.out.println("UserBoard");
          for (int row = 0; row < checkBoard.length; row++) {
             for (int col = 0; col < checkBoard[row].length; col++) {
                // System.out.print(checkBoard[row][col]);
             }
            //System.out.println("");
        }
        boolean isCorrect = true;
        
        
         for (int row = 0; row < correctBoard.length; row++) {
             for (int col = 0; col < correctBoard[row].length; col++) {
                if (correctBoard[row][col] != checkBoard[row][col]) {
                    if (firstSubmit == true) {
                    score += -10;
                    }
                    isCorrect = false;
                }
                
    }   
       
 }
       
      System.out.println("Score: " + score);
      firstSubmit = false;
      if (isCorrect) 
       return isCorrect;
        else
          JOptionPane.showMessageDialog(this, "You made a mistake somewhere or multiple... try again",
               "We'll get em next time", JOptionPane.ERROR_MESSAGE);
              return isCorrect; 
        
        
    }
 
    public boolean checkNumber(int num) throws Exception {
        
        if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9) {
        
            return true;                
        }
        else 
        return false;
        
        
    
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
                    clock.setText("Date: " + month + "/" + day + "/"+year+" Time "+hour+":"+minute+":"+second+" ");
                    
                    sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            
            
        };
        watch.start();
            
        
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        game = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jLayeredPane10 = new javax.swing.JLayeredPane();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        quit = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        clock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SudokuScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 600, 400));
        setForeground(java.awt.Color.black);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        game.setBackground(new java.awt.Color(0, 0, 0));
        game.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane1.setForeground(new java.awt.Color(204, 204, 204));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(0, 255, 255));
        jTextField1.setText("8");
        jTextField1.setToolTipText("Enter number 1-9");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setForeground(new java.awt.Color(0, 255, 255));
        jTextField4.setToolTipText("Enter number 1-9");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setForeground(new java.awt.Color(0, 255, 255));
        jTextField7.setToolTipText("Enter number 1-9");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(0, 255, 255));
        jTextField2.setToolTipText("Enter number 1-9");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setForeground(new java.awt.Color(0, 255, 255));
        jTextField5.setToolTipText("Enter number 1-9");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(0, 0, 0));
        jTextField8.setForeground(new java.awt.Color(0, 255, 255));
        jTextField8.setToolTipText("Enter number 1-9");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(0, 0, 0));
        jTextField9.setForeground(new java.awt.Color(0, 255, 255));
        jTextField9.setToolTipText("Enter number 1-9");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setForeground(new java.awt.Color(0, 255, 255));
        jTextField6.setText("1");
        jTextField6.setToolTipText("Enter number 1-9");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setForeground(new java.awt.Color(0, 255, 255));
        jTextField3.setToolTipText("Enter number 1-9");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6))
                .addContainerGap())
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.setForeground(new java.awt.Color(204, 204, 204));

        jTextField10.setBackground(new java.awt.Color(0, 0, 0));
        jTextField10.setForeground(new java.awt.Color(0, 255, 255));
        jTextField10.setText("4");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(0, 0, 0));
        jTextField11.setForeground(new java.awt.Color(0, 255, 255));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setBackground(new java.awt.Color(0, 0, 0));
        jTextField12.setForeground(new java.awt.Color(0, 255, 255));
        jTextField12.setText("6");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setBackground(new java.awt.Color(0, 0, 0));
        jTextField13.setForeground(new java.awt.Color(0, 255, 255));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setBackground(new java.awt.Color(0, 0, 0));
        jTextField14.setForeground(new java.awt.Color(0, 255, 255));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(0, 0, 0));
        jTextField15.setForeground(new java.awt.Color(0, 255, 255));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField16.setBackground(new java.awt.Color(0, 0, 0));
        jTextField16.setForeground(new java.awt.Color(0, 255, 255));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jTextField17.setBackground(new java.awt.Color(0, 0, 0));
        jTextField17.setForeground(new java.awt.Color(0, 255, 255));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jTextField18.setBackground(new java.awt.Color(0, 0, 0));
        jTextField18.setForeground(new java.awt.Color(0, 255, 255));
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jTextField10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17))
                .addContainerGap())
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane4.setForeground(new java.awt.Color(204, 204, 204));

        jTextField19.setBackground(new java.awt.Color(0, 0, 0));
        jTextField19.setForeground(new java.awt.Color(0, 255, 255));
        jTextField19.setText("5");
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jTextField20.setBackground(new java.awt.Color(0, 0, 0));
        jTextField20.setForeground(new java.awt.Color(0, 255, 255));
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jTextField21.setBackground(new java.awt.Color(0, 0, 0));
        jTextField21.setForeground(new java.awt.Color(0, 255, 255));
        jTextField21.setText("9");
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jTextField22.setBackground(new java.awt.Color(0, 0, 0));
        jTextField22.setForeground(new java.awt.Color(0, 255, 255));
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jTextField23.setBackground(new java.awt.Color(0, 0, 0));
        jTextField23.setForeground(new java.awt.Color(0, 255, 255));
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jTextField24.setBackground(new java.awt.Color(0, 0, 0));
        jTextField24.setForeground(new java.awt.Color(0, 255, 255));
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jTextField25.setBackground(new java.awt.Color(0, 0, 0));
        jTextField25.setForeground(new java.awt.Color(0, 255, 255));
        jTextField25.setText("8");
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jTextField26.setBackground(new java.awt.Color(0, 0, 0));
        jTextField26.setForeground(new java.awt.Color(0, 255, 255));
        jTextField26.setText("4");
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jTextField27.setBackground(new java.awt.Color(0, 0, 0));
        jTextField27.setForeground(new java.awt.Color(0, 255, 255));
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jTextField19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jTextField20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jTextField21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jTextField22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jTextField23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jTextField24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jTextField25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jTextField26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jTextField27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26))
                .addContainerGap())
        );

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane5.setForeground(new java.awt.Color(204, 204, 204));

        jTextField28.setBackground(new java.awt.Color(0, 0, 0));
        jTextField28.setForeground(new java.awt.Color(0, 255, 255));
        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jTextField29.setBackground(new java.awt.Color(0, 0, 0));
        jTextField29.setForeground(new java.awt.Color(0, 255, 255));
        jTextField29.setText("3");
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jTextField30.setBackground(new java.awt.Color(0, 0, 0));
        jTextField30.setForeground(new java.awt.Color(0, 255, 255));
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jTextField31.setBackground(new java.awt.Color(0, 0, 0));
        jTextField31.setForeground(new java.awt.Color(0, 255, 255));
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });

        jTextField32.setBackground(new java.awt.Color(0, 0, 0));
        jTextField32.setForeground(new java.awt.Color(0, 255, 255));
        jTextField32.setText("7");
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jTextField33.setBackground(new java.awt.Color(0, 0, 0));
        jTextField33.setForeground(new java.awt.Color(0, 255, 255));
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jTextField34.setBackground(new java.awt.Color(0, 0, 0));
        jTextField34.setForeground(new java.awt.Color(0, 255, 255));
        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });

        jTextField35.setBackground(new java.awt.Color(0, 0, 0));
        jTextField35.setForeground(new java.awt.Color(0, 255, 255));
        jTextField35.setText("2");
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        jTextField36.setBackground(new java.awt.Color(0, 0, 0));
        jTextField36.setForeground(new java.awt.Color(0, 255, 255));
        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });

        jLayeredPane5.setLayer(jTextField28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35))
                .addContainerGap())
        );

        jLayeredPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane7.setForeground(new java.awt.Color(204, 204, 204));

        jTextField46.setBackground(new java.awt.Color(0, 0, 0));
        jTextField46.setForeground(new java.awt.Color(0, 255, 255));
        jTextField46.setText("7");
        jTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField46ActionPerformed(evt);
            }
        });

        jTextField47.setBackground(new java.awt.Color(0, 0, 0));
        jTextField47.setForeground(new java.awt.Color(0, 255, 255));
        jTextField47.setText("8");
        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });

        jTextField48.setBackground(new java.awt.Color(0, 0, 0));
        jTextField48.setForeground(new java.awt.Color(0, 255, 255));
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jTextField49.setBackground(new java.awt.Color(0, 0, 0));
        jTextField49.setForeground(new java.awt.Color(0, 255, 255));
        jTextField49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField49ActionPerformed(evt);
            }
        });

        jTextField50.setBackground(new java.awt.Color(0, 0, 0));
        jTextField50.setForeground(new java.awt.Color(0, 255, 255));
        jTextField50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });

        jTextField51.setBackground(new java.awt.Color(0, 0, 0));
        jTextField51.setForeground(new java.awt.Color(0, 255, 255));
        jTextField51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField51ActionPerformed(evt);
            }
        });

        jTextField52.setBackground(new java.awt.Color(0, 0, 0));
        jTextField52.setForeground(new java.awt.Color(0, 255, 255));
        jTextField52.setText("3");
        jTextField52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField52ActionPerformed(evt);
            }
        });

        jTextField53.setBackground(new java.awt.Color(0, 0, 0));
        jTextField53.setForeground(new java.awt.Color(0, 255, 255));
        jTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField53ActionPerformed(evt);
            }
        });

        jTextField54.setBackground(new java.awt.Color(0, 0, 0));
        jTextField54.setForeground(new java.awt.Color(0, 255, 255));
        jTextField54.setText("1");
        jTextField54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField54ActionPerformed(evt);
            }
        });

        jLayeredPane7.setLayer(jTextField46, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jTextField47, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jTextField48, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jTextField49, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jTextField50, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jTextField51, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jTextField52, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jTextField53, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jTextField54, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField53))
                .addContainerGap())
        );

        jLayeredPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane8.setForeground(new java.awt.Color(204, 204, 204));

        jTextField55.setBackground(new java.awt.Color(0, 0, 0));
        jTextField55.setForeground(new java.awt.Color(0, 255, 255));
        jTextField55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField55ActionPerformed(evt);
            }
        });

        jTextField56.setBackground(new java.awt.Color(0, 0, 0));
        jTextField56.setForeground(new java.awt.Color(0, 255, 255));
        jTextField56.setText("5");
        jTextField56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField56ActionPerformed(evt);
            }
        });

        jTextField57.setBackground(new java.awt.Color(0, 0, 0));
        jTextField57.setForeground(new java.awt.Color(0, 255, 255));
        jTextField57.setText("2");
        jTextField57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField57ActionPerformed(evt);
            }
        });

        jTextField58.setBackground(new java.awt.Color(0, 0, 0));
        jTextField58.setForeground(new java.awt.Color(0, 255, 255));
        jTextField58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField58ActionPerformed(evt);
            }
        });

        jTextField59.setBackground(new java.awt.Color(0, 0, 0));
        jTextField59.setForeground(new java.awt.Color(0, 255, 255));
        jTextField59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField59ActionPerformed(evt);
            }
        });

        jTextField60.setBackground(new java.awt.Color(0, 0, 0));
        jTextField60.setForeground(new java.awt.Color(0, 255, 255));
        jTextField60.setText("1");
        jTextField60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField60ActionPerformed(evt);
            }
        });

        jTextField61.setBackground(new java.awt.Color(0, 0, 0));
        jTextField61.setForeground(new java.awt.Color(0, 255, 255));
        jTextField61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField61ActionPerformed(evt);
            }
        });

        jTextField62.setBackground(new java.awt.Color(0, 0, 0));
        jTextField62.setForeground(new java.awt.Color(0, 255, 255));
        jTextField62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField62ActionPerformed(evt);
            }
        });

        jTextField63.setBackground(new java.awt.Color(0, 0, 0));
        jTextField63.setForeground(new java.awt.Color(0, 255, 255));
        jTextField63.setText("3");
        jTextField63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField63ActionPerformed(evt);
            }
        });

        jLayeredPane8.setLayer(jTextField55, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jTextField56, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jTextField57, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jTextField58, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jTextField59, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jTextField60, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jTextField61, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jTextField62, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jTextField63, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane8Layout.createSequentialGroup()
                        .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane8Layout.createSequentialGroup()
                                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane8Layout.createSequentialGroup()
                                .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane8Layout.createSequentialGroup()
                        .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField62)
                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane9.setForeground(new java.awt.Color(204, 204, 204));

        jTextField64.setBackground(new java.awt.Color(0, 0, 0));
        jTextField64.setForeground(new java.awt.Color(0, 255, 255));
        jTextField64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField64ActionPerformed(evt);
            }
        });

        jTextField65.setBackground(new java.awt.Color(0, 0, 0));
        jTextField65.setForeground(new java.awt.Color(0, 255, 255));
        jTextField65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField65ActionPerformed(evt);
            }
        });

        jTextField66.setBackground(new java.awt.Color(0, 0, 0));
        jTextField66.setForeground(new java.awt.Color(0, 255, 255));
        jTextField66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField66ActionPerformed(evt);
            }
        });

        jTextField67.setBackground(new java.awt.Color(0, 0, 0));
        jTextField67.setForeground(new java.awt.Color(0, 255, 255));
        jTextField67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField67ActionPerformed(evt);
            }
        });

        jTextField68.setBackground(new java.awt.Color(0, 0, 0));
        jTextField68.setForeground(new java.awt.Color(0, 255, 255));
        jTextField68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField68ActionPerformed(evt);
            }
        });

        jTextField69.setBackground(new java.awt.Color(0, 0, 0));
        jTextField69.setForeground(new java.awt.Color(0, 255, 255));
        jTextField69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField69ActionPerformed(evt);
            }
        });

        jTextField70.setBackground(new java.awt.Color(0, 0, 0));
        jTextField70.setForeground(new java.awt.Color(0, 255, 255));
        jTextField70.setText("2");
        jTextField70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField70ActionPerformed(evt);
            }
        });

        jTextField71.setBackground(new java.awt.Color(0, 0, 0));
        jTextField71.setForeground(new java.awt.Color(0, 255, 255));
        jTextField71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField71ActionPerformed(evt);
            }
        });

        jTextField72.setBackground(new java.awt.Color(0, 0, 0));
        jTextField72.setForeground(new java.awt.Color(0, 255, 255));
        jTextField72.setText("9");
        jTextField72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField72ActionPerformed(evt);
            }
        });

        jLayeredPane9.setLayer(jTextField64, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jTextField65, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jTextField66, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jTextField67, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jTextField68, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jTextField69, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jTextField70, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jTextField71, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane9.setLayer(jTextField72, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane9Layout = new javax.swing.GroupLayout(jLayeredPane9);
        jLayeredPane9.setLayout(jLayeredPane9Layout);
        jLayeredPane9Layout.setHorizontalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane9Layout.createSequentialGroup()
                        .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane9Layout.setVerticalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField71)
                    .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane10.setForeground(new java.awt.Color(204, 204, 204));

        jTextField73.setBackground(new java.awt.Color(0, 0, 0));
        jTextField73.setForeground(new java.awt.Color(0, 255, 255));
        jTextField73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField73ActionPerformed(evt);
            }
        });

        jTextField74.setBackground(new java.awt.Color(0, 0, 0));
        jTextField74.setForeground(new java.awt.Color(0, 255, 255));
        jTextField74.setText("9");
        jTextField74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField74ActionPerformed(evt);
            }
        });

        jTextField75.setBackground(new java.awt.Color(0, 0, 0));
        jTextField75.setForeground(new java.awt.Color(0, 255, 255));
        jTextField75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField75ActionPerformed(evt);
            }
        });

        jTextField76.setBackground(new java.awt.Color(0, 0, 0));
        jTextField76.setForeground(new java.awt.Color(0, 255, 255));
        jTextField76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField76ActionPerformed(evt);
            }
        });

        jTextField77.setBackground(new java.awt.Color(0, 0, 0));
        jTextField77.setForeground(new java.awt.Color(0, 255, 255));
        jTextField77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField77ActionPerformed(evt);
            }
        });

        jTextField78.setBackground(new java.awt.Color(0, 0, 0));
        jTextField78.setForeground(new java.awt.Color(0, 255, 255));
        jTextField78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField78ActionPerformed(evt);
            }
        });

        jTextField79.setBackground(new java.awt.Color(0, 0, 0));
        jTextField79.setForeground(new java.awt.Color(0, 255, 255));
        jTextField79.setText("5");
        jTextField79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField79ActionPerformed(evt);
            }
        });

        jTextField80.setBackground(new java.awt.Color(0, 0, 0));
        jTextField80.setForeground(new java.awt.Color(0, 255, 255));
        jTextField80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField80ActionPerformed(evt);
            }
        });

        jTextField81.setBackground(new java.awt.Color(0, 0, 0));
        jTextField81.setForeground(new java.awt.Color(0, 255, 255));
        jTextField81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField81ActionPerformed(evt);
            }
        });

        jLayeredPane10.setLayer(jTextField73, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField74, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField75, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField76, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField77, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField78, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField79, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField80, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField81, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane10Layout = new javax.swing.GroupLayout(jLayeredPane10);
        jLayeredPane10.setLayout(jLayeredPane10Layout);
        jLayeredPane10Layout.setHorizontalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane10Layout.createSequentialGroup()
                        .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane10Layout.setVerticalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField80)
                    .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane6.setForeground(new java.awt.Color(204, 204, 204));

        jTextField37.setBackground(new java.awt.Color(0, 0, 0));
        jTextField37.setForeground(new java.awt.Color(0, 255, 255));
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });

        jTextField38.setBackground(new java.awt.Color(0, 0, 0));
        jTextField38.setForeground(new java.awt.Color(0, 255, 255));
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });

        jTextField39.setBackground(new java.awt.Color(0, 0, 0));
        jTextField39.setForeground(new java.awt.Color(0, 255, 255));
        jTextField39.setText("7");
        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });

        jTextField40.setBackground(new java.awt.Color(0, 0, 0));
        jTextField40.setForeground(new java.awt.Color(0, 255, 255));
        jTextField40.setText("4");
        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });

        jTextField41.setBackground(new java.awt.Color(0, 0, 0));
        jTextField41.setForeground(new java.awt.Color(0, 255, 255));
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });

        jTextField42.setBackground(new java.awt.Color(0, 0, 0));
        jTextField42.setForeground(new java.awt.Color(0, 255, 255));
        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });

        jTextField43.setBackground(new java.awt.Color(0, 0, 0));
        jTextField43.setForeground(new java.awt.Color(0, 255, 255));
        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        jTextField44.setBackground(new java.awt.Color(0, 0, 0));
        jTextField44.setForeground(new java.awt.Color(0, 255, 255));
        jTextField44.setText("5");
        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });

        jTextField45.setBackground(new java.awt.Color(0, 0, 0));
        jTextField45.setForeground(new java.awt.Color(0, 255, 255));
        jTextField45.setText("6");
        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });

        jLayeredPane6.setLayer(jTextField37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jTextField38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jTextField39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jTextField40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jTextField41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jTextField42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jTextField43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jTextField44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jTextField45, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44))
                .addContainerGap())
        );

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameLayout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameLayout.createSequentialGroup()
                        .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameLayout.createSequentialGroup()
                        .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane10)
                    .addComponent(jLayeredPane7)
                    .addComponent(jLayeredPane6))
                .addGap(6, 6, 6))
        );
        gameLayout.setVerticalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane8)
                    .addComponent(jLayeredPane10)
                    .addComponent(jLayeredPane9))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        getContentPane().add(game, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 420, 350));

        quit.setBackground(new java.awt.Color(0, 0, 0));
        quit.setForeground(new java.awt.Color(0, 255, 255));
        quit.setText("Quit");
        quit.setToolTipText("Quits game");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        getContentPane().add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setForeground(new java.awt.Color(0, 255, 255));
        submit.setText("Submit");
        submit.setToolTipText("Submit your game sheet");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        clock.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        clock.setForeground(new java.awt.Color(255, 0, 255));
        clock.setText("\\");
            getContentPane().add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 200, -1));

            jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 0, 255));
            jLabel1.setText("Sudoku");
            getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

            SudokuScore.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
            SudokuScore.setForeground(new java.awt.Color(255, 0, 255));
            SudokuScore.setText("Score:");
            getContentPane().add(SudokuScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 40));

            setSize(new java.awt.Dimension(614, 407));
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField5.getText());
        if (checkNumber(number) == true) {
        userBoard[1][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField2.getText());
        if (checkNumber(number) == true) {
        userBoard[1][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
     int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField4.getText());
        if (checkNumber(number) == true) {
        userBoard[0][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField1.getText());
        if (checkNumber(number) == true) {
        userBoard[0][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField10.getText());
        if (checkNumber(number) == true) {
        userBoard[0][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField11.getText());
        if (checkNumber(number) == true) {
        userBoard[0][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField13.getText());
        if (checkNumber(number) == true) {
        userBoard[1][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField14.getText());
        if (checkNumber(number) == true) {
        userBoard[1][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField19.getText());
        if (checkNumber(number) == true) {
        userBoard[3][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField20.getText());
        if (checkNumber(number) == true) {
        userBoard[3][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField22.getText());
        if (checkNumber(number) == true) {
        userBoard[4][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField23.getText());
        if (checkNumber(number) == true) {
        userBoard[4][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
 int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField28.getText());
        if (checkNumber(number) == true) {
        userBoard[3][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField29.getText());
        if (checkNumber(number) == true) {
        userBoard[3][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField31.getText());
        if (checkNumber(number) == true) {
        userBoard[4][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField32.getText());
        if (checkNumber(number) == true) {
        userBoard[4][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField37.getText());
        if (checkNumber(number) == true) {
        userBoard[0][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField38.getText());
        if (checkNumber(number) == true) {
        userBoard[0][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField40.getText());
        if (checkNumber(number) == true) {
        userBoard[1][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField41.getText());
        if (checkNumber(number) == true) {
        userBoard[1][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField46ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField46.getText());
        if (checkNumber(number) == true) {
        userBoard[3][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField46ActionPerformed

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField47.getText());
        if (checkNumber(number) == true) {
        userBoard[3][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField49ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField49.getText());
        if (checkNumber(number) == true) {
        userBoard[4][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField49ActionPerformed

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField50ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField50.getText());
        if (checkNumber(number) == true) {
        userBoard[4][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField50ActionPerformed

    private void jTextField55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField55ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField55.getText());
        if (checkNumber(number) == true) {
        userBoard[6][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField55ActionPerformed

    private void jTextField56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField56ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField56.getText());
        if (checkNumber(number) == true) {
        userBoard[6][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField56ActionPerformed

    private void jTextField58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField58ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField58.getText());
        if (checkNumber(number) == true) {
        userBoard[7][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField58ActionPerformed

    private void jTextField59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField59ActionPerformed
           int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField59.getText());
        if (checkNumber(number) == true) {
        userBoard[7][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField59ActionPerformed

    private void jTextField64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField64ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField64.getText());
        if (checkNumber(number) == true) {
        userBoard[6][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField64ActionPerformed

    private void jTextField65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField65ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField65.getText());
        if (checkNumber(number) == true) {
        userBoard[6][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField65ActionPerformed

    private void jTextField67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField67ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField67.getText());
        if (checkNumber(number) == true) {
        userBoard[7][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField67ActionPerformed

    private void jTextField68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField68ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField68.getText());
        if (checkNumber(number) == true) {
        userBoard[7][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField68ActionPerformed

    private void jTextField73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField73ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField73.getText());
        if (checkNumber(number) == true) {
        userBoard[6][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField73ActionPerformed

    private void jTextField74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField74ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField74.getText());
        if (checkNumber(number) == true) {
        userBoard[6][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField74ActionPerformed

    private void jTextField76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField76ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField76.getText());
        if (checkNumber(number) == true) {
        userBoard[7][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField76ActionPerformed

    private void jTextField77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField77ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField77.getText());
        if (checkNumber(number) == true) {
        userBoard[7][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField77ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField7.getText());
        if (checkNumber(number) == true) {
        userBoard[0][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField3.getText());
        if (checkNumber(number) == true) {
        userBoard[2][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField6.getText());
        if (checkNumber(number) == true) {
        userBoard[2][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField8.getText());
        if (checkNumber(number) == true) {
        userBoard[1][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField9.getText());
        if (checkNumber(number) == true) {
        userBoard[2][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       boolean isCorrect = CheckBoard(userBoard);
        SudokuScore.setText("Score: " + score);  
        if (isCorrect == true){
           try {
               Endgame.score2 = score;
               this.dispose();
               Endgame obj2 = new Endgame();
               obj2.setVisible(true);
           } catch (IOException ex) {
               Logger.getLogger(Sudoku2.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField12.getText());
        if (checkNumber(number) == true) {
        userBoard[0][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField15.getText());
        if (checkNumber(number) == true) {
        userBoard[1][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField18.getText());
        if (checkNumber(number) == true) {
        userBoard[2][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField17.getText());
        if (checkNumber(number) == true) {
        userBoard[2][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
       int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField16.getText());
        if (checkNumber(number) == true) {
        userBoard[2][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField39.getText());
        if (checkNumber(number) == true) {
        userBoard[0][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField42.getText());
        if (checkNumber(number) == true) {
        userBoard[1][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField45.getText());
        if (checkNumber(number) == true) {
        userBoard[2][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField44.getText());
        if (checkNumber(number) == true) {
        userBoard[2][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField43.getText());
        if (checkNumber(number) == true) {
        userBoard[2][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField21.getText());
        if (checkNumber(number) == true) {
        userBoard[3][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
       int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField24.getText());
        if (checkNumber(number) == true) {
        userBoard[4][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField27.getText());
        if (checkNumber(number) == true) {
        userBoard[5][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField26.getText());
        if (checkNumber(number) == true) {
        userBoard[5][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField25.getText());
        if (checkNumber(number) == true) {
        userBoard[5][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField30.getText());
        if (checkNumber(number) == true) {
        userBoard[3][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField33.getText());
        if (checkNumber(number) == true) {
        userBoard[4][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField36.getText());
        if (checkNumber(number) == true) {
        userBoard[5][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField35.getText());
        if (checkNumber(number) == true) {
        userBoard[5][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField34.getText());
        if (checkNumber(number) == true) {
        userBoard[5][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jTextField51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField51ActionPerformed
       int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField51.getText());
        if (checkNumber(number) == true) {
        userBoard[4][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField51ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField48.getText());
        if (checkNumber(number) == true) {
        userBoard[3][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jTextField54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField54ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField54.getText());
        if (checkNumber(number) == true) {
        userBoard[5][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField54ActionPerformed

    private void jTextField53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField53ActionPerformed
        int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField53.getText());
        if (checkNumber(number) == true) {
        userBoard[5][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField53ActionPerformed

    private void jTextField52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField52ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField52.getText());
        if (checkNumber(number) == true) {
        userBoard[5][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
        
    }//GEN-LAST:event_jTextField52ActionPerformed

    private void jTextField57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField57ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField57.getText());
        if (checkNumber(number) == true) {
        userBoard[6][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField57ActionPerformed

    private void jTextField60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField60ActionPerformed
   int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField60.getText());
        if (checkNumber(number) == true) {
        userBoard[7][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField60ActionPerformed

    private void jTextField63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField63ActionPerformed
           int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField63.getText());
        if (checkNumber(number) == true) {
        userBoard[8][0] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField63ActionPerformed

    private void jTextField62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField62ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField62.getText());
        if (checkNumber(number) == true) {
        userBoard[8][1] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField62ActionPerformed

    private void jTextField61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField61ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField61.getText());
        if (checkNumber(number) == true) {
        userBoard[8][2] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField61ActionPerformed

    private void jTextField66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField66ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField66.getText());
        if (checkNumber(number) == true) {
        userBoard[6][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField66ActionPerformed

    private void jTextField69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField69ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField69.getText());
        if (checkNumber(number) == true) {
        userBoard[7][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField69ActionPerformed

    private void jTextField72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField72ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField72.getText());
        if (checkNumber(number) == true) {
        userBoard[8][3] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField72ActionPerformed

    private void jTextField71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField71ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField71.getText());
        if (checkNumber(number) == true) {
        userBoard[8][4] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField71ActionPerformed

    private void jTextField70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField70ActionPerformed
          int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField70.getText());
        if (checkNumber(number) == true) {
        userBoard[8][5] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField70ActionPerformed

    private void jTextField75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField75ActionPerformed
         int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField75.getText());
        if (checkNumber(number) == true) {
        userBoard[6][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField75ActionPerformed

    private void jTextField78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField78ActionPerformed
           int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField78.getText());
        if (checkNumber(number) == true) {
        userBoard[7][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField78ActionPerformed

    private void jTextField81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField81ActionPerformed
           int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField81.getText());
        if (checkNumber(number) == true) {
        userBoard[8][6] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField81ActionPerformed

    private void jTextField80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField80ActionPerformed
           int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField80.getText());
        if (checkNumber(number) == true) {
        userBoard[8][7] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField80ActionPerformed

    private void jTextField79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField79ActionPerformed
           int number = 0; 
        
        try {
        number = Integer.parseInt(jTextField79.getText());
        if (checkNumber(number) == true) {
        userBoard[8][8] = number;
        System.out.println(number);
        }
        else
            JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Enter a number 1-9 cmon brother you're better than this!",
               "Big uh oh", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_jTextField79ActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        score = 0;
        Endgame.score2 = 0;
        try {
        this.dispose();
        Endgame obj2 = new Endgame();
        obj2.setVisible(true);
    } catch (IOException ex) {
        Logger.getLogger(Sudoku2.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_quitActionPerformed

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
            java.util.logging.Logger.getLogger(Sudoku2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SudokuScore;
    private javax.swing.JLabel clock;
    private javax.swing.JPanel game;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton quit;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
