package Comp250Assignment1;

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
        return this.roomPrice * this.numOfNights;
    }

    @Override
    // An equals method which takes as input an Object and return true if input matches
    //this in type, name, hotel, room type, number of nights, and total cost. Otherwise
    //the method returns false. Once again, you can ignore the fact that you did not
    //overrode the equals method in the Comp250Assignment1.Hotel class.
    public boolean equals(Object obj) {
        if (obj instanceof HotelReservation) {
            if (((HotelReservation) obj).numOfNights == this.numOfNights && ((HotelReservation) obj).reservationLocation.equals(this.reservationLocation)
                    && ((HotelReservation) obj).roomPrice == this.roomPrice && ((HotelReservation) obj).roomType.equals(this.roomType)
                    && ((HotelReservation) obj).getCost() == this.getCost() && ((HotelReservation) obj).reservationName().equals(this.reservationName())
                    && ((HotelReservation) obj).reservationLocation.equals(this.reservationLocation) )
            {

                return true;
            }
            else {
                return false;
            }

        } else {
            return false;
        }
    }

}
