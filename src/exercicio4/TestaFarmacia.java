package exercicio4;

import java.util.Locale;

public class TestaFarmacia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Farmacia farmacia1 = new Farmacia("Creme dental Sensodine", "Higiene bucal",
                "12345", 50, 12.90);

        Farmacia farmacia2 = new Farmacia("Ensure baunilha","nutricionais",
                "36789",25,59.90);

        farmacia1.visualizar();
        farmacia2.visualizar();
    }
}