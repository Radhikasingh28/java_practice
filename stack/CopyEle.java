package stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st =new Stack<>();

//        System.out.println("enter the no of elements ");
//        int n = sc.nextInt() ;
//        System.out.println("enter the elements");
//        for(int i=1;i<=n;i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
        st.push(1);
        st.push(6);
        st.push(67);
        st.push(7);
        System.out.println(st);
//        reverse the stack
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
//            int x=st.peek();
//            gt.push(x);
//            st.pop();
            gt.push(st.pop());

        }
        System.out.println(gt);
        Stack<Integer> rt = new Stack<>();
        while(gt.size()>0){
            int x=gt.peek();
            rt.push(x);
            gt.pop();

        }
        System.out.println(rt);

    }
}
