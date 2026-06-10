package week1;

public class loops2 {

    public static void MyFun(int[] arr){
   int i=0;
        while(i<arr.length){
            System.out.println(arr[i] +" ");
            i++;
        }
    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        MyFun(arr);

     
        
    }
}
