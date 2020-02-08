package Assignment1;

public class Customer {
    private String name;
    private int balance;
    private Basket reservationsBasket;

    public Customer(String customerName, int initialBalance) {
        this.reservationsBasket = new Basket();
        this.name = customerName;
        this.balance = initialBalance;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public Basket getBasket() {
        return this.reservationsBasket;
    }

    public int addFunds(int centsAdded) {
        if (centsAdded < 0) {
            throw new IllegalArgumentException("Please enter a positive number.");
        }
        else {
            this.balance += centsAdded;
            return this.balance;
        }
    }

    public int addToBasket(Reservation reservation) {
        if (reservation.reservationName().equalsIgnoreCase(this.name)) {
            this.reservationsBasket.add(reservation);
            return this.reservationsBasket.getNumOfReservations();
        }
        else {
            throw new IllegalArgumentException("Name on reservation does not match name of customer");

        }
    }

    public int addToBasket(Hotel hotel, String roomType, int numOfNights, boolean breakfastIncluded) {
        if (breakfastIncluded) {
            BnBReservation reservation = new BnBReservation(this.name, hotel, roomType, numOfNights);
            this.reservationsBasket.add(reservation);
        }
        else {
            HotelReservation reservation = new HotelReservation(this.name, hotel, roomType, numOfNights);
            this.reservationsBasket.add(reservation);
        }
        return this.reservationsBasket.getNumOfReservations();
    }

    public int addToBasket(Airport airport1, Airport airport2) {
        FlightReservation reservation = new FlightReservation(this.name,airport1, airport2);
        this.reservationsBasket.add(reservation);
        return this.reservationsBasket.getNumOfReservations();
    }

    public boolean removeFromBasket(Reservation reservation) {
        return this.reservationsBasket.remove(reservation);
    }

    public int checkOut() {
        if (this.balance < this.reservationsBasket.getTotalCost()) {
            throw new IllegalStateException("Not high enough balance");
        }
        else {
            this.balance -= this.reservationsBasket.getTotalCost();
            this.reservationsBasket.clear();
            return this.balance;
        }
    }
}
