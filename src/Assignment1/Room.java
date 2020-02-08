package Assignment1;

public class Room {
    private String roomType;
    private int roomPrice;
    private boolean roomAvailable;

    public Room(String inputRoomType) {
        if (inputRoomType.equalsIgnoreCase("double")) {
            this.roomType = inputRoomType;
            this.roomPrice = 9000;
            this.roomAvailable = true;
        }
        else if (inputRoomType.equalsIgnoreCase("queen")) {
            this.roomType = inputRoomType;
            this.roomPrice = 11000;
            this.roomAvailable = true;

        }
        else if (inputRoomType.equalsIgnoreCase("king")) {
            this.roomType = inputRoomType;
            this.roomPrice = 15000;
            this.roomAvailable = true;

        }

        else {
            throw new IllegalArgumentException("No room of such type can be created.");
        }
    }

    public Room(Room inputRoom) {
        this.roomType = inputRoom.roomType;
        this.roomPrice = inputRoom.roomPrice;
        this.roomAvailable = inputRoom.roomAvailable;
    }

    public String getType() {
        return this.roomType;
    }

    public int getPrice() {
        return this.roomPrice;
    }


    public void changeAvailability() {
        this.roomAvailable = !this.roomAvailable;
    }

    public static Room findAvailableRoom(Room[] roomArray, String inputRoomType) {
        for (Room rooms: roomArray) {
            if (rooms.roomType.equalsIgnoreCase(inputRoomType) && rooms.roomAvailable) {
                return rooms;
            }
        }
        return null;
    }

    public static boolean makeRoomAvailable(Room[] roomArray, String inputRoomType) {
        for (Room rooms: roomArray) {
            if (rooms.roomType.equalsIgnoreCase(inputRoomType) && !rooms.roomAvailable) {
                rooms.changeAvailability();
                return true;
            }
        }
        return false;
    }

}
