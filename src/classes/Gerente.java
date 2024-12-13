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
public class Gerente extends Usuario implements OperadorSistema{
    //Classe Gerente herda de Usuário
    private String cadastroGerente;
        private ArrayList<Carrinho> listaCarrinhoGerente = new ArrayList();


    //Construtor para Gerente, com os atributos de Usuário
    public Gerente(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
        this.cadastroGerente = "0";
    }
    //construtor para Gerente, sem atributos
    public Gerente() {
    }
    

    //Construtor para Gernete com os atributos de usuário + gerente
    public Gerente(String nome, String CPF, String email, String senha, String cadastroGerente ) {
        super(nome, CPF, email, senha);
        this.cadastroGerente = cadastroGerente;
    }

    //metodo de login herdado da interface OperadorSistema
    @Override
    public boolean login(String email, String senha) {
        if(super.email.equals(email) && super.senha.equals(senha)){
            return true;
        }
        return false;
        
    }
    // adicionar o carrinhos de compra do gerente
    public void addListaCarrinhosGerente(Carrinho carrinho2) {
        listaCarrinhoGerente.add(carrinho2);        
    }
    
    //metodo de logout, herdado da interface OperadorSistema
    @Override
    public boolean logout() {
        return logado = false;
    }
    
    //metodo de pesquisar, herdado da interface OperadorSistema
    @Override
    public void pesquisar(String titulo) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //metodo de consultar e-mail, herdado da interface OperadorSistema
    @Override
    public String consultarEmail(String cpf,String nome) {
        return"admin@gmail.com";
    }
    
    //metodo de esqueci a senha, herdado da interface OperadorSistema
    @Override
    public void esqueciSenha(String email, String cpf, String novaSenha) {
            if((this.getCPF().equals(cpf))&&(this.getEmail().equals(email))){
                this.setSenha(novaSenha);
            }
        }    
    
    //pega o carrinho de compras do usuário: gerente
    public ArrayList<Carrinho> getListaCarrinhoGerente() {
        return listaCarrinhoGerente;
    }
    
    //cria o carrinho de compras do usuário: gerente
    public void setListaCarrinhoGerente(ArrayList<Carrinho> listaCarrinhoGerente) {
        this.listaCarrinhoGerente = listaCarrinhoGerente;
    }
    
    //pega o cadastro do usuário: Gerente
    public String getCadastroGerente() {
        return cadastroGerente;
    }

    //cria o cadastro do usuário: Gerente
    public void setCadastroGerente(String cadastroGerente) {
        this.cadastroGerente = cadastroGerente;
    }
    }