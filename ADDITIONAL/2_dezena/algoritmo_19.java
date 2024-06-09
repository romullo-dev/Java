import java.util.Scanner;

class algoritmo_19 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int amosGal = 0;
        float c = 4, a = 7, g = 0;

        
        System.out.println("QUANTIDADES DE GALINHAS : ");
        amosGal = s.nextInt();

        g = (c + a) * amosGal;

        System.out.println("GASTO TOTAL : " + "R$ " + g);

    }
}