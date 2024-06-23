/*4 ) Criar uma classe Conta, que possua um atributo número e o atributo saldo e os métodos para
depositar, sacar conferir o saldo. Crie uma classe ContaInterface que possui apenas um método que
recebe uma conta e mostra um menu para o usuário em que ele pode escolher entre sair do menu,
depositar um valor, sacar um valor e conferir um saldo. Deve ser possível selecionar essas opções
diversas vezes até o usuário escolher sair. Crie uma classe UsaConta com um método main que cria
uma conta e chame o menu de opções.*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int O = 0;
        float S = 0;

        do { 
            ContaInterface.Interface();
            O = s.nextInt();

            switch (O) {
                case 1:
                    ContaInterface.InterfaceDepositar();
                    float Valor_Depos = s.nextInt();
                    S += Conta.Saldo(Valor_Depos, S);
                    System.err.println("DEPOSITO CONCLUIDO");
                    break;
                case 2:
                    ContaInterface.InterfaceSaque();
                    float Valor_Saque = s.nextInt();
                    if (Valor_Saque <= S) {
                        S -= Conta.Saldo(Valor_Saque);
                        System.err.println("SAQUE CONCLUIDO");
                    } else {
                        System.err.println("SEM SALDO");
                    }
                    break;

                case 3:
                    ContaInterface.InterfaceSaldo(S);
                    break;

                case 4:
                    System.err.println("SAIR");
                    break;

                default:
                    System.out.println("OPCAO INVALIDA");
            }

        } while (O != 4);
    }
}
