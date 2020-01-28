public class Basket {
    private Reservation[] Reservations;

    public Basket() {
        this.Reservations = new Reservation[0];
    }

    public Reservation[] getProducts() {
        return this.Reservations;
    }

    public void add(Reservation inputReservation) {
        this.Reservations[this.Reservations.length - 1] = inputReservation;
    }

    public boolean remove(Reservation inputReservation) {
        for (int i = 0; i < this.Reservations.length; i++) {
            if (this.Reservations[i].equals(inputReservation)) {
                this.Reservations[i] = null;
                return true;
            }
        }
        return false;
        //TODO
    }

    public void clear() {
        for (Reservation reservation : this.Reservations) {
            reservation = null;
        }
    }

    public int getNumOfReservations() {
        int numOfReservations = 0;
        for (Reservation reservation : this.Reservations) {
            if (reservation != null) {
                numOfReservations += 1;
            }
        }
        return  numOfReservations;
    }

    public int getTotalCost()  {
        int totalCost = 0;
        for (Reservation reservation : this.Reservations) {
            if (reservation != null) {
                totalCost += reservation.getCost();
            }
        }
        return totalCost;
    }
}
