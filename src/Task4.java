import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Random random=new Random();
        int n=scanner.nextInt();
        if (5<n&&n<=10){
            int[]array1=new int[n];

            for (int i=0;i<array1.length;i++){
                array1[i]=random.nextInt(20);
            }

            System.out.println("Массив случайных чисел "+Arrays.toString(array1));

            int[]array2=new int[n];

            for (int i=0;i<array2.length;i++){
               if (array1[i]%2==0){
                   array2[i]=array1[i];
               }
            }
            System.out.println("Массив только четных чисел первого массива "+Arrays.toString(array2));


        }else{
            System.out.println("Неудовлетворительный размер массива");
            System.out.println("Введите число от 5 до 10 включительно...");
        }




    }
}
