class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    void assignCargo(String cargo) {
        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum not allowed in Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println(type + " bogie assigned with cargo: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for " + type);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== UC15: Safe Cargo Assignment ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Another safe assignment
        b2.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}