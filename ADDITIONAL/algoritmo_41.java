import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_41 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int R, C = 1;
        out.println ("ESCOLHA UM NUMERO : (1 A 10)");
        int  N = s.nextInt();      

        do { 
            if (N < 10 || N > 1) {
                

                R = N * C;
                out.println (C + " X " + N + " = " +R);
            } else {
                out.println("NUMERO INVALIDO");
            }

            
            
            C++;
        } while (C < 11 && N < 10);
        
    }
}