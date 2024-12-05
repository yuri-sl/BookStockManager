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
public class Funcionario extends Usuario implements OperadorSistema{
    private String cadastroFuncionario;
    public static  int index_func;
    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList();
    private ArrayList<Carrinho> listaCarrinhoFuncionario = new ArrayList();

    
    
    //Construtor de Funcionário
    public Funcionario(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
        this.cadastroFuncionario= "0";
        //this.cadastroFuncionario=String.valueOf(listaFuncionarios.size());
    }

    //Construtor de Funcionários com os atributos de Funcionário
    public Funcionario(String nome, String CPF, String email, String senha,String cadastroFuncionario) {
        super(nome, CPF, email, senha);
        this.cadastroFuncionario = cadastroFuncionario;
    }

    public String getCadastroFuncionario() {
        return cadastroFuncionario;
    }

    public void setCadastroFuncionario(String cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cadastroFuncionario=" + cadastroFuncionario + '}';
    }

    @Override
    public boolean login(String email, String senha) {
        for(Funcionario func: listaFuncionarios){
            if(email.equals(func.getEmail()) && senha.equals(func.getSenha())){
                return true;
            }
        }return false;
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

    public void addListaCarrinhosFuncionarios(Carrinho carrinho2) {
        listaCarrinhoFuncionario.add(carrinho2);        
    }

    public ArrayList<Carrinho> getListaCarrinhoFuncionario() {
        return listaCarrinhoFuncionario;
    }

    public void setListaCarrinhoFuncionario(ArrayList<Carrinho> listaCarrinhoFuncionario) {
        this.listaCarrinhoFuncionario = listaCarrinhoFuncionario;
    }
    
    
    
}
