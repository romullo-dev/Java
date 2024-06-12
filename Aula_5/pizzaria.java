import java.util.Scanner;

class pizzaria {

    public static void main (String[] args) {
        float r_amount, p_amount = 0, s_amount, g , v,  total = 0;
        int option , c, d_conta = 0, q_amount = 0;
        Scanner scanner = new Scanner(System.in);
        float total_person = 0;
        String e_one = "", e_two = "", e_three = "";

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

        switch (d_conta) {
            case 1:
                e_one = "Refrigerante";
                break;

            case 2:
                e_two = "Pizza grande";
                break;
            case 3:
                e_three = "Sobremesa";
                break;    

            default:
                System.out.println(" ");
                break;

            


        }

    } while (option != 0);

    g = total * 12 / 100;
    v = total + g;

    System.out.println("Total: R$" + total);
        System.out.println("10% garCom: R$" + g);
        System.out.println("Total a pagar: R$" + v);

        System.out.println("DESEJA DIVIDIR A SUA CONTA: SIM(1) / NAO(2)");
        d_conta = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Quantas pessoas?");
                q_amount = scanner.nextInt();
                total_person = v / q_amount;  
                System.out.println("Total por pessoa: R$" + total_person);
                break;
            default:
                System.out.println("Conta não será dividida.");
                break;
        }

        System.out.println();
        System.out.println("       --------------------CUPOM NAO FISCAL--------------------         ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("              ------------------PEDIDO-------------------               ");
        System.out.println();
        System.out.println(e_one);
        System.out.println(e_two);
        System.out.println(e_three);
        System.out.println();
        System.out.println("Total : R$" + total);
        System.out.println("10% garcom : R$" + g);
        System.out.println("Total a pagar : R$" + v);
        System.out.println("Valor da conta por pessoa : R$" + total_person +" "+ q_amount + "x");
        System.out.println(); 
        System.out.println("-------------------- Desenvolvido por Romulo Franca ---------------------");
    }
}