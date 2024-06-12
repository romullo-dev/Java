import java.util.Scanner;

class algoritmo_23 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float a_p , a_person, s_p, s_person = 0;

        System.out.println("DIGITE A SUA ALTURA : ");
        a_person = s.nextFloat(); 
        System.out.println("DIGITE A ALTURA DA SOBRA DO PREDIO : ");
        s_p = s.nextFloat(); 
        System.out.println("DIGITE A ALTURA DA SUA SOBRA : ");
        s_person = s.nextFloat(); 

        a_p = (a_person * s_p) / s_person;

        System.out.println("ALTURA : " + a_p + " METROS");
    }
}