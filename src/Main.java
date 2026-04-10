// ---------------- UC6 ----------------
System.out.println("-----------------------------------");

HashMap<String, Integer> bogieCapacity = new HashMap<>();

// Adding bogie capacities
bogieCapacity.put("Sleeper", 72);
bogieCapacity.put("AC Chair", 60);
bogieCapacity.put("First Class", 24);
bogieCapacity.put("Cargo", 100);

// Displaying capacity details
System.out.println("Bogie Capacity Details:");

for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
        }