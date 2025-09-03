import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double compra = sc.nextDouble();
        System.out.print("Digite o valor pago: ");
        double pago = sc.nextDouble();
        int troco = (int)(pago - compra);
        System.out.println("Troco: R$ " + troco);

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        for (int c : cedulas) {
            int qtd = troco / c;
            if (qtd > 0) {
                System.out.println(qtd + " nota(s) de R$" + c);
                troco %= c;
            }
        }
        sc.close();
    }
}


