package classes;

//classe do produto
public class Produto {
    private String titulo;
    private double preço;
    private int quantidadeEstoque;
    private String codigoDoProduto;
    private String descrição;
    private String genero;
    private String autor;
    private int quantidadeComprada;

    //método construtor do produto passando todos os argumentos mínimos necessários
    public Produto(String titulo,String autor,String genero, double preço, int quantidadeEstoque, String codigoDoProduto, String descrição){
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.preço = preço;
    this.quantidadeEstoque = quantidadeEstoque;
    this.codigoDoProduto = codigoDoProduto;
    this.descrição = descrição;
    }
    
    //método equivalente ao ToString dos produtos
    public void MostraDados(){
        System.out.println(titulo);
        System.out.println(preço);
        System.out.println(quantidadeEstoque);
        System.out.println(codigoDoProduto);
        System.out.println(descrição);
    }

    //método para pegar o título do produto
    public String getTitulo() {
        return titulo;
    }

    //método para setar o título do produto
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //método para pegar o preço do produto
    public double getPreço() {
        return preço;
    }

    //método para setar o preço do produto
    public void setPreço(double preço) {
        this.preço = preço;
    }

    //método para pegar a quantidade do produto em estoque
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    //método para setar a quantidade do produto
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //método para pegar o código do produto
    public String getCodigoDoProduto() {
        return codigoDoProduto;
    }

    //método para setar o código do produto
    public void setCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }
    
    //método para pegar a descrição do produto
    public String getDescrição() {
        return descrição;
    }

    //método para setar a descrição do produto
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
    //método para pegar o gênero do produto
    public String getGenero() {
        return genero;
    }

    //método para setar o gênero do produto
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //método para pegar o nome do autor do produto
    public String getAutor() {
        return autor;
    }

    //método para setar o nome do autor do produto
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //método para pegar a quantidade comprada do produto
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    //método para setar a quantidade comprada de: produto
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
}