import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2: Passenger Bogies (ArrayList)
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + passengerBogies.size());

        System.out.println("-----------------------------------");

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After adding bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        System.out.println("Final bogie list: " + passengerBogies);

        System.out.println("-----------------------------------");

        // UC3: Unique Bogie IDs (HashSet)
        Set<String> bogieIds = new HashSet<>();

        System.out.println("Adding bogie IDs...");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Final unique bogie IDs: " + bogieIds);
    }
}