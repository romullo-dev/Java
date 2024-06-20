import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int R = 0;

        System.out.println("ESCREVA O VALOR INICIAL ");
        int V_i = s.nextInt();
        System.out.println("ESCREVA O VALOR FINAL ");
        int V_f = s.nextInt();

        Dif D = new Dif ();

        R = D.Diferenca(V_i,V_f);

        System.out.println("RESULTADO : " + R); 




        
    }
}