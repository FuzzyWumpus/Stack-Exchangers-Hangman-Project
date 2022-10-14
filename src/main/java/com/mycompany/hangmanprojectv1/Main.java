package com.mycompany.hangmanprojectv1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Main extends JPanel implements ActionListener
{
    JLabel message = new JLabel();
    boolean onOff = true;
    public void actionPerformed(ActionEvent e)
    {
 if(onOff)
     message.setText("Hello");
 else
     message.setText("Goodbye");
 onOff = !onOff;
    }
    public Main()
    {
          JButton b = new JButton("Click Me!");
    Timer t = new Timer(1000, this);
   t.setInitialDelay(1000);
   t.start();
   add(b);
   add(message);
    }
    private static void createAndShowGUI()
    {
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Basic JFrame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Main m = new Main();
        f.add(m);
         f.pack();
        f.setVisible(true);
    }


}