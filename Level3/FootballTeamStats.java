import java.util.Arrays;

public class FootballTeamStats {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150 to 250
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Player heights (cm): " + Arrays.toString(heights));

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = meanHeight(heights);

        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.printf("Mean Height: %.2f cm\n", mean);
    }
}

