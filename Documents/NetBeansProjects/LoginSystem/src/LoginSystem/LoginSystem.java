/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author franklin chidera
 */
public class LoginSystem extends javax.swing.JFrame {

    private Object username;
    private Object password;

    /**
     * Creates new form LoginSystem
     */
    public LoginSystem() {
        initComponents();
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
        disusrnm = new javax.swing.JTextField();
        dispssnmr = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(176, 224, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 12), "Login System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        disusrnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disusrnmActionPerformed(evt);
            }
        });
        jPanel1.add(disusrnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 109, 220, 54));
        jPanel1.add(dispssnmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 253, 220, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 109, 99, 54));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 253, 99, 52));

        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 99, 34));

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 101, 34));

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 89, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disusrnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disusrnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disusrnmActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      try{
         String usernam= "root";
	String pass = "root"; 
       Class.forName("com.mysql.cj.jdbc.Driver") ;
  String url = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
Connection con = DriverManager.getConnection(url,usernam,pass);
String sql = "select * from loginsys where username =? and password =?";
PreparedStatement pst = con.prepareStatement(sql);
       pst.setString(1, disusrnm.getText());
        pst.setString(2, dispssnmr.getText());
       ResultSet rs = pst.executeQuery();
       if(rs.next()){
    JOptionPane.showMessageDialog(null, "username and password matched");
}
else{
       JOptionPane.showMessageDialog(null, "username and password not correct");
 disusrnm.setText("");
 dispssnmr.setText("");
 
 con.close();

}

      } catch (Exception e) {
       JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_loginActionPerformed
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
 disusrnm.setText("");
 dispssnmr.setText("");    }//GEN-LAST:event_resetActionPerformed


    private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
frame = new JFrame("Exit");
  if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
    System.exit(0);
}
    }//GEN-LAST:event_exitActionPerformed
        
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
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSystem().setVisible(true);
            }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField dispssnmr;
    private javax.swing.JTextField disusrnm;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

   
}
