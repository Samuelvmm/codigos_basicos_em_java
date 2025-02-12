import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int quantidade;
        double preco, dinheiroRecebido, troco;

        System.out.print("Preço unitario do produto: ");
        preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        System.out.print("Qual foi o valor recebido do cliente? ");
        dinheiroRecebido = sc.nextDouble();

        troco = (quantidade * preco) - dinheiroRecebido;
        System.out.print("Troco = " + troco); 

        sc.close();
    }
}
