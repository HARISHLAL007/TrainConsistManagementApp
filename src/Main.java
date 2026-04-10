import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        String searchKey = "BG309"; // change value to test

        // Step 1: Sort array (important precondition)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(searchKey);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND");
        }

        System.out.println("Program continues...");
    }
}