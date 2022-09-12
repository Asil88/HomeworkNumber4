import java.util.Arrays;

/* В линейном массиве найти максимальный элемент.
Вставьте порядковый номер элемента за ним, передвинув все оставшиеся на одну позицию вправо.*/
public class Task11 {
    public static void main(String[] args) {
        int[] array = {-1, -2, -3, -4, -5, 1, 2, 3, 4, 56, 7, 223, 9, 10, 11, 20, 24, 28, 132, 124, 12};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            if (array[i] == max) {
                array[i]=array[i-1];

            }
            System.out.print(array[i] + "\t");
        }

    }
}


