public class Basket {
    private Reservation[] Reservations;

    public Basket() {
        this.Reservations = new Reservation[0];
    }

    public Reservation[] getProducts() {
        return this.Reservations;
    }

    public void add(Reservation inputReservation) {
        this.Reservations = new Reservation[this.Reservations.length + 1];
        this.Reservations[this.Reservations.length] = inputReservation;
    }

    public boolean remove(Reservation inputReservation) {
        boolean reservationRemoved = false;
        for (int i = 0; i < this.Reservations.length; i++) {
            if (this.Reservations[i].equals(inputReservation)) {
                this.Reservations[i] = null;
                reservationRemoved = true;
            }

            if (reservationRemoved == true) {
                if (i < (this.Reservations.length - 1)) {
                    this.Reservations[i] = this.Reservations[i+1];
                }
                else {
                    return true;
                }
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
