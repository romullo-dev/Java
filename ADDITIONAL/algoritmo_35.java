import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_35 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float a = 0; 

        out.println("diagonal maior : ");
        float DM = s.nextFloat();
        out.println("diagonal menor : ");
        float Dm = s.nextFloat();

        a = (DM * Dm)/ 2; 

        out.println("AREA : " + a);
    }
}