
import java.util.Scanner;


class exercicio_2 {
    public static void main (String[] args){
        int n = 1;

        do {

        System.out.println("*************Menu*************");
        System.out.println(" op 1");
        System.out.println(" op 2");
        System.out.println(" op 3");
        System.out.println("Escolha uma opcao: ");
        Scanner s = new Scanner (System.in);
        n = s.nextInt(); 

        if ( n == 1) {
            System.out.println("pastel");
        } else if (n == 2) {
            System.out.println("Refri");
        } 
        else {
            System.out.println("Sair");
        }



    } while ( n != 0);
        
    }
}