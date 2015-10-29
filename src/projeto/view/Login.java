/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import java.awt.Color;
import java.util.Arrays;
import projeto.Controller.ClienteCT;

/**
 *
 * @author jorgesff
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        Lb_user = new javax.swing.JLabel();
        Lb_pass = new javax.swing.JLabel();
        TF_user = new javax.swing.JTextField();
        PF_pass = new javax.swing.JPasswordField();
        Lb_titulo = new javax.swing.JLabel();
        Bt_login = new javax.swing.JButton();
        Lb_cadastra = new javax.swing.JLabel();
        Lb_cancela = new javax.swing.JLabel();
        LB_auth = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        Lb_user.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        Lb_user.setText("Usuario:");
        getContentPane().add(Lb_user);
        Lb_user.setBounds(60, 200, 90, 40);

        Lb_pass.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        Lb_pass.setText("Senha:");
        getContentPane().add(Lb_pass);
        Lb_pass.setBounds(80, 250, 80, 40);
        getContentPane().add(TF_user);
        TF_user.setBounds(160, 210, 150, 28);

        PF_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PF_passActionPerformed(evt);
            }
        });
        getContentPane().add(PF_pass);
        PF_pass.setBounds(160, 260, 150, 28);

        Lb_titulo.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        Lb_titulo.setText("Easy Dinner");
        getContentPane().add(Lb_titulo);
        Lb_titulo.setBounds(90, 90, 200, 50);

        Bt_login.setText("Entrar");
        Bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_loginActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_login);
        Bt_login.setBounds(170, 330, 70, 28);

        Lb_cadastra.setText("Cadastrar");
        Lb_cadastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_cadastraMouseClicked(evt);
            }
        });
        getContentPane().add(Lb_cadastra);
        Lb_cadastra.setBounds(40, 440, 70, 16);

        Lb_cancela.setText("Cancelar");
        Lb_cancela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lb_cancela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_cancelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Lb_cancelaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Lb_cancelaMousePressed(evt);
            }
        });
        getContentPane().add(Lb_cancela);
        Lb_cancela.setBounds(250, 440, 70, 16);
        getContentPane().add(LB_auth);
        LB_auth.setBounds(120, 300, 160, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/view/capa2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -280, 810, 1050);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PF_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PF_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PF_passActionPerformed

    private void Bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_loginActionPerformed
        String user, password;
        user = TF_user.getText();
        password = String.valueOf(PF_pass.getPassword());
        ClienteCT cliCT = new ClienteCT();
        if(cliCT.Auth(user, password)== 1){
            new Home().setVisible(true);
            this.dispose();
        }else
            LB_auth.setText("Autorização negada");
        
    }//GEN-LAST:event_Bt_loginActionPerformed

    private void Lb_cancelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_cancelaMouseClicked
        this.dispose();
    }//GEN-LAST:event_Lb_cancelaMouseClicked

    private void Lb_cancelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_cancelaMouseEntered

    }//GEN-LAST:event_Lb_cancelaMouseEntered

    private void Lb_cancelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_cancelaMousePressed
        
    }//GEN-LAST:event_Lb_cancelaMousePressed

    private void Lb_cadastraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_cadastraMouseClicked
        new Cadastro().setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_Lb_cadastraMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_login;
    private javax.swing.JLabel LB_auth;
    private javax.swing.JLabel Lb_cadastra;
    private javax.swing.JLabel Lb_cancela;
    private javax.swing.JLabel Lb_pass;
    private javax.swing.JLabel Lb_titulo;
    private javax.swing.JLabel Lb_user;
    private javax.swing.JPasswordField PF_pass;
    private javax.swing.JTextField TF_user;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
