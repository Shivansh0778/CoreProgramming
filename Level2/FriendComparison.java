import java.util.Scanner;

public class FriendComparison {

    public static String findYoungest(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return names[minIndex];
    }

    public static String findTallest(String[] names, double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}

