/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import static classes.Estoque.estoque;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuri
 */
public class Cliente extends Usuario implements OperadorSistema{
    //A classe de cliente herda de funcionário
    
    //Declaração de atributos privados para o cliente
    private String endereco;
    private String dataNascimento;
    private String celular;
    private String idCliente;
    public static ArrayList<Cliente> listaClientes = new ArrayList();
    public ArrayList<Carrinho> listaCarrinho = new ArrayList();

    //Esse index serve para que a lista de clientes seja acessada na hora do login e o cliente certo seja buscado
    //MUITO IMPORTANTE.
    public static  int index_cliente;
    
    
    //Construtor de Cliente com TODOS OS ATRIBUTOS(Atributos de usuário + atributos de cliente)
        public Cliente(String nome, String CPF, String email, String senha,String endereco, String dataNascimento, String celular) {
        super(nome, CPF, email, senha);
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.idCliente = String.valueOf(listaClientes.size());
    }

    public Cliente(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
        this.idCliente = "0";
    }
    //Método de login que é implementado pelo OperadorSistema
        @Override
    public boolean login(String email, String senha) {
        for(Cliente pessoa : listaClientes){
            if(email.equals(pessoa.email) && senha.equals(pessoa.senha)){
            return true;
        }
        }
        return false;
                
    }
    //Método de logout que é implementado pelo OperadorSistema
    @Override
    public boolean logout() {
        return logado=false;
    }
    //Método de pesquisar que é implementado pelo OperadorSistema.
    @Override
    public void pesquisar(String titulo) {
        for(Produto produto:estoque){
            if(produto.getTitulo().equals(titulo)){
                System.out.println("Produto Encontrado");
            }
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //Serve para retornar o email do cliente
    @Override
    public String consultarEmail(String cpf,String nome) {
        boolean found = false;
        for(Cliente cli:listaClientes){
            if(cli.getCPF().equals(cpf) && cli.getNome().equals(nome)){
                found = true;
                return this.getEmail();
            }
        }
        if(!found){
            JOptionPane.showMessageDialog(null, "Email não encontrado como cliente no sistema!", "Busca por email", JOptionPane.ERROR_MESSAGE);
            return "Email não encontrado";
        }else{
            JOptionPane.showMessageDialog(null, "Email encontrado com sucesso!", "Busca por email", JOptionPane.INFORMATION_MESSAGE);
            return this.getEmail();
        }
}
    //Permite que o cliente redefina a sua senha
    @Override
    public void esqueciSenha(String email, String cpf, String novaSenha) {
        for(Cliente cliente : listaClientes){
            if((cliente.getCPF().equals(cpf))&&(cliente.getEmail().equals(email))){
                cliente.setSenha(novaSenha);
            }
        }
    }
        public void Comprar(String produto,int Quantidade){
        System.out.println("Item adicionado ao carrinho!");
    
}
        
    
        
    //Getters e Setters para os atributos de Cliente

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Cliente() {
    }

    public ArrayList getListaClientes() {
        return listaClientes;
    }
    
    
    


    public String getIdCliente() {
        return idCliente;
    }

    
    public static int getIndex_cliente() {
        return index_cliente;
    }
    
    

    public ArrayList<Carrinho> getListaCarrinho() {
        return listaCarrinho;
    }


    public void addCarrinhoLista(Carrinho carrinho){
        listaCarrinho.add(carrinho);
    }

    
    
    
    
}
