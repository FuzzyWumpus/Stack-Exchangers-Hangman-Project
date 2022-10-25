/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangmanprojectv1;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nathan Elias
 */
public class GamePanel extends JPanel implements ActionListener, Runnable{
   
        static final int GAME_WIDTH = 600;
	static final int GAME_HEIGHT = 400;
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
	static final int BALL_DIAMETER = 15;
	static final int PADDLE_WIDTH = 15;
	static final int PADDLE_HEIGHT = 70;
        
	Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle1;
	Paddle paddle2;
	Ball ball;
	Score score;
        JLabel time = new JLabel();
        JButton quit;
        private static JFrame frame2;
        static boolean gameOn = true;
        static boolean pause = true;
        private javax.swing.Timer swingtimer;
        boolean playerScored = false;
        int player = 0;
        
    GamePanel() {
        
       newPaddles();
       newBall();
       score = new Score(GAME_WIDTH, GAME_HEIGHT);
       this.setFocusable(true);
       this.addKeyListener(new AL());
       this.setPreferredSize(SCREEN_SIZE);
       time = new JLabel("Player scores!");
       //GamePanel.add(h);
       gameThread = new Thread(this);
       gameThread.start();
     
    }
    
     
    
   public void newBall() {

		random = new Random();

		ball = new Ball((GAME_WIDTH/2)-(BALL_DIAMETER/2),GAME_HEIGHT/2,BALL_DIAMETER,BALL_DIAMETER);

	}

	public void newPaddles() {

		paddle1 = new Paddle(0,(GAME_HEIGHT/2)-(PADDLE_HEIGHT/2),PADDLE_WIDTH,PADDLE_HEIGHT,1);

		paddle2 = new Paddle(GAME_WIDTH-PADDLE_WIDTH,(GAME_HEIGHT/2)-(PADDLE_HEIGHT/2),PADDLE_WIDTH,PADDLE_HEIGHT,2);

	}

	public void paint(Graphics g) {

		image = createImage(getWidth(),getHeight());

		graphics = image.getGraphics();

		draw(graphics);

		g.drawImage(image,0,0,this);

	}

	public void draw(Graphics g) {

		paddle1.draw(g);

		paddle2.draw(g);

		ball.draw(g);

		score.draw(g);
               
                //Draws title to screen
                g.setFont(new Font("NeonSans",Font.BOLD,40));
                g.setColor(Color.white);
                g.drawString("PONG " ,GAME_WIDTH / 2 - 55, 35);
                //Draws the Time to screen
                g.setFont(new Font("Consolas",Font.PLAIN,15));
                Calendar cal = new GregorianCalendar();
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    int month = cal.get(Calendar.MONTH) + 1 ;
                    int year = cal.get(Calendar.YEAR);
        
                    int second=cal.get(Calendar.SECOND);
                    int minute =cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                g.drawString("Date: " + month + "/" + day + "/"+year+" Time "+hour+":"+minute+":"+second+" ",
                 GAME_WIDTH / 2 - 110, 65);
                g.setFont(new Font("Consolas",Font.PLAIN,25));
                if (player == 1){
                g.setColor(Color.blue);
                }
                else 
                   g.setColor(Color.red);   
                    
                if (playerScored) {
                    
                    g.drawString("Player " + player + " Scored!" ,GAME_WIDTH / 2 - 118, 335);
                }
                
	}

        
        
	public void move() {

		paddle1.move();

		paddle2.move();

		ball.move();

	}

