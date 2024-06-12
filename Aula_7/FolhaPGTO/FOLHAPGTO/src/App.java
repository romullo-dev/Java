public class App {
    public static void main(String[] args) throws Exception {
        float sal_bruto = (float) 1412;
        float INSS = 0; 
        float IR =0;
        float V_T =0; 
        float V_Trecebe = 300; 
        float Sal_familia =150;
        float sal_final= 0;
        float  r = 0;
        
        r = calc_INSS(sal_bruto);
        INSS = r;

        r = calc_IR (sal_bruto);
        IR = r;

        r = calc_VT (sal_bruto);
        V_T = r;

        sal_final =  (sal_bruto + V_Trecebe + Sal_familia) - (INSS + IR);

        System.out.println("VALOR INSS : " + INSS);
        System.out.println("VALOR IMPORTO DE RENDA : " + IR);
        System.out.println("VALOR FINAL : " + sal_final);   
    }

    public static float calc_INSS (float sal_bruto){ 
        float r = 0;
        r = sal_bruto / 100 * 7.5f;
        return r;

    }

    public static float calc_IR (float sal_bruto) {
        float r= 0;
        r = sal_bruto * 27.5f / 100;
        return r;

    }

    public static float calc_VT (float sal_bruto) {
        float r= 0;
        r = sal_bruto * 3 / 100;
        return r;

    }
}
