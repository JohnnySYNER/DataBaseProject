/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Database;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ionut
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
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
        BackToMenuBtn = new javax.swing.JButton();
        CategoryIdLabel = new javax.swing.JLabel();
        CategoryIdText = new javax.swing.JTextField();
        CategoryNameLabel = new javax.swing.JLabel();
        CategoryNameText = new javax.swing.JTextField();
        CategoryDescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryDescription = new javax.swing.JTextArea();
        InsertDataCat = new javax.swing.JButton();
        CategoryClearbtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Categories Information");

        BackToMenuBtn.setText("Back to menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });

        CategoryIdLabel.setText("Id");

        CategoryNameLabel.setText("Name");

        CategoryNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryNameTextActionPerformed(evt);
            }
        });

        CategoryDescriptionLabel.setText("Description");

        CategoryDescription.setColumns(20);
        CategoryDescription.setRows(5);
        jScrollPane1.setViewportView(CategoryDescription);

        InsertDataCat.setBackground(new java.awt.Color(102, 255, 102));
        InsertDataCat.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        InsertDataCat.setText("Insert Data");
        InsertDataCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertDataCatActionPerformed(evt);
            }
        });

        CategoryClearbtn.setText("Clear");
        CategoryClearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryClearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoryDescriptionLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(InsertDataCat, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CategoryClearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(BackToMenuBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoryNameLabel)
                                    .addComponent(CategoryIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(CategoryNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CategoryIdText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(CategoryIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(CategoryNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(CategoryDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackToMenuBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InsertDataCat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CategoryClearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void CategoryNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryNameTextActionPerformed

    private void InsertDataCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertDataCatActionPerformed
                                                    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_managemennt","root","ParolaCiobanu");
         
        String sql = "INSERT INTO Category VALUES(?,?,?)";
        PreparedStatement prepare = connection.prepareStatement(sql);
        prepare.setInt(1,Integer.parseInt(CategoryIdText.getText()));
        prepare.setString(2,CategoryNameText.getText());
        prepare.setString(3,CategoryDescription.getText());
        prepare.executeUpdate();
        JOptionPane.showMessageDialog(null,"Data successfully inserted");
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
    }//GEN-LAST:event_InsertDataCatActionPerformed

    private void CategoryClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryClearbtnActionPerformed
        CategoryIdText.setText("");
        CategoryNameText.setText("");
        CategoryDescription.setText("");
    }//GEN-LAST:event_CategoryClearbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JToggleButton CategoryClearbtn;
    private javax.swing.JTextArea CategoryDescription;
    private javax.swing.JLabel CategoryDescriptionLabel;
    private javax.swing.JLabel CategoryIdLabel;
    private javax.swing.JTextField CategoryIdText;
    private javax.swing.JLabel CategoryNameLabel;
    private javax.swing.JTextField CategoryNameText;
    private javax.swing.JButton InsertDataCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
