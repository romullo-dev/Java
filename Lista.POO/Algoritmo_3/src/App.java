/*3 ) Faça um projeto em Java orientado a objetos para uma escola, para receber o nome do aluno suas 4 notas e sua quantidade 
de faltas. No final o programa deverá imprimir o nome do aluno sua média aritmética e o seu resultado.
Resultado : 
                    Se o aluno tira ate 4.9 Reprovado.
                    Se o aluno tira ate 6.9 Recuperação.
                    Se o aluno tira acima 6.9 Aprovado.
Alunos com faltas superior a 10 estarão automaticamente reprovados independentemente da sua média obtida. */

import static java.lang.System.out;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        int C  = 1;
        float T = 0;

        do {
            out.println("NOTA " + C + " BIMESTRE : ");
            float N = s.nextFloat();
            C++;
            T += N;
        } while (C <= 4);

        out.println("FALTAS : ");
        int F = s.nextInt();

        if (F > 10) {
            out.println("REPROVADO POR FALTA");
        } else {
            Sit.situacao(T);
        }
        
    }
}
