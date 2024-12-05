/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import static classes.Estoque.estoque;
import classes.Produto;
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
        carregarTabelaProdutos();
        carregarTabelaProdutosAdicao();
        disableEstoqueAdicaoButtons();
        //btnAddItem.setEnabled(true);
        btnPesquisarItem.setEnabled(true);
        txtCodigoEstoque.setEnabled(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        
        
        setLocationRelativeTo(null);
    }
    
    public void disableEstoqueFields(){
        txtTituloEstoque.setEnabled(false);
        txtPrecoEstoque.setEnabled(false);
        txtQuantiaEstoque.setEnabled(false);
        txtCodigoEstoque.setEnabled(false);
        txtDescricaoEstoque.setEnabled(false);
        
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
        }
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jPanelAlterarItem = new javax.swing.JPanel();
        txtTituloEstoque = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricaoEstoque = new javax.swing.JTextArea();
        txtQuantiaEstoque = new javax.swing.JTextField();
        btnPesquisarItem = new javax.swing.JButton();
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
        jPanelAdicaoItem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMostraProdutosAdicao = new javax.swing.JTable();
        btnCriar1 = new javax.swing.JButton();
        btnSalvarItemAdicao = new javax.swing.JButton();
        btnPesquisarItem1 = new javax.swing.JButton();
        btnCancelarItemAdicao = new javax.swing.JButton();
        btnExcluirItemAdicao = new javax.swing.JButton();
        lblControleAdicao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle do estoque");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/caixas64.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setFont(new java.awt.Font("Old London", 0, 36)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 30, -1, 40));

        txtTituloEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        txtTituloEstoque.setToolTipText("insira o título do produto");
        txtTituloEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloEstoqueActionPerformed(evt);
            }
        });

        txtDescricaoEstoque.setColumns(20);
        txtDescricaoEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        txtDescricaoEstoque.setRows(5);
        jScrollPane2.setViewportView(txtDescricaoEstoque);

        txtQuantiaEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
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

        txtPrecoEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        txtPrecoEstoque.setToolTipText("insira o preço do produto");

        txtCodigoEstoque.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
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

        javax.swing.GroupLayout jPanelAlterarItemLayout = new javax.swing.GroupLayout(jPanelAlterarItem);
        jPanelAlterarItem.setLayout(jPanelAlterarItemLayout);
        jPanelAlterarItemLayout.setHorizontalGroup(
            jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblTituloEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(lblPrecoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecoEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarItem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTituloEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnSalvarItem))
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantiaEstoque)
                            .addComponent(lblCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancelarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantiaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDescricaoEstoque)))))
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarItem)
                        .addGap(131, 131, 131))))
            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(lblControleEstoque)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelAlterarItemLayout.setVerticalGroup(
            jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarItemLayout.createSequentialGroup()
                .addComponent(lblControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTituloEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTituloEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblQuantiaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantiaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescricaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblCodigoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlterarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                            .addComponent(btnPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanelAlterarItemLayout.createSequentialGroup()
                        .addComponent(btnAlterarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelAlterarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 860, -1));

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

        btnCriar1.setFont(new java.awt.Font("Old London", 1, 24)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        jLabel2.setText("Titulo");

        jTextField1.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        jLabel3.setText("Codigo de Produto");

        jTextField2.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        jButton1.setText("Buscar");

        jLabel4.setFont(new java.awt.Font("Old London", 0, 24)); // NOI18N
        jLabel4.setText("Autor");

        javax.swing.GroupLayout jPanelAdicaoItemLayout = new javax.swing.GroupLayout(jPanelAdicaoItem);
        jPanelAdicaoItem.setLayout(jPanelAdicaoItemLayout);
        jPanelAdicaoItemLayout.setHorizontalGroup(
            jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(lblControleAdicao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCriar1))
                .addGap(23, 23, 23)
                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addComponent(btnSalvarItemAdicao)
                        .addGap(132, 132, 132)
                        .addComponent(btnCancelarItemAdicao)
                        .addGap(94, 94, 94)
                        .addComponent(btnExcluirItemAdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btnPesquisarItem1))
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(9, 9, 9)))
                .addGap(24, 24, 24))
        );
        jPanelAdicaoItemLayout.setVerticalGroup(
            jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdicaoItemLayout.createSequentialGroup()
                .addComponent(lblControleAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdicaoItemLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35))
                    .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                        .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAdicaoItemLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)))
                .addGroup(jPanelAdicaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarItemAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarItemAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirItemAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelAdicaoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, 990, 460));

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
        carregarTabelaProdutos();
        carregarTabelaProdutosAdicao();
        //btnAddItem.setEnabled(true);
        btnPesquisarItem.setEnabled(true);
    }//GEN-LAST:event_btnSalvarItemActionPerformed

    private void btnPesquisarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarItemActionPerformed
        // TODO add your handling code here:
        disableEstoqueFields();
        disableEstoqueButtons();
        btnCancelarItem.setEnabled(true);
        lblTituloEstoque.setEnabled(true);
        txtTituloEstoque.setEnabled(true);
        btnBuscar.setEnabled(true);
        txtTituloEstoque.requestFocus();
        
    }//GEN-LAST:event_btnPesquisarItemActionPerformed

    private void btnAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarItemActionPerformed
        // TODO add your handling code here:
        btnSalvarItem.setEnabled(true);
        enableEstoqueFields();
        txtCodigoEstoque.setEnabled(false);
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
    }//GEN-LAST:event_btnPesquisarItem1ActionPerformed

    private void btnCancelarItemAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarItemAdicaoActionPerformed
        // TODO add your handling code here:
        tblMostraProdutosAdicao.clearSelection();
    }//GEN-LAST:event_btnCancelarItemAdicaoActionPerformed

    private void btnExcluirItemAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemAdicaoActionPerformed
        // TODO add your handling code here:
        
        int index = tblMostraProdutosAdicao.getSelectedRow();
        
        if(index>=0 && index<estoque.size()){
            estoque.remove(index);
        }
        carregarTabelaProdutosAdicao();
    }//GEN-LAST:event_btnExcluirItemAdicaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

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
    private javax.swing.JButton btnCancelarItem;
    private javax.swing.JButton btnCancelarItemAdicao;
    private javax.swing.JButton btnCriar1;
    private javax.swing.JButton btnExcluirItemAdicao;
    private javax.swing.JButton btnPesquisarItem;
    private javax.swing.JButton btnPesquisarItem1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarItem;
    private javax.swing.JButton btnSalvarItemAdicao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelAdicaoItem;
    private javax.swing.JPanel jPanelAlterarItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblCodigoEstoque;
    private javax.swing.JLabel lblControleAdicao;
    private javax.swing.JLabel lblControleEstoque;
    private javax.swing.JLabel lblDescricaoEstoque;
    private javax.swing.JLabel lblPrecoEstoque;
    private javax.swing.JLabel lblQuantiaEstoque;
    private javax.swing.JLabel lblTituloEstoque;
    private javax.swing.JTable tblMostraProdutos;
    private javax.swing.JTable tblMostraProdutosAdicao;
    private javax.swing.JTextField txtCodigoEstoque;
    private javax.swing.JTextArea txtDescricaoEstoque;
    private javax.swing.JTextField txtPrecoEstoque;
    private javax.swing.JTextField txtQuantiaEstoque;
    private javax.swing.JTextField txtTituloEstoque;
    // End of variables declaration//GEN-END:variables
}
