package Comp250Assignment1;

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
//        Comp250Assignment1.Room room1 = new Comp250Assignment1.Room("double");
//        //Comp250Assignment1.Room room2 = new Comp250Assignment1.Room("dbble");
//        Comp250Assignment1.Room room3 = new Comp250Assignment1.Room(room1);
//        Comp250Assignment1.Room room4 = new Comp250Assignment1.Room("queen");
//        System.out.println(room4.getPrice());
//        System.out.println(room4.getType());
//        System.out.println(room4.getAvailability());
//        room4.changeAvailability();
//        System.out.println(room4.getAvailability());
//        Comp250Assignment1.Room room5 = new Comp250Assignment1.Room("double");
//        Comp250Assignment1.Room room6 = new Comp250Assignment1.Room("queen");
//        Comp250Assignment1.Room room7 = new Comp250Assignment1.Room("queen");
//        Comp250Assignment1.Room room8 = new Comp250Assignment1.Room("queen");
//        Comp250Assignment1.Room room9 = new Comp250Assignment1.Room("double");
//        Comp250Assignment1.Room room10 = new Comp250Assignment1.Room("double");
//        room6.changeAvailability();
//        room8.changeAvailability();
//        Comp250Assignment1.Room[] roomArray = {room5,room6,room7,room8,room9};
//        System.out.println(room6);
//        System.out.println(room7);
//        System.out.println(findAvailableRoom(roomArray, "queen"));
//        System.out.println(room6.getAvailability());
//        System.out.println(makeRoomAvailable((roomArray), "queen"));
//        System.out.println(room6.getAvailability());

    }
}
