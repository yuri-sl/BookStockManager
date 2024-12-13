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
//Definição da classe abstrata Usuário
public abstract class Usuario implements OperadorSistema{
    
    //Definição de atributos protegidos para a classe abstrata usuário
    protected String nome;
    protected String CPF;
    protected String email;
    protected String senha;
    static ArrayList<Cliente> listaClientes = new ArrayList(); // Definição de um ArrayList para Clientes
    public ArrayList<Carrinho> listaCarrinho = new ArrayList(); // Definição de um ArrayLista para os carrinhos do usuário
    private Carrinho carrinho;
    public static boolean logado = false;
    public static String user ="anonimo"; // seta o usuário padrão como anônimo
    
    
    //método construtor do usuário sem argumentos de entrada (não usado na versão final)
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
    
    //método toString sobrescrito da versão herdada
    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", CPF=" + CPF + ", email=" + email + ", senha=" + senha + '}';
    }
    
    //método para a redefinição da senha
    public void esqueciSenha(String CPF,String senhanova){
        //verifica se o cpf está correto
        if (CPF.equals(this.CPF)){
            this.senha = senhanova;
            System.out.println("Senha atualizada com sucesso!");
        }
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
    
    //método para pegar a lista de carrinhos do cliente
    public ArrayList<Carrinho> getListaCarrinho() {
        return listaCarrinho;
    }
    
}