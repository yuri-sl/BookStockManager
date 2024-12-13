/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Carrinho;
import classes.Usuario;
//import classes.Usuario.listaCarrinho;
import static classes.Carrinho.listaProdutos;
import classes.Cliente;
import static classes.Cliente.index_cliente;
import static classes.Cliente.listaClientes;
import static classes.Estoque.estoque;
import classes.Funcionario;
import static classes.Funcionario.index_func;
import static classes.Funcionario.listaFuncionarios;
import classes.Gerente;
import classes.Produto;
import static classes.Usuario.user;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import static telas.Menu.user;
import static telas.cadastarGerente.listaGerente;

/**
 *
 * @author Yuri
 */
public class verCarrinho extends javax.swing.JFrame {
        Cliente cliente = listaClientes.get(index_cliente);//Pegando o ID do cliente
        Funcionario funcionario = listaFuncionarios.get(index_func);
        Gerente gerente = listaGerente.get(0);
        ArrayList listaCarrinhoDoCliente = cliente.getListaCarrinho();//Pegando a lista de carrinhos do cliente
        int indexCarrinho = listaCarrinhoDoCliente.size();//Pegando o tamanho da lista de carrinhos do cliente
        Carrinho carrinho1 = new Carrinho(indexCarrinho,"29/08/2024");//Criando um novo carrinho vazio de itens com o índice definido na linha anterior
        public static Vector<Carrinho> aux = new Vector<>(1);  // Initializes a Vector with an initial capacity of 1
        


