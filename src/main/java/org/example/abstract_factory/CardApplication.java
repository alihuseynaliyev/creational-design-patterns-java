package org.example.abstract_factory;

public class CardApplication {
    public static void main(String[] args) {
        var visaCardFactory = new VisaCardFactory(); // change class name ->  new MasterCardFactory
        var debitCard = visaCardFactory.createDebitCard();
        var creditCard = visaCardFactory.createCreditCard();

        debitCard.print();
        creditCard.print();
    }
}
