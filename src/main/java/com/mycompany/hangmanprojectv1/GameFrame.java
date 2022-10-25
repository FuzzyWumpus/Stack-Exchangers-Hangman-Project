/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangmanprojectv1;

import com.mycompany.hangmanprojectv1.GamePanel;
import static com.mycompany.hangmanprojectv1.GamePanel.SCREEN_SIZE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
    static boolean end = false;
    GamePanel panel;
    private static JFrame frameh;
    static int theWinner = 0;
    static boolean quit = false;
    GameFrame(){
       
        
         panel = new GamePanel();
         
         quitButton = new JButton("Quit");
         title = new JLabel("Pong");
         
               
		
               
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
    
   GameFrame(JFrame frame) {
       
       panel = new GamePanel();
                
		frame.setTitle("Pong");
		frame.setResizable(false);
                frame.add(panel);
		frame.setBackground(Color.black);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();               
                frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
                frameh = frame;
                
   }
  
    
    
  
   
    public static void end() {
        
        frameh.dispose();       
       if (!quit){
        PongOver obj2 = new PongOver(theWinner);
        obj2.setVisible(true);
       }
       else {
        Mainscreen obj2 = new Mainscreen();
        obj2.setVisible(true);
       }
    }
    
   
}
