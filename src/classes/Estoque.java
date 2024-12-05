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
public class Estoque {
    public static ArrayList<Produto> estoque = new ArrayList();
    
    
    /**
     *
     * @param produto
     */
    public void addEstoque(Produto produto){
        estoque.add(produto);
    }
    
    public void removeEstoque(Produto produto){
        estoque.remove(produto);
    }
    public int retornarTamanhoEstoque(){
        return estoque.size();
    }
}
