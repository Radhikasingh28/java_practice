package string;

import java.util.Arrays;

public class MaxOccurChar {
    public static void main(String[] args) {
        String s1 = "character";
        System.out.println(getMaxOccur(s1));

    }

    public static char getMaxOccur(String s1) {
//        frequency array t.c=O(n)

        int maxOccur = 0;
        char ans = s1.charAt(0);
        int []freq = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int idx = ch-97;
            freq[idx]++;
        }
        for(int i=0;i<26;i++){
            if (freq[i]>maxOccur){
                maxOccur=freq[i];
                ans=(char)(i+97);
            }
        }


//      by sorting t.c = O(nlogn)

//        int maxOccur = 0;
//        int freq = 0;
//        char ans = s1.charAt(0);
//        char[] arr = s1.toCharArray();
//        Arrays.sort(arr);
//        int i = 0, j = 0;
//        while (j < s1.length()) {
//            if (arr[i] == arr[j]) j++;
//            else {
//                freq = j - i;
//                if (freq > maxOccur) {
//                    maxOccur = freq;
//                    ans = arr[i];
//                }
//                i = j;
//            }
//            freq = j - i;  //if the max freq alfa is  in last ,, so we have to do this otherwise loop break eairly and not consider the ast result
//            if (freq > maxOccur) {
//                maxOccur = freq;
//                ans = arr[i];
//            }
//        }

//brute force t.c = O(n2)

// for(int i =0;i<s1.length();i++){
//            int occur =1;
//            char ch = s1.charAt(i);
//            for(int j=i+1;j<s1.length();j++) {
//                if (s1.charAt(i) == s1.charAt(j)) {
//                    occur++;
//                }
//            }
//                if(occur>maxOccur){
//                    maxOccur=occur;
//                    ans=ch;
//                }
//                else if(occur==maxOccur&&ch<ans){
//                    ans = ch;
//
//                }
//            }


            return ans;
        }
    }

