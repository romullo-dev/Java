import java.util.Scanner;

class algoritmo_11 {

    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        int aciDay = 0;
        float aciMonth, aciYear = 0;


        System.out.println("QUANTIDADE DE DIAS SEM ACIDENTES : ");
        aciDay = s.nextInt();

        aciMonth = aciDay / 30;
        aciYear = aciMonth / 12;

        System.out.println ("QUANTIDADE DE DIAS SEM ACIDENTE : " + aciDay);
        System.out.println ("QUANTIDADE DE MESES SEM ACIDENTE : " + aciMonth);
        System.out.println ("QUANTIDADE DE ANOS SEM ACIDENTE : " + aciYear);


    }  
}