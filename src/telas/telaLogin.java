/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Cliente;
import static classes.Cliente.listaClientes;
import classes.Funcionario;
import static classes.Funcionario.listaFuncionarios;
import classes.Gerente;
import javax.swing.JOptionPane;
//import static telas.cadastrarCliente.listaClientes;
import static telas.Menu.logado;
import static telas.Menu.user;
import static telas.cadastarGerente.listaGerente;
//import telas.Menu.verificarLogin();
import static telas.cadastros.cadastrosFlag;
import static classes.Cliente.usuario_tipo;
import classes.Usuario;

//import static telas.cadastrarFuncionario.listaFuncionarios;

/**
 *
 * @author Yuri
 */
public class telaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public telaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        getRootPane().setDefaultButton(btnEntrar);

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
        lblLogin = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCadastrarse = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        lblLogin.setFont(new java.awt.Font("Old London", 1, 60)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Bem-vindo");

        lblEmail.setFont(new java.awt.Font("Old London", 0, 48)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-mail");
        lblEmail.setToolTipText("");

        txtEmail.setToolTipText("Insira o email");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Old London", 0, 48)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        btnEntrar.setBackground(new java.awt.Color(51, 204, 0));
        btnEntrar.setFont(new java.awt.Font("Old London", 1, 36)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setToolTipText("fazer login");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Old London", 1, 36)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCadastrarse.setFont(new java.awt.Font("Old London", 1, 30)); // NOI18N
        lblCadastrarse.setForeground(new java.awt.Color(255, 102, 102));
        lblCadastrarse.setText("Não tem uma conta? Cadastrar-se como cliente.");
        lblCadastrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pswSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)))
                .addGap(0, 87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrarse)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lblLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lblCadastrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 220, 610, 470));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_v3.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 830, 780));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Telas/Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void lblCadastrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarseMouseClicked
        // TODO add your handling code here:
        cadastrosFlag="cliente";
        user="cadastro";
        new cadastros().setVisible(true);
        user="";
    }//GEN-LAST:event_lblCadastrarseMouseClicked

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        
        String emailInput = txtEmail.getText();
        String senhaInput = String.valueOf(pswSenha.getPassword());
        Gerente gerente = null;
        boolean emailCorreto = false;
        boolean senhaCorreta = false;
        if(listaGerente.size()>0){
            for(Gerente pessoa : listaGerente){
                if((pessoa.getEmail().equals(emailInput)&&!pessoa.getSenha().equals(senhaInput))){
                    emailCorreto = true;
                    senhaCorreta = false;
                }else if((!pessoa.getEmail().equals(emailInput)&&pessoa.getSenha().equals(senhaInput))){
                    emailCorreto = false;
                    senhaCorreta = true;
                    
                }else if(pessoa.getEmail().equals(emailInput)&&pessoa.getSenha().equals(senhaInput)){
                    emailCorreto = true;
                    senhaCorreta = true;
                    logado = true;
                    //user = "gerente";
                    //JOptionPane.showMessageDialog(null,"Entrou como gerente com sucesso!", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                    //this.setVisible(false);
                    break;
                    
                }
            }
            /*
            if (!emailCorreto && !senhaCorreta && !logado) {
                JOptionPane.showMessageDialog(null, "Email e senha incorretos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            }*/
            if(emailCorreto&&senhaCorreta&&logado){
                user="gerente";
                JOptionPane.showMessageDialog(null,"Entrou como gerente com sucesso!", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                this.setVisible(false);
            }
        }
        if(listaFuncionarios.size()>0){
        for(Funcionario item : listaFuncionarios){
                if((item.getEmail().equals(emailInput)&&!item.getSenha().equals(senhaInput))){
                    emailCorreto = true;
                    senhaCorreta = false;
                }else if((!item.getEmail().equals(emailInput)&&item.getSenha().equals(senhaInput))){
                    emailCorreto = false;
                    senhaCorreta = true;
                    
                }else             if(item.getEmail().equals(emailInput)&& item.getSenha().equals(senhaInput)){
                emailCorreto = true;
                senhaCorreta = true;
                logado = true;
                user = "funcionario";
                JOptionPane.showMessageDialog(null,"Credenciais verificadas... pegando indice", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                Funcionario.index_func=Integer.parseInt(item.getCadastroFuncionario());//Problema AQUI!!! -> Consertado. Bastou inicializar um índice 0 como string em cadastro Func.
                JOptionPane.showMessageDialog(null,"Entrou como funcionário com sucesso!", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                this.setVisible(false);

                

                //verificarLogin(logado);


                break;
            }
        }
        }
        if(!logado && listaClientes.size() > 0){
        for(Cliente item:listaClientes){
                if((item.getEmail().equals(emailInput)&&!item.getSenha().equals(senhaInput))){
                    emailCorreto = true;
                    senhaCorreta = false;
                }else if((!item.getEmail().equals(emailInput)&&item.getSenha().equals(senhaInput))){
                    emailCorreto = false;
                    senhaCorreta = true;
                    
                }else if(item.getEmail().equals(emailInput)&&item.getSenha().equals(senhaInput)){
                    emailCorreto = true;
                    senhaCorreta = true;
                    logado = true;
                    user = "cliente";
                    JOptionPane.showMessageDialog(null,"Credenciais verificadas... pegando índice", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                    Cliente.index_cliente=Integer.parseInt(item.getIdCliente());//PROBLEMA AQUI DE NOVO!!
                    JOptionPane.showMessageDialog(null,"Entrou como cliente com sucesso!", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                    this.setVisible(false);
                    //user = "gerente";
                    //JOptionPane.showMessageDialog(null,"Entrou como gerente com sucesso!", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                    //this.setVisible(false);
                    break;
                    
                }

            /*if(item.getEmail().equals(emailInput)&& item.getSenha().equals(senhaInput)){
                emailCorreto = true;
                senhaCorreta = true;
                logado = true;
                user = "cliente";
                JOptionPane.showMessageDialog(null,"Credenciais verificadas... pegando índice", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                Cliente.index_cliente=Integer.parseInt(item.getIdCliente());//PROBLEMA AQUI DE NOVO!!
                JOptionPane.showMessageDialog(null,"Entrou como cliente com sucesso!", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                this.setVisible(false);
                

                break;
            }*/
        }
                    if (!emailCorreto && !senhaCorreta && !logado) {
                JOptionPane.showMessageDialog(null, "Email ou senha incorretos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            }
        
            /*if(emailCorreto&&senhaCorreta&&logado){
                user="gerente";
                JOptionPane.showMessageDialog(null,"Entrou como gerente com sucesso!", "Notificação Login",JOptionPane.PLAIN_MESSAGE);
                this.setVisible(false);
            }*/
        }
        if(logado){
            new Menu().setVisible(true);
        }
        if(!logado){
        JOptionPane.showMessageDialog(null, "Email ou senha incorretos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastrarse;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
