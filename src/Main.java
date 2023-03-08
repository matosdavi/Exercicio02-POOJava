import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean repeticao = false;

        do {

            Scanner entrada = new Scanner(System.in);

            imprime("===CADASTRAR FUNCIONÁRIOS===\n\n");

            imprime("Escolha qual tipo de Funcionário quer cadastrar:\n1) Gerente\n2) Administrativo\n3)Estagiário\n");
            int escolha = Integer.parseInt(entrada.nextLine());

            if (escolha == 1) {
                Gerente gerente = new Gerente();

                gerente.entradaDeDados();
                gerente.calcHorasExtra();
            } else if (escolha == 2) {
                Administrativo administrador = new Administrativo();

                administrador.entradaDeDados();
                administrador.calcSalario();
            } else if (escolha == 3) {
                Estagiario estagiario = new Estagiario();

                estagiario.entradaDeDados();
                estagiario.calcHoras();
            } else {
                imprime("Opção inválida. Por favor, esolha um número de 1 a 3.");
            }

            imprime("\n\nDeseja realizar outro cadastro?\nS - Sim\nN - Não\n");
            String resposta = entrada.nextLine();
            if (resposta.equalsIgnoreCase("s")){
                repeticao = true;
            } else if (resposta.equalsIgnoreCase("n")){
                repeticao = false;
            } else {
                System.out.println("Opção inválida. Fim da execução.");
            }

        } while (repeticao);
        imprime("Fim da execução.");

    }
    public static void imprime(String msg) {

        System.out.print(msg);
    }
}

//Mostrar na tela todos os dados inseridos e calculados. Criar, além do menu principal, a opção do usuário SAIR