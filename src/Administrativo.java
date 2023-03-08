import java.util.Scanner;

public class Administrativo extends Funcionario {

    private double horasExtra;
    private double horasTrabalhadas;
    private double valorHora;
    private double salario;
    Scanner entrada = new Scanner(System.in);

    public void calcSalario() {

        imprime("Informe a quantidade de horas trabalhadas: ");
        horasTrabalhadas = entrada.nextDouble();

        imprime("Informe a quantidade de horas extras: ");
        horasExtra = entrada.nextDouble();

        imprime("Informe o valor recebido por hora: ");
        valorHora = entrada.nextDouble();

        salario = valorHora * (horasTrabalhadas + horasExtra);
        imprime("\nO salário do Administrador " + nome + " é: R$" + salario + ".");
    }
}

//O administrativo deve calcular o seu salário, com base em horas trabalhadas, horas extras e o valor da hora trabalhada.