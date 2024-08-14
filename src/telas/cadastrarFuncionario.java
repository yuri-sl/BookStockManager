/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuri
 */
public class cadastrarFuncionario extends javax.swing.JFrame {
    static ArrayList<Funcionario> listaFuncionarios;

    /**
     * Creates new form cadastrarFuncionario
     */
    public cadastrarFuncionario() {
        initComponents();
        listaFuncionarios = new ArrayList();

        
        setLocationRelativeTo(null);
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
        lblCadastroFuncionario = new javax.swing.JLabel();
        lblNomeFuncionario = new javax.swing.JLabel();
        lblCPFFuncionario = new javax.swing.JLabel();
        lblEmailFuncionario = new javax.swing.JLabel();
        lblSenhaFuncionario = new javax.swing.JLabel();
        lblCodigoFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtSenhaFuncionario = new javax.swing.JTextField();
        txtCodigoFuncionario = new javax.swing.JTextField();
        btnCancelarFuncionario = new javax.swing.JButton();
        btnSalvarFuncionario = new javax.swing.JButton();
        btnSairFuncionario = new javax.swing.JButton();
        ftxCPFFuncionario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de funcionários");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/technicalsupport_support_representative_person_people_man_1641.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblCadastroFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadastroFuncionario.setText("Cadastro de Funcionários");

        lblNomeFuncionario.setText("Nome");

        lblCPFFuncionario.setText("CPF");

        lblEmailFuncionario.setText("E-mail");

        lblSenhaFuncionario.setText("Senha");

        lblCodigoFuncionario.setText("Código Funcionário");

        txtNomeFuncionario.setToolTipText("Insira o nome do funcionário");

        txtEmailFuncionario.setToolTipText("Insira o email do funcionário");

        txtSenhaFuncionario.setToolTipText("Defina uma senha para o funcionário");

        txtCodigoFuncionario.setToolTipText("Insira o código de funcionário");

        btnCancelarFuncionario.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarFuncionario.setText("Cancelar");
        btnCancelarFuncionario.setToolTipText("Cancelar operação");
        btnCancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFuncionarioActionPerformed(evt);
            }
        });

        btnSalvarFuncionario.setBackground(new java.awt.Color(51, 255, 0));
        btnSalvarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvarFuncionario.setText("Salvar");
        btnSalvarFuncionario.setToolTipText("Salvar funcionário");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });

        btnSairFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/exit_icon-icons.com_70975.png"))); // NOI18N
        btnSairFuncionario.setText("Sair");
        btnSairFuncionario.setToolTipText("Sair do cadastro de funcionário");
        btnSairFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairFuncionarioActionPerformed(evt);
            }
        });

        try {
            ftxCPFFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxCPFFuncionario.setToolTipText("Insira o CPF do funcionário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSairFuncionario)
                        .addGap(137, 137, 137)
                        .addComponent(lblCadastroFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNomeFuncionario)
                                    .addComponent(lblCPFFuncionario))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftxCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEmailFuncionario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblSenhaFuncionario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(btnSalvarFuncionario)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigoFuncionario)
                                .addGap(0, 0, 0)
                                .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancelarFuncionario))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastroFuncionario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSairFuncionario)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(lblEmailFuncionario)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoFuncionario)
                    .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPFFuncionario)
                    .addComponent(lblSenhaFuncionario)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarFuncionario)
                    .addComponent(btnCancelarFuncionario))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairFuncionarioActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnSairFuncionarioActionPerformed

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
        // TODO add your handling code here:
        if (txtNomeFuncionario.getText().equals("") || ftxCPFFuncionario.getText().equals("") ||
            txtEmailFuncionario.getText().equals("") || txtSenhaFuncionario.getText().equals("")
                || txtCodigoFuncionario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Todos os campos devem ser inseridos!", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        }else{
        String nome = txtNomeFuncionario.getText();
        String cpf = ftxCPFFuncionario.getText();
        String email = txtEmailFuncionario.getText();
        String senha = txtSenhaFuncionario.getText();
        String idFuncionario = txtCodigoFuncionario.getText();
        
        Funcionario funcionario = new Funcionario(nome,cpf,email,senha,idFuncionario);
        listaFuncionarios.add(funcionario);
        JOptionPane.showMessageDialog(null,"Funcionário cadastrado com sucesso!", "Mensagem",JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void btnCancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFuncionarioActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(cadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarFuncionario;
    private javax.swing.JButton btnSairFuncionario;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JFormattedTextField ftxCPFFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPFFuncionario;
    private javax.swing.JLabel lblCadastroFuncionario;
    private javax.swing.JLabel lblCodigoFuncionario;
    private javax.swing.JLabel lblEmailFuncionario;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblSenhaFuncionario;
    private javax.swing.JTextField txtCodigoFuncionario;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtSenhaFuncionario;
    // End of variables declaration//GEN-END:variables
}
