/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangmanprojectv1.Pong;

import static com.mycompany.hangmanprojectv1.Pong.GamePanel.SCREEN_SIZE;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * This was meant to be the  outer panel to put buttons and labels but Idk how to make it work
 * @author Nathan Elias
 */
public class OuterPanel extends JPanel{
    
        static final int GAME_WIDTH = 600;
	static final int GAME_HEIGHT = 400;
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
        
        GamePanel panel;
        OuterPanel(){
            panel = new GamePanel();
             this.setPreferredSize(SCREEN_SIZE);
          //   panel.add(panel);
        }
        
}
