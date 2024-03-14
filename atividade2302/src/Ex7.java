import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String escolhaP;
        String[] opcao = {"Pedra", "Papel", "Tesoura"};

        System.out.printf("Digite sua escolha (Pedra, Papel ou Tesoura): ");
        escolhaP = scan.nextLine();

        boolean escolhaValida = false;
        for(String op : opcao){
            if (escolhaP.equals(op)) {
                escolhaValida = true;
                break;
            }
            if(!escolhaValida){
                System.out.println("Escolha Inválida!");
            }
            else {
                int indiceC = random.nextInt(opcao.length);
                String escolhaC = opcao[indiceC];

                System.out.println("Sua escolha foi " + escolhaP);
                System.out.println("A escolha do Computador foi " + escolhaC);

                String vencedor = determinarVencedor(escolhaP, escolhaC);

                System.out.println("O resultado foi: " + vencedor);
            }
        }


    }
    private static String determinarVencedor(String escolhaP, String escolhaC) {
        if (escolhaP.equals("Pedra") && escolhaC.equals("Tesoura")){
            return "Você";
        }
        else if (escolhaP.equals("Tesoura") && escolhaC.equals("Papel")){
            return "Você";
        }
        else if (escolhaP.equals("Papel") && escolhaC.equals("Pedra")){
            return "Você";
        }
        else if (escolhaP.equals(escolhaC)){
            return "Empate";
        }
        else{
            return "Computador";
        }
    }
    private static boolean opValida(String escolha, String[] opcao) {
        for (String op : opcao) {
            if (opcao.equals(escolha)) {
                return true;
            }
        }
        return false;
    }
}
