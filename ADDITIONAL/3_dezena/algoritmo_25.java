import java.util.Scanner;

class algoritmo_25 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("RAIO DO CILINDRO : ");
        float r = s.nextFloat();
        System.out.println("ALTURA DO CILINDRO : ");
        float h = s.nextFloat();

        float v = (float) (3.14 * ( r * r ) * 4);

        System.out.println("VOLUME : " + v + "METROS");
        

    }
}