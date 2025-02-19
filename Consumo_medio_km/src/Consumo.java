import java.util.Scanner;
import java.util.Locale;;

public class Consumo {
    public static void main(String[] args){
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
       
        
        double distanciaPercorrida, combustivel, consumoMedio;


        System.out.print("Qual é a distância a ser percorrida? ");
        distanciaPercorrida = sc.nextDouble();

        System.out.print("Quanto de combustível foi gasto? ");
        combustivel= sc.nextDouble();

        consumoMedio = distanciaPercorrida / combustivel;

        System.out.print("Consumo medio = " + String.format("%.3f",consumoMedio));
        
        sc.close();
    }
}
