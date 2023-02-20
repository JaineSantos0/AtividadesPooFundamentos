package exercicio3;

public class Produto {

    private String nome;
    private String categoria;
    private String codigoInterno;
    private Integer quantidade;
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, String categoria, String codigoInterno, Integer quantidade, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.codigoInterno = codigoInterno;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void visulizar(){
        System.out.println(nome + ", " + categoria + ", " + codigoInterno + ", " + quantidade + ", "
                + String.format("%.2f",preco));
    }
}