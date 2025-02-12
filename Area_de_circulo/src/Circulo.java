import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args)  {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double raio, area, pi;
        pi = 3.14566;

        System.out.print("Digite o valor do raio do circulo: ");
        raio = sc.nextDouble();

        area = pi * (raio * raio);

        System.out.print("Area = " + area);

        sc.close();


    }
}
