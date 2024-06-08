import java.util.Scanner;

class algoritmo_6 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int dia, mes, qtd_dias, ano = 0;

        System.out.println ("Qual dia do mes é hoje?");
        dia =  s.nextInt(); 

        System.out.println ("Qual o mes?");
        mes =  s.nextInt();

        mes = mes * 30;
        dia += 30 - dia;
        qtd_dias = mes - dia;

        ano = (30*12) - (qtd_dias);

        System.out.println ("Faltam " + ano + " dias para acabar o ano!");



    }

}