
class algoritmo_39 {
    public static void main(String[] args) {
        float S = 1200 , C1 = 200, C2 = 120;

        C1 = C1 - (C1 * 2 / 100);
        C2 = C2 - (C2 * 2 / 100);

        float soma = S -C1 - C2;
        
        System.out.printf("SOBRA DO SALARIO R$ %.2f\n", soma);


    }
}