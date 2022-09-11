public class Task3 {
    public static void main(String[] args) {
        int []arr1={1,3,5,7,9};
        int []arr2={2,4,6,8,10};
        int sum1=0;
        int sum2=0;
        for (int i=0;i<5;i++){
            sum1=sum1+arr1[i];
            sum2=sum2+arr2[i];
        }
        if (sum1/5==sum2/5){
            System.out.println("Средние арефмитическме массивов равны");
        } else if (sum1/5>sum2/5) {
            System.out.println("Средние арефмитическме первого массива = "+sum1+" больше");
        }else if (sum1/5<sum2/5){
            System.out.println("Средние арефмитическме второго массива = "+sum2+" больше");
        }

    }
}
