import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Welcome Message (UC1)
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (UC1)
        List<String> passengerBogies = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + passengerBogies.size());

        System.out.println("-----------------------------------");

        // UC2: Add Passenger Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After adding bogies: " + passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        // Final state
        System.out.println("Final bogie list: " + passengerBogies);
    }
}