public class BnBReservation extends HotelReservation {
    public BnBReservation(String reservationName, Hotel hotel, String inputRoomType, int numberOfNights) {
        super(reservationName, hotel, inputRoomType, numberOfNights);
        HotelReservation hotelReservation = new HotelReservation(reservationName, hotel, inputRoomType, numberOfNights);
    }

    public int getCost() {
        return (this.getCost() + 10 * this.getNumOfNights());
    }
}
