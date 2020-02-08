package Assignment1;

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

        ////??? A constructor that takes as input a String with the name on the reservation, a
        //Hotel, a String with the room type, and an int indicating the number of nights.
        //The constructor uses the inputs to create a Reservation and initialize the corre-
        //sponding elds. The constructor should also make sure to reserve a room of the
        //correct type in the specied hotel. If such reservation is not possible, then an
        //IllegalArgumentException should be raised.



    }

    public int getNumOfNights() {
        return this.numOfNights;
    }

    public int getCost() {
        return this.roomPrice * this.numOfNights;
    }

    @Override

    public boolean equals(Object obj) {
        if (obj instanceof HotelReservation) {
            return ((HotelReservation) obj).numOfNights == this.numOfNights && ((HotelReservation) obj).reservationLocation.equals(this.reservationLocation)
                    && ((HotelReservation) obj).roomPrice == this.roomPrice && ((HotelReservation) obj).roomType.equalsIgnoreCase(this.roomType)
                    && ((HotelReservation) obj).getCost() == this.getCost() && ((HotelReservation) obj).reservationName().equalsIgnoreCase(this.reservationName())
                    && ((HotelReservation) obj).reservationLocation.equals(this.reservationLocation);

        } else {
            return false;
        }
    }

}
