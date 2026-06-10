package string;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String one="listen";
        String two="silent";

        char[] a =one.toCharArray(); // converting string to character array ['l', 'i', 's', 't', 'e', 'n'],,   ['s', 'i', 'l', 'e', 'n', 't']
        char[] b =two.toCharArray();

        Arrays.sort(a); /// sorts the array from asc to desc and below
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b)); //compares both and returns boolean
    }
}
