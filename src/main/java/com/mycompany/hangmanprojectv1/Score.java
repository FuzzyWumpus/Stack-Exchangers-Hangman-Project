/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangmanprojectv1;

import com.mycompany.hangmanprojectv1.CreditScreen;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;

public class Score extends Rectangle  {
        private Font font;
        private boolean qHighlight = false;
        private Rectangle quitBtn; // Quit Button
	private String quitTxt = "Press q to quit";
	static int GAME_WIDTH;
        
	static int GAME_HEIGHT;

	int player1;

	int player2;

	

	Score(int GAME_WIDTH, int GAME_HEIGHT){

		Score.GAME_WIDTH = GAME_WIDTH;

		Score.GAME_HEIGHT = GAME_HEIGHT;
                int x, y, w, h;

		w = 300;
		h = 150;

		y = GAME_HEIGHT / 2 - h / 2;

		x = GAME_WIDTH / 4 - w / 2;
		 

		x = GAME_WIDTH * 3 / 4 - w / 2;
		quitBtn = new Rectangle(x, y, w, h);

		font = new Font("Roboto", Font.PLAIN, 100);

	}

	public void draw(Graphics g) {
   
                
		
		g.setColor(Color.white);
               
		g.setFont(new Font("Consolas",Font.PLAIN,40));
                   int strWidth, strHeight;
		
                 
		g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
                g.setColor(Color.BLUE);
                g.drawString("P1", GAME_WIDTH / 2 - 180, 50);
                g.setColor(Color.RED);
                g.drawString("P2", GAME_WIDTH / 2 + 75, 50);
                g.setColor(Color.white);
		

		g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-120, 50);

		g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+135, 50);
              
                strWidth = g.getFontMetrics(font).stringWidth(quitTxt);
		strHeight = g.getFontMetrics(font).getHeight();
                g.setFont(new Font("Consolas",Font.PLAIN,15));
                g.setColor(Color.white);
		g.drawString(quitTxt,(GAME_WIDTH/2)+145, 380);

	}
        
        
       
			

	

     
    
}
