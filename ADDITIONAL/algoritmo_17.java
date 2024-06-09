import java.util.Scanner;

class algoritmo_17 {

    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        float temCels, tem_F = 0;


        System.out.println("TEMPERATURA EM Celsius : ");
        temCels =  s.nextFloat();

        tem_F = (float) ((temCels * 1.8) + 32);

        System.out.println("TEMPERATURA EM Fahrenheit : " + tem_F + "°F");


    }
}