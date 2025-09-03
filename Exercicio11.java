import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorLinhas = 0;
        
        while (true) {
            System.out.print("Digite um número (negativo ou 0 para parar): ");
            int n = sc.nextInt();

            if (n <= 0) break;

            if (contadorLinhas % 20 == 0) {
                System.out.println("Valor\tCubo\tRaiz");
            }
            int cubo = n * n * n;
            double raiz = Math.sqrt(n);
            System.out.println(n + "\t" + cubo + "\t" + raiz);
            contadorLinhas++;
        }
        sc.close();
    }
}
