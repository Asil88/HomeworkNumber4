public class Task8 {
    public static void main(String[] args) {
        int[]array=new int[]{1,2,3,4,4,4,5,6,7,8,9,10};
        boolean r = false;
        int e =array[0];
        for (int i=1;i< array.length+2;i++){
          if (array.length-2>=i) {
              if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                  r = true;
              }
          }else{
              break;
          }
        }
        System.out.println(r);
    }
}
