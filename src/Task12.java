import java.util.Arrays;

//Дан одномерный массив целых чисел. Найдите, сколько раз в нем повторяется самое частое число.
public class Task12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 5, 5, 6, 1, 6, 6, 7, 7, 7, 7, 7, 23, 34, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1};
        int max = 0;// Максимальное кол-во повторов числа(счетчик)
        int num = 0;// Число с самым большим кол-вом повторов
        int n = 1;// Число повтора,по умолчанию 1
        int count = 0;//Переменная в которое сохраняется число повторов
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                n++;
                count = n;
                if (max < count) {
                    max = count;
                    num = array[i];
                }
            } else {
                n = 1;
            }
        }
        System.out.println("Число " + num + " встречается " + max + " раз");
    }
}