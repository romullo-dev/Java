public class pontos  {
    public static int pontuacao (int R, int resp) {
       int T = 0;
       if (R == resp) {
          T += 10; 
       }
     return T;
    }
    public static void resultado  (int R, int resp ) {
        if (R == resp) {
          System.out.println ("|                                                          CORRETO                                                                 |");        
        } else {
          System.out.println ("|                                                       INCORRETO                                                                  |"); 

        }
 
    }
 
 }
