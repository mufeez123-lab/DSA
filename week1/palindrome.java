package week1;

public class palindrome {
    // public static void main(String[] args) {
    //     int n=121;

    //     int rev=0;
    //     int temp=n;

    //     while(n>0){
    //         int result=n%10;
    //         rev=rev*10+result;
    //         n=n/10;
    //     }

    //     if(temp==rev){
    //         System.out.println("Palindrome");
    //     }else{
    //         System.out.println("Not Palidrome");
    //     }
     

    //     }

    public static void main(String[] args) {
        int n=121;

        String str=Integer.toString(n);

        char[] digits=str.toCharArray();
        String reverse="";

        for(int i=digits.length-1;i>=0;i--){
            reverse+=digits[i];
            
        }
       if(str.equals(reverse)){
        System.out.println(n+ " Palindrome ");
       }else{
        System.out.println("not a palindrome");
       }
    }
    }
