/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import javax.swing.JOptionPane;

/**
 *
 * @author jorgesff
 */
public class Cad_restaurante extends javax.swing.JFrame {

    /**
     * Creates new form Cad_restaurante
     */
    public Cad_restaurante() {
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

        LB_intro1 = new javax.swing.JLabel();
        BT_proximo1 = new javax.swing.JButton();
        LB_usuario1 = new javax.swing.JLabel();
        LB_senha1 = new javax.swing.JLabel();
        LB_conf_senha1 = new javax.swing.JLabel();
        LB_nome1 = new javax.swing.JLabel();
        LB_email1 = new javax.swing.JLabel();
        TF_usuario1 = new javax.swing.JTextField();
        TF_nome1 = new javax.swing.JTextField();
        TF_email1 = new javax.swing.JTextField();
        PF_senha1 = new javax.swing.JPasswordField();
        PF_conf_senha1 = new javax.swing.JPasswordField();
        LB_endereco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CB_local = new javax.swing.JComboBox();
        TF_endereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FTF_numero = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        FTF_telefone = new javax.swing.JFormattedTextField();
        BG_6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(690, 520));
        setMinimumSize(new java.awt.Dimension(690, 520));
        setPreferredSize(new java.awt.Dimension(690, 520));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        LB_intro1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        LB_intro1.setText("Preencha todos os campos:");
        getContentPane().add(LB_intro1);
        LB_intro1.setBounds(20, 10, 250, 30);

        BT_proximo1.setIcon(new javax.swing.ImageIcon("/home/jorgesff/Imagens/seta-preta-a-direita_pequena.png")); // NOI18N
        BT_proximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_proximo1ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_proximo1);
        BT_proximo1.setBounds(590, 430, 40, 40);

        LB_usuario1.setText("Usuario: ");
        getContentPane().add(LB_usuario1);
        LB_usuario1.setBounds(200, 60, 60, 16);

        LB_senha1.setText("Senha:");
        getContentPane().add(LB_senha1);
        LB_senha1.setBounds(210, 100, 44, 16);

        LB_conf_senha1.setText("Digite a senha novamente:");
        getContentPane().add(LB_conf_senha1);
        LB_conf_senha1.setBounds(80, 140, 180, 16);

        LB_nome1.setText("Nome: ");
        getContentPane().add(LB_nome1);
        LB_nome1.setBounds(210, 180, 60, 16);

        LB_email1.setText("Email:");
        getContentPane().add(LB_email1);
        LB_email1.setBounds(220, 220, 38, 20);
        getContentPane().add(TF_usuario1);
        TF_usuario1.setBounds(270, 50, 140, 28);

        TF_nome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_nome1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF_nome1);
        TF_nome1.setBounds(270, 170, 140, 28);

        TF_email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_email1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF_email1);
        TF_email1.setBounds(270, 210, 140, 28);

        PF_senha1.setText("jPasswordField1");
        getContentPane().add(PF_senha1);
        PF_senha1.setBounds(270, 90, 145, 28);

        PF_conf_senha1.setText("jPasswordField1");
        getContentPane().add(PF_conf_senha1);
        PF_conf_senha1.setBounds(270, 130, 145, 28);

        LB_endereco.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        LB_endereco.setText("Localização");
        getContentPane().add(LB_endereco);
        LB_endereco.setBounds(30, 300, 120, 30);

        jLabel4.setText("Endereço");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 370, 80, 30);

        CB_local.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rua", "Avenida", "Travessa", "Logradouro", " " }));
        getContentPane().add(CB_local);
        CB_local.setBounds(150, 370, 111, 28);
        getContentPane().add(TF_endereco);
        TF_endereco.setBounds(270, 370, 310, 28);

        jLabel2.setText("Nº");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 420, 30, 16);

        try {
            FTF_numero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(FTF_numero);
        FTF_numero.setBounds(150, 410, 90, 28);

        jLabel1.setText("Telefone:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 270, 70, 16);

        try {
            FTF_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(FTF_telefone);
        FTF_telefone.setBounds(270, 260, 170, 28);

        BG_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/view/Fundo.jpg"))); // NOI18N
        BG_6.setBorder(new javax.swing.border.MatteBorder(null));
        BG_6.setFocusable(false);
        getContentPane().add(BG_6);
        BG_6.setBounds(0, 0, 690, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_nome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_nome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_nome1ActionPerformed

    private void TF_email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_email1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void BT_proximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_proximo1ActionPerformed
        if(     (this.TF_email1.getText().isEmpty())|| 
                (this.TF_endereco.getText().isEmpty())||
                (this.TF_nome1.getText().isEmpty())||
                (this.TF_usuario1.getText().isEmpty())||
                (this.PF_senha1.getPassword().length==0)||
                (this.PF_conf_senha1.getPassword().length==0)||
                (this.CB_local.getSelectedItem()=="")||
                (this.FTF_numero.getText().isEmpty())||
                (this.FTF_telefone.getText().isEmpty())
          ){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos", "ERRO", WIDTH);
        } else {
            new Cad_conclusao().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BT_proximo1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
    }//GEN-LAST:event_formWindowStateChanged

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
            java.util.logging.Logger.getLogger(Cad_restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_restaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_6;
    private javax.swing.JButton BT_proximo1;
    private javax.swing.JComboBox CB_local;
    private javax.swing.JFormattedTextField FTF_numero;
    private javax.swing.JFormattedTextField FTF_telefone;
    private javax.swing.JLabel LB_conf_senha1;
    private javax.swing.JLabel LB_email1;
    private javax.swing.JLabel LB_endereco;
    private javax.swing.JLabel LB_intro1;
    private javax.swing.JLabel LB_nome1;
    private javax.swing.JLabel LB_senha1;
    private javax.swing.JLabel LB_usuario1;
    private javax.swing.JPasswordField PF_conf_senha1;
    private javax.swing.JPasswordField PF_senha1;
    private javax.swing.JTextField TF_email1;
    private javax.swing.JTextField TF_endereco;
    private javax.swing.JTextField TF_nome1;
    private javax.swing.JTextField TF_usuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}