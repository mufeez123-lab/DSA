package week1;
import java.util.Scanner;

public class index1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your Name: ");
     String name=sc.nextLine();

     System.out.println("Enter your Mail ID: ");
     String email=sc.nextLine();

     System.out.println("Enter your Age: ");
     int age=sc.nextInt();
          sc.nextLine();

     System.out.println("Enter your password: ");
     String password=sc.nextLine();



     System.out.println("Your name is : "+name);
     System.out.println("Your email is : "+email);
     System.out.println("Your age is : "+age);
     System.out.println("Your password is : "+password);
    }
}
