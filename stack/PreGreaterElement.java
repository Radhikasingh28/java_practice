package stack;

import java.util.Stack;

public class PreGreaterElement {
    public static void main(String[] args) {
        int []arr={100,80,60,70,75,60,85};
        int []res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int i=0;
        res[i]=-1;
        st.push(arr[i]);
        for(i=0;i<arr.length;i++){
            while(st.peek()<arr[i] && st.size()>0){
                st.pop();
            }
            if(st.peek()>arr[i]){
                res[i]=st.peek();
                st.push(arr[i]);
            }
        }
        for( i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for( i=0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        }

    }
}
