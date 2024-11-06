
package gymmembershipmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TrainerPage extends JFrame {
    TrainerRole trainerRole = new TrainerRole();

    
    public TrainerPage() {
        initComponents();
        setTitle("Trainer Page");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        AddMemberButton = new javax.swing.JButton();
        ViewMembersButton = new javax.swing.JButton();
        AddClassButton = new javax.swing.JButton();
        ViewClassesButton = new javax.swing.JButton();
        RegisterMemberButton = new javax.swing.JButton();
        CancelRegistrationButton = new javax.swing.JButton();
        ViewRegistrationsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Trainer");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Page");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 44));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
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
        LogoutButton.setBounds(500, 400, 200, 30);

        AddMemberButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddMemberButton.setText("Add Member");
        AddMemberButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddMemberButton.setFocusable(false);
        AddMemberButton.setPreferredSize(new java.awt.Dimension(150, 30));
        AddMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddMemberButton);
        AddMemberButton.setBounds(500, 50, 200, 30);

        ViewMembersButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewMembersButton.setText("View Members");
        ViewMembersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewMembersButton.setFocusable(false);
        ViewMembersButton.setPreferredSize(new java.awt.Dimension(150, 30));
        ViewMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMembersButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewMembersButton);
        ViewMembersButton.setBounds(500, 100, 200, 30);

        AddClassButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddClassButton.setText("Add Class");
        AddClassButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddClassButton.setFocusable(false);
        AddClassButton.setPreferredSize(new java.awt.Dimension(150, 30));
        AddClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddClassButton);
        AddClassButton.setBounds(500, 150, 200, 30);

        ViewClassesButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewClassesButton.setText("View Classes");
        ViewClassesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewClassesButton.setFocusable(false);
        ViewClassesButton.setPreferredSize(new java.awt.Dimension(150, 30));
        ViewClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClassesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewClassesButton);
        ViewClassesButton.setBounds(500, 200, 200, 30);

        RegisterMemberButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RegisterMemberButton.setText("Register Member for Class");
        RegisterMemberButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterMemberButton.setFocusable(false);
        RegisterMemberButton.setPreferredSize(new java.awt.Dimension(150, 30));
        RegisterMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterMemberButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterMemberButton);
        RegisterMemberButton.setBounds(500, 250, 200, 30);

        CancelRegistrationButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelRegistrationButton.setText("Cancel Registration");
        CancelRegistrationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelRegistrationButton.setFocusable(false);
        CancelRegistrationButton.setPreferredSize(new java.awt.Dimension(150, 30));
        CancelRegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelRegistrationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelRegistrationButton);
        CancelRegistrationButton.setBounds(500, 300, 200, 30);

        ViewRegistrationsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewRegistrationsButton.setText("View Registrations");
        ViewRegistrationsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewRegistrationsButton.setFocusable(false);
        ViewRegistrationsButton.setPreferredSize(new java.awt.Dimension(150, 30));
        ViewRegistrationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRegistrationsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewRegistrationsButton);
        ViewRegistrationsButton.setBounds(500, 350, 200, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        trainerRole.logout();
        TrainerLogin trainerLogin = new TrainerLogin();
        trainerLogin.setVisible(true);
        trainerLogin.setLocationRelativeTo(null);
        trainerLogin.pack();
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void AddMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberButtonActionPerformed
        AddMember addmember = new AddMember();
        addmember.setVisible(true);
        addmember.pack();
        addmember.setLocationRelativeTo(null);
        this.dispose();    }//GEN-LAST:event_AddMemberButtonActionPerformed

    private void ViewMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMembersButtonActionPerformed
        ListOfMembers members = new ListOfMembers();
        members.setVisible(true);
        members.pack();
        members.setLocationRelativeTo(null);
        this.dispose();    
    }//GEN-LAST:event_ViewMembersButtonActionPerformed

    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassButtonActionPerformed
        AddClass addclass = new AddClass();
        addclass.setVisible(true);
        addclass.pack();
        addclass.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_AddClassButtonActionPerformed

    private void ViewClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewClassesButtonActionPerformed
        ListOFClasses classes = new ListOFClasses();
        classes.setVisible(true);
        classes.pack();
        classes.setLocationRelativeTo(null);
        this.dispose();    
    }//GEN-LAST:event_ViewClassesButtonActionPerformed

    private void RegisterMemberButtonActionPerformed(ActionEvent evt){
        RegisterMemberforClass register = new RegisterMemberforClass();
        register.setVisible(true);
        register.pack();
        register.setLocationRelativeTo(null);
        this.dispose();
    }
    
    private void ResgistrationMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResgistrationMemberButtonActionPerformed
        RegisterMemberforClass register = new RegisterMemberforClass();
        register.setVisible(true);
        register.pack();
        register.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ResgistrationMemberButtonActionPerformed

    private void CancelRegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelRegistrationButtonActionPerformed
        CancelRegistration cancel = new CancelRegistration();
        cancel.setVisible(true);
        cancel.pack();
        cancel.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CancelRegistrationButtonActionPerformed

    private void ViewRegistrationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRegistrationsButtonActionPerformed
        ListOfRegistrations registrations = new ListOfRegistrations();
        registrations.setVisible(true);
        registrations.pack();
        registrations.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ViewRegistrationsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClassButton;
    private javax.swing.JButton AddMemberButton;
    private javax.swing.JButton CancelRegistrationButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton RegisterMemberButton;
    private javax.swing.JButton ViewClassesButton;
    private javax.swing.JButton ViewMembersButton;
    private javax.swing.JButton ViewRegistrationsButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
