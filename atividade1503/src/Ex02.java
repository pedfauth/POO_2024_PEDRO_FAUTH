import java.util.Set;
import java.util.HashSet;
public class Ex02 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        nomes.add("Pedro");
        nomes.add("Kwon");
        nomes.add("Enzo");
        nomes.add("Carol");
        nomes.add("Breno");
        nomes.add("Giulio");


        boolean find = nomes.contains("Pedro");
        if (find){System.out.println("Achou!");}

        boolean delete = nomes.remove("Giulio");

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
