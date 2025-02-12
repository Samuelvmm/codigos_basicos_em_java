import java.util.Scanner;
import java.util.Locale;

public class folhaDePagamento {
        public static void main (String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner (System.in);

            String nome;
            double valorHora, salario;
            int horaTrabalhada;

            System.out.print("Qual o nome do funcionário? ");
            nome = sc.nextLine();

            System.out.print("Quanto ele recebe por hora trabalhada? ");
            valorHora = sc.nextDouble();

            System.out.print("Quantas horas ele trablhou no mês? ");
            horaTrabalhada = sc.nextInt();

            salario = valorHora * horaTrabalhada;
            System.out.print("O salario do " + nome + " deve ser " + salario);

            sc.close();

        }
}