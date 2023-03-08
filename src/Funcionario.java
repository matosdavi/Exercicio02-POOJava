import java.util.Scanner;

public abstract class Funcionario {

    protected String nome;
    protected int idade;
    protected String bairro;
    Scanner entrada = new Scanner(System.in);

    public static void imprime(String msg) {

        System.out.print(msg);
    }
        public void entradaDeDados() {

        imprime("Informe o nome do funcionário: ");
        nome = entrada.nextLine();

        imprime("Informe a idade do funcionário: ");
        idade = Integer.parseInt(entrada.nextLine());

        imprime("Informe o bairro do funcionário: ");
        bairro = entrada.nextLine();
    }
}