import java.util.Scanner;

class algoritmo_22 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float t_350 ,  t__600 , l_1 , total = 0;

        System.out.println("QUANTIFAFE  : ");
        t_350 = s.nextFloat();
        System.out.println("GARRAFA 600 ML : ");
        t__600 = s.nextFloat();
        System.out.println("GARRAFA 1 L : ");
        l_1 = s.nextFloat();

        t_350 = (350 * t_350) / 1000; 
        t__600 = (600 * t__600) / 1000;
        l_1 = 1 * l_1;

        total = t_350 + t__600 + l_1;

        System.out.println(total + " LITROS");
       



    }
}