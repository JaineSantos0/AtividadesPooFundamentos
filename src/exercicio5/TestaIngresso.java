package exercicio5;

import java.time.LocalTime;
import java.util.Locale;

public class TestaIngresso {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Ingresso ingresso1 = new Ingresso("345687", "O Gato De Botas",
                LocalTime.of(8,20,0),6,29.90);

        Ingresso ingresso2 = new Ingresso("678954", "Dr. Estranho no Multiuniverso da Loucura",
                LocalTime.of(7,30,0),5,29.90);
    }
}