	public void checkCollision() {

		

		//bounce ball off top & bottom window edges

		if(ball.y <=0) {

			ball.setYDirection(-ball.yVelocity);

		}

		if(ball.y >= GAME_HEIGHT-BALL_DIAMETER) {

			ball.setYDirection(-ball.yVelocity);

		}

		//bounce ball off paddles

		if(ball.intersects(paddle1)) {

			ball.xVelocity = Math.abs(ball.xVelocity);

			ball.xVelocity++; //zoom

			if(ball.yVelocity>0)

				ball.yVelocity++; //zoom

			else

				ball.yVelocity--;

			ball.setXDirection(ball.xVelocity);

			ball.setYDirection(ball.yVelocity);

		}

		if(ball.intersects(paddle2)) {

			ball.xVelocity = Math.abs(ball.xVelocity);

			ball.xVelocity++; //zoom

			if(ball.yVelocity>0)

				ball.yVelocity++; //zoom

			else

				ball.yVelocity--;

			ball.setXDirection(-ball.xVelocity);

			ball.setYDirection(ball.yVelocity);

		}

		//stops paddles at window borders

		if(paddle1.y<=0)

			paddle1.y=0;

		if(paddle1.y >= (GAME_HEIGHT-PADDLE_HEIGHT))

			paddle1.y = GAME_HEIGHT-PADDLE_HEIGHT;

		if(paddle2.y<=0)

			paddle2.y=0;

		if(paddle2.y >= (GAME_HEIGHT-PADDLE_HEIGHT))

			paddle2.y = GAME_HEIGHT-PADDLE_HEIGHT;

		//give a player 1 point and resets the game by making  new paddles & ball

		if(ball.x <=0) {
                  pause = true;
                        
                  
                        playerScored = true;
                        player = 2;
                        score.player2 += 10;
                        if (score.player2 == 100 ){
                             GameFrame.end();
                           GameFrame.theWinner = 2;
                           gameThread.stop();
                          
                        }
                           
                   
                        newPaddles();
                        
                        newBall();
                        
                        System.out.println("Player 2: "+ score.player2);
                        
                 
		}

		if(ball.x >= GAME_WIDTH-BALL_DIAMETER) {
                    
         
                        playerScored = true;
                        player = 1;
			score.player1 += 10;
                        if (score.player1 == 100 ){
                            GameFrame.theWinner = 1;
                             GameFrame.end();
                            
                            gameThread.stop();
                           
                        }
                        
                         pause = true;
                      
                        
			newPaddles();

			newBall();
                       
			System.out.println("Player 1: "+score.player1);

		}

	}
public void run() {

		//game loop
               
		long lastTime = System.nanoTime();

		double amountOfTicks = 60.0;

		double ns = 1000000000 / amountOfTicks;

		double delta = 0;
                long timePausedS = 0;
                long timePausedF = 0;
                long timePaused = 0;
             
		while (!Thread.interrupted()) {
                     while (pause) {
                         try {
                             timePausedS = System.nanoTime();
                             Thread.sleep(1);
                             timePausedF = System.nanoTime();                           
                             timePaused += timePausedF - timePausedS;
                           
                         } catch (InterruptedException ex) {
                             Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
                         }
        }   
                    if(!pause) {
			long now = System.nanoTime();
                        
			delta += (now - lastTime - timePaused)/ns;

                        timePaused = 0;
                        
			lastTime = now;
                    }
                        
                        
			if(delta >=1 && !pause) {
                            
				move();

				checkCollision();

				repaint();

				delta--;
                                
                           
			}

		}

	}

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public void drawPlayer1(Graphics g) {
       g.drawString("Player 1 scored", GAME_WIDTH , 50);
    }

    

	public class AL extends KeyAdapter{

		public void keyPressed(KeyEvent e) {
                       
                  
			paddle1.keyPressed(e);

			paddle2.keyPressed(e);
                        
                        
                        
                         if(e.getKeyCode()==KeyEvent.VK_SPACE) {
                             
				pause = false;

			}
                           if(e.getKeyCode()==KeyEvent.VK_Q) {
                               GameFrame.quit = true;
                                 gameThread.stop();
				GameFrame.end();

			}
                        
		}

		public void keyReleased(KeyEvent e) {

			paddle1.keyReleased(e);

			paddle2.keyReleased(e);
                        
                       
                        
                        if(e.getKeyCode()==KeyEvent.VK_SPACE) {
                                
				pause = false;
                                
                                
			}


		}

	}

}
