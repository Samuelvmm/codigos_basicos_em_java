import java.util.Scanner;
import java.util.Locale;

public class baskara {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double a, b, c, delta, X1, X2;

        System.out.print("coeficiente a: ");
        a = sc.nextDouble();
        
        System.out.print ("coeficiente b: ");
        b = sc.nextDouble();

        System.out.print ("coeficiente c: ");
        c = sc.nextDouble();

        delta = b * b - 4 * a * c;

        
        if (delta < 0) {
            System.out.println("Esta equação não possui raizes");
        }
        else {
            X1 = ((- b) + Math.sqrt(delta)) / ( 2 * a);
            X2 = ((- b) - Math.sqrt(delta)) / ( 2 * a);
            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);
        }
           
    
        sc.close();
    }
}
