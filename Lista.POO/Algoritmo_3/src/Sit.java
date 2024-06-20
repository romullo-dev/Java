public class Sit {
    public static void situacao (Float T) {
        Float M = T / 4;
        
        if (M <= 4.9) {
            System.out.println ("REPROVADO COM MEDIA " + M);
        } else if (M <= 6.9) {  
            System.out.println ("EM RECUPERACAO COM MEDIA " + M);
        } else {
            System.out.println ("APROVADO COM MEDIA " + M);
        }
        
    }
}
