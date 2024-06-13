import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_34 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in); 
        float A = 0; 

        out.println("QUAL A ALTURA DO QUADRADO : ");
        float H = s.nextFloat();

        A = H*H;

        out.println("ALTURA : " + A);

    }
}