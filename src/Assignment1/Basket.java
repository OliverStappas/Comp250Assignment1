package Assignment1;

public class Basket {
    private Reservation[] Reservations;

    public Basket() {
        this.Reservations = new Reservation[0];
    }

    public Reservation[] getProducts() {
        return this.Reservations.clone();
    }

    public int add(Reservation inputReservation) {
        Reservation[] temp = this.Reservations;

        this.Reservations = new Reservation[this.Reservations.length + 1];
        this.Reservations[this.Reservations.length - 1] = inputReservation;

        if (this.Reservations.length - 1 >= 0)
            System.arraycopy(temp, 0, this.Reservations, 0, this.Reservations.length - 1);

        return this.Reservations.length;
    }

    public boolean remove(Reservation inputReservation) {
        boolean reservationRemoved = false;
        for (int i = 0; i < this.Reservations.length; i++) {
            if (this.Reservations[i].equals(inputReservation)) {
                this.Reservations[i] = null;
                reservationRemoved = true;
            }

            if (reservationRemoved) {
                if (i < (this.Reservations.length - 1)) {
                    this.Reservations[i] = this.Reservations[i + 1];
                } else {
                    Reservation[] temp = this.Reservations;
                    this.Reservations = new Reservation[this.Reservations.length - 1];
                    System.arraycopy(temp, 0, this.Reservations, 0, this.Reservations.length);
                    return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        this.Reservations = new Reservation[0];
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
