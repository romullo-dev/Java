import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_40 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float a = 0; 

        out.println("CATETO 1 : ");
        float C_one = s.nextFloat();
        out.println("CATETO 2 : ");
        float C_two = s.nextFloat();

        a = (C_one + C_two); 

        out.println(" VALOR DA HIPOTENUSA : " + a);
    }
}