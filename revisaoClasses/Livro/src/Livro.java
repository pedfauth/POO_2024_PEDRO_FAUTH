//Classe Livro: Crie uma classe Livro com atributos como título, autor e número de páginas. Crie um método para exibir as informações do livro.
public class Livro{
    public String titulo_livro;
    public String autor_livro;
    public int paginas_livro;

    public Livro(){
        this.titulo_livro = titulo_livro;
        this.autor_livro = autor_livro;
        this.paginas_livro = paginas_livro;
    }

    public void informacoes(String titulo_livro, String autor_livro, int paginas_livro) {
        this.titulo_livro = titulo_livro;
        this.autor_livro = autor_livro;
        this.paginas_livro = paginas_livro;

        System.out.println("O título é: " + titulo_livro);
        System.out.println("O autor é: " + autor_livro);
        System.out.println("O livro tem " + paginas_livro + "páginas");
    }
}