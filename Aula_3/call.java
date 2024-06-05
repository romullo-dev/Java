import java.util.Scanner;

class call {
    public static void main (String[] args){
        int opcao = 1;

        while (opcao != 3) { 
            Scanner s = new Scanner(System.in );
        
            System.out.println("1 - Comida");
            System.out.println("2 - Bebida");
            System.out.println("3 - Sair");
            System.out.println("Qual opcao?");
            opcao = s.nextInt();

            if (opcao == 1) {
                System.out.println("Comida");
            }
            else if (opcao == 2) {
                System.out.println("Bebida");
            }
            break; 
        }
    }
}
