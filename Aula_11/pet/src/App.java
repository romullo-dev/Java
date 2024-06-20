import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //ATRIBUTOS
        Scanner s = new Scanner( System.in); // metodo para receber os dados
        String nomeTutor = "";
        String nomeCachorro = "";
        float idade = 0; // coloca o 0 zero por ser numero e nao palavras
        float idadehumana = 0;
       
        System.out.println("Dados de entrada!");
        System.out.println (" Nome do tutor");
        nomeTutor = s.next (); // Next coloca para ler o que o usuario vai escrever por ser nome e esse se fose numero seria nexfloaut
        System.out.println (" Nome do cachorro");
        nomeCachorro = s.next ();
        System.out.println (" Idade do cachorro");
        idade = s.nextFloat();
        dadostotal(nomeTutor, nomeCachorro, idade);
        idadehumana = calcula_idade(idade);
        System.out.println ("Idade Humana: " + idadehumana);
        // chamar, invocar aqui na classe abaixo dos ojetos no metodo main
        //System.out.println (nomeTutor  + nomeCachorro + idade);

    }
             public static void dadostotal ( String nomeTutor, String nomeCachorro, float idade ){
            System.out.println ("Nome do cachorro: " + nomeCachorro);
            System.out.println (" Nome do tutor: " + nomeTutor);
            System.out.println ( "Idade: " + idade);
           

        }//Fim do metodo dadototal
                public static float calcula_idade(float idade) {
                float idadehumana=0;
                idadehumana = idade * 7;
                return idadehumana;
        }//fim do metodo calcula_idade


    }