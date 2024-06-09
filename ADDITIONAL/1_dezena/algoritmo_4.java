import java.util.Scanner;

class algoritmo_4 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in); 
        String name = "";
        int b_year, age = 0;
        int dayLived = 0;

        System.out.println("NOME : ");
        name = s.next();
        System.out.print("ANO DE NASCIMENTO : ");
        b_year = s.nextInt();

        age =  2024 - b_year;
        dayLived = b_year * 365;

        if (b_year >= 2025) {
            System.out.println ("NÃO PODE SER APOS O ANO ATUAL");
        } else {

            System.out.println ("NOME : " + name);
            System.out.println ("IDADE : " + age);
            System.out.println ("IDADE : " + dayLived);
        }


        
    }
}