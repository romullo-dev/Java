import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_33 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float a = 0; 

        out.println("base maior : ");
        float bM = s.nextFloat();
        out.println("base menor : ");
        float bm = s.nextFloat();
        out.println("altura : ");
        float h = s.nextFloat();

        a = (bM + bm) * h / 2; 

        out.println("AREA : " + a);
    }
}