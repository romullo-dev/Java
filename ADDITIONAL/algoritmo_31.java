import static java.lang.System.out;
import java.util.Scanner;


class algoritmo_31 {

    public static void main (String [] args){
        int nomberAleatorio, n= 0;
         

        do {  
            Scanner s = new Scanner (System.in);  

            out.println ("ESCREVA UM NUMERO ALEATORIO (0 A 100)");
            nomberAleatorio = s.nextInt ();

            if (nomberAleatorio < 0 || nomberAleatorio > 100){
                out.println ("NUMERO INVALIDO");
            } else if (nomberAleatorio > n){
                n = nomberAleatorio;
            }
        
            
            }  while (nomberAleatorio < 6);
    } 
}