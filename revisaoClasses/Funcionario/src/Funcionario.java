//Classe Funcionário: Crie uma classe Funcionário com atributos como nome, cargo e salário. Implemente um método para calcular o aumento de salário com base em uma porcentagem dada.
public class Funcionario{
    public String nome_funcionario;
    private String cargo_funcionario;
    private float salario_funcionario;
    private float aumento_funcionario;

    public Funcionario(){
        this.nome_funcionario = nome_funcionario;
        this.cargo_funcionario = cargo_funcionario;
        this.salario_funcionario = salario_funcionario;
    }

    public void set_aumento(float salario_funcionario, float percentual_aumento, float aumento_funcionario){
        this.aumento_funcionario = salario_funcionario * (percentual_aumento / 100);
        salario_funcionario += aumento_funcionario;
    }
}