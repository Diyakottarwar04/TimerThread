import java.util.*;

// Custom Exception
class InvalidBatteryException extends Exception {
    public InvalidBatteryException(String message) {
        super(message);
    }
}

public class Drone {

    // Method to add drone entry with validation
    public static void addDrone(HashMap<Integer, Double> droneMap, Integer droneId, Double batteryPercentage) throws InvalidBatteryException {
        if (batteryPercentage > 100.0) {
            throw new InvalidBatteryException("Invalid battery percentage (>100%) for Drone ID: " + droneId);
        }
        droneMap.put(droneId, batteryPercentage);
    }

    public static void main(String[] args) {
        HashMap<Integer, Double> droneMap = new HashMap<>();

        // Insert at least 5 sample entries
        try {
            addDrone(droneMap, 201, 45.0);
            addDrone(droneMap, 202, 12.5);
            addDrone(droneMap, 203, 85.0);
            addDrone(droneMap, 204, 100.0);
            addDrone(droneMap, 205, 67.0);
            
            // Uncomment to test exception
            // addDrone(droneMap, 206, 110.0);

        } catch (InvalidBatteryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display all drones with status
        System.out.println("\nDrone Battery Status:");
        for (Map.Entry<Integer, Double> entry : droneMap.entrySet()) {
            Integer id = entry.getKey();
            Double battery = entry.getValue();
            if (battery < 15.0) {
                System.out.println("Drone ID: " + id + " -> Battery: " + battery + "% (Needs Recharge)");
            } else {
                System.out.println("Drone ID: " + id + " -> Battery: " + battery + "%");
            }
        }

        // Find and print drone with highest battery
        Integer maxId = null;
        Double maxBattery = -1.0;
        for (Map.Entry<Integer, Double> entry : droneMap.entrySet()) {
            if (entry.getValue() > maxBattery) {
                maxBattery = entry.getValue();
                maxId = entry.getKey();
            }
        }

        if (maxId != null) {
            System.out.println("\nDrone with highest battery:");
            System.out.println("Drone ID: " + maxId + " -> Battery: " + maxBattery + "%");
        } else {
            System.out.println("No drones found.");
        }
    }
}
