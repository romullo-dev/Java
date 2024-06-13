import static java.lang.System.out; 
import java.util.Scanner;

class algoritmo_36 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float Sal_min = (float) 1412;

        out.print ("VALOR DO SALARIO : ");
        float SalValor = s.nextFloat();

        float total = SalValor / Sal_min;

        out.printf("QUANTIDADE DE SALARIOS MINIMO %.1f", total);

        s.close();

    }
}