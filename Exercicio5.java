import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalJogadores = 5 * 11;
        int jogadoresMenores18 = 0;
        double somaAlturas = 0;
        int jogadoresMais80kg = 0;

        for (int time = 1; time <= 5; time++) {
            int somaIdades = 0;
            System.out.println("Time " + time);
            for (int jogador = 1; jogador <= 11; jogador++) {
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                System.out.print("Peso: ");
                double peso = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();

                somaIdades += idade;
                somaAlturas += altura;

                if (idade < 18) jogadoresMenores18++;
                if (peso > 80) jogadoresMais80kg++;
            }
            double mediaIdades = somaIdades / 11.0;
            System.out.println("Média de idades do time " + time + ": " + mediaIdades);
        }
        double mediaAlturas = somaAlturas / totalJogadores;
        double porcentagemMais80kg = (jogadoresMais80kg * 100.0) / totalJogadores;
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + jogadoresMenores18);
        System.out.println("Média de altura do campeonato: " + mediaAlturas);
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemMais80kg + "%");
        sc.close();
    }
}
