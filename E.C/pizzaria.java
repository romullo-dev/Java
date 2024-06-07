import java.util.Scanner;

class pizzaria {

    public static void main (String[] args) {
        float option, r_amount, p_amount, s_amount, g , v, total = 0;
        Scanner scanner = new Scanner(System.in);

        do {   

        System.out.println ("------------------------- FAÇA O SEU PEDIDO!-------------------------");
        System.out.println (" 1 -  Refrigerante ----------- R$ 8,50 ");
        System.out.println (" 2 -  Pizza grande ----------- R$ 30,00");
        System.out.println (" 3 -  Sobremesa    ----------- R$ 10,00");
        System.out.println (" 0 -  Sair");

        
        option = scanner.nextFloat();

        //REFRI
        if (option == 1) {
            System.out.println (" QUANTIDADE DE REFRI :");
            r_amount = scanner.nextFloat();
            total +=  r_amount * 8.50;
            System.out.println (total);
            
        //PIZZA    
        } else if (option == 2) {
            System.out.println (" QUANTIDADE DE PIZZAS :");
            
            p_amount = scanner.nextFloat();

            total +=  p_amount * 30.00;

            System.out.println (total);
        //SOBREMESA    
        } else if (option == 3) {
            System.out.println (" QUANTIDADE DE SOBREMESA :");
            
            s_amount = scanner.nextFloat();

            total +=  s_amount * 10.00;

            System.out.println (total);
             
        }

    } while (option != 0);

    g = total * 12 / 100;
    v = total + g;

    
    System.out.println(); // Linha em branco para legibilidade
    System.out.println("     VALOR FINAL");
    System.out.println("---------------------------------");
    System.out.println("Total : R$" + total);
    System.out.println("10% garçom : R$" + g);
    System.out.println("Total a pagar : R$" + v);

    System.out.println("---------------------------------");

    System.out.println("-----------Desenvolvido por Romulo Franca------------");


    




        
        

    }

}