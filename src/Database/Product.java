/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Timestamp;

/**
 *
 * @author ionut
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ProductIdText = new javax.swing.JTextField();
        ProductNameText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductDescText = new javax.swing.JTextArea();
        ProductPriceText = new javax.swing.JTextField();
        ProductQInStockText = new javax.swing.JTextField();
        ProductLastRestockDateText = new javax.swing.JTextField();
        ProductSupplierIdText = new javax.swing.JTextField();
        BackToMenuProdbtn = new javax.swing.JButton();
        clearProdbtn = new javax.swing.JButton();
        InsertDataProdbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Product Information");

        jLabel2.setText("Id");

        jLabel3.setText("Name");

        jLabel4.setText("Description");

        jLabel5.setText("Price");

        jLabel6.setText("Quantity in stock");

        jLabel7.setText("Last restock Date");

        jLabel8.setText("Supplier Id");

        ProductDescText.setColumns(20);
        ProductDescText.setRows(5);
        jScrollPane1.setViewportView(ProductDescText);

        ProductPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductPriceTextActionPerformed(evt);
            }
        });

        ProductLastRestockDateText.setText("YYYY-MM-DD hh:mm:ss");
        ProductLastRestockDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductLastRestockDateTextActionPerformed(evt);
            }
        });

        BackToMenuProdbtn.setText("Back to menu");
        BackToMenuProdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuProdbtnActionPerformed(evt);
            }
        });

        clearProdbtn.setForeground(new java.awt.Color(255, 0, 0));
        clearProdbtn.setText("Clear");
        clearProdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearProdbtnActionPerformed(evt);
            }
        });

        InsertDataProdbtn.setBackground(new java.awt.Color(102, 255, 102));
        InsertDataProdbtn.setText("Insert Data");
        InsertDataProdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertDataProdbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(ProductIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ProductNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ProductPriceText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(InsertDataProdbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductQInStockText, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(93, 93, 93)
                                .addComponent(clearProdbtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(BackToMenuProdbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductLastRestockDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductSupplierIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(ProductIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductQInStockText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductLastRestockDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductSupplierIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InsertDataProdbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackToMenuProdbtn)
                            .addComponent(clearProdbtn))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuProdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuProdbtnActionPerformed
new Menu().setVisible(true);
        dispose();        
    }//GEN-LAST:event_BackToMenuProdbtnActionPerformed

    private void clearProdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearProdbtnActionPerformed
        ProductIdText.setText("");
        ProductNameText.setText("");
         ProductDescText.setText("");
        ProductPriceText.setText("");
         ProductQInStockText.setText("");
        ProductLastRestockDateText.setText("");
         ProductSupplierIdText.setText("");
    }//GEN-LAST:event_clearProdbtnActionPerformed

    private void ProductPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductPriceTextActionPerformed
      
    }//GEN-LAST:event_ProductPriceTextActionPerformed

    private void InsertDataProdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertDataProdbtnActionPerformed
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_managemennt","root","ParolaCiobanu");
        connection = null;
       
        if (ProductIdText.getText().isEmpty() || ProductNameText.getText().isEmpty() || ProductDescText.getText().isEmpty() || ProductPriceText.getText().isEmpty() 
                 || ProductLastRestockDateText.getText().isEmpty()|| ProductSupplierIdText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "You cannot Insert Null data into the table");
        } else {
            String sql = "INSERT INTO Products (Product_Id, Product_Name, Product_Description, Product_Price, Quantity_In_Stock, Last_Restock_Time, Supplier_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement prepare = connection.prepareStatement(sql);
        prepare.setInt(1,Integer.parseInt(ProductIdText.getText()));
        prepare.setString(2,ProductNameText.getText());
        prepare.setString(3,ProductDescText.getText());
     float productPrice = Float.parseFloat(ProductPriceText.getText());
        prepare.setFloat(4, productPrice);
        prepare.setInt(5,Integer.parseInt(ProductQInStockText.getText()));
     Timestamp lastRestockTime = Timestamp.valueOf(ProductLastRestockDateText.getText());
        prepare.setTimestamp(6, lastRestockTime);
        prepare.setInt(7,Integer.parseInt(ProductSupplierIdText.getText()));
        prepare.executeUpdate();
        JOptionPane.showMessageDialog(null,"Data successfully inserted");
         }
        connection.close();
      
    } catch(SQLException e) {
        if (e.getErrorCode() == 1062) {
            JOptionPane.showMessageDialog(null,"Failed to insert data: Category ID already exists");
        } else {
            JOptionPane.showMessageDialog(null,e);
        }
            
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_InsertDataProdbtnActionPerformed

    private void ProductLastRestockDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductLastRestockDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductLastRestockDateTextActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuProdbtn;
    private javax.swing.JButton InsertDataProdbtn;
    private javax.swing.JTextArea ProductDescText;
    private javax.swing.JTextField ProductIdText;
    private javax.swing.JTextField ProductLastRestockDateText;
    private javax.swing.JTextField ProductNameText;
    private javax.swing.JTextField ProductPriceText;
    private javax.swing.JTextField ProductQInStockText;
    private javax.swing.JTextField ProductSupplierIdText;
    private javax.swing.JButton clearProdbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
