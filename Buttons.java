/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hangman;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;
import java.util.Random;

/**
 *
 * @author sebas
 */
public class Buttons extends javax.swing.JFrame {

    /**
     * Creates new form Buttons
     */
    int location1; //blue
    int location2; //red
    int location3; //green
    int location4; //yellow
    int location5; //magenta
    public Buttons() {
        initComponents();
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        
        
        location1 = randomOne();
        location2= randomTwo();
        location3 = randomThree();
        location4 = randomFour();
        location5 =randomFive();
        int[] locationArray = new int[5];
        locationArray[0] = location1;
        locationArray[1] = location2;
        locationArray[2] = location3;
        locationArray[3] = location4;
        locationArray[4] = location5;
        for(int i=0;i < locationArray.length;i++){
            if(locationArray[i] == 1){
                jButton1.setVisible(true);
            }
            if(locationArray[i] == 2){
                jButton2.setVisible(true);
            }
            if(locationArray[i] == 3){
                jButton3.setVisible(true);
            }
            if(locationArray[i] == 4){
                jButton4.setVisible(true);
            }
            if(locationArray[i] == 5){
                jButton5.setVisible(true);
            }
            if(locationArray[i] == 6){
                jButton6.setVisible(true);
            }
            if(locationArray[i] == 7){
                jButton7.setVisible(true);
            }
            if(locationArray[i] == 8){
                jButton8.setVisible(true);
            }
            if(locationArray[i] == 9){
                jButton9.setVisible(true);
            }
            if(locationArray[i] == 10){
                jButton10.setVisible(true);
            }
            if(locationArray[i] == 11){
                jButton11.setVisible(true);
            }
            if(locationArray[i] == 12){
                jButton12.setVisible(true);
            }
            if(locationArray[i] == 13){
                jButton13.setVisible(true);
            }
            if(locationArray[i] == 14){
                jButton14.setVisible(true);
            }
            if(locationArray[i] == 15){
                jButton15.setVisible(true);
            }
            if(locationArray[i] == 16){
                jButton16.setVisible(true);
            }
        }
                
    }
    private int randomOne()
    {
        Random rand = new Random();
        int location1 = rand.nextInt(16)+1;
        System.out.println(location1 +" ");
        return location1;
    };
    
    public int randomTwo()
    {
        Random rand = new Random();
        int location2 = rand.nextInt(16)+1;
        if(location2 == location1)
        {
            randomTwo();
        }
        System.out.println(location2 +" ");
        return location2;
    }
    
    public int randomThree(){
        Random rand = new Random();
        int location3 = rand.nextInt(16)+1;
        if(location3 == location1)
        {
            randomThree();
        }
        if(location3 == location2)
        {
            randomThree();
        }
        System.out.println(location3 +" ");
        return location3;
    }
    public int randomFour(){
        Random rand = new Random();
        int location4 = rand.nextInt(16)+1;
        if(location4 == location1)
        {
            randomFour();
        }
        if(location4 == location2)
        {
            randomFour();
        }
        if(location4 == location3)
        {
            randomFour();
        } 
        System.out.println(location4 +" ");
        return location4;
    }
    public int randomFive(){
        Random rand = new Random();
        int location5 = rand.nextInt(16)+1;
        if(location5 == location1)
        {
            randomFive();
        }
        if(location5 == location2)
        {
            randomFive();
        }
        if(location5 == location3)
        {
            randomFive();
        } 
        if(location5 == location4)
        {
            randomFive();
        } 
        System.out.println(location5 +" ");
        return location5;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setText("Color");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.GridLayout(0, 4, 2, 2));

        jButton1.setText("jButton1");
        jPanel2.add(jButton1);

        jButton2.setText("jButton2");
        jPanel2.add(jButton2);

        jButton3.setText("jButton3");
        jPanel2.add(jButton3);

        jButton4.setText("jButton4");
        jPanel2.add(jButton4);

        jButton5.setText("jButton5");
        jPanel2.add(jButton5);

        jButton6.setText("jButton6");
        jPanel2.add(jButton6);

        jButton7.setText("jButton7");
        jPanel2.add(jButton7);

        jButton8.setText("jButton8");
        jPanel2.add(jButton8);

        jButton9.setText("jButton9");
        jPanel2.add(jButton9);

        jButton10.setText("jButton10");
        jPanel2.add(jButton10);

        jButton11.setText("jButton11");
        jPanel2.add(jButton11);

        jButton12.setText("jButton12");
        jPanel2.add(jButton12);

        jButton13.setText("jButton13");
        jPanel2.add(jButton13);

        jButton14.setText("jButton14");
        jPanel2.add(jButton14);

        jButton15.setText("jButton15");
        jPanel2.add(jButton15);

        jButton16.setText("jButton16");
        jPanel2.add(jButton16);

        jLabel2.setText("Date n time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.getAccessibleContext().setAccessibleName("clock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Buttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buttons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
