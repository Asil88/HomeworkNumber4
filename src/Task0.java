import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            if (array[i] == n) {
                System.out.println("Число входит в массив");
                return;
            }
        }
        System.out.println("Число не входит в массив");

    }
}
