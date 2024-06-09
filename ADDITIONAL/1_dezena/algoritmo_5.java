import java.util.Scanner;

class algoritmo_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Float valueGas = 5f, p_value, liter;
        
        System.out.println ("VALOR : ");
        p_value = s.nextFloat();

        liter = p_value / valueGas;

        System.out.println ();

        System.out.println ("LITROS " + liter + " LITROS");
        System.out.println ("VALOR R$ " + p_value);
        


    }

}