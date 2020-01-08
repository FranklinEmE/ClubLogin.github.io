
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franklin chidera
 */
public class addScoreForm extends javax.swing.JFrame {

    /**
     * Creates new form addScoreForm
     */
    
    Course c = new Course();
    student std = new student();
    Score sc = new Score();
        DefaultTableModel model;

    public addScoreForm() {
        initComponents();
    c.fillCourseCombo(jComboBox1CourseID);
    std.fillStudentJtable(jTable1, "");
    
    HideColumn(6);
    HideColumn(5);
    HideColumn(4);
    HideColumn(3);

 model = (DefaultTableModel)jTable1.getModel();
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.BLACK);
    }
    
    
    private void HideColumn(int colIndex){
        TableColumn col = jTable1.getColumnModel().getColumn(colIndex);
        col.setMaxWidth(0);
        col.setMinWidth(0);
        col.setPreferredWidth(0);
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
        jButtonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_studentId = new javax.swing.JTextField();
        jButtonAddScore = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1CourseID = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Description = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("Add Score");
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

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 114, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Student Id:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jTextField_studentId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_studentIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 236, 30));

        jButtonAddScore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddScore.setText("Add");
        jButtonAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 96, 32));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First_Name", "Last_Name", "Sex", "BirthDate", "Phone", "Address"
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

        jPanel1.add(jComboBox1CourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 240, -1));

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

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed

        this.dispose();

//        if(!jTextField_studentId.getText().equals("")){
//            int id = Integer.valueOf(jTextField_studentId.getText());
//            c.insertUpdateDeleteStudent('d', id, null, null);
//            manageCourseForm.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id", "Label", "Hours"}));
//            c.fillCourseJtable(manageCourseForm.jTable1);
//            jTextField_studentId.setText("");
//            jTextField_.setText("");
//            jSpinner1.setValue(4);
//        }

    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextField_studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_studentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_studentIdActionPerformed

    private void jButtonAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddScoreActionPerformed
       int stdId = Integer.valueOf(jTextField_studentId.getText());
       int crsId = Integer.valueOf(c.getCourseId(jComboBox1CourseID.getSelectedItem().toString()));
       double scr = Double.valueOf(jTextField_Score.getText());
       sc.insertUpdateDeleteStudent('i', stdId, crsId, scr, jTextField_Description.getText());
       
       try{
             editDeleteScore.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Student Id", "Course Id", "Score", "Description"}));
         sc.fillScoreJtable(editDeleteScore.jTable1); 
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }
           
        
        
//        addCourseForm Addcf = new  addCourseForm();
//        Addcf.setVisible(true);
//        Addcf.pack();
//        Addcf.setLocationRelativeTo(null);
//        Addcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddScoreActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int rowIndex = jTable1.getSelectedRow();
        jTextField_studentId.setText(jTable1.getValueAt(rowIndex, 0).toString());
        
//        rowIndex = jTable1.getSelectedRow();
//        if(model.getValueAt(rowIndex, 3).toString().equals("Male")){
//            jRadioButtonMalee.setSelected(true);
//            jRadioButtonFemalee.setSelected(false);
//
//        }else{
//            jRadioButtonFemalee.setSelected(true);
//            jRadioButtonMalee.setSelected(false);
//
//        }
//        jTextField_STD_ID1.setText(model.getValueAt(rowIndex, 0).toString());
//        jTextField_FName1.setText(model.getValueAt(rowIndex, 1).toString());
//        jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
//        jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
//        jTextArea1.setText(model.getValueAt(rowIndex, 6).toString());
//
//        Date bdate;
//        try {
//            bdate = new SimpleDateFormat("dd-MM-yyyy").parse(model.getValueAt(rowIndex, 4).toString());
//            dateChooserComboBirthDatee.setDate(bdate);
//        } catch (ParseException ex) {
//            Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
            java.util.logging.Logger.getLogger(addScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addScoreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddScore;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboBox1CourseID;
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
    private javax.swing.JTextField jTextField_studentId;
    // End of variables declaration//GEN-END:variables
}
