package Comp250Assignment1;

public class FlightReservation extends Reservation {
    private Airport departureAirport;
    private Airport arrivalAirport;

    public FlightReservation(String reservationName, Airport departure, Airport arrival) {
        super(reservationName);
        if (Airport.getDistance(departure, arrival) != 0) {
            this.departureAirport = departure;
            this.arrivalAirport = arrival;
        }
        else {
            throw new IllegalArgumentException("Both airports are the same.");
        }

    }

    public int getCost() {
        return (int) Math.ceil(((Airport.getDistance(this.departureAirport, this.arrivalAirport) / 167.52 ) * 124) + this.arrivalAirport.getFees() + this.departureAirport.getFees() + 5375) ;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FlightReservation) {
            if (((FlightReservation) obj).reservationName() == this.reservationName() &&
            ((FlightReservation) obj).getCost() == this.getCost() &&
            ((FlightReservation) obj).departureAirport == this.departureAirport &&
            ((FlightReservation) obj).arrivalAirport == this.arrivalAirport) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}

