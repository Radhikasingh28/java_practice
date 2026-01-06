package stack;

public class ImplentationWithLL {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;

        }
    }
    public static class Stackll{
        node head = null;
        int size =0;
        void push(int x){
            node temp = new node (x);
            temp.next=head;
            head=temp;
            size++;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;

            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
           if(head==null){
               System.out.println("stack is empty");
              return -1;
           }
           int x = head.data;
           head = head.next;
           size--;
           return x;
        }
    }


    public static void main(String[] args) {
        Stackll st = new Stackll();
        st.push(2); //2
        st.display();
        st.push(3);//2 3
        st.display();
        st.push(4);//2 3 4
        st.display();
        System.out.println(st.peek());//4

        st.push(5);//2 3 5
        st.display();
        st.pop();
        st.pop();
        st.display();//2
        System.out.println(st.size());//1
        st.display();
        st.push(6);//2 6
        st.display();
        st.peek();//6
        st.display();
        System.out.println(st.size());//2

    }
}
