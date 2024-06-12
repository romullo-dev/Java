import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_29 {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in); 

        out.println ("VALOR DO PRODUTO : ");
        float vP = s.nextFloat();
        float v_a =  vP - (vP * 10 /100);

        out.println("RESULTADO : " + v_a);

    }

} 