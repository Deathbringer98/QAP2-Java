// Money.java
public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        double total = this.dollars + this.cents / 100.0 + otherAmount.dollars + otherAmount.cents / 100.0;
        return new Money(total);
    }

    public Money subtract(Money otherAmount) {
        double total = this.dollars + this.cents / 100.0 - (otherAmount.dollars + otherAmount.cents / 100.0);
        return new Money(total);
    }

    public int compareTo(Money otherObject) {
        double thisAmount = this.dollars + this.cents / 100.0;
        double otherAmount = otherObject.dollars + otherObject.cents / 100.0;
        return Double.compare(thisAmount, otherAmount);
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return "$" + this.dollars + "." + this.cents;
    }
}