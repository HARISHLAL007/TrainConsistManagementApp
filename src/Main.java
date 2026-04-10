import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== UC9: Group Bogies by Type ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 58));

        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Grouping by bogie name (type)
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("----------------------------");
        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}