import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner objScan = new Scanner(System.in);

        float num1,num2,num3;

        System.out.printf("Digite seu número: ");
        num1 = objScan.nextInt();
        System.out.printf("Digite seu número: ");
        num2 = objScan.nextInt();
        System.out.printf("Digite seu número: ");
        num3 = objScan.nextInt();

        float media = (num1+num2+num3) / 3;


        System.out.println("a média é " + media);
    }
}
