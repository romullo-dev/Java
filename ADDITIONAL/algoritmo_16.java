import java.util.Scanner;

class algoritmo_16 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int numberHam = 0;
        float fatiaT = 100, fatiaP = 50, carnHam = 100, soma = 0;
        
        System.out.println("QUANTIDADE DE HAMBURGUES");
        numberHam = s.nextInt();
        
        
        fatiaT = (numberHam * fatiaT) / 1000;
        fatiaP = (numberHam * fatiaP) / 1000;
        carnHam = (numberHam * carnHam) / 1000;


        System.out.println(fatiaT);
        System.out.println("QUANTIDADE HAMBURGUES : "+ fatiaP);
        System.out.println("QUANTIDADE HAMBURGUES : "+ carnHam);





    }
}