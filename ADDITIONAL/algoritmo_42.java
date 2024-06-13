import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_42 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int C = 1;

        out.println("ESCREVA UM NUMERO ALEATORIO");
        int N = s.nextInt();

        do { 
            out.println(C);
            C++;
        } while (C < 5);
    }
}