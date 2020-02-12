
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franklin chidera
 */
public class editDeleteScore extends javax.swing.JFrame {

    /**
     * Creates new form editDeleteScore
     */
    Score sc = new Score();
    public editDeleteScore() {
        initComponents();
        sc.fillScoreJtable(jTable1);
        
         jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.BLUE);
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
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Score = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonRemoveScore = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_courseId = new javax.swing.JTextField();
        jButtonEditScore = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Description = new javax.swing.JTextField();
        jTextField_studentId1 = new javax.swing.JTextField();
        jButtonAddScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("Edit / Delete Score");
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Course Id:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jTextField_Score.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 236, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Score:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButtonRemoveScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRemoveScore.setText("Remove");
        jButtonRemoveScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemoveScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 114, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Student Id:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jTextField_courseId.setEditable(false);
        jTextField_courseId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_courseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_courseIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_courseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 236, 30));

        jButtonEditScore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditScore.setText("Edit");
        jButtonEditScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 96, 32));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Course Id", "Score", "Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 510, 360));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Description:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jTextField_Description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 236, 30));

        jTextField_studentId1.setEditable(false);
        jTextField_studentId1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_studentId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_studentId1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_studentId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 236, 30));

        jButtonAddScore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddScore.setText("Add");
        jButtonAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 96, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ScoreActionPerformed

    private void jButtonRemoveScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveScoreActionPerformed

        
      int sid = Integer.valueOf(jTextField_studentId1.getText());
    int  cid = Integer.valueOf(jTextField_courseId.getText());
    
    sc.insertUpdateDeleteStudent('d', sid, cid, null, null);
     jTable1.setModel(new DefaultTableModel(null, new Object[]{"student Id", "Course Id", "Score", "Description"}));
    sc.fillScoreJtable(jTable1);

        //        if(!jTextField_studentId.getText().equals("")){
            //            int id = Integer.valueOf(jTextField_studentId.getText());
            //            c.insertUpdateDeleteStudent('d', id, null, null);
            //            manageCourseForm.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id", "Label", "Hours"}));
            //            c.fillCourseJtable(manageCourseForm.jTable1);
            //            jTextField_studentId.setText("");
            //            jTextField_.setText("");
            //            jSpinner1.setValue(4);
            //        }
    }//GEN-LAST:event_jButtonRemoveScoreActionPerformed

    private void jTextField_courseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_courseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_courseIdActionPerformed

    private void jButtonEditScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditScoreActionPerformed
 
      int sid = Integer.valueOf(jTextField_studentId1.getText());
    int  cid = Integer.valueOf(jTextField_courseId.getText());
    double scr = Double.valueOf(jTextField_Score.getText());
    String ds = jTextField_Description.getText();
    
    sc.insertUpdateDeleteStudent('u', sid, cid, scr, ds);
    jTable1.setModel(new DefaultTableModel(null, new Object[]{"student Id", "Course Id", "Score", "Description"}));
    sc.fillScoreJtable(jTable1);


//        int stdId = Integer.valueOf(jTextField_courseId.getText());
//        int crsId = Integer.valueOf(c.getCourseId(jComboBox1CourseID.getSelectedItem().toString()));
//        double scr = Double.valueOf(jTextField_Score.getText());
//        System.out.println(crsId);
//        sc.insertUpdateDeleteStudent('i', stdId, crsId, scr, jTextField_Description.getText());

        //        addCourseForm Addcf = new  addCourseForm();
        //        Addcf.setVisible(true);
        //        Addcf.pack();
        //        Addcf.setLocationRelativeTo(null);
        //        Addcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonEditScoreActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int rowIndex = jTable1.getSelectedRow();
        jTextField_studentId1.setText(jTable1.getValueAt(rowIndex, 0).toString());
        jTextField_courseId.setText(jTable1.getValueAt(rowIndex, 1).toString());
       jTextField_Score.setText(jTable1.getValueAt(rowIndex, 2).toString());
      jTextField_Description.setText(jTable1.getValueAt(rowIndex, 3).toString());

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

        //        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
            //
            //            rowIndex = jTable1.getSelectedRow();
            //            jTextField_STD_ID1.setText(model.getValueAt(rowIndex, 0).toString());
            //            jTextField_FName1.setText(model.getValueAt(rowIndex, 1).toString());
            //            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            //            jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
            //            jTextArea1.setText(model.getValueAt(rowIndex, 6).toString());
            //
            //            if(model.getValueAt(rowIndex, 3).toString().equals("Male")){
                //                jRadioButtonMalee.setSelected(true);
                //                jRadioButtonFemalee.setSelected(false);
                //
                //            }else{
                //                jRadioButtonFemalee.setSelected(true);
                //                jRadioButtonMalee.setSelected(false);
                //
                //            }
            //            Date bdate;
            //            try {
                //                bdate = new SimpleDateFormat("dd-MM-yyyy").parse(model.getValueAt(rowIndex, 4).toString());
                //                dateChooserComboBirthDatee.setDate(bdate);
                //            } catch (ParseException ex) {
                //                Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField_DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DescriptionActionPerformed

    private void jTextField_studentId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_studentId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_studentId1ActionPerformed

    private void jButtonAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddScoreActionPerformed
    
  AddStudentForm Addscf = new AddStudentForm();
              Addscf.setVisible(true);
              Addscf.pack();
              Addscf.setLocationRelativeTo(null);
              Addscf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddScoreActionPerformed

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
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editDeleteScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddScore;
    private javax.swing.JButton jButtonEditScore;
    private javax.swing.JButton jButtonRemoveScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Description;
    private javax.swing.JTextField jTextField_Score;
    private javax.swing.JTextField jTextField_courseId;
    private javax.swing.JTextField jTextField_studentId1;
    // End of variables declaration//GEN-END:variables
}