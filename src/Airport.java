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

    public static void main(String[] args) {
//        Airport airport1 = new Airport(4,4,5);
//        Airport airport2 = new Airport(1,1,1);
//        System.out.println(getDistance(airport1,airport2));
//        System.out.println(airport1.getFees());
//        System.out.println(airport1.getFees());

    }
}
