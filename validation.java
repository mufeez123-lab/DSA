package week1;
import java.util.*;
public class validation {

    public static int Myval(Scanner sc){
            int num;

            while(true){
                System.out.println("Enter the Number: ");
                num=sc.nextInt();

                if(num>0){
                    return num;
                }else{
                        System.out.println("Invalid input!!");
                }
            }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
         
        int number=Myval(sc);
        System.out.println("Valid number is "+number);
        
    }
}
