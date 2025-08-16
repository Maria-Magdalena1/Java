package Java_OOP.WorkingWithAbstraction.HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private Discount discount;

public PriceCalculator(double pricePerDay,int numberOfDays,Season season,Discount discount) {
    this.pricePerDay=pricePerDay;
    this.numberOfDays=numberOfDays;
    this.season=season;
    this.discount=discount;
}

public double calculatePrice() {
    double basePrice=pricePerDay*numberOfDays*season.getMultiplier();
    double discountAmount=basePrice*(discount.getPercentage()*1.0/100);
    return basePrice-discountAmount;
}

}
