import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe scanner
        // Exibir as mensagens para o usuário
        // Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem de saída final

        String mensagemSaida = registrarDadosBancarios();

        System.out.println(mensagemSaida);

    }

    public static String registrarDadosBancarios() {
        /**
         * Método criado para fazer o registro dos dados bancários
         */

        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o número da Conta. ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, insira o número da Agência. ");
        String agencia = scanner.next();

        System.out.println("Por favor, insira o nome do Cliente. ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o valor de saldo. ");
        double saldo = scanner.nextDouble();

        scanner.close();

        // Mensagem de saída concatenada conforme solicitado no desafio
        String saida = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ")
                .concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        return saida;
    }
}
