import java.util.Scanner;

class algoritmo_15 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float valorCont, valor_int = 0;
        
        System.out.println("VALOR DA CONTA : ");
        valorCont = s.nextFloat();


        valor_int = valorCont / 3; 


        System.out.println("A CONTA DIVIDA PARA 3 FICA : " + "R$ " + valor_int);





    }
}