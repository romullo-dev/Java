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

        out.println("NOTA 1 BIMESTRE");
        float N1 = s.nextFloat();
        out.println("NOTA 2 BIMESTRE");
        float N2 = s.nextFloat();
        out.println("NOTA 3 BIMESTRE");
        float N3 = s.nextFloat();
        out.println("NOTA 4 BIMESTRE");
        float N4 = s.nextFloat();
        out.println("QUANTIDADE DE FALTAS");
        int F = s.nextInt();

    }
}
