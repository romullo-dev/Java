/*5 ) Faça um projeto em Java orientado a objetos de um Quiz, perguntas e resposta. Faça no mínimo 5 perguntas com alternativas A,B,C,D, as 
perguntas podem ser sobre orientação a objetos. Cada resposta certa vale 1 ponto no final mostra a pontuação obtida. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int C = 1;
        Scanner s = new Scanner (System.in);
        int R = 0;
        int resp =0, P = 0;

        while (C <= 2) {

            do { 
                Quiz.Pergunta_1(R , resp, P,C);

                R = s.nextInt();

                resp = 4;

                P += pontos.pontuacao(R,resp);

                pontos.resultado(R,resp);

                C += pontos.Contagem(R, resp);

            } while (R != resp);

            do { 
                Quiz.Pergunta_2(R, resp, P, C);

                R = s.nextInt();

                resp = 3;

                P += pontos.pontuacao(R,resp);

                pontos.resultado(R,resp);

                C += pontos.Contagem(R, resp);
            } while (R != resp);

            do { 
                Quiz.Pergunta_3(R, resp, P, C);

                R = s.nextInt();

                resp = 3;

                P += pontos.pontuacao(R,resp);

                pontos.resultado(R,resp);

                C += pontos.Contagem(R, resp);
            } while (R != resp);

            do { 
                Quiz.Pergunta_4(R, resp, P, C);

                R = s.nextInt();

                resp = 1;

                P += pontos.pontuacao(R,resp);

                pontos.resultado(R,resp);

                C += pontos.Contagem(R, resp);
            } while (R != resp);

            do { 
                Quiz.Pergunta_5(R, resp, P, C);

                R = s.nextInt();

                resp = 3;

                P += pontos.pontuacao(R,resp);

                pontos.resultado(R,resp);

                C += pontos.Contagem(R, resp);
            } while (R != resp);

        } 

    }
}
