/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lakpura;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.UIManager;

/**
 *
 * @author janithwanni
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        System.out.println(getLocation().getX() + "   " + getLocation().getY());
        setBounds(0, 0, 1364, 726);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(Toolkit.getDefaultToolkit().getImage(""));
        //setLocation(0, 24);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bglabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        employeeicon = new javax.swing.JLabel();
        employeetxt = new javax.swing.JLabel();
        employeetxt1 = new javax.swing.JLabel();
        employeetxt2 = new javax.swing.JLabel();
        employeetxt3 = new javax.swing.JLabel();
        employeetxt4 = new javax.swing.JLabel();
        employeetxt5 = new javax.swing.JLabel();
        employeetxt6 = new javax.swing.JLabel();
        employeetxt7 = new javax.swing.JLabel();
        employeetxt8 = new javax.swing.JLabel();
        employeetxt9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        bglabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/Multicolor_gaussian_blur_gradient_2560x1600.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1359, 740));

        jScrollPane1.setPreferredSize(getPreferredSize());

        jPanel1.setPreferredSize(getPreferredSize());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/handy.png"))); // NOI18N
        employeeicon.setToolTipText("");
        jPanel1.add(employeeicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, 140));

        employeetxt.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt.setText("Register Shifts");
        jPanel1.add(employeetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 180, 80));

        employeetxt1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt1.setText("Deductions");
        jPanel1.add(employeetxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 180, 80));

        employeetxt2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt2.setText("Invoice");
        jPanel1.add(employeetxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 170, 80));

        employeetxt3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt3.setText("Employees");
        jPanel1.add(employeetxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 140, 80));

        employeetxt4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt4.setText("Payroll");
        jPanel1.add(employeetxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 170, 80));

        employeetxt5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt5.setText("Buy Uniforms");
        jPanel1.add(employeetxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 200, 80));

        employeetxt6.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt6.setText("Issue Letters");
        jPanel1.add(employeetxt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 170, 80));

        employeetxt7.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt7.setText("Manage User");
        jPanel1.add(employeetxt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, 170, 80));

        employeetxt8.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt8.setText("Manage Clients");
        jPanel1.add(employeetxt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 180, 80));

        employeetxt9.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        employeetxt9.setText("Officer");
        jPanel1.add(employeetxt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 190, 80));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 64)); // NOI18N
        jLabel1.setText("Welcome !");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 470, 120));

        //DateFormat df = new SimpleDateFormat("HH:mm");
        Date d = new Date();
        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TimeKeeper tm = new TimeKeeper(jLabel2);
        Thread t = new Thread(tm);
        t.start();
        jLabel2.setText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 320, 40));

        DateFormat df2  = new SimpleDateFormat("EEEEEEEE MMMM d y");
        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText(df2.format(d));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 320, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/businessman99.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 430, 110, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/personal23.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 250, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/football114.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/invoice1 (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/Very-Basic-Document-icon.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/dollar120.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/business60.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/business116.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/dollar91.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x400.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x400.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x200#2.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 190, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x200#2.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x200#2.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x200#2.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x200#2.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x200#2.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x200#2.png"))); // NOI18N
        jButton10.setContentAreaFilled(false);
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPics/buttonfinal200x200#2.png"))); // NOI18N
        jButton11.setContentAreaFilled(false);
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        //employee
        new Employee().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        //officer
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        //invoice
        //new Invoice().setVisible(true); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        //issue 
        new issueLetters().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bglabel;
    private javax.swing.JLabel employeeicon;
    private javax.swing.JLabel employeetxt;
    private javax.swing.JLabel employeetxt1;
    private javax.swing.JLabel employeetxt2;
    private javax.swing.JLabel employeetxt3;
    private javax.swing.JLabel employeetxt4;
    private javax.swing.JLabel employeetxt5;
    private javax.swing.JLabel employeetxt6;
    private javax.swing.JLabel employeetxt7;
    private javax.swing.JLabel employeetxt8;
    private javax.swing.JLabel employeetxt9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
