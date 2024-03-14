import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float cel;

        System.out.printf("Digite a temperatura: ");
        cel = scan.nextInt();

        float far = (cel * 9/5) + 32;

        System.out.println(cel + " graus celcius são " + far + " fahrenheit");
    }
}
