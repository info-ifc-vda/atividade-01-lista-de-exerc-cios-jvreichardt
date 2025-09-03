import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angulos = new int[3];
        int[] lados = new int[3];

        System.out.println("Digite os 3 ângulos do triângulo:");
        for (int i = 0; i < 3; i++) {
            angulos[i] = sc.nextInt();
        }

        System.out.println("Digite os 3 lados do triângulo:");
        for (int i = 0; i < 3; i++) {
            lados[i] = sc.nextInt();
        }

        // Classificação por ângulos
        if (angulos[0] == 90 || angulos[1] == 90 || angulos[2] == 90) {
            System.out.println("Triângulo Retângulo");
        } else if (angulos[0] > 90 || angulos[1] > 90 || angulos[2] > 90) {
            System.out.println("Triângulo Obtusângulo");
        } else {
            System.out.println("Triângulo Acutângulo");
        }

        // Classificação por lados
        if (lados[0] == lados[1] && lados[1] == lados[2]) {
            System.out.println("Equilátero");
        } else if (lados[0] != lados[1] && lados[1] != lados[2] && lados[0] != lados[2]) {
            System.out.println("Escaleno");
        } else {
            System.out.println("Isósceles");
        }

        sc.close();
    }
}
