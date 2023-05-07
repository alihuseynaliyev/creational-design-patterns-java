package org.example.prototype;

public class DebitCard {
    private String cardName;
    private String cardNumber;

    public DebitCard(String cardName, String cardNumber) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
    }

    public DebitCard clone() {
        return new DebitCard(cardName,cardNumber);
    }
}
