//Classe Carro: Crie uma classe Carro com atributos como marca, modelo e ano. Implemente métodos para ligar e desligar o carro.
public class Carro{
    public String marca_carro;
    public String modelo_carro;
    public int ano_carro;
    public boolean ligado = false;

    public Carro(){
        this.marca_carro = marca_carro;
        this.modelo_carro = modelo_carro;
        this.ano_carro = ano_carro;
    }

    public void ligar(boolean ligado){
        if(!ligado){
            System.out.println("O carro ligado.");
            ligado = true;
        }
        else{
            System.out.println("O carro já estava ligado.");
        }
    }
    public void desligar(boolean ligado){
        if(ligado){
            System.out.println("O carro desligado.");
            ligado = false;
        }
        else{
            System.out.println("O carro já estava desligado.");
        }
    }

}