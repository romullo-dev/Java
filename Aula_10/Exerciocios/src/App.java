import static java.lang.System.out;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        float R = 0, T = 0;

        out.println("QUAL O SEU SALARIO");
        float S = s.nextFloat();

        R = Calc (S);
        T = S - R;

        out.print ("SALARIO FINAL R$ " +T);;
        out.print ("IMPOSTOS R$ " +R);
        

        
    }

    public static float Calc (float S) {
        float R =  0; 
        if (S < 2112.00 ) {
            out.println("ISENTO");
        } else  if (S < 2826.665) {
            R = (float) (S * 7.5/100);
        } else if (S < 3751.05) {
            R = (float) (S * 15/100);
        } else if (S < 4664.68) {
            R = (float) ( S * 22.5/100);
        } else if (S > 4664.68) {
            R = (float) ( S * 27.5/100);
        }
        return R;
    }
}
