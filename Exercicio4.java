import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double precoUnit = 0;
        if (codigo >= 1 && codigo <= 10) precoUnit = 10;
        else if (codigo >= 11 && codigo <= 20) precoUnit = 15;
        else if (codigo >= 21 && codigo <= 30) precoUnit = 20;
        else if (codigo >= 31 && codigo <= 40) precoUnit = 40;

        double precoTotal = precoUnit * quantidade;
        double desconto = 0;
        if (precoTotal <= 250) desconto = precoTotal * 0.05;
        else if (precoTotal <= 500) desconto = precoTotal * 0.10;
        else desconto = precoTotal * 0.15;

        double precoFinal = precoTotal - desconto;

        System.out.println("Preço unitário: R$ " + precoUnit);
        System.out.println("Preço total: R$ " + precoTotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço final: R$ " + precoFinal);

        sc.close();
    }
}
