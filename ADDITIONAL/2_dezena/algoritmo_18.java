import java.util.Scanner;

class algoritmo_18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jobNor, jobExt = 0;
        float salNor = 10 , salExt = 15, total = 0 , t_liquido = 0;
        
        System.out.println("HORAS DE TRABALHO");
        jobNor = s.nextInt();
        System.out.println("HORAS EXTRA");
        jobExt = s.nextInt();

        total = (jobNor * salNor) + (jobExt * salExt);
        t_liquido = total - (total * 10 /100);

        System.out.println("SALARIO BRUTO :" + total);
        System.out.println("SALARIO LIQUIDO :" + t_liquido);
    }
}