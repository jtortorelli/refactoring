package jtortorelli.refactoring.example;

abstract public class Price {
    abstract public int getPriceCode();

    abstract public double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
