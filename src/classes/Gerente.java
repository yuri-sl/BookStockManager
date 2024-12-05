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

    //Construtor para Gernete com os atributos de usuário + gerente
    public Gerente(String nome, String CPF, String email, String senha, String cadastroGerente ) {
        super(nome, CPF, email, senha);
        this.cadastroGerente = cadastroGerente;
    }

    public String getCadastroGerente() {
        return cadastroGerente;
    }

    public void setCadastroGerente(String cadastroGerente) {
        this.cadastroGerente = cadastroGerente;
    }

    @Override
    public boolean login(String email, String senha) {
        if(super.email.equals(email) && super.senha.equals(senha)){
            return true;
        }
        return false;
        
    }

    @Override
    public boolean logout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pesquisar(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultarEmail(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void addListaCarrinhosGerente(Carrinho carrinho2) {
        listaCarrinhoGerente.add(carrinho2);    
    }

    public ArrayList<Carrinho> getListaCarrinhoGerente() {
        return listaCarrinhoGerente;
    }

    public void setListaCarrinhoGerente(ArrayList<Carrinho> listaCarrinhoGerente) {
        this.listaCarrinhoGerente = listaCarrinhoGerente;
    }
        
    
}
