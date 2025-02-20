import java.util.Locale;
import java.util.Scanner;

public class niveldeGlicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

       double glicose;

       System.out.print("Qual a medida da sua glicose: ");
       glicose = sc.nextDouble();

       if (glicose <= 100) 
            System.out.println("classificacao: NORMAL");
       
        else if (glicose > 100 && glicose <= 140)
            System.out.println("classificacao: ELEVADO");
        
        else 
            System.out.println("Classificacao: DIABETES");
            
        sc.close();
    }
}
