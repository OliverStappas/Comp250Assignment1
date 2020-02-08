package Assignment1;

public class Airport {
    private int xCoordinate;
    private int yCoordinate;
    private int airportFees;

    public Airport(int x, int y, int fees) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.airportFees = fees;
    }

    public int getFees() {
        return this.airportFees;
    }

    public static int getDistance(Airport airport1, Airport airport2) {
        return (int) Math.ceil(Math.sqrt(Math.pow((airport1.xCoordinate - airport2.xCoordinate),2) +
                Math.pow((airport1.yCoordinate - airport2.yCoordinate), 2)));
    }
}
