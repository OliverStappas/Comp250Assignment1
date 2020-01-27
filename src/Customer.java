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
        return this.reservationsBasket.getProducts(); //TODO
    }
}
