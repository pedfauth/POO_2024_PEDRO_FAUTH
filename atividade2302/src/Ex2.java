import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner objScan = new Scanner(System.in);
        System.out.printf("Digite um número ");

        float num;
        num = objScan.nextInt();

        String op;
        if(num > 0){
            op = "positivo";
        }
        else if(num < 0) {
            op = "negativo";
        }
        else{
            op = "zero";
        }

        System.out.println("O número " + num + " é " + op);
    }
}