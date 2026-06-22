package hashmap;
import java.util.*;
public class duplicate{
    public static void main(String args[]){
        int[] arr={1,3,3,2,2,5};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(key);
            }
        }
    }

}