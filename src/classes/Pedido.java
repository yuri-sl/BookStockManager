package classes;


public class Pedido {
    private int codPedido;
    private int codRastreio;
    private Pagamento pagamento;

    public Pedido() {
    }
    
    

    public Pedido(int codPedido, int codRastreio) {
        this.codPedido = codPedido;
        this.codRastreio = codRastreio;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getCodRastreio() {
        return codRastreio;
    }

    public void setCodRastreio(int codRastreio) {
        this.codRastreio = codRastreio;
    }
    
}
