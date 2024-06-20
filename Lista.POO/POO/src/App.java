import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        int aux = 0, R = 0; 

        System.out.println("ESCREVA O VALOR INICIAL ");
        int V_i = s.nextInt();
        System.out.println("ESCREVA O VALOR FINAL ");
        int V_f = s.nextInt();

        aux = D (V_i ,V_f);
        R = aux;

        System.out.println("RESULTADO : " + R);

    }

    public static int D (int V_i, int V_f) {
        int aux = 0;

        aux = V_f -V_i;

        return aux;
        
    }
}
