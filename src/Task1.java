import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] array = new int[50];


            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(40);
            }

            Arrays.sort(array);

            int sum = array.length;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == n) {
                    sum = sum - 1;
                }
            }
            int[] newArray = new int[sum];

            for (int i = 0; i < sum; i++) {
                if (i < sum) {
                    if (array[i] != n)
                        newArray[i] = array[i + 1];
                } else {
                    System.out.println("Число не входит в массив");
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(newArray));

        }

}
