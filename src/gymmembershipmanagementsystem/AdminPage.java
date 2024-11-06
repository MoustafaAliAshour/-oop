
package gymmembershipmanagementsystem;

import javax.swing.JFrame;

/**
 *
 * @author Mohamed
 */
public class AdminPage extends JFrame {

    AdminRole adminRole = new AdminRole();
    public AdminPage() {
        initComponents();
        setTitle("Admin Page");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        AddTrainerButton = new javax.swing.JButton();
        RemoveTrainerButton = new javax.swing.JButton();
        ViewTrainersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Admin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Page");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 44));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        LogoutButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutButton.setFocusable(false);
        LogoutButton.setPreferredSize(new java.awt.Dimension(150, 30));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutButton);
        LogoutButton.setBounds(520, 340, 150, 30);

        AddTrainerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddTrainerButton.setText("Add Trainer");
        AddTrainerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddTrainerButton.setFocusable(false);
        AddTrainerButton.setPreferredSize(new java.awt.Dimension(150, 30));
        AddTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddTrainerButton);
        AddTrainerButton.setBounds(520, 100, 150, 30);

        RemoveTrainerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RemoveTrainerButton.setText("Remove Trainer");
        RemoveTrainerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoveTrainerButton.setFocusable(false);
        RemoveTrainerButton.setPreferredSize(new java.awt.Dimension(150, 30));
        RemoveTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTrainerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RemoveTrainerButton);
        RemoveTrainerButton.setBounds(520, 180, 150, 30);

        ViewTrainersButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewTrainersButton.setText("View Trainers");
        ViewTrainersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewTrainersButton.setFocusable(false);
        ViewTrainersButton.setPreferredSize(new java.awt.Dimension(150, 30));
        ViewTrainersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTrainersButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewTrainersButton);
        ViewTrainersButton.setBounds(520, 260, 150, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        adminRole.logout();
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setVisible(true);
        adminLogin.setLocationRelativeTo(null);
        adminLogin.pack();
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void AddTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainerButtonActionPerformed
        AddTrainer addTrainer = new AddTrainer();
        addTrainer.setVisible(true);
        addTrainer.pack();
        addTrainer.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_AddTrainerButtonActionPerformed

    private void RemoveTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTrainerButtonActionPerformed
        RemoveTrainer removeTrainer = new RemoveTrainer();
        removeTrainer.setVisible(true);
        removeTrainer.pack();
        removeTrainer.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RemoveTrainerButtonActionPerformed

    private void ViewTrainersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTrainersButtonActionPerformed
        ListOfTrainers listOfTrainers = new ListOfTrainers();
        listOfTrainers.setVisible(true);
        listOfTrainers.pack();
        listOfTrainers.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ViewTrainersButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainerButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton RemoveTrainerButton;
    private javax.swing.JButton ViewTrainersButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
