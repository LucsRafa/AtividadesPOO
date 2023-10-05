import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Lucas Rafael";
        String tipo = "Poupança";
        double saldo = 1800.00;
        int escolha = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipo);
        System.out.println("Saldo atual " + saldo);
        System.out.println("***********************");

        String menu = """
                **Escolha a opção**
                                
                1 - Consulta Saldo
                2 - Tranferir valor 
                3 - Receber valor
                4 - sair
                """;

        while (escolha != 4) {
            System.out.println(menu);
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo: " + saldo);
            } else if (escolha == 2) {
                System.out.println("Insira o valor a ser transferido: ");
                double valorTranferido = leitura.nextDouble();

                if (valorTranferido > saldo) {
                    System.out.println("Saldo Insufisiente ");
                } else {

                    saldo -= valorTranferido  ;

                System.out.println("Saldo atual: " + saldo);}
            }
            else if (escolha == 3) {
                System.out.println("Insira o valor a ser Recebido: ");
                double valorRecebido = leitura.nextDouble();

                if (valorRecebido > saldo) {

                    saldo += valorRecebido  ;

                    System.out.println("Saldo atual: " + saldo);
                }
                else if (escolha != 4) {
                    System.out.println("opção invalida!!!!!!");



                }
            }
        }
    }
}





