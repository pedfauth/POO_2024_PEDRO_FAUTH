//Classe Pessoa: Crie uma classe Pessoa com atributos como nome, idade e endereço. Crie métodos para configurar e obter esses atributos.
public class Pessoa{
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String get_nome(){
        return this.nome;
    }
    public int get_idade(){
        return this.idade;
    }
    public String get_endereco(){
        return this.endereco;
    }
}