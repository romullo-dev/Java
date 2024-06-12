import java.util.Scanner;

class algoritmo_26 {

    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        float n1, n2, m = 0;

        System.out.println("PRIMEIRA NOTA : ");
        n1 = s.nextFloat();
        System.out.println("SEGUNDA NOTA : ");
        n2 = s.nextFloat();

        m =  (n1 + n2) / 2;

        System.out.println("MEDIA : " + m );

        if (m <= 4.9) {
            System.out.println("REPROVADO");
        } else if (m <= 6.9) {
            System.out.println("EM RECUPERACAO");
        } else {
            System.out.println("APROVADO");
        }

    }
}