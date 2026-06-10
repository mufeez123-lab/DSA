package week1;
import java.util.*;

public class funvloop {


    public static void printNum(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
    
    

        }
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the array");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            

        }

        System.out.println("array elements are: ");
        printNum(arr);

      
         


        
        
    }
}
