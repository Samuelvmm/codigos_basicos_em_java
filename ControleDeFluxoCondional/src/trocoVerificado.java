import java.util.Locale;
import java.util.Scanner;

public class trocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double precoUnitario, dinheiroRecebido, valorDaCompra, troco;
        int quantidadeComprada;

        System.out.print("Preco unitario do produto: ");
        precoUnitario = sc.nextDouble();

        System.out.print("quantidade comorada: ");
        quantidadeComprada = sc.nextInt();

        System.out.print("Dinheiro que o cliente te passou: ");
        dinheiroRecebido = sc.nextDouble();

        valorDaCompra = precoUnitario * quantidadeComprada;

        if (dinheiroRecebido < valorDaCompra) {
            troco = valorDaCompra - dinheiroRecebido;
            System.out.println("Dinheiro insuficiente para efetuar sua compra. Faltam " + String.format("%.2f", troco) + " reais." );
        }
        else {
            troco = dinheiroRecebido - valorDaCompra;
            System.out.println("Troco = " + String.format("%.2f", troco) + " reais." );
        }
        sc.close();
    }
}
