import java.util.*;

public class Jogo_Vetores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String[] jogador = new String[2];
        int[][] niveis = new int[2][4];

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
            jogador[i] = scan.next();
            for (int j = 0; j < 4; j++) {
                niveis[i][j] = rand.nextInt(101);
            }
        }

        opcoes(scan, jogador, niveis); // Passando jogador e niveis como parâmetros
    }

    public static void opcoes(Scanner scan, String[] jogador, int[][] niveis) {
        int op;
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Ver pontos do nível");
            System.out.println("2 - Ver vencedor");
            System.out.println("0 - Sair");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    pontosDoNivel(jogador, niveis, scan);
                    break;
                    
                case 2:
                	 int totalJogador1 = 0;
                	    int totalJogador2 = 0;
                	    for (int i = 0; i < 2; i++) {
                	        int totalJogador = 0;
                	        for (int j = 0; j < 4; j++) {
                	            totalJogador += niveis[i][j];
                	        }
                	        if (i == 0) {
                	            totalJogador1 += totalJogador;
                	        } else {
                	            totalJogador2 += totalJogador;
                	        }
                	    }
                	    vencedor(totalJogador1, totalJogador2);
                	    
                	 break;
                   
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }

    public static void pontosDoNivel(String[] jogador, int[][] niveis, Scanner scan) {
        System.out.println("Digite o número do jogador que deseja ver: 1 - " + jogador[0] + ", 2 - " + jogador[1]);
        int verJogador = scan.nextInt();
        System.out.println("Digite o número do nível que deseja ver: ");
        int verNivel = scan.nextInt();

        if (verJogador > 0 && verJogador <= jogador.length && verNivel > 0 && verNivel <= niveis[0].length) {
            System.out.println("Resultados do nível " + verNivel + " para o jogador " + jogador[verJogador - 1] + ": ");
            System.out.println("Pontos: " + niveis[verJogador - 1][verNivel - 1]);
        } else {
            System.out.println("Jogador ou nível inválido.");
        }
    }

    public static void vencedor(int totalJogador1, int totalJogador2) {
        if (totalJogador1 > totalJogador2) {
            System.out.println("O melhor jogador foi o Jogador 1");
        } else if (totalJogador2 > totalJogador1) {
            System.out.println("O melhor jogador foi o Jogador 2");
        } else {
            System.out.println("Os jogadores empataram");
        }
    }

}
