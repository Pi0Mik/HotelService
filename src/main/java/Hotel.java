import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    private List<Room> roomList = new ArrayList<>();

    public Hotel(int howManyRooms) {
        List<Integer> roomNumbers = generateRoomNumbers(howManyRooms);

        for (int i = 0; i < howManyRooms; i++) {
            roomList.add(new Room(
                    roomNumbers.get(i),
                    generateRoomCapacity(),
                    generateBoolean(0.25),
                    generateBoolean(0.5)));
        }
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    private List<Integer> generateRoomNumbers(int totalRoomsNumber) {
        List<Integer> roomNumbersList = new ArrayList<>();
        int roomsPerFloor;
        //zakładam, że hotel ma 3 piętra
        if (totalRoomsNumber % 3 == 0) roomsPerFloor = totalRoomsNumber / 3;
        else roomsPerFloor = totalRoomsNumber / 3 + 1; //zaokraglam int w gore jesli sie nie dzieli na 3

        for (int floorNumber = 1; floorNumber <= 3; floorNumber++) {
            for (int roomLastDigits = 0; roomLastDigits < roomsPerFloor; roomLastDigits++) {
                roomNumbersList.add(floorNumber * 100 + roomLastDigits);
                totalRoomsNumber--; //na ostatnim pietrze bedzie mniej pokoi, jesli ich liczba niepodzielna przez 3
                if (totalRoomsNumber == 0) break;
            }
        }
        return roomNumbersList;
    }

    private int generateRoomCapacity() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    private boolean generateBoolean(double probablityOfFalse) {
        if (Math.random() > probablityOfFalse) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "roomList=" + roomList +
                '}';
    }
}
