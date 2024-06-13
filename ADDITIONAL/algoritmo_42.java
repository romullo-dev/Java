import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_42 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int C, N = 0;
        int P_c = 0, I_c = 0 , c= 1;

        do {  
            out.println("ESCREVA UM NUMERO ALEATORIO");
            N = s.nextInt();

            int r = N % 2;
            
            if (r == 0) { //NUMEROS PARES
                P_c++;
            } else { //NUMEROS IMPARES
                I_c++;
            }

        } while (N != 0);            

        out.println("PARES " + P_c);
        out.println("IMPARES " + I_c);

    }
}