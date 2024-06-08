import java.util.Scanner;

class algoritmo_8 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        float number_one, number_two, number_three, total = 0;


        System.out.println("NOTA 1");
        number_one = s.nextFloat();

        System.out.println("NOTA 2");
        number_two = s.nextFloat();

        System.out.println("NOTA 3");
        number_three = s.nextFloat();

        total = (number_one + number_two + number_three) / 3;

        System.out.println(total);

    
    }

}