
package telas;

import classes.Carrinho;
import static classes.Carrinho.listaProdutos;
import static classes.Estoque.estoque;
import classes.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static telas.Menu.logado;

/**
 *
 * @author v
 */
public class verProdutos extends javax.swing.JFrame {

    /**
     * Creates new form verProdutos
     */
    public verProdutos() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        carregarTabelaProdutos();
        txtQuantidade.setText("1");
        Produto item;
        btnSobre.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        private void carregarTabelaProdutos(){
            DefaultTableModel modeloTabelaProdutos = new DefaultTableModel(new Object[] {"Titulo","Autor","Gênero","Valor","Quant.Estoque"},0);
            
            for(int i=0;i<estoque.size();i++){
                Object linha[] = new Object[] {estoque.get(i).getTitulo(),
                                               estoque.get(i).getAutor(),
                                               estoque.get(i).getGenero(),
                                               estoque.get(i).getPreço(),
                                               estoque.get(i).getQuantidadeEstoque()};
                modeloTabelaProdutos.addRow(linha);
                
                
            }
            //Tabela recebe modelo de produtos do estoque
            tabela_produtos.setModel(modeloTabelaProdutos);
            
            tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabela_produtos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabela_produtos.getColumnModel().getColumn(2).setPreferredWidth(14);
            tabela_produtos.getColumnModel().getColumn(3).setPreferredWidth(8);
            tabela_produtos.getColumnModel().getColumn(4).setPreferredWidth(3);


            
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        lblResultadosPesquisa = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnSobre = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca por produtos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/pesquisar64.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(237, 224, 182));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Old London", 0, 36)); // NOI18N
        titulo.setText("Pesquisar por produtos");
        titulo.setToolTipText("");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Pesquisar por título ou autor");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        Tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TabelaFocusGained(evt);
            }
        });

        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Gênero", "Valor", "quant. estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        Tabela.setViewportView(tabela_produtos);
        if (tabela_produtos.getColumnModel().getColumnCount() > 0) {
            tabela_produtos.getColumnModel().getColumn(0).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(1).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(2).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(3).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(4).setResizable(false);
        }

        lblResultadosPesquisa.setText("Resultados da pesquisa");

        lblNome.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblNome.setText("Titulo:");

        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/information_info_1565.png"))); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/accept_icon-icons.com_74428.png"))); // NOI18N
        btnComprar.setText("Adicionar ao carrinho");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Old London", 0, 18)); // NOI18N
        jLabel1.setText("Quantidade");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        lblAutor.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblAutor.setText("Autor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(titulo)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(btnSobre)
                                        .addGap(199, 199, 199)
                                        .addComponent(btnComprar))
                                    .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 74, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisar)
                                .addGap(142, 142, 142))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(lblResultadosPesquisa)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultadosPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar)
                    .addComponent(btnSobre))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 760, 510));

        btnSair.setFont(new java.awt.Font("Old London", 0, 48)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 130, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BuscarItem.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
                if (estoque == null || estoque.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O estoque está vazio ou não foi carregado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tituloPesquisado = txtTitulo.getText().toLowerCase().trim();
        String autorPesquisado = txtAutor.getText().toLowerCase().trim();
        String tituloPesquisadoPuro = txtTitulo.getText();
        String autorPesquisadoPuro = txtAutor.getText();
        if (tituloPesquisado.isEmpty()&& autorPesquisado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um título ou autor para pesquisar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            carregarTabelaProdutos();
            return;
        }


        DefaultTableModel modeloTabelaProdutos = new DefaultTableModel(new Object[] {"Titulo", "Autor", "Gênero", "Valor", "Quant.Estoque"}, 0);

        boolean produtoEncontrado = false;

        boolean tituloVazio = tituloPesquisado.isBlank();
        boolean autorVazio = autorPesquisado.isBlank();
    for (Produto produto : estoque) {
        if (produto != null && produto.getTitulo() != null && produto.getAutor() != null) {
            boolean matchesTitle = tituloPesquisado.isBlank() || produto.getTitulo().toLowerCase().contains(tituloPesquisado);
            boolean matchesAuthor = autorPesquisado.isBlank() || produto.getAutor().toLowerCase().contains(autorPesquisado);
            
            if (matchesTitle && matchesAuthor) {
                Object novalinha[] = new Object[]{
                    produto.getTitulo(),
                    produto.getAutor(),
                    produto.getGenero(),
                    produto.getPreço(),
                    produto.getQuantidadeEstoque()
                };
                modeloTabelaProdutos.addRow(novalinha);
                produtoEncontrado = true;
            }
        }
    }     
if (produtoEncontrado) {
        tabela_produtos.setModel(modeloTabelaProdutos);
        // Ajusta a largura das colunas
        tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabela_produtos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabela_produtos.getColumnModel().getColumn(2).setPreferredWidth(14);
        tabela_produtos.getColumnModel().getColumn(3).setPreferredWidth(8);
        tabela_produtos.getColumnModel().getColumn(4).setPreferredWidth(3);
}else{
    if(autorPesquisado.isEmpty()){
                JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o título: " + tituloPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
        carregarTabelaProdutos(); // Load all products if no matches found
    }
    if(tituloPesquisado.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o autor: " + autorPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
            carregarTabelaProdutos();
    }
    if((!tituloPesquisado.isEmpty())&&(!autorPesquisado.isEmpty())){
        JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o título: " + tituloPesquisadoPuro +" e autor: "+autorPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
        carregarTabelaProdutos();
    }

}
        
    //GEN-LAST:event_btnPesquisarActionPerformed
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        //int i = tabela_produtos.getSelectedRow();
        if(!logado){
            JOptionPane.showMessageDialog(null, "Entre com uma conta para poder adicionar ao carrinho!", "Erro ao adicionar para carrinho", JOptionPane.ERROR_MESSAGE);
        }else{

        int row = tabela_produtos.getSelectedRow();
        int column = tabela_produtos.getSelectedColumn();
        Object produtoPesquisado = tabela_produtos.getValueAt(row,0);
        System.out.println("Value selected at: "+produtoPesquisado);
        String inputBusca = String.valueOf(produtoPesquisado);
        txtTitulo.setText(inputBusca);
        System.out.println("Item do inputBusca a ser aparecido na caixa de texto"+inputBusca);
        String selected="";
        //System.out.println(i);
        for(Produto itemEstoque : estoque){
            if(itemEstoque.getTitulo().equals(inputBusca)){
            Produto item = itemEstoque;
            selected = item.getTitulo();
            System.out.println(item.getTitulo());
            txtTitulo.setText(item.getTitulo());
            }
        }
        /*
        if(i>=0 && i<estoque.size()){
            Produto item = estoque.get(i);
            selected = item.getTitulo();
            System.out.println(item.getTitulo());
            txtTitulo.setText(item.getTitulo());
        }*/
        System.out.println("Item selecionado para compra foi: "+selected);
        Produto itemComprado;
        for(Produto itemBusca : estoque){
           // JOptionPane.showMessageDialog(null,"Busca Iniciada!", "Notificação Adicionar item ao carrinho",JOptionPane.PLAIN_MESSAGE);
            System.out.println("Busca inciada!");

            if(itemBusca.getTitulo().equals(selected)){
                //JOptionPane.showMessageDialog(null,"Item Encontrado!", "Notificação Adicionar item ao carrinho",JOptionPane.PLAIN_MESSAGE);
                itemComprado = itemBusca;
                if(Integer.parseInt(txtQuantidade.getText())<=itemComprado.getQuantidadeEstoque()){
                listaProdutos.add(itemComprado);
                itemComprado.setQuantidadeComprada(Integer.parseInt(txtQuantidade.getText()));
                itemBusca.setQuantidadeEstoque(itemBusca.getQuantidadeEstoque()-itemComprado.getQuantidadeComprada());
                JOptionPane.showMessageDialog(null,"Item adicionado ao carrinho com sucesso!", "Notificação Adicionar item ao carrinho",JOptionPane.PLAIN_MESSAGE);

                }else if(itemComprado.getQuantidadeEstoque()==0){
                 JOptionPane.showMessageDialog(null, "Não há mais estoque para este item", "Erro ao adicionar item ao carrinho", JOptionPane.ERROR_MESSAGE);   
                }else if(Integer.parseInt(txtQuantidade.getText())>itemComprado.getQuantidadeEstoque()){
                    JOptionPane.showMessageDialog(null, "Quantidade inserida acima da disponível!", "Erro ao adicionar item ao carrinho", JOptionPane.ERROR_MESSAGE);   
                }
            }
        }
}
        carregarTabelaProdutos();
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void TabelaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabelaFocusGained

    }//GEN-LAST:event_TabelaFocusGained

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked
        // TODO add your handling code here:
        int i = tabela_produtos.getSelectedRow();
        int row = tabela_produtos.getSelectedRow();
        int column = tabela_produtos.getSelectedColumn();
        Object produtoPesquisado = tabela_produtos.getValueAt(row,0);
        System.out.println("Value selected at: "+produtoPesquisado);
        String inputBusca = String.valueOf(produtoPesquisado);
        //txtTitulo.setText(inputBusca);
        System.out.println("Item do inputBusca a ser aparecido na caixa de texto"+inputBusca);
        btnSobre.setEnabled(true);
        //String nomePesquisado = tabela_produtos.getCom
        
        /*System.out.println(i);
        if(i>=0 && i<estoque.size()){
            Produto item = estoque.get(i);
            System.out.println(item.getTitulo());
            txtTitulo.setText(item.getTitulo());
        }*/
        
    }//GEN-LAST:event_tabela_produtosMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        btnSobre.setEnabled(false);
        tabela_produtos.clearSelection();
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(verProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verProdutos().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblResultadosPesquisa;
    private javax.swing.JTable tabela_produtos;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
