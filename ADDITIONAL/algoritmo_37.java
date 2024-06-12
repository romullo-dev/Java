import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_37 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int Num,tab, c = 1;

        out.println ("ESCREVA UM NUMERO QUE DESEJA SABER A TABUADA : ");
        Num =  s.nextInt();

        do { 

            tab = Num * c;

            out.println(Num + " X " +  c + "=" + tab);
            c++;
        } while (c <= 10);

    }
}