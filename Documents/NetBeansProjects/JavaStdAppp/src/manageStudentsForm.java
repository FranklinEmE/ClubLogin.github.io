
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class manageStudentsForm extends javax.swing.JFrame {

   student std = new student();
    DefaultTableModel model;
    public manageStudentsForm() {
        initComponents();
        std.fillStudentJtable(jTable1, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonMalee);
        bg.add(jRadioButtonFemalee);
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.BLACK);

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
        jLabel2 = new javax.swing.JLabel();
        jButtonRemoveStudent = new javax.swing.JButton();
        jButtonEditStudent = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_Val_Find = new javax.swing.JTextField();
        jTextField_LName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jRadioButtonMalee = new javax.swing.JRadioButton();
        jRadioButtonFemalee = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        dateChooserComboBirthDatee = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTextField_FName1 = new javax.swing.JTextField();
        jButtonAddStudent1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_STD_ID1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("First Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 127, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 178, -1, -1));

        jButtonRemoveStudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRemoveStudent.setText("Remove");
        jButtonRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveStudentActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemoveStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 114, 32));

        jButtonEditStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditStudent.setText("Edit");
        jButtonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudentActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 491, 96, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sex:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 228, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Address:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 362, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Phone:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 311, -1, -1));

        jTextField_Val_Find.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Val_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Val_FindActionPerformed(evt);
            }
        });
        jTextField_Val_Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Val_Find, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 80, 340, 30));

        jTextField_LName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 169, 236, 35));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("BirthDate:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 266, -1, -1));

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 304, 236, 32));

        jRadioButtonMalee.setText("Male");
        jPanel1.add(jRadioButtonMalee, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 222, -1, -1));

        jRadioButtonFemalee.setText("Female");
        jPanel1.add(jRadioButtonFemalee, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 222, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("Manage Students");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 0, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 354, 236, -1));
        jPanel1.add(dateChooserComboBirthDatee, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 266, 239, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Enter Value TO Search:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, 30));

        jTextField_FName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_FName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FName1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_FName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 121, 236, 30));

        jButtonAddStudent1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddStudent1.setText("Add");
        jButtonAddStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudent1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddStudent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 491, 96, 32));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 550, 380));

        jTextField_STD_ID1.setEditable(false);
        jTextField_STD_ID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_STD_ID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_STD_ID1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_STD_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 61, 236, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 60, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStudentActionPerformed
  /*
         ALTER TABLE score
  add CONSTRAINT fk_score_student
  FOREIGN KEY(student_id)
  REFERENCES student (Id)
  on DELETE CASCADE
        */
        
        if(jTextField_STD_ID1.getText().equals("")){
      JOptionPane.showMessageDialog(null, "No Student Selected");
  }else{
            int id = Integer.valueOf(jTextField_STD_ID1.getText());
            std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null);
            std.fillStudentJtable(jTable1, "");
           jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address",}));
           std.fillStudentJtable(jTable1, jTextField_Val_Find.getText());
           MainForm.studentcount.setText(" Student count =  "+Integer.toString(MyFunction.countData("studentinfor"))); 
        
        jTextField_STD_ID1.setText("");
        jTextArea1.setText("");
        jTextField_FName1.setText("");
        jTextField_LName.setText("");
        jTextField_Phone.setText("");
        jRadioButtonFemalee.setSelected(false);
        jRadioButtonMalee.setSelected(false);
        dateChooserComboBirthDatee.setDate(null);





  }
    }//GEN-LAST:event_jButtonRemoveStudentActionPerformed

    private void jButtonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudentActionPerformed

        String fname = jTextField_STD_ID1.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String address = jTextArea1.getText();
        String sex = "Male";
        int id = Integer.valueOf(jTextField_STD_ID1.getText());
        if(jRadioButtonFemalee.isSelected()){
            sex = "Female";
        }
