import java.util.List;
import java.util.Scanner;

public class HotelDemo {

    public static void main(String[] args) {
        Hotel hotel = new Hotel(25);
        do {
            System.out.println("\n\n            Hotel Menu");
            System.out.println("+-------------------------------+");
            System.out.println("1 - Wyświetl wszystkie pokoje");
            System.out.println("2 - Wyświetl dostępne pokoje");
            System.out.println("3 - Zarezerwuj pokój");
            System.out.println("4 - Zwolnij pokój");

            System.out.print("Wybierze opcję z menu: ");
            try {
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt(); // Get user input from the keyboard

                switch (input) {
                    case 1:
                        System.out.println(hotel);
                        break;
                    case 2:
                        System.out.println(UserService.getAllFreeRooms(hotel));
                        break;
                    case 3:
                        UserService.bookRoom(getRoomNumber(), hotel);
                        break;
                    case 4:
                        UserService.freeRoom(getRoomNumber(), hotel);
                        break;

                }
            } catch (NumberFormatException e) {
            }

        }
        while (true);
    }

    private static int getRoomNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer pokoju: ");
        return scanner.nextInt();
    }

//    private static boolean checkIfRoomNumberExists(int roomNumber) {
//
//    }

}

