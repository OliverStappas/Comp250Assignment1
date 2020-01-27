public class HotelReservation extends Reservation {
    private Hotel reservationLocation;
    private String roomType;
    private int numOfNights;
    private int roomPrice;

    public HotelReservation(String reservationName, Hotel hotel, String inputRoomType, int numberOfNights) {
        super(reservationName);
        this.roomType = inputRoomType;
        this.numOfNights = numberOfNights;
        this.reservationLocation = hotel;
        this.roomPrice = hotel.reserveRoom(inputRoomType);

    }

    public int getNumOfNights() {
        return this.numOfNights;
    }

    public int getCost() {
        return roomPrice * numOfNights;
    }

    @Override
    public boolean equals(Object obj) {
//TODO
    }

}
