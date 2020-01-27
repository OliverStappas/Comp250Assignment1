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
        return 5 // TODO
    }

    public boolean equals(Object) {
        if ()
    }
}
