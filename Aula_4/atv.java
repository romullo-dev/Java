import java.util.Scanner;

class atv {
    public static void main (String [] args){

        int n, n1, n2, soma = 1;

        do {

        System.out.println ("*********** CALCULADORA ***********");
        System.out.println (" 1 - Somar");
        System.out.println (" 2 - Subtrair");
        System.out.println (" 3 - Multiplicar");
        System.out.println (" 4 - Dividir");
        System.out.println (" 0 - Sair");
        System.out.println ("DIGITE UMA OPCAO :");
        Scanner s = new Scanner (System.in);
        n = s.nextInt();

        if (n == 1) {
            System.out.println ("Escreva o primeiro numero");
            Scanner a_one = new Scanner (System.in);
            n1 = a_one.nextInt();

            System.out.println ("Escreva o primeiro numero");
            Scanner a_two = new Scanner (System.in);
            n2 = a_two.nextInt();

            soma = n1 + n2;

            System.out.println (soma);
            
        } else if (n == 2) {    

            System.out.println("Escreva o primeiro numero");
            Scanner s_one = new Scanner (System.in);
            n1 = s_one.nextInt();
            System.out.println("Escreva o segundo numero");
            Scanner s_two = new Scanner (System.in);
            n2 =  s_two.nextInt();

            soma = n1 - n2;

            System.out.println (soma);

            } else if (n == 3) {    
            System.out.println("Escreva o primeiro numero");
            Scanner d_one = new Scanner (System.in);
            n1 = d_one.nextInt();
            System.out.println("Escreva o segundo numero");
            Scanner d_two = new Scanner (System.in);
            n2 =  d_two.nextInt();

            soma = n1 * n2;

            System.out.println (soma);

            } else if (n == 4) {    
                System.out.println("Escreva o primeiro numero");
                Scanner m_one = new Scanner (System.in);
                n1 = m_one.nextInt();
                System.out.println("Escreva o segundo numero");
                Scanner m_two = new Scanner (System.in);
                n2 =  m_two.nextInt();
        
                soma = n1 / n2;
        
                System.out.println (soma);

            } 
            else {
                System.out.println("OPCAO INVALIDA!!");
            }

            

        } while ( n != 0);


    }
}