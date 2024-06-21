import static java.lang.System.out;
import java.util.Scanner;

public class Perg {
    public static void pergunta () {
        Scanner s = new Scanner (System.in);
        int R = 0;

        do { 
            out.println(" ESCOLHA A OPCAO DESEJADA");
            out.println();
            out.println(" 1 - XXXXXXX");
            out.println(" 2 - XXXXXXX");
            out.println(" 3 - XXXXXXX");
            out.println(" 4 - XXXXXXX");
            R = s.nextInt();

            if (R == 4) {
                out.println ("ACEERTOUU");        
            } else {
                out.println ("ERROU"); 
            }
            
        } while (R != 4);

        




    }
}
