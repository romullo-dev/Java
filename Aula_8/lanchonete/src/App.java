import static java.lang.System.out;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner s = new Scanner (System.in);
        int op = 0;
        float total_ger = 0, total=0;

        do{ 
            out.println("**************SISTEMA DE LANCHONETE*************");
            out.println("**************Lanchonete Gulogemas *************");
            out.println("********************* MENU *************");
            out.println("       Pasteis       ");
            out.println("10 -  Carne - R$ 3,00");
            out.println("20 -  Queijo - R$ 4,00");

            out.println("       Salgados       ");
            out.println("30 - Coxinha - R$ 2,00");
            out.println("40 - Risole - R$ 2,50");
            out.println("       Refrigerante      ");
            out.println("50 - Refri lata - R$ 2,30");
            out.println("60 - Coca cola 2l - R$ 8,70");


            op = s.nextInt();

            
            total = totalizaPasteis (op);
            total_ger += total;

            total =  totalizaSalg (op);
            total_ger += total;

            total = totalizaRef(op);
            total_ger += total;

        } while (op != 0);
        
        out.printf("TOTAL : R$ %.2f" , total_ger);
    }

    public static float totalizaPasteis (int op){
        float total = 0;
        if (op == 10) {
            total += 3;
        } else if (op == 20) {
            total += 4;
        }
        return total;
    }

    public static float totalizaSalg (int op){
        float total = 0; 
        if (op == 30){
            total += 2;
        } else if (op == 40 ){
            total = (float) 2.50;
        }
        return total;
    }

    public static float totalizaRef(int op) {
        float total = 0;
        if (op == 50) {
            total += 2.30f; 
        } else if (op == 60) {
            total += 8.70f; 
        }
        return total;
        
    }

}


