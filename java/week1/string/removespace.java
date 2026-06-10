package string;

public class removespace {

    public static String  removespace(String str){
        String removedspace=str.replace(" ", "");
        return removedspace;
    }
    public static void main(String[] args) {
        String str="java programming";

      
        System.out.println(  removespace(str));
        
    }
}
