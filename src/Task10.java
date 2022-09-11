import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 6, 7, 7, 7, 8, 10, 10, 12, 12, 12};
        int max = Integer.MIN_VALUE;
        boolean t = false;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (max == array[i - 1]) {
                t = true;
            }
        }

        if (t) {
            System.out.print("Максимально число  "+max+ " не является единственным");
        }

    }
}
