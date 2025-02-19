import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);  
        Scanner sc = new Scanner (System.in);

        int numero = 1021; 
        String agencia, NomeCliente;
        double Saldo;

        System.out.print("Por favor, digite o numero da agencia !");
        agencia = sc.nextLine();

        System.out.print("Qual o seu nome? ");
        NomeCliente = sc.nextLine();

        System.out.print("Quanto você vai depositar? ");
        Saldo = sc.nextDouble();
        
        System.out.println("Olá " + NomeCliente + ", obrugado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu salado " + Saldo + " já está disponível para saque.");


        sc.close();


    }
}
