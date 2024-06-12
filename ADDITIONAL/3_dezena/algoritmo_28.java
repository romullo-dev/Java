import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_28 {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);

        out.println("QUAL A PRIMEIRA NOTA : ");
        float n1 = s.nextFloat();
        out.println("QUAL A SEGUNDA NOTA : ");
        float n2 = s.nextFloat();
        out.println("QUAL A TERCEIRA NOTA : ");
        float n3 = s.nextFloat();

        n1 = n1 * 2;
        n2 = n2 * 3;
        n3 = n3 * 4;
        float t = (n1 + n2 + n3 )  / 3;

        out.println(t);
    }
}