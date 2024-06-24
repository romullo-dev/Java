/*45. Faça um programa que receba a idade, altura e o peso de 25 pessoas, Calcule e mostre:
 A quantidade de pessoas com idade superior a 50 anos;
 A média das Alturas das pessoas com idade entre 10 e 20 anos
 A porcentagem das pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas.*/
import static java.lang.System.out;
import java.util.Scanner;

public class algoritmo_45 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int C = 0, II = 0, HH = 0, c =0, PP = 0, PPorce, C_P=0;
        
        do {   
            out.println("Escreva sua idade :  ");
            int I = s.nextInt();
            out.println("Escreva a sua altura : ");
            float H = s.nextFloat();
            out.println("Escreva o seu peso : ");
            float P = s.nextFloat();

            C++; 

            if (I >= 50) {
                II++;
            } else if (I > 9 && I < 21){
                HH += H;
                c++;
                HH = HH /c;
            } else if (P <= 40) {
                PP++;
                PPorce = PP * C/100;
            }

        } while (C <= 1);

        out.println("QUANTIDADE DE PESSOAS MAIOR DE 50 ANOS : " + II);
        out.println("A média das Alturas das pessoas com idade entre 10 e 20 anos : " + HH);
        out.println("Porcentagem das pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas : " + PP);

    }
    
}
