package exercicio6;

import java.util.Locale;

public class TestaCurso {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas", "Tecnólogo", "2 anos e meio"
                ,"Apresentação da Grade Curricular", 5000.00);

        Curso curso2 = new Curso("Engenharia de Software","Bacharelado","5 anos"
                ,"Apresentação da Grade Curricular",90000.00);

        curso1.visualizar();
        curso2.visualizar();
    }
}