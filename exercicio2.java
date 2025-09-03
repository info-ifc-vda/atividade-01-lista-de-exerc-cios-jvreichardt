import java.util.*;
public class exercicio2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o salario minimo? ");
        int salario_minimo = scanner.nextInt();
        System.out.println("Qual a quantidade de quilowatts consumida por sua residência?: ");
        int consumo = scanner.nextInt();
        scanner.close();

        float valor_quilowat = salario_minimo*0.01f;
        float valor_pago = (salario_minimo*0.01f)*consumo;

        System.out.println("Valor do quilowatt= "+valor_quilowat);
        System.out.println("Valor a ser pago pela residencia= "+valor_pago);

    }
}
