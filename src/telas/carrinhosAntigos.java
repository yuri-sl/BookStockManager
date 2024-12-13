/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Carrinho;

import javax.swing.table.DefaultTableModel;
import classes.Cliente;
import static classes.Cliente.index_cliente;
import static classes.Cliente.listaClientes;
import classes.Funcionario;
import static classes.Funcionario.index_func;
import static classes.Funcionario.listaFuncionarios;
import static classes.Usuario.user;
import java.util.ArrayList;
//import static telas.Menu.user;

/**
 *
 * @author Yuri
 */
public class carrinhosAntigos extends javax.swing.JFrame {

    /**
     * Creates new form carrinhosAntigos
     */
    public carrinhosAntigos() {
        initComponents();
        setLocationRelativeTo(null);
        disableCarrinhoFields();
        btnCancelarCarrinho.setEnabled(false);
        System.out.println("User é igual a "+user);
        if(user.equals("cliente")){
            carregarTabelaCliente();
        }
        if(user.equals("funcionario")){
            carregarTabelaFuncionarioPedidos();
        }
        if(user.equals("gerente")){
            
        }

    }
    
            public void enableCarrinhoFields(){
            txtNumCarrinho.setEnabled(true);
            txtData.setEnabled(true);
            txtProdutos.setEnabled(true);
            txtCodPedido.setEnabled(true);
            txtCodRastreio.setEnabled(true);
            txtTotal.setEnabled(true);
            
            lblNumCarrinho.setEnabled(true);
            lblData.setEnabled(true);
            lblProdutos.setEnabled(true);
            lblCodPedido.setEnabled(true);
            lblCodRastreio.setEnabled(true);
            lblTotal.setEnabled(true);
            
        }
            
                    public void disableCarrinhoFields(){
            txtNumCarrinho.setEnabled(false);
            txtData.setEnabled(false);
            txtProdutos.setEnabled(false);
            txtCodPedido.setEnabled(false);
            txtCodRastreio.setEnabled(false);
            txtTotal.setEnabled(false);
            
            lblNumCarrinho.setEnabled(false);
            lblData.setEnabled(false);
            lblProdutos.setEnabled(false);
            lblCodPedido.setEnabled(false);
            lblCodRastreio.setEnabled(false);
            lblTotal.setEnabled(false);
        }
                    
