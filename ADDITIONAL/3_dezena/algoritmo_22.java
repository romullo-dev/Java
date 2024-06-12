import java.util.Scanner;

class algoritmo_22 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float m_1 = 1, m_5 = 5 , m_10 = 10, m_25 = 25, m_50 = 50, r_1 = 100, total = 0;

        System.out.println("MOEDAS DE 1 CENTAVOS : ");
        m_1 = s.nextFloat();
        System.out.println("MOEDAS DE 5 CENTAVOS : ");
        m_5 = s.nextFloat();
        System.out.println("MOEDAS DE 10 CENTAVOS : "); 
        m_10 = s.nextFloat();
        System.out.println("MOEDAS DE 25 CENTAVOS : "); 
        m_25 = s.nextFloat();
        System.out.println("MOEDAS DE 50 CENTAVOS : "); 
        m_50 = s.nextFloat();
        System.out.println("MOEDAS DE 1 REAL : "); 
        r_1 = s.nextFloat();

        total = (m_1 * 1 + m_5 * 5 + m_10 * 10 + m_25 * 25 + m_50 * 50 + r_1 * 100) /100;


        System.out.println(total);
       



    }
}