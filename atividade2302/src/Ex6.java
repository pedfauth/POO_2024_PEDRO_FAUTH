import java.util.Random;

public class Ex6 {
    public static int rolada(){
        Random random = new Random();
        int randomInt = random.nextInt(6);

        int result = randomInt + 1;

        return result;
    }
    public static void main(String[] args) {
        int rolada = rolada();
        System.out.println("Você rolou um " + rolada);
    }
}
