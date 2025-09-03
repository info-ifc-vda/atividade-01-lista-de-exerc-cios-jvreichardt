import java.util.*;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        int inicio = Math.min(n1, n2);
        int fim = Math.max(n1, n2);
        for (int i = inicio; i <= fim; i++) {
            long fat = 1;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            System.out.println("Fatorial de " + i + " = " + fat);
        }
        sc.close();
    }
}

