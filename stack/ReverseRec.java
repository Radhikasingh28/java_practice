package stack;

import java.util.Stack;

public class ReverseRec {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }
    public static void Addottom( int x,Stack<Integer> st){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0) {
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }


    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        Addottom(top,st);

    }
}
