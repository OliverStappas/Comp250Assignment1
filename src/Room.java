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

//    public boolean getAvailability() {
//        return this.roomAvailable;
//    }

    public void changeAvailability() {
        this.roomAvailable = !this.roomAvailable;
    }

    public static Room findAvailableRoom(Room[] roomArray, String inputRoomType) {
        for (Room rooms: roomArray) {
            if (rooms.roomType == inputRoomType && rooms.roomAvailable) {
                return rooms;
            }
        }
        return null;
    }

    public static boolean makeRoomAvailable(Room[] roomArray, String inputRoomType) {
        for (Room rooms: roomArray) {
            if (!rooms.roomAvailable) {
                rooms.changeAvailability();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        Room room1 = new Room("double");
//        //Room room2 = new Room("dbble");
//        Room room3 = new Room(room1);
//        Room room4 = new Room("queen");
//        System.out.println(room4.getPrice());
//        System.out.println(room4.getType());
//        System.out.println(room4.getAvailability());
//        room4.changeAvailability();
//        System.out.println(room4.getAvailability());
//        Room room5 = new Room("double");
//        Room room6 = new Room("queen");
//        Room room7 = new Room("queen");
//        Room room8 = new Room("queen");
//        Room room9 = new Room("double");
//        Room room10 = new Room("double");
//        room6.changeAvailability();
//        room8.changeAvailability();
//        Room[] roomArray = {room5,room6,room7,room8,room9};
//        System.out.println(room6);
//        System.out.println(room7);
//        System.out.println(findAvailableRoom(roomArray, "queen"));
//        System.out.println(room6.getAvailability());
//        System.out.println(makeRoomAvailable((roomArray), "queen"));
//        System.out.println(room6.getAvailability());

    }
}
