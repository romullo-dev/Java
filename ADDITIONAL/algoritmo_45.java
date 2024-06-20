/*45. Faça um programa que receba a idade, altura e o peso de 25 pessoas, Calcule e mostre:
 A quantidade de pessoas com idade superior a 50 anos;
 A média das Alturas das pessoas com idade entre 10 e 20 anos
 A porcentagem das pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas.*/
import static java.lang.System.out;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int C = 0;
        
        do {   
            out.println("Escreva sua idade :  ");
            int I = s.nextInt();
            out.println("Escreva a sua altura : ");
            float H = s.nextFloat();

            C++;    

        } while (C <= 5);


        out.println("QUANTIDADE DE PESSOAS MAIOR DE 50 ANOS : ");
        out.println("A média das Alturas das pessoas com idade entre 10 e 20 anos : ");
        out.println("Porcentagem das pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas : ");

    }
    
}
