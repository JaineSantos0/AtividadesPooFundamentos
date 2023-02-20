package exercicio6;

public class Curso {

    private String nome;
    private String tipo;
    private String duracao;
    private String gradeCurricular;
    private Double preco;

    public Curso() {
    }

    public Curso(String nome, String tipo, String duracao, String gradeCurricular, Double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.duracao = duracao;
        this.gradeCurricular = gradeCurricular;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGradeCurricular() {
        return gradeCurricular;
    }

    public void setGradeCurricular(String gradeCurricular) {
        this.gradeCurricular = gradeCurricular;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void visualizar() {
        System.out.println(nome + ", " + tipo + ", " + duracao + ", " + gradeCurricular
                + ", " + String.format("%.2f",preco));
    }
}