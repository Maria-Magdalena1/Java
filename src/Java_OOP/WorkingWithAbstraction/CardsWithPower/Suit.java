package Java_OOP.WorkingWithAbstraction.CardsWithPower;

public enum Suit {
    CLUBS (0),
    DIAMONDS (13),
    HEARTS (26),
    SPADES (39);

    private int powers;
    Suit(int powers) {
        this.powers=powers;
    }

    public int getPowers() {
        return powers;
    }
}
