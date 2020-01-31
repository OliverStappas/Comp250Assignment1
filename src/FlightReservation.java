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
        double distance  = Airport.getDistance(this.arrivalAirport, this.departureAirport);
        double gallonsOfFuel = distance / 167.52;
        int flightCost = (int) Math.ceil(gallonsOfFuel * 124);
        return flightCost;
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

