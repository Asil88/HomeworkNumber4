import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {-1, -2, -3, -4, -5, 1, 2, 3, 4, 56, 7, 8, 9, 10, 11, 20, 24, 28, 132, 124, 1292};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));

            for (int i=1,j=0;i<array.length;i++,j++){
                array[j]=array[i-1];
                System.out.print(array[j]+"\t");
            }


    }
}