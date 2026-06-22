package hashmap;
import java.util.*;
public class anagram{
    public static void main(String args[]){
        String str1="silent";
        String str2="listen";

        if(str1.length()!=str2.length()){
            System.out.println("Not an anagram");
            break;
        }

        HashMap<Character,Integer> map=new HasMap<>();

        for(char ch:str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:str2.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        boolean anagram=true;

        for(int count:map.values()){
            if(count!=0){
                anagram=false;
                break;
            }
        }
        System.out.println(anagram);
    }
}