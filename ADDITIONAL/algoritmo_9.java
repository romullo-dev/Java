import java.util.Scanner;

class algoritmo_9 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in); 
        int option, a_camisaP, a_camisaM, a_camisaG = 0;
        float total = 0;

        do { 

        System.out.println("------ FACA SEU PEDIDO ------");
        System.out.println ();
        System.out.println(" 1 ----------- CAMISA PEQUENA");
        System.out.println(" 2 ----------- CAMISA MEDIA");
        System.out.println(" 3 ----------- CAMISA GRANDE");
        System.out.println (" 0 -  Sair");
        option = s.nextInt();

        switch (option) {
            case 1:
                System.out.println ("QUANTIDADE DE CAMISAS PEQUENAS ");
                a_camisaP = s.nextInt();
                total += a_camisaP * 10;

                System.out.println ("R$ " + total);

                break;

            case 2:
                System.out.println ("QUANTIDADE DE CAMISAS MEDIA ");
                a_camisaM = s.nextInt();
                total += a_camisaM * 12;
                
                System.out.println ("R$ " + total);

                break;

            case 3:
                System.out.println ("QUANTIDADE DE CAMISAS MEDIA ");
                a_camisaG = s.nextInt();
                total += a_camisaG * 12;
                
                System.out.println ("R$ " + total);

                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        } while (option != 0);

        System.out.println("VALOR TOTAL R$ " + total);


    }
}