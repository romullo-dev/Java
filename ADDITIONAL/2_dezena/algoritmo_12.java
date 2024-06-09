import java.util.Scanner; 

class algoritmo_12 {

    public static void main (String[] args){
        Scanner s = new Scanner (System.in); 
        float salario_inicial, salario_aumen, salario_desc = 0;   

        System.out.println("DIGITE O SEU SALARIO : ");
        salario_inicial = s.nextFloat();


        salario_aumen = (salario_inicial * 15 / 100) + salario_inicial;
        salario_desc = salario_aumen - (salario_aumen * 8 / 100);

        System.out.println("SALARIO INICIAL : " + "R$ " + salario_inicial);
        System.out.println("SALARIO COM AUMENTO : " + "R$ " +  salario_aumen);
        System.out.println("SALARIO FINAL : " + "R$ " +  salario_desc);



    }
}