/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangmanprojectv1;

import java.awt.*;
import static java.awt.Color.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Ball extends Rectangle{



	Random random;

	int xVelocity;

	int yVelocity;

	int initialSpeed = 2;
        int color;
	

	Ball(int x , int y , int width, int height){

		super(x,y,width,height);
                x=0;
                y=0;
		random = new Random();

		int randomXDirection = random.nextInt(2);

		if(randomXDirection == 0)

			randomXDirection--;

		setXDirection(randomXDirection*initialSpeed);

		

		int randomYDirection = random.nextInt(2);

		if(randomYDirection == 0)

			randomYDirection--;

		setYDirection(randomYDirection*initialSpeed);
                 int color = random.nextInt(5);
		

	}

	

	public void setXDirection(int randomXDirection) {

		xVelocity = randomXDirection;

	}

	public void setYDirection(int randomYDirection) {

		yVelocity = randomYDirection;

	}

	public void move() {
                if (GamePanel.pause) {
                    x += 0;
                    y += 0;
                } else {
		x += xVelocity;

		y += yVelocity;
                }
	}

	public void draw(Graphics g) {
               
                switch(color){
                    case 1:
                    g.setColor(WHITE);
                    break;
                    case 2:    
                     g.setColor(RED);
                     break;
                    case 3:
                    g.setColor(CYAN);
                    break;
                    case 4:    
                     g.setColor(PINK); 
                     break;
                    case 5:
                    g.setColor(CYAN);
                    break;
                    default:
                      
                    g.setColor(WHITE);
                  break;
                    
                    
                }
               

		g.fillOval(x, y, height, width);

	}

}
