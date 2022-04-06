package dao.nguoc.phan.tu.so.nguyen;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();


        System.out.print("Enter total elements in array: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            myArray[i] = sc.nextInt();
        }

        System.out.println("Array before reversing: " + Arrays.toString(myArray));

        // Reverse array using stack
        for (int i = 0; i < size; i++) {
            myStack.push(myArray[i]);
        }
        int[] reversedArr = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArr[i] = myStack.pop();
        }

        System.out.println("Array after reversing: " + Arrays.toString(reversedArr));

    }
}
