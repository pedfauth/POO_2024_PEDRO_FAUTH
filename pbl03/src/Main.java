import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();
        int numeroContaAtual = 1;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar uma conta");
            System.out.println("2. Ver o saldo de uma conta");
            System.out.println("3. Sacar");
            System.out.println("4. Depositar");
            System.out.println("Qualquer outro número para finalizar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do titular:");
                    String nomeTitular = scanner.next();
                    System.out.println("Digite o saldo inicial:");
                    double saldoInicial = scanner.nextDouble();

                    Conta novaConta = new Conta(nomeTitular, numeroContaAtual, saldoInicial);
                    contas.add(novaConta);

                    System.out.println("Conta criada com sucesso. Número da conta: " + numeroContaAtual);
                    numeroContaAtual++;
                    break;
                case 2:
                    System.out.println("Digite o número da conta:");
                    int numeroConta = scanner.nextInt();
                    boolean contaEncontrada = false;
                    for (Conta conta : contas) {
                        if (conta.getNumeroConta() == numeroConta) {
                            System.out.println("Saldo da conta " + numeroConta + ": " + conta.getSaldo());
                            contaEncontrada = true;
                            break;
                        }
                    }
                    if (!contaEncontrada) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da conta:");
                    int numContaSaque = scanner.nextInt();
                    for (Conta conta : contas) {
                        if (conta.getNumeroConta() == numContaSaque) {
                            System.out.println("Digite o valor que será sacado:");
                            double valorSaque = scanner.nextDouble();
                            if (conta.sacar(valorSaque)) {
                                System.out.println("Saque efetuado com sucesso.");
                            } else {
                                System.out.println("Saldo insuficiente para sacar o valor especificado.");
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da conta:");
                    int numContaDeposito = scanner.nextInt();
                    for (Conta conta : contas) {
                        if (conta.getNumeroConta() == numContaDeposito) {
                            System.out.println("Digite o valor que será depositado:");
                            double valorDeposito = scanner.nextDouble();
                            conta.depositar(valorDeposito);
                            System.out.println("Depósito efetuado com sucesso. Saldo atualizado: " + conta.getSaldo());
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Finalizando o programa.");
                    return;
            }
        }
    }
}

