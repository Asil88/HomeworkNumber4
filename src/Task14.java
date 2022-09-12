/*Вычислить среднее арифметическое значение тех элементов одномерного массива,
  которые попадают в интервал от –2 до 10.*/
public class Task14 {
    public static void main(String[] args) {
      int [] array ={-5,-3,-1,1,3,5,7,9,11,13,15,17,19,21,23,25};
      int sum=0;
      int count=0;

      for (int i=0;i<array.length;i++){
          if (-2<array[i]&&array[i]<10){
              count++;
              sum=array[i]+sum;
          }
      }
        System.out.println("Среднее арифметическое "+sum/count);
    }
}
