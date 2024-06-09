import java.util.Scanner;

class algoritmo_14{

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float r, a = 0; 

        System.out.println ("VALOR DO RAIO : ");
        r = s.nextFloat();

        a = (float) ((r * r ) * 3.14);

        System.out.println("AREA : " + a);

    }
}