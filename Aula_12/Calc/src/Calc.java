public class Calc {
    public static float calcular (float n1, float n2, int O) {
        float T = 0;
       
        switch (O) {
            case 1:
                T = n1 + n2;
                break;
            case 2:
                T = n1 - n2;
                break;
            case 3: 
                T = n1 * n2;
                break;
            case 4: 
                T = n1 / n2;
                break;
        }

        return T;

    }

}

