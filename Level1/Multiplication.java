//  5. Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result Hint => a. Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult b. Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array c. Finally, display the result from the array in the format number *i=

import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int arr[] = new int[4];
        for (int i = 6; i <= 9; i++) {
            arr[i - 6] = n * i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(n + " * " + (i + 6) + " = " + arr[i]);
        }
    }
}

