/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import static classes.Estoque.estoque;
import classes.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static telas.cadastros.cadastrosFlag;

/**
 *
 * @author Yuri
 */
public class ControleEstoque extends javax.swing.JFrame {

    /**
     * Creates new form ControleEstoque
     */
    public ControleEstoque() {
        initComponents();

        disableEstoqueFields();
        disableEstoqueButtons();
        disableEstoqueAdicaoFields();
        carregarTabelaProdutos();
        carregarTabelaProdutosAdicao();
        disableEstoqueAdicaoButtons();
        //btnAddItem.setEnabled(true);
        btnPesquisarItem.setEnabled(true);
        txtCodigoEstoque.setEnabled(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        btnPesquisarItem.setEnabled(true);
        txtCodigoEstoque.setEnabled(false);
        lblCodigoEstoque.setEnabled(true);
        txtGeneroEstoque.setEnabled(false);
        lblGeneroEstoque.setEnabled(false);
        
        
        setLocationRelativeTo(null);
    }
    
    public void disableEstoqueFields(){
        lblAutor.setEnabled(false);
        txtAutor.setEnabled(false);
        txtTituloEstoque.setEnabled(false);
        txtPrecoEstoque.setEnabled(false);
        txtQuantiaEstoque.setEnabled(false);
        txtCodigoEstoque.setEnabled(false);
        txtDescricaoEstoque.setEnabled(false);
        txtGeneroEstoque.setEnabled(false);

        
        lblTituloEstoque.setEnabled(false);
        lblPrecoEstoque.setEnabled(false);
        lblQuantiaEstoque.setEnabled(false);
        lblCodigoEstoque.setEnabled(false);
        lblDescricaoEstoque.setEnabled(false);

        
    }
    public void enableEstoqueFields(){
        txtTituloEstoque.setEnabled(true);
        txtPrecoEstoque.setEnabled(true);
        txtQuantiaEstoque.setEnabled(true);
        txtCodigoEstoque.setEnabled(true);
        txtDescricaoEstoque.setEnabled(true);
        
        lblTituloEstoque.setEnabled(true);
        lblPrecoEstoque.setEnabled(true);
        lblQuantiaEstoque.setEnabled(true);
        lblCodigoEstoque.setEnabled(true);
        lblDescricaoEstoque.setEnabled(true);
        
    }
    public void enableEstoqueAdicaoFields(){
        txtTituloAdicao.setEnabled(true);
        txtAutorAdicao.setEnabled(true);
        txtCodigoProdutoAdicao.setEnabled(true);
        lblCodigoProdutoAdicao.setEnabled(true);
        lblTituloAdicao.setEnabled(true);
        lblAutorAdicao.setEnabled(true);
    }
    public void disableEstoqueAdicaoFields(){
        txtTituloAdicao.setEnabled(false);
        txtAutorAdicao.setEnabled(false);
        txtCodigoProdutoAdicao.setEnabled(false);
        lblCodigoProdutoAdicao.setEnabled(false);
        lblTituloAdicao.setEnabled(false);
        lblAutorAdicao.setEnabled(false);
    }
    
    public void disableEstoqueButtons(){
        //btnAddItem.setEnabled(false);
        btnAlterarItem.setEnabled(false);
        btnSalvarItem.setEnabled(false);
        //btnExcluirItem.setEnabled(false);
        btnCancelarItem.setEnabled(false);
        btnPesquisarItem.setEnabled(false);
        btnBuscar.setEnabled(false);
        
    }
    public void disableEstoqueAdicaoButtons(){
        btnSalvarItemAdicao.setEnabled(false);
        btnExcluirItemAdicao.setEnabled(false);
        btnCancelarItemAdicao.setEnabled(false);
        
        
        
    }
    public void carregarCamposProduto(){
        int i = tblMostraProdutos.getSelectedRow();
        if(i>=0 && i<estoque.size()){
            Produto item = estoque.get(i);
            txtTituloEstoque.setText(item.getTitulo());
            txtPrecoEstoque.setText(String.valueOf(item.getPreço()));
            txtQuantiaEstoque.setText(String.valueOf(item.getQuantidadeEstoque()));
            txtCodigoEstoque.setText(String.valueOf(item.getCodigoDoProduto()));
            txtDescricaoEstoque.setText(item.getDescrição());
            txtAutor.setText(item.getAutor());
            txtGeneroEstoque.setText(item.getGenero());
        }
     
    }
    public void clearEstoqueFields(){
            txtTituloEstoque.setText("");
            txtPrecoEstoque.setText("");
            txtQuantiaEstoque.setText("");
            txtCodigoEstoque.setText("");
            txtDescricaoEstoque.setText("");
            txtAutor.setText("");
    }
    
    
    private void carregarTabelaProdutos(){
        DefaultTableModel modeloTabelaProdutos = new DefaultTableModel(new Object[] {"Título","Autor","Gênero","Preço","Quantia Estoque","Código Produto","Descrição"},0);
        
        for(int i=0;i<estoque.size();i++){
            Object linha[] = new Object[] {estoque.get(i).getTitulo(),
                                           estoque.get(i).getAutor(),
                                           estoque.get(i).getGenero(),
                                           estoque.get(i).getPreço(),
                                           estoque.get(i).getQuantidadeEstoque(),
                                           estoque.get(i).getCodigoDoProduto(),
                                           estoque.get(i).getDescrição()};
            modeloTabelaProdutos.addRow(linha);
            
        }
        tblMostraProdutos.setModel(modeloTabelaProdutos);
        
        tblMostraProdutos.getColumnModel().getColumn(0).setPreferredWidth(WIDTH);
        tblMostraProdutos.getColumnModel().getColumn(1).setPreferredWidth(WIDTH);
        tblMostraProdutos.getColumnModel().getColumn(2).setPreferredWidth(WIDTH);
        tblMostraProdutos.getColumnModel().getColumn(3).setPreferredWidth(WIDTH);
        tblMostraProdutos.getColumnModel().getColumn(4).setPreferredWidth(WIDTH);
        tblMostraProdutos.getColumnModel().getColumn(5).setPreferredWidth(WIDTH);
        tblMostraProdutos.getColumnModel().getColumn(6).setPreferredWidth(WIDTH);
        
        
    }
        private void carregarTabelaProdutosAdicao(){
        DefaultTableModel modeloTabelaProdutos = new DefaultTableModel(new Object[] {"Título","Autor","Gênero","Preço","Quantia Estoque","Código Produto","Descrição"},0);
        
        for(int i=0;i<estoque.size();i++){
            Object linha[] = new Object[] {estoque.get(i).getTitulo(),
                                           estoque.get(i).getAutor(),
                                           estoque.get(i).getGenero(),
                                           estoque.get(i).getPreço(),
                                           estoque.get(i).getQuantidadeEstoque(),
                                           estoque.get(i).getCodigoDoProduto(),
                                           estoque.get(i).getDescrição()};
            modeloTabelaProdutos.addRow(linha);
            
        }
        tblMostraProdutosAdicao.setModel(modeloTabelaProdutos);
        
        tblMostraProdutosAdicao.getColumnModel().getColumn(0).setPreferredWidth(WIDTH);
        tblMostraProdutosAdicao.getColumnModel().getColumn(1).setPreferredWidth(WIDTH);
        tblMostraProdutosAdicao.getColumnModel().getColumn(2).setPreferredWidth(WIDTH);
        tblMostraProdutosAdicao.getColumnModel().getColumn(3).setPreferredWidth(WIDTH);
        tblMostraProdutosAdicao.getColumnModel().getColumn(4).setPreferredWidth(WIDTH);
        tblMostraProdutosAdicao.getColumnModel().getColumn(5).setPreferredWidth(WIDTH);
        tblMostraProdutosAdicao.getColumnModel().getColumn(6).setPreferredWidth(WIDTH);
        
        
    }
    private void clearControleAdicao(){
        txtTituloAdicao.setText("");
        txtAutorAdicao.setText("");
        txtCodigoProdutoAdicao.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanelAlterarItem = new javax.swing.JPanel();
        txtTituloEstoque = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricaoEstoque = new javax.swing.JTextArea();
        txtQuantiaEstoque = new javax.swing.JTextField();
        btnPesquisarItem = new javax.swing.JButton();
        lblAutor = new javax.swing.JLabel();
        lblPrecoEstoque = new javax.swing.JLabel();
        btnSalvarItem = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAlterarItem = new javax.swing.JButton();
        lblQuantiaEstoque = new javax.swing.JLabel();
        lblCodigoEstoque = new javax.swing.JLabel();
        lblTituloEstoque = new javax.swing.JLabel();
        txtPrecoEstoque = new javax.swing.JTextField();
        txtCodigoEstoque = new javax.swing.JTextField();
        btnCancelarItem = new javax.swing.JButton();
        lblDescricaoEstoque = new javax.swing.JLabel();
        lblControleEstoque = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostraProdutos = new javax.swing.JTable();
        txtAutor = new javax.swing.JTextField();
        lblGeneroEstoque = new javax.swing.JLabel();
        txtGeneroEstoque = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanelAdicaoItem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMostraProdutosAdicao = new javax.swing.JTable();
        btnCriar1 = new javax.swing.JButton();
        btnSalvarItemAdicao = new javax.swing.JButton();
        btnPesquisarItem1 = new javax.swing.JButton();
        btnCancelarItemAdicao = new javax.swing.JButton();
        btnExcluirItemAdicao = new javax.swing.JButton();
        lblControleAdicao = new javax.swing.JLabel();
        lblTituloAdicao = new javax.swing.JLabel();
        txtTituloAdicao = new javax.swing.JTextField();
        lblCodigoProdutoAdicao = new javax.swing.JLabel();
        txtCodigoProdutoAdicao = new javax.swing.JTextField();
        btnBuscarAdicao = new javax.swing.JButton();
        lblAutorAdicao = new javax.swing.JLabel();
        txtAutorAdicao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle do estoque");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/caixas64.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setBackground(new java.awt.Color(204, 0, 0));
        btnSair.setFont(new java.awt.Font("Old London", 0, 36)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 30, -1, 40));

        jPanel2.setBackground(new java.awt.Color(19, 55, 175));

        jPanelAlterarItem.setBackground(new java.awt.Color(0, 164, 164));

        txtTituloEstoque.setToolTipText("insira o título do produto");
        txtTituloEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloEstoqueActionPerformed(evt);
            }
        });

        txtDescricaoEstoque.setColumns(20);
        txtDescricaoEstoque.setRows(5);
        jScrollPane2.setViewportView(txtDescricaoEstoque);

        txtQuantiaEstoque.setToolTipText("insira a quantia em estoque");

        btnPesquisarItem.setBackground(new java.awt.Color(153, 153, 255));
        btnPesquisarItem.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        btnPesquisarItem.setText("Pesquisar");
        btnPesquisarItem.setToolTipText("pesquisar por título");
        btnPesquisarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarItemActionPerformed(evt);
            }
        });

        lblAutor.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblAutor.setText("Autor");

        lblPrecoEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblPrecoEstoque.setText("Preço");

        btnSalvarItem.setBackground(new java.awt.Color(51, 255, 0));
        btnSalvarItem.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        btnSalvarItem.setText("Salvar");
        btnSalvarItem.setToolTipText("salvar os dados");
        btnSalvarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarItemActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("aperte para buscar pelo item");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAlterarItem.setBackground(new java.awt.Color(255, 255, 0));
        btnAlterarItem.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        btnAlterarItem.setText("Alterar Item");
        btnAlterarItem.setToolTipText("alterar dados de algum produto");
        btnAlterarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarItemActionPerformed(evt);
            }
        });

        lblQuantiaEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblQuantiaEstoque.setText("Quantia em estoque");

        lblCodigoEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblCodigoEstoque.setText("Código de produto");

        lblTituloEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblTituloEstoque.setText("Titulo");

        txtPrecoEstoque.setToolTipText("insira o preço do produto");
        txtPrecoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoEstoqueActionPerformed(evt);
            }
        });

        txtCodigoEstoque.setToolTipText("insira o código do produto");

        btnCancelarItem.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarItem.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        btnCancelarItem.setText("Cancelar");
        btnCancelarItem.setToolTipText("cancelar operação");
        btnCancelarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarItemActionPerformed(evt);
            }
        });

        lblDescricaoEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblDescricaoEstoque.setText("Descrição");

        lblControleEstoque.setFont(new java.awt.Font("Old London", 0, 36)); // NOI18N
        lblControleEstoque.setText("Controle do estoque - Alteração de item");

        jScrollPane1.setToolTipText("tabela com os produtos em estoque");

        tblMostraProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Gênero", "Preço", "Qnt. Estoque", "Cód. Prod.", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMostraProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMostraProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMostraProdutos);
        if (tblMostraProdutos.getColumnModel().getColumnCount() > 0) {
            tblMostraProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblMostraProdutos.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblMostraProdutos.getColumnModel().getColumn(2).setPreferredWidth(15);
            tblMostraProdutos.getColumnModel().getColumn(3).setPreferredWidth(8);
            tblMostraProdutos.getColumnModel().getColumn(4).setPreferredWidth(3);
            tblMostraProdutos.getColumnModel().getColumn(5).setPreferredWidth(5);
            tblMostraProdutos.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        lblGeneroEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblGeneroEstoque.setText("Gênero");

        javax.swing.GroupLayout jPanelAlterarItemLayout = new javax.swing.GroupLayout(jPanelAlterarItem);
        jPanelAlterarItem.setLayout(jPanelAlterarItemLayout);
        jPanelAlterarItemLayout.setHorizontalGroup(
            jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createSequentialGroup()
                        .addComponent(lblControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createSequentialGroup()
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescricaoEstoque)
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addComponent(btnAlterarItem)
                                .addGap(59, 59, 59)
                                .addComponent(btnSalvarItem)
                                .addGap(124, 124, 124)
                                .addComponent(btnCancelarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnPesquisarItem))
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createSequentialGroup()
                        .addComponent(lblCodigoEstoque)
                        .addGap(92, 92, 92)
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblQuantiaEstoque))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                            .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createSequentialGroup()
                                        .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                        .addComponent(lblTituloEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTituloEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(62, 62, 62)
                            .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblGeneroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtQuantiaEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(txtGeneroEstoque)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelAlterarItemLayout.setVerticalGroup(
            jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createSequentialGroup()
                .addComponent(lblControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtPrecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(lblQuantiaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantiaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblGeneroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTituloEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTituloEstoque)
                            .addComponent(lblPrecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAlterarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelAlterarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 910, 620));

        jPanel1.setBackground(new java.awt.Color(193, 91, 15));

        jPanelAdicaoItem.setBackground(new java.awt.Color(255, 153, 51));

        jScrollPane3.setToolTipText("tabela com os produtos em estoque");

        tblMostraProdutosAdicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Gênero", "Preço", "Qnt. Estoque", "Cód. Prod.", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMostraProdutosAdicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMostraProdutosAdicaoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMostraProdutosAdicao);
        if (tblMostraProdutosAdicao.getColumnModel().getColumnCount() > 0) {
            tblMostraProdutosAdicao.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblMostraProdutosAdicao.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblMostraProdutosAdicao.getColumnModel().getColumn(2).setPreferredWidth(15);
            tblMostraProdutosAdicao.getColumnModel().getColumn(3).setPreferredWidth(8);
            tblMostraProdutosAdicao.getColumnModel().getColumn(4).setPreferredWidth(3);
            tblMostraProdutosAdicao.getColumnModel().getColumn(5).setPreferredWidth(5);
            tblMostraProdutosAdicao.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        btnCriar1.setBackground(new java.awt.Color(255, 189, 43));
        btnCriar1.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        btnCriar1.setText("Criar Item");
        btnCriar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriar1ActionPerformed(evt);
            }
        });

        btnSalvarItemAdicao.setBackground(new java.awt.Color(51, 255, 0));
        btnSalvarItemAdicao.setFont(new java.awt.Font("Old London", 1, 24)); // NOI18N
        btnSalvarItemAdicao.setText("Salvar");
        btnSalvarItemAdicao.setToolTipText("salvar os dados");
        btnSalvarItemAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarItemAdicaoActionPerformed(evt);
            }
        });

        btnPesquisarItem1.setBackground(new java.awt.Color(153, 153, 255));
        btnPesquisarItem1.setFont(new java.awt.Font("Old London", 1, 24)); // NOI18N
        btnPesquisarItem1.setText("Pesquisar");
        btnPesquisarItem1.setToolTipText("pesquisar por título");
        btnPesquisarItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarItem1ActionPerformed(evt);
            }
        });

        btnCancelarItemAdicao.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarItemAdicao.setFont(new java.awt.Font("Old London", 1, 24)); // NOI18N
        btnCancelarItemAdicao.setText("Cancelar");
        btnCancelarItemAdicao.setToolTipText("cancelar operação");
        btnCancelarItemAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarItemAdicaoActionPerformed(evt);
            }
        });

        btnExcluirItemAdicao.setBackground(new java.awt.Color(153, 153, 153));
        btnExcluirItemAdicao.setFont(new java.awt.Font("Old London", 1, 24)); // NOI18N
        btnExcluirItemAdicao.setText("Excluir");
        btnExcluirItemAdicao.setToolTipText("Excluir algum produto do estoque");
        btnExcluirItemAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemAdicaoActionPerformed(evt);
            }
        });

        lblControleAdicao.setFont(new java.awt.Font("Old London", 0, 36)); // NOI18N
        lblControleAdicao.setText("Controle do estoque - Adição/Remoção de item");

        lblTituloAdicao.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblTituloAdicao.setText("Titulo");

        lblCodigoProdutoAdicao.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblCodigoProdutoAdicao.setText("Codigo de Produto");

        btnBuscarAdicao.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        btnBuscarAdicao.setText("Buscar");
        btnBuscarAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdicaoActionPerformed(evt);
            }
        });

        lblAutorAdicao.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        lblAutorAdicao.setText("Autor");

        javax.swing.GroupLayout jPanelAdicaoItemLayout = new javax.swing.GroupLayout(jPanelAdicaoItem);
        jPanelAdicaoItem.setLayout(jPanelAdicaoItemLayout);
        jPanelAdicaoItemLayout.setHorizontalGroup(
            jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(lblControleAdicao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCriar1)
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addComponent(lblTituloAdicao)
                        .addGap(18, 18, 18)
                        .addComponent(txtTituloAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addComponent(btnSalvarItemAdicao)
                        .addGap(117, 117, 117)
                        .addComponent(btnCancelarItemAdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnExcluirItemAdicao)
                        .addGap(58, 58, 58)
                        .addComponent(btnPesquisarItem1))
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addComponent(lblAutorAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtAutorAdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigoProdutoAdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoProdutoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanelAdicaoItemLayout.setVerticalGroup(
            jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdicaoItemLayout.createSequentialGroup()
                .addComponent(lblControleAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCodigoProdutoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAutorAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAutorAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                                        .addComponent(txtCodigoProdutoAdicao)
                                        .addGap(9, 9, 9))))
                            .addComponent(lblTituloAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtTituloAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarItemAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarItemAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirItemAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(jPanelAdicaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAdicaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, 960, 590));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Telas/ControleEstoque.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloEstoqueActionPerformed

    private void btnCancelarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarItemActionPerformed
        // TODO add your handling code here:

        disableEstoqueFields();
        disableEstoqueButtons();
        //btnAddItem.setEnabled(true);
        carregarCamposProduto();
        tblMostraProdutos.clearSelection();
        btnPesquisarItem.setEnabled(true);
        txtGeneroEstoque.setEnabled(false);
    }//GEN-LAST:event_btnCancelarItemActionPerformed

    private void btnSalvarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarItemActionPerformed
        // TODO add your handling code here:
        disableEstoqueFields();
        disableEstoqueButtons();
        txtCodigoEstoque.setEnabled(false);
        int index = tblMostraProdutos.getSelectedRow();
        Produto produto = estoque.get(index);
        produto.setTitulo(txtTituloEstoque.getText());
        produto.setPreço(Double.parseDouble(txtPrecoEstoque.getText()));
        produto.setCodigoDoProduto(txtCodigoEstoque.getText());
        produto.setAutor(txtAutor.getText());
        produto.setQuantidadeEstoque(Integer.parseInt(txtQuantiaEstoque.getText()));
        produto.setCodigoDoProduto(txtCodigoEstoque.getText());
        produto.setDescrição(txtDescricaoEstoque.getText());
        produto.setGenero(txtGeneroEstoque.getText());
        
        carregarTabelaProdutos();
        carregarTabelaProdutosAdicao();
        //btnAddItem.setEnabled(true);
        btnPesquisarItem.setEnabled(true);
    }//GEN-LAST:event_btnSalvarItemActionPerformed

    private void btnPesquisarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarItemActionPerformed
        // TODO add your handling code here:
        disableEstoqueFields();
        disableEstoqueButtons();
        clearEstoqueFields();
        btnCancelarItem.setEnabled(true);
        lblTituloEstoque.setEnabled(true);
        txtTituloEstoque.setEnabled(true);
        txtGeneroEstoque.setEnabled(true);
        txtAutor.setEnabled(true);
        lblAutor.setEnabled(true);
        txtCodigoEstoque.setEnabled(true);
        lblCodigoEstoque.setEnabled(true);
        lblGeneroEstoque.setEnabled(true);
        btnBuscar.setEnabled(true);
        txtTituloEstoque.requestFocus();
        
    }//GEN-LAST:event_btnPesquisarItemActionPerformed

    private void btnAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarItemActionPerformed
        // TODO add your handling code here:
        btnSalvarItem.setEnabled(true);
        enableEstoqueFields();
        txtCodigoEstoque.setEnabled(true);
        txtAutor.setEnabled(true);
        lblAutor.setEnabled(true);
        txtGeneroEstoque.setEnabled(true);
            lblGeneroEstoque.setEnabled(true);

    }//GEN-LAST:event_btnAlterarItemActionPerformed

    private void tblMostraProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMostraProdutosMouseClicked
        // TODO add your handling code here:
        btnAlterarItem.setEnabled(true);
        btnCancelarItem.setEnabled(true);
        //btnExcluirItem.setEnabled(true);
        carregarCamposProduto();
    }//GEN-LAST:event_tblMostraProdutosMouseClicked

    private void tblMostraProdutosAdicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMostraProdutosAdicaoMouseClicked
        // TODO add your handling code here:
        btnExcluirItemAdicao.setEnabled(true);
        btnCancelarItemAdicao.setEnabled(true);
        int i = tblMostraProdutosAdicao.getSelectedRow();
        int row = tblMostraProdutosAdicao.getSelectedRow();
        int column = tblMostraProdutosAdicao.getSelectedColumn();
        Object produtoPesquisado = tblMostraProdutosAdicao.getValueAt(row,0);
        System.out.println("Value selected at: "+produtoPesquisado);
        for (Produto item : estoque) {
        if (item.getTitulo().equals(produtoPesquisado)) {
            // Use the matched Produto item directly
            txtTituloAdicao.setText(item.getTitulo());
            txtAutorAdicao.setText(item.getAutor());
            txtCodigoProdutoAdicao.setText(item.getCodigoDoProduto());
            
            // Break the loop as you have found the item
            break;
        }
    }
        Produto produtoPegado = (Produto)produtoPesquisado;
        String inputBusca = String.valueOf(produtoPesquisado);
        System.out.println("Item do inputBusca a ser aparecido na caixa de texto"+inputBusca);
        
    }//GEN-LAST:event_tblMostraProdutosAdicaoMouseClicked

    private void btnCriar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriar1ActionPerformed
        // TODO add your handling code here:
        cadastrosFlag="criarItem";
        new cadastros().setVisible(true);
        btnSalvarItemAdicao.setEnabled(true);
        
        lblTituloEstoque.setEnabled(true);
    }//GEN-LAST:event_btnCriar1ActionPerformed

    private void btnSalvarItemAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarItemAdicaoActionPerformed
        // TODO add your handling code here:
        
        carregarTabelaProdutosAdicao();
        carregarTabelaProdutos();
    }//GEN-LAST:event_btnSalvarItemAdicaoActionPerformed

    private void btnPesquisarItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarItem1ActionPerformed
        // TODO add your handling code here:
        enableEstoqueAdicaoFields();
        clearControleAdicao();
    }//GEN-LAST:event_btnPesquisarItem1ActionPerformed

    private void btnCancelarItemAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarItemAdicaoActionPerformed
        // TODO add your handling code here:
        tblMostraProdutosAdicao.clearSelection();
    }//GEN-LAST:event_btnCancelarItemAdicaoActionPerformed

    private void btnExcluirItemAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemAdicaoActionPerformed
        // TODO add your handling code here:
        int index = tblMostraProdutosAdicao.getSelectedRow();
        
        // Ensure that a row is selected
        if (index == -1) {
        // Handle the case where no row is selected (optional)
        JOptionPane.showMessageDialog(this, "Please select a product to remove.");
        return;
        }

        // Retrieve the product title from the selected row
        Object itemPesquisado = tblMostraProdutosAdicao.getValueAt(index, 0);
        String inputBusca = String.valueOf(itemPesquisado);

        // Search for the item in the stock and remove it
        for (Produto itemEstoque : estoque) {
        if (itemEstoque.getTitulo().equals(inputBusca)) {
            estoque.remove(itemEstoque);
        break; // Exit the loop after removing the item
            }
        }
        carregarTabelaProdutosAdicao();
        carregarTabelaProdutos();
        
        
    }//GEN-LAST:event_btnExcluirItemAdicaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnBuscarAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdicaoActionPerformed
        // TODO add your handling code here:
        String tituloPesquisado = txtTituloAdicao.getText().toLowerCase().trim();
        String autorPesquisado = txtAutorAdicao.getText().toLowerCase().trim();
        String numCodigoPesquisado = txtCodigoProdutoAdicao.getText().toLowerCase().trim();
        String tituloPesquisadoPuro = txtTituloAdicao.getText();
        String autorPesquisadoPuro = txtAutorAdicao.getText();
        String numCodigoPesquisadoPuro = txtCodigoProdutoAdicao.getText();
        if (tituloPesquisado.isEmpty()&& autorPesquisado.isEmpty()&&numCodigoPesquisado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um título ou autor ou código de produto para pesquisar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            carregarTabelaProdutosAdicao();
            return;
        }


        DefaultTableModel modeloTabelaProdutos = new DefaultTableModel(new Object[] {"Titulo", "Autor", "Gênero", "Valor", "Quant.Estoque"}, 0);

        boolean produtoEncontrado = false;

        boolean tituloVazio = tituloPesquisado.isBlank();
        boolean autorVazio = autorPesquisado.isBlank();
        boolean codigoVazio = numCodigoPesquisado.isBlank();
    for (Produto produto : estoque) {
        if (produto != null && produto.getTitulo() != null && produto.getAutor() != null) {
            boolean matchesTitle = tituloPesquisado.isBlank() || produto.getTitulo().toLowerCase().contains(tituloPesquisado);
            boolean matchesAuthor = autorPesquisado.isBlank() || produto.getAutor().toLowerCase().contains(autorPesquisado);
            boolean matchesCodigo = numCodigoPesquisado.isBlank() || produto.getCodigoDoProduto().toLowerCase().contains(numCodigoPesquisado);
            
            if (matchesTitle && matchesAuthor && matchesCodigo) {
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
        tblMostraProdutosAdicao.setModel(modeloTabelaProdutos);
        // Ajusta a largura das colunas
        tblMostraProdutosAdicao.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblMostraProdutosAdicao.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblMostraProdutosAdicao.getColumnModel().getColumn(2).setPreferredWidth(14);
        tblMostraProdutosAdicao.getColumnModel().getColumn(3).setPreferredWidth(8);
        tblMostraProdutosAdicao.getColumnModel().getColumn(4).setPreferredWidth(3);
}else{
    if(autorPesquisado.isEmpty()){
                JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o título: " + tituloPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
        carregarTabelaProdutosAdicao(); // Load all products if no matches found
    }
    if(tituloPesquisado.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o autor: " + autorPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
            carregarTabelaProdutosAdicao();
    }
    if((!tituloPesquisado.isEmpty())&&(!autorPesquisado.isEmpty())){
        JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o título: " + tituloPesquisadoPuro +" e autor: "+autorPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
        carregarTabelaProdutosAdicao();
    }

}
    }//GEN-LAST:event_btnBuscarAdicaoActionPerformed

    private void txtPrecoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoEstoqueActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        txtPrecoEstoque.setEnabled(false);
        txtQuantiaEstoque.setEnabled(false);
        txtDescricaoEstoque.setEnabled(false);
        
        String tituloPesquisado = txtTituloEstoque.getText().toLowerCase().trim();
        String autorPesquisado = txtAutor.getText().toLowerCase().trim();
        String numCodigoPesquisado = txtCodigoEstoque.getText().toLowerCase().trim();
        String tituloPesquisadoPuro = txtTituloEstoque.getText();
        String autorPesquisadoPuro = txtAutor.getText();
        String numCodigoPesquisadoPuro = txtCodigoEstoque.getText();
        if (tituloPesquisado.isEmpty()&& autorPesquisado.isEmpty()&&numCodigoPesquisado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um título ou autor ou código de produto para pesquisar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            carregarTabelaProdutos();
            return;
        }


        DefaultTableModel modeloTabelaProdutos = new DefaultTableModel(new Object[] {"Titulo", "Autor", "Gênero", "Valor", "Quant.Estoque"}, 0);

        boolean produtoEncontrado = false;

        boolean tituloVazio = tituloPesquisado.isBlank();
        boolean autorVazio = autorPesquisado.isBlank();
        boolean codigoVazio = numCodigoPesquisado.isBlank();
    for (Produto produto : estoque) {
        if (produto != null && produto.getTitulo() != null && produto.getAutor() != null) {
            boolean matchesTitle = tituloPesquisado.isBlank() || produto.getTitulo().toLowerCase().contains(tituloPesquisado);
            boolean matchesAuthor = autorPesquisado.isBlank() || produto.getAutor().toLowerCase().contains(autorPesquisado);
            boolean matchesCodigo = numCodigoPesquisado.isBlank() || produto.getCodigoDoProduto().toLowerCase().contains(numCodigoPesquisado);
            
            if (matchesTitle && matchesAuthor && matchesCodigo) {
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
        tblMostraProdutos.setModel(modeloTabelaProdutos);
        // Ajusta a largura das colunas
        tblMostraProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblMostraProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblMostraProdutos.getColumnModel().getColumn(2).setPreferredWidth(14);
        tblMostraProdutos.getColumnModel().getColumn(3).setPreferredWidth(8);
        tblMostraProdutos.getColumnModel().getColumn(4).setPreferredWidth(3);
}else{
    if(autorPesquisado.isEmpty()&&numCodigoPesquisado.isEmpty()){
                JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o título: " + tituloPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
        carregarTabelaProdutos(); // Load all products if no matches found
    }
    if((tituloPesquisado.isEmpty()&&numCodigoPesquisado.isEmpty())){
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o autor: " + autorPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
            carregarTabelaProdutos();
    }
    if((tituloPesquisado.isEmpty()&&autorPesquisado.isEmpty())){
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o código: " + numCodigoPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
            carregarTabelaProdutos();        
    }
    if((!tituloPesquisado.isEmpty())&&(!autorPesquisado.isEmpty())){
        JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o título: " + tituloPesquisadoPuro +" e autor: "+autorPesquisadoPuro, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
        carregarTabelaProdutos();
    }

}    
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarItem;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarAdicao;
    private javax.swing.JButton btnCancelarItem;
    private javax.swing.JButton btnCancelarItemAdicao;
    private javax.swing.JButton btnCriar1;
    private javax.swing.JButton btnExcluirItemAdicao;
    private javax.swing.JButton btnPesquisarItem;
    private javax.swing.JButton btnPesquisarItem1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarItem;
    private javax.swing.JButton btnSalvarItemAdicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAdicaoItem;
    private javax.swing.JPanel jPanelAlterarItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAutorAdicao;
    private javax.swing.JLabel lblCodigoEstoque;
    private javax.swing.JLabel lblCodigoProdutoAdicao;
    private javax.swing.JLabel lblControleAdicao;
    private javax.swing.JLabel lblControleEstoque;
    private javax.swing.JLabel lblDescricaoEstoque;
    private javax.swing.JLabel lblGeneroEstoque;
    private javax.swing.JLabel lblPrecoEstoque;
    private javax.swing.JLabel lblQuantiaEstoque;
    private javax.swing.JLabel lblTituloAdicao;
    private javax.swing.JLabel lblTituloEstoque;
    private javax.swing.JTable tblMostraProdutos;
    private javax.swing.JTable tblMostraProdutosAdicao;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAutorAdicao;
    private javax.swing.JTextField txtCodigoEstoque;
    private javax.swing.JTextField txtCodigoProdutoAdicao;
    private javax.swing.JTextArea txtDescricaoEstoque;
    private javax.swing.JTextField txtGeneroEstoque;
    private javax.swing.JTextField txtPrecoEstoque;
    private javax.swing.JTextField txtQuantiaEstoque;
    private javax.swing.JTextField txtTituloAdicao;
    private javax.swing.JTextField txtTituloEstoque;
    // End of variables declaration//GEN-END:variables
}
