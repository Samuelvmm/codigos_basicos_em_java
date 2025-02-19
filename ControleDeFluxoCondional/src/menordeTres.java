import java.util.Scanner;

public class menordeTres {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N1, N2, N3;

        System.out.print("Primeiro valor: ");
        N1 = sc.nextInt();

        System.out.print("Segundo valor: ");
        N2 = sc.nextInt();

        System.out.print("Terceiro valor: ");
        N3 = sc.nextInt();

        if (N1 < N2 && N1 < N3)
            System.out.println("Menor = " + N1);
        else if (N2 < N3) 
            System.out.println( "Menor = " + N2) ;
        else 
            System.out.println("Menor = " + N3);

        sc.close();
    }

}