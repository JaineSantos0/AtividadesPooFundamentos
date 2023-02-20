package exercicio2;

import java.util.Locale;

public class TestaFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Funcionario funcionario1 = new Funcionario("Ana","78690",
                "Desenvolvedora FullStack Junior",4500.00,44);

        Funcionario funcionario2 = new Funcionario("Oscar","78432",
                "Desenvolvedor FullStack Pleno",8000.00,44);

        funcionario1.visulizar();
        funcionario2.visulizar();
    }
}