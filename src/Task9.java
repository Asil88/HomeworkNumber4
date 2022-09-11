public class Task9 {
    public static void main(String[] args) {
        int[]array=new int[12];
        int a=2;
        int b=3;
        boolean w=false;
        for (int i=0;i<array.length;i++){
            array[i]=i;
        }

        for (int i=0;i<array.length;i++){
            if (array[i]%a==0&&array[i]%b!=0){
                w=true;
            }
        }
        System.out.println(w);
    }
}
