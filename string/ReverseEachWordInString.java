package string;

public class ReverseEachWordInString {
    public static  String reverseWord(String str){
        String ans="";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans=ans+sb;
                ans=ans+" ";
                sb=new StringBuilder("");
            }
        }
        sb.reverse();
        ans=ans+sb;
        return ans;

    }
    public static void main(String[] args) {
        String str = " i am an educator";
        System.out.println(reverseWord(str));
    }
}
