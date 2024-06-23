import static java.lang.System.out;
import java.util.Scanner;

public class Quiz {
    public static void Pergunta_1 (int C) {
        Scanner s = new Scanner (System.in);
        int R = 0;
        int resp =0, P = 0;
        
        do { 
            out.println("                                                                                                                                    ");
            out.println(" ---------------------------------------------------------------------------------------------------------------------------------- ");
            out.println("|                                                                                                                                  |");
            out.println("|                                   ************************** QUIZ **************************                                     |");
            out.println("|                                                                                                                                  |");
            out.println("|                                                                                                                    PERGUNTA ("+C+")  |");
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

            resp = 4;

            P = pontos.pontuacao(R,resp);
            out.println("|                                                     PONTUACAO ("+P+")                                                               |");
            out.println("|                                                                                                                                  |");
            pontos.resultado(R,resp);
            out.println(" ---------------------------------------------------------------------------------------------------------------------------------- ");
            out.println("                                                                                                                                    ");


        } while (R != resp);

    }

    public static void Pergunta_2 (int C) {
        Scanner s = new Scanner (System.in);
        int R = 0;
        int resp =0, P = 0;
        
        do { 
            out.println("                                                                                                                                    ");
            out.println(" ---------------------------------------------------------------------------------------------------------------------------------- ");
            out.println("|                                                                                                                                  |");
            out.println("|                                   ************************** QUIZ **************************                                     |");
            out.println("|                                                                                                                                  |");
            out.println("|                                                                                                                    PERGUNTA ("+C+")  |");
            out.println("|                                                                                                                                  |");
            out.println("|                                               PROGRAMACAO ORIENTADA A OBJETO                                                     |");
            out.println("|                                                                                                                                  |");
            out.println("|                                                  ESCOLHA A OPCAO CORRETA                                                         |");
            out.println("|                                                                                                                                  |");
            out.println("|                                                                                                                                  |");
            out.println("|                                    O que é um objeto em Programação Orientada a Objetos?                                         |");
            out.println("|                                                                                                                                  |");
            out.println("|  1 - Um arquivo de código                                                                                                        |");
            out.println("|  2 - Um tipo de dado primitivo                                                                                                   |");
            out.println("|  3 - Uma instância de uma classe                                                                                                 |");
            out.println("|  4 - Uma biblioteca de funções                                                                                                   |"); 
            R = s.nextInt();

            resp = 3;

            P = pontos.pontuacao(R,resp);
            out.println("|                                                     PONTUACAO ("+P+")                                                               |");
            out.println("|                                                                                                                                  |");
            pontos.resultado(R,resp);
            out.println(" ---------------------------------------------------------------------------------------------------------------------------------- ");
            out.println("                                                                                                                                    ");

            C++;

        } while (R != resp);

    }

    

}
