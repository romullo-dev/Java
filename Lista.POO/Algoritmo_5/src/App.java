/*5 ) Faça um projeto em Java orientado a objetos de um Quiz, perguntas e resposta. Faça no mínimo 5 perguntas com alternativas A,B,C,D, as 
perguntas podem ser sobre orientação a objetos. Cada resposta certa vale 1 ponto no final mostra a pontuação obtida. */
import static java.lang.System.out;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        int C = 1;
        int R = 0;
        while (C <= 2) {
            do { 
                out.println("                                                                                                                                    ");
                out.println(" ---------------------------------------------------------------------------------------------------------------------------------- ");
                out.println("|                                                                                                                                  |");
                out.println("|                                   ************************** QUIZ **************************                                     |");
                out.println("|                                                                                                                                  |");
                out.println("|                                                                                                                                  |");
                out.println("|                                               PROGRAMACAO ORIENTADA A OBJETO                                                     |");
                out.println("|                                                                                                                                  |");
                out.println("|                                                  ESCOLHA A OPCAO CORRETA                                                         |");
                out.println("|                                                                                                                                  |");
                out.println("|                                                                                                                                  |");
                out.println("|                  Qual das seguintes opções não é um conceito fundamental da Programação Orientada a Objetos?                     |");
                out.println("|                                                                                                                                  |");
                out.println("|  1 - Encapsulamento                                                                                                              |");
                out.println("|  2 - Herança                                                                                                                     |");
                out.println("|  3 - Polimorfismo                                                                                                                |");
                out.println("|  4 - Proceduralismo                                                                                                              |");
                R = s.nextInt();
                if (R != 3) {
                out.println ("|                                                             ACEERTOUU                                                            |");        
                } else {
                out.println ("|                                                             ERROOUUUU                                                            |"); 
                }
                
            } while (R != 2);




            out.println("|                                                           ("+C+")                                                                   |");






            C++;
        } 

        


        

    }
}
