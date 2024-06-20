import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        int O =0;
        float R = 0;

        do { 
            
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.println("DIGITE UMA OPÇÃO :");
            O = s.nextInt();


            System.out.println("DIGITE O PRIMEIRO NUMERO : "); 
            float n1 = s.nextFloat();
            System.out.println("DIGITE O PRIMEIRO NUMERO : "); 
            float n2 = s.nextFloat();

            Calc C = new Calc ();
            R = C.calcular(n1, n2, O);

            System.out.println("RESULTADO : "+R);
              
        } while (O !=0);

        

    }
}
