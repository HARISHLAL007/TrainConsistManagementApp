class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " -> " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== UC14: Custom Exception Handling ===");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 56);
            PassengerBogie b3 = new PassengerBogie("First Class", 0); // invalid

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}