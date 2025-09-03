import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdPrimos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            boolean primo = true;
            if (n <= 1) primo = false;
            else {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) qtdPrimos++;
        }
        System.out.println("Quantidade de números primos: " + qtdPrimos);

        sc.close();
    }
}
