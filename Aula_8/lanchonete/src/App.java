import static java.lang.System.out;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner s = new Scanner (System.in);
        int op =0;
        float total_ger = 0, total=0;

        do{ 
            out.println("**************SISTEMA DE LANCHONETE*************");
            out.println("**************Lanchonete Gulogemas *************");
            out.println("********************* MENU *************");
            out.println("Pasteis");
            out.println("10 -  Carne - R$ 3,00");
            out.println("20 -  Queijo - R$ 4,00");
            op = s.nextInt();

            
            total = totaliza (op);
            total_ger += total;
            

            out.println(total_ger);

        } while (op != 0);
    }

    public static float totaliza (int op){
        float total = 0;
        if (op == 10) {
            total += 4;
        } else if (op == 20) {
            total += 3;
        }
        return total;
        
    }

}


