package Comp250Assignment1;

public class BnBReservation extends HotelReservation {
    public BnBReservation(String reservationName, Hotel hotel, String inputRoomType, int numberOfNights) {
        super(reservationName, hotel, inputRoomType, numberOfNights);
        HotelReservation hotelReservation = new HotelReservation(reservationName, hotel, inputRoomType, numberOfNights);
    }

    public int getCost() {
        return (super.getCost() + 1000 * this.getNumOfNights());
    }
}
