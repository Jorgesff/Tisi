/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author jorgesff
 */
public class Cad_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cad_cliente
     */
    public Cad_cliente() {
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

        jToolBar1 = new javax.swing.JToolBar();
        LB_intro = new javax.swing.JLabel();
        BT_proximo = new javax.swing.JButton();
        LB_usuario = new javax.swing.JLabel();
        LB_senha = new javax.swing.JLabel();
        LB_conf_senha = new javax.swing.JLabel();
        LB_nome = new javax.swing.JLabel();
        LB_email = new javax.swing.JLabel();
        TF_usuario = new javax.swing.JTextField();
        TF_nome = new javax.swing.JTextField();
        TF_email = new javax.swing.JTextField();
        PF_senha = new javax.swing.JPasswordField();
        PF_conf_senha = new javax.swing.JPasswordField();
        BG_5 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(690, 520));
        setMinimumSize(new java.awt.Dimension(690, 520));
        setPreferredSize(new java.awt.Dimension(690, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        LB_intro.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        LB_intro.setText("Preencha todos os campos:");
        getContentPane().add(LB_intro);
        LB_intro.setBounds(70, 100, 250, 30);

        BT_proximo.setIcon(new javax.swing.ImageIcon("/home/jorgesff/Imagens/seta-preta-a-direita_pequena.png")); // NOI18N
        BT_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_proximoActionPerformed(evt);
            }
        });
        getContentPane().add(BT_proximo);
        BT_proximo.setBounds(590, 400, 40, 30);

        LB_usuario.setText("Usuario: ");
        getContentPane().add(LB_usuario);
        LB_usuario.setBounds(240, 150, 60, 16);

        LB_senha.setText("Senha:");
        getContentPane().add(LB_senha);
        LB_senha.setBounds(250, 190, 44, 16);

        LB_conf_senha.setText("Digite a senha novamente:");
        getContentPane().add(LB_conf_senha);
        LB_conf_senha.setBounds(120, 230, 180, 16);

        LB_nome.setText("Nome: ");
        getContentPane().add(LB_nome);
        LB_nome.setBounds(250, 270, 60, 16);

        LB_email.setText("Email:");
        getContentPane().add(LB_email);
        LB_email.setBounds(260, 310, 38, 20);
        getContentPane().add(TF_usuario);
        TF_usuario.setBounds(310, 140, 140, 28);

        TF_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(TF_nome);
        TF_nome.setBounds(310, 260, 140, 28);

        TF_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_emailActionPerformed(evt);
            }
        });
        getContentPane().add(TF_email);
        TF_email.setBounds(310, 300, 140, 28);

        PF_senha.setText("jPasswordField1");
        getContentPane().add(PF_senha);
        PF_senha.setBounds(310, 180, 145, 28);

        PF_conf_senha.setText("jPasswordField1");
        getContentPane().add(PF_conf_senha);
        PF_conf_senha.setBounds(310, 220, 145, 28);

        BG_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/view/Fundo.jpg"))); // NOI18N
        BG_5.setBorder(new javax.swing.border.MatteBorder(null));
        BG_5.setMaximumSize(new java.awt.Dimension(690, 520));
        BG_5.setMinimumSize(new java.awt.Dimension(690, 520));
        BG_5.setName(""); // NOI18N
        BG_5.setPreferredSize(new java.awt.Dimension(690, 520));
        getContentPane().add(BG_5);
        BG_5.setBounds(0, 0, 690, 520);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_nomeActionPerformed

    private void TF_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_emailActionPerformed

    private void BT_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_proximoActionPerformed
         if(     (this.TF_email.getText().isEmpty())||
                (this.TF_nome.getText().isEmpty())||
                (this.TF_usuario.getText().isEmpty())||
                (this.PF_senha.getPassword().length==0)||
                (this.PF_conf_senha.getPassword().length==0)
          ){
             JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos", "ERRO", WIDTH);            
            }else{
                new Cad_conclusao().setVisible(true);
                this.dispose();
            }
            
    }//GEN-LAST:event_BT_proximoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Cad_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_5;
    private javax.swing.JButton BT_proximo;
    private javax.swing.JLabel LB_conf_senha;
    private javax.swing.JLabel LB_email;
    private javax.swing.JLabel LB_intro;
    private javax.swing.JLabel LB_nome;
    private javax.swing.JLabel LB_senha;
    private javax.swing.JLabel LB_usuario;
    private javax.swing.JPasswordField PF_conf_senha;
    private javax.swing.JPasswordField PF_senha;
    private javax.swing.JTextField TF_email;
    private javax.swing.JTextField TF_nome;
    private javax.swing.JTextField TF_usuario;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
