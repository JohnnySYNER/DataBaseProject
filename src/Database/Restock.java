/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author ionut
 */
public class Restock extends javax.swing.JFrame {

    /**
     * Creates new form Restock
     */
    public Restock() {
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

        jLabel6 = new javax.swing.JLabel();
        RestockSupplierIdText = new javax.swing.JTextField();
        InsertDataRestockbtn = new javax.swing.JButton();
        clearRestockbtn = new javax.swing.JButton();
        BackToMenuRestockbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RestockIdText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RestockProductIdText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RestockDateText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RestockQuantityText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RestockPriceText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Price");

        RestockSupplierIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestockSupplierIdTextActionPerformed(evt);
            }
        });

        InsertDataRestockbtn.setBackground(new java.awt.Color(102, 255, 102));
        InsertDataRestockbtn.setText("Insert Data");
        InsertDataRestockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertDataRestockbtnActionPerformed(evt);
            }
        });

        clearRestockbtn.setForeground(new java.awt.Color(255, 0, 0));
        clearRestockbtn.setText("Clear");
        clearRestockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRestockbtnActionPerformed(evt);
            }
        });

        BackToMenuRestockbtn.setText("Back to menu");
        BackToMenuRestockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuRestockbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Restock Information");

        jLabel2.setText("Id");

        RestockIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestockIdTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Product Id");

        RestockProductIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestockProductIdTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Date");

        RestockDateText.setText("yyyy-mm-dd hh:mm:ss");
        RestockDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestockDateTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantity");

        jLabel7.setText("Supplier Id");

        RestockPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestockPriceTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InsertDataRestockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addComponent(clearRestockbtn)
                                .addGap(91, 91, 91)
                                .addComponent(BackToMenuRestockbtn))
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RestockSupplierIdText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(RestockDateText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RestockProductIdText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(RestockIdText, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RestockPriceText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RestockQuantityText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestockIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestockProductIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RestockDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RestockQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RestockPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RestockSupplierIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(InsertDataRestockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackToMenuRestockbtn)
                            .addComponent(clearRestockbtn))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RestockSupplierIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestockSupplierIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestockSupplierIdTextActionPerformed

    private void InsertDataRestockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertDataRestockbtnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_managemennt","root","ParolaCiobanu");

            // check if any of the text fields are empty
            if (RestockIdText.getText().isEmpty() || RestockProductIdText.getText().isEmpty() || RestockDateText.getText().isEmpty() || RestockQuantityText.getText().isEmpty() || RestockSupplierIdText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "You cannot Insert Null data into the table");
            } else {
                String sql = "INSERT INTO Restock (Restock_Id,Product_Id,Restock_Date,Restock_Quantity,Restock_price,Supplier_Id) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement prepare = connection.prepareStatement(sql); 
 
                prepare.setInt(1,Integer.parseInt(RestockIdText.getText()));
                prepare.setString(2,RestockProductIdText.getText());
                Timestamp lastRestockTime = Timestamp.valueOf(RestockDateText.getText());
        prepare.setTimestamp(3, lastRestockTime);
                prepare.setInt(4, Integer.parseInt(RestockQuantityText.getText()));
                prepare.setInt(5,Integer.parseInt(RestockPriceText.getText()));
                prepare.setInt(6,Integer.parseInt(RestockSupplierIdText.getText()));
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data successfully inserted");
            }
            connection.close();
            RestockIdText.setText("");
            RestockProductIdText.setText("");
            RestockQuantityText.setText("");
            RestockDateText.setText("");
            RestockPriceText.setText("");
            RestockSupplierIdText.setText("");
        } catch(SQLException e) {
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null,"Failed to insert data: Category ID already exists");
                RestockIdText.setText("");
            } else {
                JOptionPane.showMessageDialog(null,e);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_InsertDataRestockbtnActionPerformed

    private void clearRestockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearRestockbtnActionPerformed
        RestockIdText.setText("");
        RestockProductIdText.setText("");
        RestockQuantityText.setText("");
        RestockDateText.setText("");
        RestockSupplierIdText.setText("");

    }//GEN-LAST:event_clearRestockbtnActionPerformed

    private void BackToMenuRestockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuRestockbtnActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToMenuRestockbtnActionPerformed

    private void RestockIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestockIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestockIdTextActionPerformed

    private void RestockProductIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestockProductIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestockProductIdTextActionPerformed

    private void RestockPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestockPriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestockPriceTextActionPerformed

    private void RestockDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestockDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestockDateTextActionPerformed

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
            java.util.logging.Logger.getLogger(Restock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuRestockbtn;
    private javax.swing.JButton InsertDataRestockbtn;
    private javax.swing.JTextField RestockDateText;
    private javax.swing.JTextField RestockIdText;
    private javax.swing.JTextField RestockPriceText;
    private javax.swing.JTextField RestockProductIdText;
    private javax.swing.JTextField RestockQuantityText;
    private javax.swing.JTextField RestockSupplierIdText;
    private javax.swing.JButton clearRestockbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
