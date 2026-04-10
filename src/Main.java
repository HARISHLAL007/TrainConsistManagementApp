public class Main {
    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309"; // change value to test

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND");
        }

        System.out.println("Program continues...");
    }
}
