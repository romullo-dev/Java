import java.util.Scanner;

class algoritmo_2 {
    public static void main (String[] args){
        int a_horse, a_haras = 0;
        Scanner s = new Scanner (System.in);

        System.out.println ("QUANTIDADE DE CAVALOS : ");
        a_horse = s.nextInt();
        
        a_haras =  a_horse * 4;

        System.out.println("RESULTADO : " + a_haras);


    }

}