public class Hotel {
    private String hotelName;
    private Room[] roomsInHotel;

    public Hotel(String hotelNameInput, Room[] roomsInput) {
        this.hotelName = hotelNameInput;

        // initializing roomsInHotel field
        int roomsInputLength = roomsInput.length;
        this.roomsInHotel = new Room[roomsInputLength];
        for (int i = 0; i < roomsInputLength; i ++) {
            this.roomsInHotel[i] = roomsInput[i];
        }
    }

    public int reserveRoom(String roomType) {
        Room availableRoom = Room.findAvailableRoom(this.roomsInHotel, roomType);
        if (availableRoom != null) {
            availableRoom.changeAvailability();
            return availableRoom.getPrice();
        }
        else {
            throw new IllegalArgumentException("Fail"); // ???
        }
    }

    public boolean cancelRoom(String roomType) {
        if (Room.makeRoomAvailable(this.roomsInHotel, roomType)) {
            return true;
        }
        else {
            return false;
        }

    }
}
