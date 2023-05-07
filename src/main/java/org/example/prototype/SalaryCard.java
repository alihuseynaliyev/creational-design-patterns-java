package org.example.prototype;

public class SalaryCard  {
    private String cardName;
    private String cardNumber;

    public SalaryCard(String cardName, String cardNumber) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
    }

    public SalaryCard clone() {
        return new SalaryCard(cardName,cardNumber);
    }
}
