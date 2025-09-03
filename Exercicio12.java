import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[10];
        int[] v2 = new int[10];

        System.out.println("Digite 10 números do vetor 1:");
        for (int i = 0; i < 10; i++) v1[i] = sc.nextInt();
        System.out.println("Digite 10 números do vetor 2:");
        for (int i = 0; i < 10; i++) v2[i] = sc.nextInt();

        System.out.println("Números não comuns:");
        for (int i = 0; i < 10; i++) {
            boolean comum = false;
            for (int j = 0; j < 10; j++) {
                if (v1[i] == v2[j]) comum = true;
            }
            if (!comum) System.out.print(v1[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            boolean comum = false;
            for (int j = 0; j < 10; j++) {
                if (v2[i] == v1[j]) comum = true;
            }
            if (!comum) System.out.print(v2[i] + " ");
        }
        sc.close();
    }
}