        private void carregarTabelaCliente(){
            DefaultTableModel modeloTabelaCarrinhosAntigos = new DefaultTableModel(new Object[] {"Num.Carrinho","Data Pedido","Produtos","Total"},0);
            
            Cliente cliente = listaClientes.get(index_cliente);
            System.out.println("Cliente passado");
            ArrayList<Carrinho> listaCarrinhoDoCliente = cliente.getListaCarrinho();
            System.out.println("Tamanho da lista: "+cliente.getListaCarrinho().size());
            System.out.println("ListaResgatada");
            
            for(int i=0;i<cliente.getListaCarrinho().size();i++){
                Object linha[] = new Object[] {cliente.getListaCarrinho().get(i).getNumCarrinho(),
                                               cliente.getListaCarrinho().get(i).getData(),
                                               cliente.getListaCarrinho().get(i).mostarProdutos(cliente.getListaCarrinho().get(i).itensNoCarrinho),
                                               cliente.getListaCarrinho().get(i).getTotal()};
                modeloTabelaCarrinhosAntigos.addRow(linha);
                
                
            }
            //Tabela recebe modelo de clientes
            tblCliente.setModel(modeloTabelaCarrinhosAntigos);
            
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(14);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(10);
            //tblCliente.getColumnModel().getColumn(4).setPreferredWidth(100);


            
        }
        private void carregarTabelaFuncionarioPedidos(){
            System.out.println("Está acessando a função de pedidos de funcionário!");
            DefaultTableModel modeloTabelaCarrinhosAntigos = new DefaultTableModel(new Object[] {"Num.Carrinho","Data Pedido","Produtos","Total"},0);
            
            Funcionario funcionario = listaFuncionarios.get(index_func);
            ArrayList<Carrinho> listaCarrinhoDoFuncionario = funcionario.getListaCarrinhoFuncionario();
            

            Cliente cliente = listaClientes.get(index_cliente);
            System.out.println("Cliente passado");
            ArrayList<Carrinho> listaCarrinhoDoCliente = cliente.getListaCarrinho();
            System.out.println("Tamanho da lista: "+cliente.getListaCarrinho().size());
            System.out.println("ListaResgatada");
            
            for(int i=0;i<cliente.getListaCarrinho().size();i++){
                Object linha[] = new Object[] {funcionario.getListaCarrinhoFuncionario().get(i).getNumCarrinho(),
                                               funcionario.getListaCarrinhoFuncionario().get(i).getData(),
                                               funcionario.getListaCarrinhoFuncionario().get(i).mostarProdutos(funcionario.getListaCarrinho().get(i).itensNoCarrinho),
                                               funcionario.getListaCarrinhoFuncionario().get(i).getTotal()};
                modeloTabelaCarrinhosAntigos.addRow(linha);
                
                
            }
            //Tabela recebe modelo de clientes
            tblCliente.setModel(modeloTabelaCarrinhosAntigos);
            
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(14);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(10);
            //tblCliente.getColumnModel().getColumn(4).setPreferredWidth(100);


            
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lblCarrinhosAnteriores = new javax.swing.JLabel();
        lblNumCarrinho = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblCodPedido = new javax.swing.JLabel();
        lblCodRastreio = new javax.swing.JLabel();
        txtNumCarrinho = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtCodPedido = new javax.swing.JTextField();
        txtCodRastreio = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        btnPesquisarCarrinho = new javax.swing.JButton();
        btnCancelarCarrinho = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProdutos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar carrinhos anteriores");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NumCarrinho", "Data do pedido", "Produtos", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        lblCarrinhosAnteriores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCarrinhosAnteriores.setText("Consultar Carrinhos Antigos");

        lblNumCarrinho.setText("NumCarrinho");

        lblData.setText("Data");

        lblProdutos.setText("Produtos");

        lblTotal.setText("Total");

        lblCodPedido.setText("Cod.Pedido");

        lblCodRastreio.setText("Cod.Rastreio");

        txtNumCarrinho.setToolTipText("número do carrinho");

        txtTotal.setToolTipText("valor total");

        txtCodPedido.setToolTipText("código do pedido");

        txtCodRastreio.setToolTipText("código do rastreio");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setToolTipText("data do pedido");

        btnPesquisarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/searchmagnifierinterfacesymbol1_79893.png"))); // NOI18N
        btnPesquisarCarrinho.setText("Pesquisar");
        btnPesquisarCarrinho.setToolTipText("pesquisar por carrinho");
        btnPesquisarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCarrinhoActionPerformed(evt);
            }
        });

        btnCancelarCarrinho.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarCarrinho.setText("Cancelar");
        btnCancelarCarrinho.setToolTipText("cancelar operação");
        btnCancelarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCarrinhoActionPerformed(evt);
            }
        });

        txtProdutos.setColumns(20);
        txtProdutos.setRows(5);
        jScrollPane2.setViewportView(txtProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnPesquisarCarrinho)
                        .addGap(239, 239, 239)
                        .addComponent(btnCancelarCarrinho))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(lblCarrinhosAnteriores))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(271, 271, 271)
                                    .addComponent(lblData)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(163, 163, 163)
                                    .addComponent(lblCodPedido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblTotal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(133, 133, 133))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lblNumCarrinho)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtNumCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lblCodRastreio)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtCodRastreio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(67, 67, 67)
                                            .addComponent(lblProdutos)
                                            .addGap(18, 18, 18)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCarrinhosAnteriores)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumCarrinho)
                    .addComponent(txtNumCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodPedido)
                    .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblProdutos)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodRastreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodRastreio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisarCarrinho)
                    .addComponent(btnCancelarCarrinho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCarrinhoActionPerformed
        // TODO add your handling code here:
        enableCarrinhoFields();
        btnCancelarCarrinho.setEnabled(true);
        btnPesquisarCarrinho.setEnabled(false);
    }//GEN-LAST:event_btnPesquisarCarrinhoActionPerformed

    private void btnCancelarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCarrinhoActionPerformed
        // TODO add your handling code here:
        disableCarrinhoFields();
        btnPesquisarCarrinho.setEnabled(true);
        btnCancelarCarrinho.setEnabled(false);
    }//GEN-LAST:event_btnCancelarCarrinhoActionPerformed

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
            java.util.logging.Logger.getLogger(carrinhosAntigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carrinhosAntigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carrinhosAntigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carrinhosAntigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carrinhosAntigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCarrinho;
    private javax.swing.JButton btnPesquisarCarrinho;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCarrinhosAnteriores;
    private javax.swing.JLabel lblCodPedido;
    private javax.swing.JLabel lblCodRastreio;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNumCarrinho;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCodPedido;
    private javax.swing.JTextField txtCodRastreio;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNumCarrinho;
    private javax.swing.JTextArea txtProdutos;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
