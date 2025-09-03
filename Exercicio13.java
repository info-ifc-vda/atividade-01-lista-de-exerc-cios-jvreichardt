import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[10];
        int[] v2 = new int[5];

        System.out.println("Digite 10 números do vetor 1:");
        for (int i = 0; i < 10; i++) v1[i] = sc.nextInt();
        System.out.println("Digite 5 números do vetor 2:");
        for (int i = 0; i < 5; i++) v2[i] = sc.nextInt();

        System.out.println("Primeiro vetor resultante:");
        for (int i = 0; i < 10; i++) {
            if (v1[i] % 2 == 0) {
                int soma = v1[i];
                for (int j = 0; j < 5; j++) soma += v2[j];
                System.out.print(soma + " ");
            }
        }
        System.out.println("\nSegundo vetor resultante:");
        for (int i = 0; i < 10; i++) {
            if (v1[i] % 2 != 0) {
                int qtdDiv = 0;
                for (int j = 0; j < 5; j++) {
                    if (v1[i] % v2[j] == 0) qtdDiv++;
                }
                System.out.print(qtdDiv + " ");
            }
        }
        sc.close();
    }
}