//        }else if(jRadioButtonFemalee.isSelected()){
//            sex = "Male";  
//        }
        //else if(jRadioButtonMalee.isSelected()){
            //   sex = "Male";
            //  }
        if(verifText()){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String bdate = dateFormat.format(dateChooserComboBirthDatee.getDate());

            student std = new student();

            std.insertUpdateDeleteStudent('u', id, fname, lname, sex, bdate, phone, address);
         //   MainForm.studentcount.setText(" Student count =  "+Integer.toString(MyFunction.countData("studentinfor")));
            manageStudentsForm.jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address",}));
            std.fillStudentJtable(manageStudentsForm.jTable1, "");

    }//GEN-LAST:event_jButtonEditStudentActionPerformed
    }
    private void jTextField_Val_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Val_FindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Val_FindActionPerformed

    private void jTextField_LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNameActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

     public boolean verifText(){
        if(jTextField_FName1.getText().equals("") || jTextField_LName.getText().equals("") || jTextField_LName.getText().equals("")
       || jTextArea1.getText().equals("") || jTextField_STD_ID1.getText().equals("") || dateChooserComboBirthDatee.getDate() == null ){
         JOptionPane.showMessageDialog(null, "One Or More Empty Is Field");

            return false;
        }else if(dateChooserComboBirthDatee.getDate().compareTo(new Date()) > 0){
             JOptionPane.showMessageDialog(null, "No student From The Future Are Allowed");
           return false;
 
        }else{
                   return true;
 
        }
    }
    
    private void jTextField_FName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FName1ActionPerformed

    private void jButtonAddStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudent1ActionPerformed

  AddStudentForm Addsf = new AddStudentForm();
              Addsf.setVisible(true);
              Addsf.pack();
              Addsf.setLocationRelativeTo(null);
              Addsf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddStudent1ActionPerformed
int rowIndex;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    model = (DefaultTableModel)jTable1.getModel();    
        
    rowIndex = jTable1.getSelectedRow();
 
    jRadioButtonFemalee.setSelected(false);
   jRadioButtonMalee.setSelected(false);
    if(model.getValueAt(rowIndex, 3).toString().equals("Male")){
    jRadioButtonMalee.setSelected(true);

}else{
     jRadioButtonFemalee.setSelected(true);

}
 jTextField_STD_ID1.setText(model.getValueAt(rowIndex, 0).toString());
  jTextField_FName1.setText(model.getValueAt(rowIndex, 1).toString());
 jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
 jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
  jTextArea1.setText(model.getValueAt(rowIndex, 6).toString());


Date bdate;
       try {
           bdate = new SimpleDateFormat("dd-MM-yyyy").parse(model.getValueAt(rowIndex, 4).toString());
           dateChooserComboBirthDatee.setDate(bdate);
       } catch (ParseException ex) {
           Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_STD_ID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_STD_ID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_STD_ID1ActionPerformed

    private void jTextField_Val_FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyTyped

    }//GEN-LAST:event_jTextField_Val_FindKeyTyped

    private void jTextField_Val_FindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyPressed

    }//GEN-LAST:event_jTextField_Val_FindKeyPressed

    private void jTextField_Val_FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyReleased

         jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address",}));
         std.fillStudentJtable(jTable1, jTextField_Val_Find.getText());

    }//GEN-LAST:event_jTextField_Val_FindKeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

   if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
    
  rowIndex = jTable1.getSelectedRow();
  jTextField_STD_ID1.setText(model.getValueAt(rowIndex, 0).toString());
  jTextField_FName1.setText(model.getValueAt(rowIndex, 1).toString());
  jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
  jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
  jTextArea1.setText(model.getValueAt(rowIndex, 6).toString()); 
  
  if(model.getValueAt(rowIndex, 3).toString().equals("Male")){
  jRadioButtonMalee.setSelected(true);
       jRadioButtonFemalee.setSelected(false);

}else{
     jRadioButtonFemalee.setSelected(true);
     jRadioButtonMalee.setSelected(false);

}
  Date bdate;
       try {
           bdate = new SimpleDateFormat("dd-MM-yyyy").parse(model.getValueAt(rowIndex, 4).toString());
           dateChooserComboBirthDatee.setDate(bdate);
       } catch (ParseException ex) {
           Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
       }
}
        
    }//GEN-LAST:event_jTable1KeyReleased

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
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateChooserComboBirthDatee;
    private javax.swing.JButton jButtonAddStudent1;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JButton jButtonRemoveStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemalee;
    private javax.swing.JRadioButton jRadioButtonMalee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_FName1;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_STD_ID1;
    private javax.swing.JTextField jTextField_Val_Find;
    // End of variables declaration//GEN-END:variables
}
