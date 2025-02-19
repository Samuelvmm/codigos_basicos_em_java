import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double N1, N2, notaFinal;

        System.out.print ("Digite a primeira nota: ");
        N1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        N2 = sc.nextDouble();

        notaFinal = N1 + N2;
        System.out.println("NOTA FINAL = " + notaFinal);

        
        if (notaFinal > 60.00)
            System.out.println("APROVADO!");
        else 
            System.out.print("REPROVADO!");


        sc.close();

    }
}
