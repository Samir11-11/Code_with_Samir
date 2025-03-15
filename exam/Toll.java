import java.util.*;
public class Toll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vehicleTypes = {"Car", "Truck"};
        int tollFee;
        boolean rfid;

        while (true) {
            System.out.print("Enter vehicle type (Car/Truck) or 'exit' to quit: ");
            String vehicleType = scanner.nextLine();
            
            if (vehicleType.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (!vehicleType.equalsIgnoreCase(vehicleTypes[0]) && !vehicleType.equalsIgnoreCase(vehicleTypes[1])) {
                System.out.println("Invalid vehicle type. Please enter 'Car' or 'Truck'.");
                continue;
            }
            System.out.print("Does the vehicle have an RFID pass? (true/false): ");
            rfid = scanner.nextBoolean();
            scanner.nextLine();            
            if (vehicleType.equalsIgnoreCase(vehicleTypes[0])) { 
                tollFee = 100;
            } else { 
                tollFee = 200;
            }
            if (rfid) {
                tollFee -= tollFee * 0.10; 
            }

            System.out.println("The toll fee for the " + vehicleType + " is: ₹" + tollFee);
        }
    }
}
