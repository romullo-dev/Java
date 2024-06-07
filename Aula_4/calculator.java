import java.util.Scanner;

class calculator {

    public static void main (String[] args) {

        int nr, sum, number_1, number_2;

        do { 

        System.out.println ("------------------------- MENU -------------------------");
        System.out.println (" 1 - Somar");
        System.out.println (" 2 - Subtrair");
        System.out.println (" 3 - Multiplicar");
        System.out.println (" 4 - Dividir");
        System.out.println (" 0 - Sair");
        System.out.println ("ESCOLHA UMA DAS OPCOES : ");
        
        Scanner s = new Scanner(System.in);
        nr  = s.nextInt();

    
        if (nr == 1) {
            System.out.println ("Digite o primeiro numero");
            Scanner a_one = new Scanner (System.in);
            number_1 = a_one.nextInt();

            System.out.println ("Digite o segundo numero");
            Scanner a_two = new Scanner (System.in);
            number_2 = a_two.nextInt();

            sum = number_1 + number_2;

            System.out.println(number_1 + " + " + number_2  + " = " + sum);

        } else if ( nr == 2 ){
            System.out.println("Digite o primeiro numero");
            Scanner m_one = new Scanner (System.in);
            number_1 = m_one.nextInt();

            System.out.println("Digite o segundo numero");
            Scanner m_two = new Scanner (System.in);
            number_2 = m_two.nextInt();

            sum = number_1 - number_2;

            System.out.println(number_1 + " - " + number_2  + " = " + sum);
            
        } else if ( nr == 3 ){
            System.out.println("Digite o primeiro numero");
            Scanner m_one = new Scanner (System.in);
            number_1 = m_one.nextInt();

            System.out.println("Digite o segundo numero");
            Scanner m_two = new Scanner (System.in);
            number_2 = m_two.nextInt();

            sum = number_1 * number_2;

            System.out.println(number_1 + " * " + number_2  + " = " + sum);
            
        }

        else if ( nr == 4 ){
            System.out.println("Digite o primeiro numero");
            Scanner d_one = new Scanner (System.in);
            number_1 = d_one.nextInt();

            System.out.println("Digite o segundo numero");
            Scanner d_two = new Scanner (System.in);
            number_2 = d_two.nextInt();

            sum = number_1 / number_2;

            System.out.println(number_1 + " / " + number_2  + " = " + sum);
            
        }

        else if ( nr == 0 ){
            System.out.println("Sair");
            
        }

        else {
            System.out.println ("Opcao invalida");
        }

    } while (nr != 0);


    }
}
