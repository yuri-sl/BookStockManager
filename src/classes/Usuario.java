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
public abstract class Usuario {
    //Definição da classe abstrata Usuário
    
    //Definição de atributos protegidos para a classe abstrata usuário
    protected String nome;
    protected String CPF;
    protected String email;
    protected String senha;
    static ArrayList<Cliente> listaClientes = new ArrayList(); // Definição de um ArrayList para Clientes
    public static ArrayList<Carrinho> historicoCarrinhos = new ArrayList();
    public ArrayList<Carrinho> listaCarrinho = new ArrayList();
    private Carrinho carrinho;
    public static boolean usuario_logado = false;
    public static String usuario_tipo ="";
    
    

    
    public Usuario(){
        this.listaClientes = new ArrayList();
        
    }
    //Definição de construtor para Usuário
    public Usuario(String nome,String CPF,String email,String senha){
        this.listaClientes = new ArrayList();
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
    }
    
    //Definição de Getters e Setters para o Usuário, com seus respectivos atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 
    
    public String Consultar(String titulo){
        return titulo;
    }

    //Override com o toString
    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", CPF=" + CPF + ", email=" + email + ", senha=" + senha + '}';
    }
    
    public void esqueciSenha(String CPF,String senhanova){
        if (CPF.equals(this.CPF)){
            this.senha = senhanova;
            System.out.println("Senha atualizada com sucesso!");
            
        }
    }

    public ArrayList<Carrinho> getListaCarrinho() {
        return listaCarrinho;
    }
    
    
}
