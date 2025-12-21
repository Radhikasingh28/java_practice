package string;

public class SwapString {
    public static void main(String[] args) {
        String str = "tanisha";
        reverseString(str);
        System.out.println(reverseString(str));
    }

        public static String reverseString(String str){
            char[]arr= str.toCharArray();
            int i = 0;
            int j = str.length() - 1;
            while (i <= j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        return new String(str);
        }
    // by StringBuilder

//        StringBuilder s = new StringBuilder("radhika");
//        //s.reverse();
//        int i=0;
//        int j=s.length()-1;
//        while(i<=j) {
//            char temp1 = s.charAt(i);
//            char temp2 = s.charAt(j);
//            s.setCharAt(i, temp2);
//            s.setCharAt(j, temp1);
//            i++;
//            j--;
//        }

}


