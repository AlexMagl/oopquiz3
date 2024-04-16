package quizes.q3.aleksandre_maghlakelidze_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManager {
        private Map<String, Room> guestMap;

        public HotelManager() {
                this.guestMap = new HashMap<>();
        }

        public void checkIn(Person person, Room room) {
                guestMap.put(person.getId(), room);
        }

        public void checkOut(Person person) {
                guestMap.remove(person.getId());
        }

        public void displayInfo() {
                System.out.println("Guests and their rooms:");
                for (Map.Entry<String, Room> entry : guestMap.entrySet()) {
                        String guestId = entry.getKey();
                        Room room = entry.getValue();
                        System.out.println("Guest ID: " + guestId + ", Room Number: " + room.toString());
                }
        }

        // Additional methods if needed
}