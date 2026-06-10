package string;

public class unrepeated {
    public static void main(String[] args) {
        String str="swissed";
        int length=str.length();


        for(int i=0;i<length;i++){
            char ch=str.charAt(i);
            int count=0;


            for(int j=0;j<length;j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }

            if(count==1){
                System.out.print(ch+ " ");
            }

        }
    }
}
