import java.util.Locale;
import java.util.Scanner;


public class Operadora {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int quantidadeMinuturos,minutosexcedido;
        double valorPagar;

        System.out.print("Digite a quantidade de minutos: ");
        quantidadeMinuturos = sc.nextInt();

        if (quantidadeMinuturos >= 100) {
            minutosexcedido = quantidadeMinuturos - 100;
            valorPagar = 50 + (minutosexcedido * 2);
        }
        else 
            valorPagar = 50;
        
        
        System.out.println("Valor a pagar : R$" + String.format("%.2f", valorPagar));

        sc.close();
    }
}
