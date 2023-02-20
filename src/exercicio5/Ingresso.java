package exercicio5;

import java.time.LocalTime;

public class Ingresso {

    private String numero;
    private String nomeDoFilme;
    private LocalTime horario;
    private Integer sala;
    private Double valor;

    public Ingresso() {
    }

    public Ingresso(String numero, String nomeDoFilme, LocalTime horario, Integer sala, Double valor) {
        this.numero = numero;
        this.nomeDoFilme = nomeDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void visualizar(){
        System.out.println(numero + ", " + nomeDoFilme + ", " + horario
                + ", " + sala + ", " + String.format("%.2f",valor));
    }
}