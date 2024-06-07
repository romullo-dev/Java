import java.util.Scanner;

class algoritmo_1 {
    public static void main (String [] args) {

        float a, h , w = 0;
        Scanner s = new Scanner (System.in);

        System.out.println ("ALTURA : ");
        h = s.nextFloat();
        System.out.println ("LARGURA ; ");
        w = s.nextFloat();

        a = h * w;

        System.out.println("AREA : " + a + " m");
        
    }
}