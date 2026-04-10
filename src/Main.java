import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();

        System.out.println("Adding bogie IDs...");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Final unique bogie IDs:");
        System.out.println(bogieIds);
    }
}