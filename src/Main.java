import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance Check ===");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try invalid case:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Goods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // Safety check using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        System.out.println("----------------------------");

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}