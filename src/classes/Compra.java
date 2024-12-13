package classes;
//Classe compra que é uma associação terciária entre Usuário, Carrinho e Produto
public class Compra {
    //Relaciona um usuário
    private Usuario usuario;
    //Um carrinho
    private Carrinho carrinho;
    //E  vários produtos
    private Produto[] produto;
}
