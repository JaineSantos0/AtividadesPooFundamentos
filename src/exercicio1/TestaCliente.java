package exercicio1;

public class TestaCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana", "(12)991567799", "345.789.333-65",
                "ana@gmail.com", "R das Carmálias 55 Flores");

        Cliente cliente2 = new Cliente("Oscar", "(11)992766654", "567.896.444-32",
                "oscar@gmail.com", "R Padre Antônio Feijó 3 Jardim Satélite");

        cliente1.visualizar();
        cliente2.visualizar();
    }
}