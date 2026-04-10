import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names ===");

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Using built-in sort
        Arrays.sort(bogieNames);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("Program continues...");
    }
}