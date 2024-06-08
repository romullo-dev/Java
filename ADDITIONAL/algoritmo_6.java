import java.util.Scanner;

class algoritmo_6 {

    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        float w_dish, total = 0, dishVolue = 12.00f;

        System.out.println ("PESO : (KG)");
        w_dish =  s.nextFloat(); 

        total = w_dish * dishVolue;

        System.out.println (total + " KG");



    }

}