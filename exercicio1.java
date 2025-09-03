import java.util.*;

public class exercicio1 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas horas voce trabalha?");
        int horas = scanner.nextInt();
        System.out.println("Quanto ganha por hora?");
        int ganho = scanner.nextInt();
        scanner.close();

        float salario_bruto = horas*ganho;
        float imposto = salario_bruto *0.3f; 
        float salario = salario_bruto - imposto;

        System.out.println("Salario Líquido= "+salario);
    }
}
