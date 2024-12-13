package classes;

import java.util.Date;
import java.util.List;

//classe de finalização do pagamento
public class Pagamento extends Carrinho{
    private String formaPagamento;
    private String senha;
    private Pedido pedido = new Pedido();

    //construtor do pagamento sem argumentos
    public Pagamento() {
        this.formaPagamento="nada";
    }
    
    
    //construtor do pagamento com entradas
    public Pagamento(String formaPagamento, String senha, int numCarrinho, Date data, double total, List<String> produtos) {
        //super(numCarrinho, data, total, produtos);
        this.formaPagamento = formaPagamento;
        this.senha = senha;
    }
    
    //método para alterar a forma de pagamento
    public void MudarFormaDePagamento(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    
    //método para efetuar o pagamento
    public boolean Pagar(String senha){
        if(senha == this.senha){
            System.out.println("Pagamento aprovado");
            return true;
        }else{
            System.out.println("");
            return false;
        }
    }
    
    // método para pegar o pedido
    public Pedido getPedido() {
        return pedido;
    }
    
    //método para pegar a forma de pagamento
    public String getFormaPagamento() {
        return formaPagamento;
    }
    
    //método para setar a forma de pagamento
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    //método para pegar a senha
    public String getSenha() {
        return senha;
    }
    
    //método para setar uma nova senha
    public void setSenha(String senha) {
        this.senha = senha;
    }
 
}