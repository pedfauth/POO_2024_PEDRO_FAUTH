import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;

        System.out.printf("Digite sua idade: ");
        idade = scan.nextInt();

        String opc = new String();

        if (idade >= 18) {
            opc = "maior";
        }
        else if (idade < 18) {
            opc = "menor";
        }

        System.out.println("Você é " + opc + " de idade.");
    }
}
