/* 2 ) Faça um projeto Java orientado a objetos que receba um numero entre 10 e 99  e escreva esse número em ordem crescente e decrescente até 0 e até 100:
Exemplo:
       Usuário digitou 27
Decrescente 26,25,24,23,22,21,20,19.....0
Crescente 28,29,30,31,32...100
       Esse projeto deverá te três arquivos o App principal e as classes Crescente e Decrescente.*/

import static java.lang.System.out;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);

        out.println("ESCREVA UM NUMERO ALEATORIO : ");
        int N = s.nextInt();

        if (N >= 10 && N >=99) {
            out.println("NUMERO INVALIDO");
        } else {
            out.println("CRESCENTE : ");
            Cresc.crescer(N);
            out.println("DECRESCENTE : ");
            Desc.descr(N);
        }

    }
}
