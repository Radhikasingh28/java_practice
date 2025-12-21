package string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        if(anagram(s1,s2)==true){
            System.out.println("string is anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
    public static boolean anagram(String s1,String s2) {
        if(s1.length()!=s2.length())return false;
        char[] arr = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        for (int i = 0; i < s1.length();i++) {
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }


}