    /**
     * Creates new form verCarrinho
     */
    public verCarrinho() {
        initComponents();
        setLocationRelativeTo(null);
        carregarTabelaProdutos();
        btnRemoverItem.setEnabled(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        jPanel4.setVisible(false);
        disableCarrinhoFields();
        System.out.println("User é igual a "+user);
        if(listaProdutos.size()!=0){
            btnEsvaziarCarrinho.setEnabled(true);
        }else{
            btnEsvaziarCarrinho.setEnabled(false);
        }
        carregarTabelaCliente();
        
    }
    

    
    //Carregar a tabela com os funcionários da lista
    private void carregarTabelaProdutos() {
            DefaultTableModel modeloTabelaProdutos = new DefaultTableModel(new Object[] {"Titulo","Autor","Preço","Quantidade","Gênero"},0);
            
            for(int i=0;i<listaProdutos.size();i++){
                Object linha[] = new Object[]{listaProdutos.get(i).getTitulo(),
                                              listaProdutos.get(i).getAutor(),
                                              listaProdutos.get(i).getPreço(),
                                              listaProdutos.get(i).getQuantidadeComprada(),
                                              listaProdutos.get(i).getGenero()};
                
                modeloTabelaProdutos.addRow(linha);
                
            }
            //Tabela recebe modelo
            tblProdutos.setModel(modeloTabelaProdutos);
            
            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(5);
            tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(3);
            tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(3);
            tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
            
            
    }
            public void enableCarrinhoFields(){
            txtNumCarrinho.setEnabled(true);
            txtData.setEnabled(true);
            txtProdutos.setEnabled(true);
            //txtCodPedido.setEnabled(true);
            //txtCodRastreio.setEnabled(true);
            txtTotal.setEnabled(true);
            
            lblNumCarrinho.setEnabled(true);
            lblData.setEnabled(true);
            lblProdutos.setEnabled(true);
            //lblCodPedido.setEnabled(true);
            //lblCodRastreio.setEnabled(true);
            lblTotal.setEnabled(true);
            
        }
            
                    public void disableCarrinhoFields(){
            txtNumCarrinho.setEnabled(false);
            txtData.setEnabled(false);
            txtProdutos.setEnabled(false);
            //txtCodPedido.setEnabled(false);
            //txtCodRastreio.setEnabled(false);
            txtTotal.setEnabled(false);
            
            lblNumCarrinho.setEnabled(false);
            lblData.setEnabled(false);
            lblProdutos.setEnabled(false);
            //lblCodPedido.setEnabled(false);
            //lblCodRastreio.setEnabled(false);
            lblTotal.setEnabled(false);
        }
                    
        private void carregarTabelaCliente(){
            DefaultTableModel modeloTabelaCarrinhosAntigos = new DefaultTableModel(new Object[] {"Num.Carrinho","Data Pedido","Produtos","Total","Forma Pagamento"},0);
            
            Cliente cliente = listaClientes.get(index_cliente);
            System.out.println("Cliente passado");
            ArrayList<Carrinho> listaCarrinhoDoCliente = cliente.getListaCarrinho();
            System.out.println("Tamanho da lista: "+cliente.getListaCarrinho().size());
            System.out.println("ListaResgatada");
            
            for(int i=0;i<cliente.getListaCarrinho().size();i++){
                Object linha[] = new Object[] {cliente.getListaCarrinho().get(i).getNumCarrinho(),
                                               cliente.getListaCarrinho().get(i).getData(),
                                               cliente.getListaCarrinho().get(i).mostarProdutos(cliente.getListaCarrinho().get(i).itensNoCarrinho),
                                               cliente.getListaCarrinho().get(i).getTotal(),
                                               cliente.getListaCarrinho().get(i).getPagamento().getFormaPagamento(),
                                               //cliente.getListaCarrinho().get(i).getPedido().getCodPedido(),

                                               
                };
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
            DefaultTableModel modeloTabelaCarrinhosAntigos = new DefaultTableModel(new Object[] {"Num.Carrinho","Data Pedido","Produtos","Total","Forma Pagamento"},0);
            
            Funcionario funcionario = listaFuncionarios.get(index_func);
            ArrayList<Carrinho> listaCarrinhoDoFuncionario = funcionario.getListaCarrinhoFuncionario();
            

            System.out.println("Funcionário passado");
            System.out.println("Tamanho da lista: "+funcionario.getListaCarrinhoFuncionario().size());
            System.out.println("ListaResgatada");
                    System.out.println("Quantidade de itens no carrinho:"+funcionario.getListaCarrinhoFuncionario().size());
            for(int i=0;i<funcionario.getListaCarrinhoFuncionario().size();i++){
                Object linha[] = new Object[] {funcionario.getListaCarrinhoFuncionario().get(i).getNumCarrinho(),
                                               funcionario.getListaCarrinhoFuncionario().get(i).getData(),
                                               funcionario.getListaCarrinhoFuncionario().get(i).mostarProdutos(funcionario.getListaCarrinhoFuncionario().get(i).itensNoCarrinho),
                                               funcionario.getListaCarrinhoFuncionario().get(i).getTotal(),
                                               funcionario.getListaCarrinhoFuncionario().get(i).getPagamento().getFormaPagamento()
                };
                modeloTabelaCarrinhosAntigos.addRow(linha);
                
                
            }
                    System.out.println("Tabela criada com sucesso");
            //Tabela recebe modelo de clientes
            tblCliente.setModel(modeloTabelaCarrinhosAntigos);
                    System.out.println("Tabela carregada com sucesso");
            
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(14);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(10);
            //tblCliente.getColumnModel().getColumn(4).setPreferredWidth(100);


            
        }
                                private void carregarTabelaGerentePedidos(){
            System.out.println("Está acessando a função de pedidos de gerente!");
            DefaultTableModel modeloTabelaCarrinhosAntigos = new DefaultTableModel(new Object[] {"Num.Carrinho","Data Pedido","Produtos","Total","Forma Pagamento"},0);
            
            Gerente gerente = listaGerente.get(0);
            ArrayList<Carrinho> listaCarrinhoDoFuncionario = gerente.getListaCarrinhoGerente();
            

            System.out.println("Funcionário passado");
            System.out.println("Tamanho da lista: "+gerente.getListaCarrinhoGerente().size());
            System.out.println("ListaResgatada");
                    System.out.println("Quantidade de itens no carrinho:"+gerente.getListaCarrinhoGerente().size());
            for(int i=0;i<gerente.getListaCarrinhoGerente().size();i++){
                Object linha[] = new Object[] {gerente.getListaCarrinhoGerente().get(i).getNumCarrinho(),
                                               gerente.getListaCarrinhoGerente().get(i).getData(),
                                               gerente.getListaCarrinhoGerente().get(i).mostarProdutos(gerente.getListaCarrinhoGerente().get(i).itensNoCarrinho),
                                               gerente.getListaCarrinhoGerente().get(i).getTotal(),
                                               gerente.getListaCarrinhoGerente().get(i).getPagamento().getFormaPagamento()
                };
                modeloTabelaCarrinhosAntigos.addRow(linha);
                
                
            }
                    System.out.println("Tabela criada com sucesso");
            //Tabela recebe modelo de clientes
            tblCliente.setModel(modeloTabelaCarrinhosAntigos);
                    System.out.println("Tabela carregada com sucesso");
            
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(14);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(10);
            //tblCliente.getColumnModel().getColumn(4).setPreferredWidth(100);


            
        }
        private void clearCarrinhoFields(){
            txtNumCarrinho.setText("");
            txtTotal.setText("");
            txtData.setText("");
            txtProdutos.setText("");
        }
    private void preencherCamposCarrinho(Carrinho carrinho) {
    txtNumCarrinho.setText(String.valueOf(carrinho.getNumCarrinho()));
    txtData.setText(String.valueOf(carrinho.getData()));
    txtTotal.setText(String.valueOf(carrinho.getTotal()));
    txtProdutos.setText(carrinho.mostrarProdutos());
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnRemoverItem = new javax.swing.JButton();
        btnEsvaziarCarrinho = new javax.swing.JButton();
        lblProdutosCarrinho = new javax.swing.JLabel();
        btnConfirmarCompra = new javax.swing.JButton();
        lblVisualizarCarrinho = new javax.swing.JLabel();
        btnVerCarrinhosAntigos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lblCarrinhosAnteriores = new javax.swing.JLabel();
        lblNumCarrinho = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtNumCarrinho = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtProdutos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar meu carrinho");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/simbolos/carrinho64.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(99, 83, 39));

        jPanel1.setBackground(new java.awt.Color(208, 174, 83));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Preço", "Quantidade", "Gênero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        btnRemoverItem.setBackground(new java.awt.Color(153, 153, 153));
        btnRemoverItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRemoverItem.setText("Remover item");
        btnRemoverItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverItemMouseClicked(evt);
            }
        });
        btnRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverItemActionPerformed(evt);
            }
        });

        btnEsvaziarCarrinho.setBackground(new java.awt.Color(255, 0, 0));
        btnEsvaziarCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEsvaziarCarrinho.setText("Esvaziar carrinho");
        btnEsvaziarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsvaziarCarrinhoActionPerformed(evt);
            }
        });

        lblProdutosCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblProdutosCarrinho.setText("Meus produtos no carrinho");

        btnConfirmarCompra.setBackground(new java.awt.Color(0, 255, 0));
        btnConfirmarCompra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConfirmarCompra.setText("Confirmar compra");
        btnConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCompraActionPerformed(evt);
            }
        });

        lblVisualizarCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVisualizarCarrinho.setText("Visualizar Carrinho Atual");

        btnVerCarrinhosAntigos.setBackground(new java.awt.Color(91, 255, 128));
        btnVerCarrinhosAntigos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerCarrinhosAntigos.setText("Ver carrinhos antigos");
        btnVerCarrinhosAntigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCarrinhosAntigosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(590, Short.MAX_VALUE)
                .addComponent(btnVerCarrinhosAntigos)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(lblVisualizarCarrinho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblProdutosCarrinho, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnRemoverItem)
                                    .addGap(136, 136, 136)
                                    .addComponent(btnEsvaziarCarrinho)
                                    .addGap(106, 106, 106)
                                    .addComponent(btnConfirmarCompra))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblVisualizarCarrinho)
                .addGap(39, 39, 39)
                .addComponent(btnVerCarrinhosAntigos)
                .addContainerGap(368, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(lblProdutosCarrinho)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemoverItem)
                        .addComponent(btnEsvaziarCarrinho)
                        .addComponent(btnConfirmarCompra))
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 840, 490));

        jPanel4.setBackground(new java.awt.Color(99, 83, 39));

        jPanel5.setBackground(new java.awt.Color(209, 176, 84));

        jPanel6.setBackground(new java.awt.Color(208, 174, 83));

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NumCarrinho", "Data do pedido", "Produtos", "Total", "Forma Pagamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class
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
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        lblCarrinhosAnteriores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCarrinhosAnteriores.setText("Consultar Carrinhos Antigos");

        lblNumCarrinho.setText("NumCarrinho");

        lblData.setText("Data");

        lblProdutos.setText("Produtos");

        lblTotal.setText("Total");

        txtNumCarrinho.setToolTipText("número do carrinho");

        txtTotal.setToolTipText("valor total");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setToolTipText("data do pedido");

        txtProdutos.setColumns(20);
        txtProdutos.setRows(5);
        jScrollPane3.setViewportView(txtProdutos);

        jButton1.setFont(new java.awt.Font("Old London", 0, 36)); // NOI18N
        jButton1.setText("Fechar janela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(lblCarrinhosAnteriores)
                        .addGap(130, 130, 130)
                        .addComponent(jButton1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(lblProdutos)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblNumCarrinho)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarrinhosAnteriores)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumCarrinho)
                    .addComponent(txtNumCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProdutos)
                        .addComponent(lblTotal)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 1000, 520));

        btnSair.setBackground(new java.awt.Color(255, 51, 0));
        btnSair.setFont(new java.awt.Font("Old London", 0, 36)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 50, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Telas/VerCarrinho.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(99, 83, 39));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 840, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCompraActionPerformed
        // TODO add your handling code here:
        if(listaProdutos.size()>0){
            carrinho1.setItensNoCarrinho(listaProdutos);
            carrinho1.contarSaldo();
            aux.add(carrinho1);
            new telaPagamento().setVisible(true);
        }else{
        JOptionPane.showMessageDialog(null, "Adicione algum item ao carrinho!", "Error ao acessar o pagamento", JOptionPane.ERROR_MESSAGE);
        }
        carregarTabelaProdutos();

        //}

    }//GEN-LAST:event_btnConfirmarCompraActionPerformed

    private void btnVerCarrinhosAntigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCarrinhosAntigosActionPerformed
        // TODO add your handling code here:
        //new carrinhosAntigos().setVisible(true);
        carregarTabelaProdutos();
        if(user.equals("cliente")){
            carregarTabelaCliente();
        }
        if(user.equals("funcionario")){
            carregarTabelaFuncionarioPedidos();
        }
        if(user.equals("gerente")){
            carregarTabelaGerentePedidos();
        }
        jPanel4.setVisible(true);
    }//GEN-LAST:event_btnVerCarrinhosAntigosActionPerformed

    private void btnEsvaziarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsvaziarCarrinhoActionPerformed
    // Get the total number of rows in the table
    int rowCount = tblProdutos.getRowCount();

    for (int row = 0; row < rowCount; row++) {  // Loop until rowCount - 1
        // Get the name of the product from the current row
        Object produtoPesquisado = tblProdutos.getValueAt(row, 0);
        String inputBusca = String.valueOf(produtoPesquisado);

        // Get the quantity of the product from the current row
        Object quantPesquisado = tblProdutos.getValueAt(row, 3);
        
        if (quantPesquisado == null) {
            continue; // Skip this row if quantity is null
        }

        String quantBuscastr = String.valueOf(quantPesquisado);
        int quantBusca = Integer.parseInt(quantBuscastr);

        // Find the corresponding item in stock and update the quantity
        for (Produto itemEstoque : estoque) {
            if (itemEstoque.getTitulo().equals(inputBusca)) {
                itemEstoque.setQuantidadeEstoque(itemEstoque.getQuantidadeEstoque() + quantBusca);
            }
        }
    }

    // Clear the list of products
    listaProdutos.clear();

    // Reload the product table
    carregarTabelaProdutos();
    }//GEN-LAST:event_btnEsvaziarCarrinhoActionPerformed

    private void btnRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverItemActionPerformed
        // TODO add your handling code here:
        int row = tblProdutos.getSelectedRow();
        
        //pega o nome do produto 
        Object produtoPesquisado = tblProdutos.getValueAt(row,0);
        String inputBusca = String.valueOf(produtoPesquisado);
        //pega a quantidade do produto
        Object quantPesquisado = tblProdutos.getValueAt(row,3);
        String quantBuscastr = String.valueOf(quantPesquisado);
        int quantBusca = Integer.parseInt(quantBuscastr);
        
        for(Produto itemEstoque : estoque){
            if(itemEstoque.getTitulo().equals(inputBusca)){
            Produto item = itemEstoque;
            item.setQuantidadeEstoque(item.getQuantidadeEstoque()+quantBusca);
            }
        }
        listaProdutos.remove(row);
        //listaProdutos.clear();
        carregarTabelaProdutos();
    }//GEN-LAST:event_btnRemoverItemActionPerformed

    private void btnRemoverItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverItemMouseClicked
        // TODO add your handling code here:
        int indiceItem = tblProdutos.getSelectedColumn();
        if (indiceItem>=0 && indiceItem<listaProdutos.size()){
            
            listaProdutos.remove(indiceItem);  
            
        }
    carregarTabelaProdutos();
        
    }//GEN-LAST:event_btnRemoverItemMouseClicked

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        // TODO add your handling code here:
        btnRemoverItem.setEnabled(true);
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel4.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        // TODO add your handling code here:
        //enableCarrinhoFields();
                int row = tblCliente.getSelectedRow();
        int column = tblCliente.getSelectedColumn();
        Object carrinhoPesquisado = tblCliente.getValueAt(row,0);
        String inputBuscaString = String.valueOf(carrinhoPesquisado);
        int inputBuscaInt = Integer.parseInt(inputBuscaString);
        System.out.println("item encontrado pela busca foi:"+inputBuscaString);
        System.out.println("O tipo de usuário é:"+user);
        String selected="";
        if(user.equals("cliente")){
        for(Carrinho itemCarrinho : cliente.getListaCarrinho()){
            if(itemCarrinho.getNumCarrinho()==(inputBuscaInt)){
            Carrinho carrinho = itemCarrinho;
            txtNumCarrinho.setText(String.valueOf(carrinho.getNumCarrinho()));
            txtData.setText(String.valueOf(carrinho.getData()));
            txtTotal.setText(String.valueOf(carrinho.getTotal()));
            txtProdutos.setText(carrinho.mostrarProdutos());
            
            }
        }
        }
        if(user.equals("funcionario")){
                    for(Carrinho itemCarrinho : funcionario.getListaCarrinhoFuncionario()){
            if(itemCarrinho.getNumCarrinho()==(inputBuscaInt)){
            Carrinho carrinho = itemCarrinho;
            txtNumCarrinho.setText(String.valueOf(carrinho.getNumCarrinho()));
            txtData.setText(String.valueOf(carrinho.getData()));
            txtTotal.setText(String.valueOf(carrinho.getTotal()));
            txtProdutos.setText(carrinho.mostrarProdutos());
            
            }
        }
        }if(user.equals("gerente")){
            System.out.println("Entrou na função de gerente");
            System.out.println("Tamanho da lista de gerente é:"+gerente.getListaCarrinhoGerente().size());
            for(Carrinho itemCarrinho : gerente.getListaCarrinhoGerente()){
                System.out.println("Iniciou o for loop");
            if(itemCarrinho.getNumCarrinho()==(inputBuscaInt)){
                System.out.println("Encontrou o carrinho");
            Carrinho carrinho = itemCarrinho;
                System.out.println("Definiu a cópia");
            txtNumCarrinho.setText(String.valueOf(carrinho.getNumCarrinho()));
                System.out.println("Começou a definir os parametros de texto");
            txtData.setText(String.valueOf(carrinho.getData()));
            txtTotal.setText(String.valueOf(carrinho.getTotal()));
            txtProdutos.setText(carrinho.mostrarProdutos());
            
            }
        }
        }
    }//GEN-LAST:event_tblClienteMouseClicked

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
            java.util.logging.Logger.getLogger(verCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verCarrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarCompra;
    private javax.swing.JButton btnEsvaziarCarrinho;
    private javax.swing.JButton btnRemoverItem;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVerCarrinhosAntigos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCarrinhosAnteriores;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNumCarrinho;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblProdutosCarrinho;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVisualizarCarrinho;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNumCarrinho;
    private javax.swing.JTextArea txtProdutos;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
