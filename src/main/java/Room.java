public class Room {

    private int roomNumber;
    private int numberOfPeople;
    private boolean hasBathroom;
    private boolean isAvailable;

    public Room(int roomNumber, int numberOfPeople, boolean hasBathroom, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.numberOfPeople = numberOfPeople;
        this.hasBathroom = hasBathroom;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "\nRoom{" +
                "roomNumber=" + roomNumber +
                ", numberOfPeople=" + numberOfPeople +
                ", hasBathroom=" + hasBathroom +
                ", isAvailable=" + isAvailable +
                "}";
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
