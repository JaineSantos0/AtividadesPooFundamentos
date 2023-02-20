package exercicio3;

import java.util.Locale;

public class TestaGame {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Produto produto1 = new Produto("Cadeira Gamer", "Escritório",
                "545", 30, 7000.00);

        Produto produto2 = new Produto("HeadSet Gamer", "Perifericos",
                "77890", 50, 500.00);

        produto1.visulizar();
        produto2.visulizar();
    }
}