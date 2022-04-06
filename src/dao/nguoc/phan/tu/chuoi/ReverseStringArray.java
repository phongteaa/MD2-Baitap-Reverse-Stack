package dao.nguoc.phan.tu.chuoi;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Character> myStack = new Stack<>();

        System.out.print("Enter a random string: ");
        String str = input.nextLine();

        System.out.println("Original string: " + str);

        for (int i = 0; i < str.length(); i++) {
            myStack.push(str.charAt(i));
        }

        StringBuilder reversedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            reversedStr.append(myStack.pop());
        }

        System.out.println("String after reversing: " + reversedStr);
    }
}
