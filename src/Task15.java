/*Найти сумму элементов массива целых чисел, которые делятся на 5 и на 8 одновременно.*/
public class Task15 {
    public static void main(String[] args) {
        int []array=new int[100];
        int sum=0;
        for(int i=0;i< array.length;i++){
            array[i]=i;
        }
        for(int i=0;i< array.length;i++){
            if (i%5==0&&i%8==0){
                sum=array[i]+sum;
            }
        }
        System.out.println("Сумма чисел равна "+sum);
    }
}
