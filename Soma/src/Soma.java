import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int x,y, Soma;

        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();

        Soma = x + y;
        System.out.println("Soma= " + Soma);
    }
}
