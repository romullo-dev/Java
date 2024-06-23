public class pontos  {
    public static int pontuacao (int R, int resp) {
       int T = 0;
       if (R == resp) {
          T += 10; 
       }
     return T;
    }
    
    public static int Contagem (int R, int resp) {
      int c = 0;
      if (R == resp) {
         c++; 
      }
      return c;
   }





   public static void resultado  (int R, int resp ) {
    if (R == resp) {

      System.out.println ("  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- ");
      System.out.println (" |                                                         CORRETO                                                                |");        
      System.out.println ("  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- ");

    } else {

      System.out.println ("  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- ");
      System.out.println (" |                                                       INCORRETO                                                                |"); 
      System.out.println ("  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- ");

    }

}
 
 }
