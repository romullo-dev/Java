import static java.lang.System.out;
import java.util.Scanner;


class algoritmo_30 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);  
        
        out.println ("SALARIO FIXO : ");
        float salF = s.nextFloat ();
        out.println ("VALOR DE VENDAS : ");
        float valV = s.nextFloat ();

        float valC = valV * 10 /100;
        float soma = salF + valC;

        out.println("SALARIO FINAL :  " + soma);


        


    }
}