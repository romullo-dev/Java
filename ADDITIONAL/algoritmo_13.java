import java.util.Scanner;

class algoritmo_13 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int nomberAlea = 0; 
        int dezena, cent = 0;

        System.out.println("DIGITE UM NUMERO INTERO : ");
        nomberAlea = s.nextInt();

        cent = nomberAlea / 100;
        dezena = nomberAlea / 10;

        System.out.println ("UNIDADES : " + nomberAlea);
        System.out.println ("DEZENAS : "+ dezena);
        System.out.println ("CENTENAS : "+ cent);



    }
}