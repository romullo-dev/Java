import java.util.Scanner;

class algoritmo_10 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int n1 , n2 = 0;

        System.out.println (" NUMERO 1 : ");
        n1 = s.nextInt();
        System.out.println (" NUMERO 2 : ");
        n2 = s.nextInt();

        if (n1 > n2) {
            System.out.println ("numero : " + n1 );
        } else {
            System.out.println ("numero : " + n2 );
        }

    }
}