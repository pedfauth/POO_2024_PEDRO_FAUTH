//Classe Triângulo: Crie uma classe Triângulo com atributos para os lados (a, b, c). Implemente um método para verificar se é um triângulo válido e outro para calcular a área.
public class Triangulo{
    private double a;
    private double b;
    private double c;

    public Triangulo(){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean verifica_triangulo(){
        return ((a + b) > c) && ((b + c) > a) && ((a + c) > b);
    }

    public double area_triangulo(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}