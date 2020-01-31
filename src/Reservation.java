public abstract class Reservation {
    private String reservationName;

    public Reservation(String inputName) {
        this.reservationName = inputName;
    }

    public final String reservationName() {
        return this.reservationName;
    }

    public abstract int getCost();

    public abstract boolean equals(Object obj);

}
