import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ---------------- UC2 ----------------
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

        // ---------------- UC3 ----------------
        System.out.println("-----------------------------------");

        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate

        System.out.println("Unique bogie IDs: " + bogieIds);

        // ---------------- UC4 ----------------
        System.out.println("-----------------------------------");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial train: " + train);

        train.add(2, "Pantry");
        System.out.println("After adding Pantry: " + train);

        train.removeFirst();
        train.removeLast();

        System.out.println("Final train consist: " + train);

        // ---------------- UC5 ----------------
        System.out.println("-----------------------------------");

        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate (ignored)

        System.out.println("Final train formation (no duplicates, ordered): " + formation);
    }
}