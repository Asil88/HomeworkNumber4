/*Дан целочисленный линейный массив из 10 элементов. Найдите наименьшее число K элементов,
которое нужно исключить из последовательности A[1],A[2],…,A[10],
чтобы осталась возрастающая последовательность.*/

public class Task13 {
    public static void main(String[] args) {
    int array[]={1,6,3,8,22,6,7,33,9,10};
    int k=0;
    for (int i=1;i<array.length;i++){
        if (array[i]>array[i-1]){
            k++;
        }
    }
        System.out.println(k);
    }
}
