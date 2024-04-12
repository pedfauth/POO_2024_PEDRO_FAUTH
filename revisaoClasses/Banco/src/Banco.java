//Classe Banco: Crie uma classe Banco que represente uma conta bancária. Inclua atributos como número da conta, saldo e métodos para depósito e retirada de dinheiro.
public class Banco{
    public int numero_conta;
    private float saldo_conta;

    public Banco(int numero_conta, float saldo_conta){
        this.numero_conta = numero_conta;
        this.saldo_conta = saldo_conta;
    }

    public void depositar(float saldo_conta, float deposito_conta){
        this.saldo_conta = saldo_conta;

        saldo_conta += deposito_conta;
        System.out.println("Você depositou " + deposito_conta + " o valor total da conta é: " + saldo_conta);
    }

    public void sacar(float saldo_conta, float saque_conta){
        this.saldo_conta = saldo_conta;

        if(saldo_conta < saque_conta){
            System.out.println("Não foi possível sacar. Valor insuficiente.");
        }
        else{
            saldo_conta -= saque_conta;
            System.out.println("Você sacou " + saque_conta + " o valor total da conta é: " + saldo_conta);
        }
    }
}
