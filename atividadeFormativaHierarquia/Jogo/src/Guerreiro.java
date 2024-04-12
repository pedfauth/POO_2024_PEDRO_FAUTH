public class Guerreiro extends Personagem {
    private int forca = 1000;
    private String arma = "Espada";
    public Guerreiro(String nome, int vida) {
        this.setArma(arma);
    }
    public String getArma(String arma) {
        return this.arma;
    }
    public int getForca(int forca) {
        return this.forca = forca;
    }
    public String setArma(String arma) {
        return this.arma = arma;
    }
    public int setForca(int forca) {
        return this.forca = forca;
    }
}
