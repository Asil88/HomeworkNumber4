import java.util.Arrays;
import java.util.Random;

/*Размерность массива –30. Заполнение массива осуществить случайными числами от 500 до 1000.*/
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[30];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
           array[i]=random.nextInt(500,1000);
        }
        System.out.println(Arrays.toString(array));
    }
}
