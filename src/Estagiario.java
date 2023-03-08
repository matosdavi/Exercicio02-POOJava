public class Estagiario extends Funcionario {

    private int horasSemanais;
    private int mesesEst;
    private int horasTotais;

    public void calcHoras() {

        imprime("Informe a quantidade de horas semanais no estágio: ");
        horasSemanais = entrada.nextInt();

        imprime("Informe quantos meses durou o estágio: ");
        mesesEst = entrada.nextInt();

        horasTotais = mesesEst * (horasSemanais * 4);

        imprime("\nO Estagiário " + nome + " atuou durante " + horasTotais + " horas.");
    }
}

//O estagiário entra com as horas de estágio na semana, quantos meses ele estagiou  e calcula-se quantas horas ele estagiou