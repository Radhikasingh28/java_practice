package string;

public class StringCompress {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
    public static String compress(String str){
        //ist method

//        String ans="";
//        int count=1;
//        for(int i=1;i<str.length();i++) {
//            char curr = str.charAt(i);
//            char pre = str.charAt(i-1);
//            if(curr==pre){
//                    count++;
//                } else {
//                    ans = ans + pre + count;
//                    count = 1;
//                }
//            }
//        ans = ans + str.charAt(str.length()-1) +count;
//
//        return ans;

//2nd method

        String ans="a";
        int count=1;
       for(int i=1;i<str.length();i++) {
          char curr = str.charAt(i);
          char pre = str.charAt(i-1);
            if(curr==pre){
                    count++;
                }   else{
                ans=ans+count;
                ans=ans+curr;
                count=1;

            }

            }
       ans = ans+count; //for last char
       return ans;

    }
}
