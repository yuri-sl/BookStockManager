package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Carrinho {
    //Declaração de atributos  protegidos do carrinho
    protected int numCarrinho;
    protected String data;
    protected double total;
    //lista stática com a lista de produtos no carrinho
    public static ArrayList<Produto> listaProdutos = new ArrayList();
    //ArrayList de produtos que vai ser clonado da lista de Produtos. Ele serve para guardar os itens que foram comprados nesse carrinho na parte de carrinhos anteriores
    public  ArrayList<Produto> itensNoCarrinho = new ArrayList();
    private Pedido pedido = new Pedido();
    private Pagamento pagamento;


    //Construtor de carrinho. Um vazio e outro com os atributos dados
    public Carrinho() {
    }

    public Carrinho(int numCarrinho, String data) {
        this.numCarrinho = numCarrinho;
        this.data = data;
    }
    
    
    
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
    //Contabiliza o saldo total do carrinho com base nos produtos na lista
    public void contarSaldo(){
                double saldo = 0;
            for(Produto item : itensNoCarrinho){
            saldo += item.getPreço()*item.getQuantidadeComprada();
            
        }
            this.total=saldo;
                
            }
        public void addItem(Produto item){
        itensNoCarrinho.add(item);
        
    }
     public void removeItem(int i){
         itensNoCarrinho.remove(i);
     }
     public void clearLista(){
         listaProdutos.clear();
     }
     
     public String mostarProdutos(ArrayList<Produto> itensNoCarrinho){
        StringBuilder resumo = new StringBuilder();
        for (Produto item : itensNoCarrinho) {
            resumo.append(item.getTitulo()).append("*").append(item.getQuantidadeComprada()).append("\n");
        }
            return resumo.toString();
         
     }
        public String mostrarProdutos(){
        StringBuilder resumo = new StringBuilder();
        for (Produto item : this.itensNoCarrinho) {
            resumo.append(item.getTitulo()).append("*").append(item.getQuantidadeComprada()).append("\n");
        }
            return resumo.toString();
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


    public ArrayList<Produto> getItensNoCarrinho() {
        return itensNoCarrinho;
    }

    public void setItensNoCarrinho(ArrayList<Produto> itensNoCarrinho) {
        this.itensNoCarrinho = itensNoCarrinho;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }



}
