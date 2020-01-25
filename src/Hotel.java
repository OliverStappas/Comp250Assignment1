public class Hotel {
    private String hotelName;
    private Room[] roomsInHotel;

    public Hotel(String hotelNameInput, Room[] roomsInput) {
        this.hotelName = hotelNameInput;
        this.roomsInHotel = roomsInput;
    }

    public int reserveRoom(String roomType) {
        Room availableRoom = Room.findAvailableRoom(this.roomsInHotel, roomType);
        if (availableRoom != null) {
            availableRoom.changeAvailability();
            return availableRoom.getPrice();
        }
        else {
            throw new IllegalArgumentException(); // ???
        }
    }

//    public boolean cancelRoom(String roomType) {
//        for (Room rooms: roomsInHotel) {
//            rooms.
//        }
//
//
//    }
}
