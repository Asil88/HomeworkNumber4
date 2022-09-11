import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array=new int[]{23,55,-2,42,-5,1,8,26,90,0};
        int x = 0;
        System.out.println(Arrays.toString(array));

        for (int i=1;i< array.length;i++){
            for (int j= array.length-1;j>=i;j--){
                if (array[j-1]>array[j]){
                    x=array[j-1];
                    array[j-1]=array[j];
                    array[j]=x;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }
}

