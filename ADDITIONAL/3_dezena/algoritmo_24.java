import java.util.Scanner;

class algoritmo_24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a quantidade de refresco desejada (em litros): ");
        float quantidadeRefresco = s.nextFloat();

        float quantidadeAgua = (8.0f / 10.0f) * quantidadeRefresco;
        float quantidadeSuco = (2.0f / 10.0f) * quantidadeRefresco;

        System.out.println("Para fazer " + quantidadeRefresco + " litros de refresco, você precisará de:");
        System.out.println(quantidadeAgua + " litros de água");
        System.out.println(quantidadeSuco + " litros de suco de maracujá");
    }   
}
