import java.util.Scanner;

public class Gerente extends Funcionario {

    private double horasTrabalhadas;
    private double horasExtra;
    private double horasSemanais = 44;
    Scanner entrada = new Scanner(System.in);

    public void calcHorasExtra() {
        imprime("Informe quantas horas o Gerente trabalhou durante a semana: ");
        horasTrabalhadas = entrada.nextDouble();

        horasExtra = horasTrabalhadas - horasSemanais;

        imprime("\nO Gerente " + nome + " trabalhou " + horasExtra + " horas a mais.");
    }
}

//O gerente deve, além de cadastrar os seus dados, calcular quantas horas a mais ele trabalhou na semana, considerando um valor de horas como entrada e a semana como 44 horas