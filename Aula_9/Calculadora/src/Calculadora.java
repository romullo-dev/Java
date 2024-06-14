import static java.lang.System.out;
import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        float S = 0 , t = 0, N;
        String O = "";
    
        do { 
            out.println("ESCREVA O NUMERO QUE DESEJA CALCULAR");
            N = s.nextFloat();

            out.println("OPERACAO : (+ - / *)");
            O = s.next();
            
            if (O == "+") {
                t = soma(N);
                S += t;
            }
            
           

            out.println(S);
            

        } while ( N != 0);
    }

    public static float soma (float N) {
        float t =  0;
        return t + N;
    }

}
