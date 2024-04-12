//Classe Conta Bancária: Crie uma classe Conta Bancária com atributos para o nome do titular, número da conta e saldo. Implemente métodos para depositar, sacar e exibir o saldo.
public class ContaBancaria{
    public String nome_titular;
    public int numero_conta_bancaria;
    public double saldo_conta_bancaria;

    public ContaBancaria(){
        this.nome_titular = nome_titular;
        this.numero_conta_bancaria = numero_conta_bancaria;
        this.saldo_conta_bancaria = saldo_conta_bancaria;
    }

    public void informacao_conta_bancaria(double saldo_conta_bancaria){
        System.out.println("O saldo da conta é: " + saldo_conta_bancaria);
    }

    public void sacar_conta_bancaria(double saldo_conta_bancaria, double saque_conta_bancaria){
        if(saldo_conta_bancaria < saque_conta_bancaria){
            System.out.println("O saque não foi efetuado pois não ha saldo suficiente.");
        }
        else{
            saldo_conta_bancaria -= saque_conta_bancaria;
        }
    }

    public void depositar_conta_bancaria(double saldo_conta_bancaria, double deposito_conta_bancaria){
        saldo_conta_bancaria += deposito_conta_bancaria;
    }
}