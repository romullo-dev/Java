import java.util.Scanner;

class algoritmo_3 {
    public static void main (String[] args) {
        int A_bread, A_cornbread = 0;
        float value_bread = 0.12f, value_cornbread = 1.50f , value_total, perce = 0;
        Scanner s = new Scanner (System.in);


        System.out.println ("QUANTIDADE DE PAES VENDIDOS : ");
        A_bread =  s.nextInt ();
        System.out.println ("QUANTIDADE DE BROAS VENDIDOS : ");
        A_cornbread = s.nextInt();

        value_total = (value_bread * A_bread) + (value_cornbread * A_cornbread);
        perce = value_total * 10 / 100;

        System.out.println ("VENDAS " + value_total);
        System.out.println("GUARDADO " + perce);


    }
    
}