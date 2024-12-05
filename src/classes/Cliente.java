/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

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
    
    
    
    public void Comprar(String produto,int Quantidade){
        System.out.println("Item adicionado ao carrinho!");
    
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

    @Override
    public boolean login(String email, String senha) {
        for(Cliente pessoa : listaClientes){
            if(email.equals(pessoa.email) && senha.equals(pessoa.senha)){
            return true;
        }
        }
        return false;
                
    }

    @Override
    public boolean logout() {
        return false;
    }

    @Override
    public void pesquisar(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultarEmail(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
