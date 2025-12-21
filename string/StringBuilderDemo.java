package string;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        System.out.println(s.length() +" "+ s.capacity());
      s.append("garg");
        System.out.println(s.length() +" "+ s.capacity());
        s.setCharAt(1,'r');
        System.out.println(s);
    }
}
