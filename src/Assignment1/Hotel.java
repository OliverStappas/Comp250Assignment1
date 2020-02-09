package Assignment1;

public class Hotel {
    private String hotelName;
    private Room[] roomsInHotel;

    public Hotel(String hotelNameInput, Room[] roomsInput) {
        this.hotelName = hotelNameInput;

        // initializing roomsInHotel field
        int roomsInputLength = roomsInput.length;
        this.roomsInHotel = new Room[roomsInputLength];
        for (int i = 0; i < roomsInputLength; i ++) {
            Room temp = new Room(roomsInput[i]);
            this.roomsInHotel[i] = temp;
        }
    }

    public int reserveRoom(String roomType) {
        Room availableRoom = Room.findAvailableRoom(this.roomsInHotel, roomType);
        if (availableRoom != null) {
            availableRoom.changeAvailability();
            return availableRoom.getPrice();
        }
        else {
            throw new IllegalArgumentException("No room available");
        }
    }

    public boolean cancelRoom(String roomType) {
        return Room.makeRoomAvailable(this.roomsInHotel, roomType);

    }
}
