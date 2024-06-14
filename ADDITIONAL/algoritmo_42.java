import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_42 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int C = 0, N, cont = 0;
        int P_c = 0, I_c = 0 , c= 1, Icc = 0;
    

        do {  

            out.println("ESCREVA UM NUMERO ALEATORIO (INTEIRO) : ");
            N = s.nextInt();

            if ( N < 0) {
                out.println("NUMERO INVALIDO");
            } else {
                int r = N % 2;
            
                if (r == 0) { //NUMEROS PARES
                    P_c++;
                } else { //NUMEROS IMPARES
                    I_c++;
                }

                if (r == 0) { //NUMEROS PARES MEDIA
                    C += N;
                } else {
                    Icc += N; 
                }
                
                cont++;
            }
            
            } while (N != -1);            

            float M = C / P_c;
            float MEDIA = (C + Icc) / cont;

            out.println("PARES " + P_c);
            out.println("IMPARES " + I_c);
            out.println("SOMAS PARES " + C);
            out.println("MEDIA PARES " + M);
            out.println("MEDIA TOTAL " + MEDIA );

    }
}