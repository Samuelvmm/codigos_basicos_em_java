import java.util.Locale;
import java.util.Scanner;

public class dardo {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);
      
      double D1, D2, D3;

      System.out.println("Digite as 3 distancias: ");
      D1 = sc.nextDouble();
      D2 = sc.nextDouble();
      D3 = sc.nextDouble();

      if (D1 > D2 && D1 > D3)
            System.out.println("MAIOR DISTANCIA = " + D1);
      else if (D2 > D3) 
            System.out.println("MAIOR DISTANCIA = " + D2);
      else 
            System.out.println("MAIOR DISTANCIA = " + D3);    
      
            sc.close();

    }
}
