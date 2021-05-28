import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static List<Room> getAllRooms(Hotel hotel) {

        return hotel.getRoomList();
    }

    public static List<Room> getAllFreeRooms(Hotel hotel) {
        List<Room> freeRoomsList = new ArrayList<>();

        for (Room room : hotel.getRoomList()) {
            if (room.isAvailable() == true) {
                freeRoomsList.add(room);
            }
        }
        return freeRoomsList;
    }

    public static void bookRoom(int roomNumber, Hotel hotel) {
        for (Room room : hotel.getRoomList()) {
            if (room.getRoomNumber() == roomNumber) {
                if (room.isAvailable() == true) {
                    room.setAvailable(false);
                } else
                    System.out.println("Podany pokój jest już zajęty");
            }
        }
    }

    public static void freeRoom(int roomNumber, Hotel hotel) {
        for (Room room : hotel.getRoomList()) {
            if (room.getRoomNumber() == roomNumber) {
                if (room.isAvailable() == false) {
                    room.setAvailable(true);
                } else System.out.println("Pokój nie był zajęty");
            }
        }
    }

}
