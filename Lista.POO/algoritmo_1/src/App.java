/*1 ) Faça um classe em Java para receber dois atributos inteiro Inicial e final. Faça um método chamado calcular para calcular
a diferença entre final e inicial, mostre o resultado dessa operação usando a classe principal main. Faça esse projeto de duas formas: 
Em um único arquivo e em 2 arquivos, ou seja usando o método main junto do arquivo da classe que você criou e outro programa em arquivos separados.*/ 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        int aux = 0, R = 0; 

        System.out.println("ESCREVA O VALOR INICIAL ");
        int V_i = s.nextInt();
        System.out.println("ESCREVA O VALOR FINAL ");
        int V_f = s.nextInt();

        aux = D (V_i ,V_f);
        R = aux;

        System.out.println("RESULTADO : " + R);

    }

    public static int D (int V_i, int V_f) {
        int aux = 0;

        aux = V_f -V_i;

        return aux;
        
    }
}
