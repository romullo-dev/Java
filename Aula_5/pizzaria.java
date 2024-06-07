import java.util.Scanner;

class pizzaria {

    public static void main (String[] args) {
        float r_amount, p_amount = 0, s_amount, g , v, total = 0;
        int option , c = 0;
        Scanner scanner = new Scanner(System.in);

        do {   

        System.out.println ("------------------------- FACA O SEU PEDIDO!-------------------------");
        System.out.println (" 1 -  Refrigerante ----------- R$ 8,50 ");
        System.out.println (" 2 -  Pizza grande ----------- R$ 30,00");
        System.out.println (" 3 -  Sobremesa    ----------- R$ 10,00");
        System.out.println (" 0 -  Sair");

        
        option = scanner.nextInt();

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

        if (option == 2) {

            System.out.println ("ESCOLHA A COBERTURA DA PIZZA: ");
            System.out.println ("1 - queijo    ------  R$ 2,50");
            System.out.println ("2 - presunto  ------  R$ 2,50");
            System.out.println ("3 - calabresa ------  R$ 2,50");
            System.out.println ("4 - goiabada  ------  R$ 2,50");
            System.out.println ("5 - chocolate ------  R$ 2,50");
            c = scanner.nextInt();
            total += 2.5 * p_amount;
            System.out.println (total);


        }

    } while (option != 0);

    g = total * 12 / 100;
    v = total + g;

    
    System.out.println(); 
    System.out.println("     VALOR FINAL");
    System.out.println("---------------------------------");
    System.out.println("Total : R$" + total);
    System.out.println("10% garcom : R$" + g);
    System.out.println("Total a pagar : R$" + v);

    System.out.println("---------------------------------");

    System.out.println("-----------Desenvolvido por Romulo Franca------------");


    




        
        

    }

}