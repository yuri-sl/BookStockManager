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
//Classe de estoque que serve para armazernar todos os produtos em estoque
public class Estoque {
    public static ArrayList<Produto> estoque = new ArrayList();
    
    
    /**
     *
     * @param produto
     */
    //Adicionar produto ao estoque
    public void addEstoque(Produto produto){
        estoque.add(produto);
    }
    //Remover produto do estoque
    public void removeEstoque(Produto produto){
        estoque.remove(produto);
    }
    //Retornar o tamanho da lista de Estoque
    public int retornarTamanhoEstoque(){
        return estoque.size();
    }
    //Limpar totalmente o estoque
    public void limparEstoque(){
        estoque.clear();
    }
}
