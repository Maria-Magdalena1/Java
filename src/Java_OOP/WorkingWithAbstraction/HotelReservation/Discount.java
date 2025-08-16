package Java_OOP.WorkingWithAbstraction.HotelReservation;

public enum Discount {
    NONE(0),
    SECONDVISIT(10),
    VIP(20);

    private int percentage;
    Discount(int percentage) {
        this.percentage=percentage;
    }

    public int getPercentage() {
        return percentage;
    }
}
