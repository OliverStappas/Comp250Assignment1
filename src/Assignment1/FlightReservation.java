package Assignment1;

public class FlightReservation extends Reservation {
    private Airport departureAirport;
    private Airport arrivalAirport;

    public FlightReservation(String reservationName, Airport departure, Airport arrival) {
        super(reservationName);
        if (arrival.equals(departure)) {
            throw new IllegalArgumentException("Both airports are the same.");
        }
        else {
            this.departureAirport = departure;
            this.arrivalAirport = arrival;        }
    }

    public int getCost() {
        return (int) Math.ceil(((Airport.getDistance(this.departureAirport, this.arrivalAirport) / 167.52 ) * 124) + this.arrivalAirport.getFees() + this.departureAirport.getFees() + 5375) ;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FlightReservation) {
            return ((FlightReservation) obj).reservationName().equalsIgnoreCase(this.reservationName()) &&
                    ((FlightReservation) obj).getCost() == this.getCost() &&
                    ((FlightReservation) obj).departureAirport.equals(this.departureAirport) &&
                    ((FlightReservation) obj).arrivalAirport.equals(this.arrivalAirport);
        }
        else {
            return false;
        }
    }
}

