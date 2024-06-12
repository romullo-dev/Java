import java.util.Scanner;

class algoritmo_27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("ALTURA");
        float a = s.nextFloat();

        System.out.println("PESO");
        float p = s.nextFloat();

        float imc = p / (a * a);

        System.out.println(" IMC : " + imc);


        if (imc <= 18.5) {
            System.out.println(" Abaixo do peso ");
            
        } else if (imc <= 25) {
            System.out.println(" Peso ideal ");
            
        } else if (imc <= 30) {
            System.out.println(" Sobrepeso ");
            
        } else if (imc <= 40) {
            System.out.println(" Obesidade ");
            
        } else {
            System.out.println(" Obesidade mórbida ");
        }

        
    }
}