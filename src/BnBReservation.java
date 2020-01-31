public class BnBReservation extends HotelReservation {
    public BnBReservation(String reservationName, Hotel hotel, String roomType, int numberOfNights) {
        super(reservationName);
        HotelReservation hotelReservation = new HotelReservation(reservationName, hotel, roomType, numberOfNights);
        //TODO
    }

    public int getCost() {
        return;
    }
}
