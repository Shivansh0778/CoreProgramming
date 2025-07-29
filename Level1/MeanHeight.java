// Create a program to find the mean height of players present in a football team. Hint => a. The formula to calculate the mean is: mean = sum of all elements/number of elements c. Find the sum of all the elements present in the array. b. Create a double array named heights of size 11 and get input values from the user. d. Divide the sum by 11 to find the mean height and print the mean height of the football team

import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height[] = new double[11];
        
        double sum = 0.0;

        for(int i = 0 ; i<11; i++){
            System.out.println("Enter height of player "+ (i+1)+":");
            height[i]=sc.nextDouble();
            sum=sum+height[i];
        }
        sc.close();

        Double Mean=sum/11;
        System.out.println("mean height :"+ Mean);

    }
}
