import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] contas = new int[10];
        double[] saldos = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta: ");
            contas[i] = sc.nextInt();
            System.out.print("Digite o saldo: ");
            saldos[i] = sc.nextDouble();
        }
        int opcao;
        do {
            System.out.println("\n1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar ativo bancário");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Código da conta: ");
                int cod = sc.nextInt();
                System.out.print("Valor: ");
                double val = sc.nextDouble();
                for (int i = 0; i < 10; i++) {
                    if (contas[i] == cod) saldos[i] += val;
                }
            } else if (opcao == 2) {
                System.out.print("Código da conta: ");
                int cod = sc.nextInt();
                System.out.print("Valor: ");
                double val = sc.nextDouble();
                for (int i = 0; i < 10; i++) {
                    if (contas[i] == cod && saldos[i] >= val) {
                        saldos[i] -= val;
                    }
                }
            } else if (opcao == 3) {
                double soma = 0;
                for (int i = 0; i < 10; i++) soma += saldos[i];
                System.out.println("Ativo bancário: R$ " + soma);
            }
        } while (opcao != 4);
        sc.close();
    }
}


