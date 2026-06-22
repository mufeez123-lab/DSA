package hashmap;
import java.util.*;
public class stringfreq{
    public static void main(String args[]){
        String str="aaabbbc";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch,map.get(ch,0)+1);
        }
        
        for(char ch:str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("Unrepeated values are"+ch);
                break;
            }
        }
    }
}