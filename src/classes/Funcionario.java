/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import static classes.Cliente.listaClientes;
import static classes.Estoque.estoque;
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

    //Construtor vazio de funcionário
    public Funcionario() {
    }

    
    
    //Construtor de Funcionário com vários atributos
    public Funcionario(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
        this.cadastroFuncionario= String.valueOf(listaFuncionarios.size());
        //this.cadastroFuncionario=String.valueOf(listaFuncionarios.size());
    }

    //Construtor de Funcionários com os atributos de Funcionário
    public Funcionario(String nome, String CPF, String email, String senha,String cadastroFuncionario) {
        super(nome, CPF, email, senha);
        this.cadastroFuncionario = cadastroFuncionario;
    }

    //Método toString que retorna o funcionário com seu cadastro
    @Override
    public String toString() {
        return "Funcionario{" + "cadastroFuncionario=" + cadastroFuncionario + '}';
    }
    //Método de login que é implementado pela interface
    @Override
    public boolean login(String email, String senha) {
        for(Funcionario func: listaFuncionarios){
            if(email.equals(func.getEmail()) && senha.equals(func.getSenha())){
                return true;
            }
        }return false;
    }
    //Método de logout
    @Override
    public boolean logout() {
        return logado=false;
    }

    //Pesquisar por um produto em específico
    @Override
    public void pesquisar(String titulo) {
        for(Produto produto:estoque){
            if(produto.getTitulo().equals(titulo)){
                System.out.println("Produto Encontrado");
            }
        }     
    }

    //Consulta por emails
    @Override
    public String consultarEmail(String cpf,String nome) {
        boolean encontrado = false;
        for(Funcionario func: listaFuncionarios){
            if(func.getCPF().equals(cpf)&&(func.getNome().equals(nome))){
                encontrado = true;
                return func.getEmail();
            }
        }if(!encontrado){
            return "Email não encontrado";
        }else{
            return this.getEmail();
        }
    }
    //Método de esquecer a senha que permite o usuário redefinir a sua senha com uma nova
    @Override
    public void esqueciSenha(String email, String cpf, String novaSenha) {
        for(Funcionario func : listaFuncionarios){
            if((func.getCPF().equals(cpf))&&(func.getEmail().equals(email))){
                func.setSenha(novaSenha);
            }
        }
    }
    //Métodos Getters e Setters para listas de carrinhos
    public void addListaCarrinhosFuncionarios(Carrinho carrinho2) {
        listaCarrinhoFuncionario.add(carrinho2);        
    }

    public ArrayList<Carrinho> getListaCarrinhoFuncionario() {
        return listaCarrinhoFuncionario;
    }

    public void setListaCarrinhoFuncionario(ArrayList<Carrinho> listaCarrinhoFuncionario) {
        this.listaCarrinhoFuncionario = listaCarrinhoFuncionario;
    }

        public String getCadastroFuncionario() {
        return cadastroFuncionario;
    }

    public void setCadastroFuncionario(String cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }
    
    
    
}
