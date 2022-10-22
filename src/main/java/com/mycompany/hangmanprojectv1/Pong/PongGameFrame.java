/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangmanprojectv1.Pong;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Nathan Elias
 */
public class PongGameFrame extends JPanel {
    
    PongGameFrame(){
        
    }
    
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
    }
    
    public static void main(String[] args) {
        
        JFrame newFrame = new JFrame("My cool pong game");
        newFrame.setSize(600,400);
        newFrame.setLocationRelativeTo(null);
        newFrame.setVisible(true);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PongGameFrame game = new PongGameFrame();
        
        while(true) {
            game.repaint();
        
        }
        
    }
    
    
}
