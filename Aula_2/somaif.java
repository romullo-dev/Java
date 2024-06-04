import java.util.Scanner;


class somaif {
    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner s = new Scanner(System.in );
        System.out.println("Digite o 1º numero");
        a = s.nextInt();
        System.out.println("Digite o 2º numero");
        b = s.nextInt();
        c = a + b;
        System.out.println("a soma dos numeros é : " + c);

        if (c <= 50) {
            System.err.println("O valor de c menor ou igual a 50");
        }

        else if (c <= 100) {
            System.err.println("O valor de c menor ou igual a 100");
        }

        else if (c <= 250) {
            System.err.println("O valor de c menor ou igual a 250");
        }

        else {
            System.err.println("O valor de c menor ou igual a 250");
        }

    }
}