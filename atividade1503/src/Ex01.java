import java.util.ArrayList;
import java.util.List;
public class Ex01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Augusto");
        nomes.add("Ferreira");
        nomes.add("Fauth");

        for (String n: nomes) {
            System.out.println(n);
        }
    }
}