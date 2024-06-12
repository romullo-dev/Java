import static java.lang.System.out;
import java.util.Scanner;

class algoritmo_38 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        

        out.println ("ANO DE NASCMENTO : ");
        int A_nasc =  s.nextInt();

        int I = 2024 - A_nasc;
        int M = I * 12;
        int S = M*4;
        int D = I * 365;

        out.println ("IDADE DIAS : " + D);
        out.println ("IDADE SEMANAS : " + S);
        out.println ("IDADE MES : " + M);
        out.println ("IDADE ANO : " + I);

        


    }
}