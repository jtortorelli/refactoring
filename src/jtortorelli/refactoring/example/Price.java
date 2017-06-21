package jtortorelli.refactoring.example;

abstract public class Price {
    abstract public int getPriceCode();

    abstract public double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
