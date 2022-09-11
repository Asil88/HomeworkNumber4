
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int middlesum = 0;
        int[]array=new int[n];

        for (int i=0;i<n;i++){
            array[i]= (int) ((Math.random()*40));
        }
        for (int i=0;i<n;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        for (int i=0;i<n;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        for (int i=0;i<n;i++){
        middlesum=middlesum+array[i];
        }



        System.out.println("Минимальное число массива = "+min);
        System.out.println("Максимальное число массива = "+max);
        System.out.println("Cреднее значение массива = "+(middlesum/n));
    }
}
