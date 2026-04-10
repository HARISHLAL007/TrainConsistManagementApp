public class Main {

    public static void main(String[] args) {

        System.out.println("=== UC20: Exception Handling During Search ===");

        String[] bogieIds = {}; // try empty and non-empty cases

        String searchKey = "BG101";

        try {
            // Fail-fast check
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available to search");
            }

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

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}