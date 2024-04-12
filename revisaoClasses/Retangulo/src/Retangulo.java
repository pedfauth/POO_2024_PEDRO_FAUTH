//Classe Retângulo: Crie uma classe Retângulo com atributos de largura e altura. Implemente métodos para calcular a área e o perímetro do retângulo.
public class Retangulo{
    public double largura;
    public double altura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double perimetro(double altura, double largura){
        return (2 * altura) + (2 * largura);
    }

    public double area(double altura, double largura){
        return altura * largura;
    }
}