/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangmanprojectv1.Pong;

import static com.mycompany.hangmanprojectv1.Pong.GamePanel.SCREEN_SIZE;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Nathan Elias
 */
public class GameFrame extends JFrame {
   
    private JButton quitButton;
    private JLabel title;
    GamePanel panel;
   // OuterPanel panel2;
    GameFrame(){
         panel = new GamePanel();
       //  panel2 = new OuterPanel();
         quitButton = new JButton("Quit");
         title = new JLabel("Pong");
         
               
		
                //panel2.add(quitButton);
               
		this.setTitle("Pong");
		this.setResizable(false);
                this.add(panel);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();               
                this.getContentPane().add(panel);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
               
    }
    
}
