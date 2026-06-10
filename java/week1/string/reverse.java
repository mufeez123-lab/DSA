package string;

public class reverse {
    public static void main(String[] args) {
        String str="Hello";

        String reverse=" ";
        int string=str.length();

        for(int i=string-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}
