import java.util.Scanner;

class algoritmo_44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M = 0, C = 0;

        do { 
        
            System.out.println("ESCREVA A SUA IDADE : ");
            int N = s.nextInt();

            if (N >= 18) {
                M++;
            }

            C++;

        } while (C < 11);

        System.out.println ("QUANTIDADE DE PESSOAS MAIOR DE IDADE " + M);
 

    }
}