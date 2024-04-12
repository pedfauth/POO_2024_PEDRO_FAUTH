//Classe Estudante: Crie uma classe Estudante com atributos como nome, matrícula e notas. Implemente um método para calcular a média das notas.
public class Estudante{
    public String nome_estudante;
    public String matricula_estudante;
    public float[] notas_estudante;

    public Estudante(String nome_estudante, String matricula_estudante, float[] notas_estudante){
        this.nome_estudante = nome_estudante;
        this.matricula_estudante = matricula_estudante;
        this.notas_estudante = notas_estudante;
    }

    public float media(float[] notas_estudante, float soma){

        for(float nota : notas_estudante){
            soma += nota;
        }

        return soma / notas_estudante.length;
    }
}