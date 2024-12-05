package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Carrinho {
    //Declaração de atributos  protegidos do carrinho
    protected int numCarrinho;
    protected String data;
    protected double total;
    public static ArrayList<Produto> listaProdutos = new ArrayList();
    private String idCliente;
    public  ArrayList<Produto> itensNoCarrinho = new ArrayList();


    //Construtor de carrinho. Um vazio e outro com os atributos dados
    public Carrinho() {
    }

    public Carrinho(int numCarrinho, String data) {
        this.numCarrinho = numCarrinho;
        this.data = data;
    }
    
    
    //Esse construtor já calcula o saldo
    public Carrinho(int numCarrinho, String data,ArrayList<Produto> itensNoCarrinho) {
    this.numCarrinho = numCarrinho;
    this.data = data;
    this.itensNoCarrinho = itensNoCarrinho;
    this.total = 0;
    double saldo = 0;
        for(Produto item : itensNoCarrinho){
        saldo += item.getPreço()*item.getQuantidadeComprada();
            
        }
            this.total=saldo;
    }
    
    public void verificarCarrinho(Cliente cliente){
        if(cliente.getIdCliente().equals(this.getidCliente())){
            cliente.getListaCarrinho();
        }
        
    }
    //Método separado para contar o saldo do carrinho
    public void contarSaldo(){
        double saldo = 0;
        for(Produto item : itensNoCarrinho){
        saldo += item.getPreço()*item.getQuantidadeComprada();   
        }
        this.total=saldo;                
    }
    //Método de adicionar item ao carrinho
        public void addItem(Produto item){
        itensNoCarrinho.add(item);
        
    }
    //Método de remover produto do carrinho
     public void removeProduto(int i){
         itensNoCarrinho.remove(i);
     }
     public void clearLista(){
         listaProdutos.clear();
     }
     
     public String mostarProdutos(ArrayList<Produto> itensNoCarrinho){
         String resumo="";
         for(Produto item: itensNoCarrinho){
             resumo = resumo + " "+item.getTitulo()+"*"+item.getQuantidadeComprada();
             
         }
         return resumo;
         
         
     }
     public String mostrarProdutos(){
         String resumo="";
         for(Produto item: this.itensNoCarrinho){
             resumo = resumo+" "+item.getTitulo()+"*"+item.getQuantidadeComprada()+",";
         }
         return resumo;
     }
        
        
    //Métodos getters e setters para cada um dos atributos
    public int getNumCarrinho() {
        return numCarrinho;
    }

    public void setNumCarrinho(int numCarrinho) {
        this.numCarrinho = numCarrinho;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getidCliente() {
        return idCliente;
    }

    public void setIdCarrinho(String idCarrinho) {
        this.idCliente = idCliente;
    }

    public ArrayList<Produto> getItensNoCarrinho() {
        return itensNoCarrinho;
    }

    public void setItensNoCarrinho(ArrayList<Produto> itensNoCarrinho) {
        this.itensNoCarrinho = itensNoCarrinho;
    }


}
