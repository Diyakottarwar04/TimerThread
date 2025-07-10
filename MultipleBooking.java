import java.util.*;

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String msg) {
        super(msg);
    }
}

public class MultipleBooking {
    public static void main(String[] args) throws SeatAlreadyBookedException {
        TreeMap<Integer, String> seatMap = new TreeMap<>();

        // Initialize all seats as "Available"
        for (int i = 1; i <= 5; i++) {
            seatMap.put(i, "Available");
        }

        int seatToBook = 3;

        // Check if the seat is already booked
        if (seatMap.get(seatToBook).equals("Booked")) {
            throw new SeatAlreadyBookedException("Seat " + seatToBook + " is already booked!");
        } else {
            // Mark the seat as booked
            seatMap.put(seatToBook, "Booked");
            System.out.println("Seat " + seatToBook + " successfully booked.");
        }

        // Print seat status
        System.out.println("\nSeat Status:");
        for (Map.Entry<Integer, String> e : seatMap.entrySet()) {
            System.out.println("Seat " + e.getKey() + ": " + e.getValue());
        }
    }
}
