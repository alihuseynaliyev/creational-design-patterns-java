package org.example.abstract_factory;

public class VisaCardFactory implements CardFactory {
    @Override
    public DebitCard createDebitCard() {
        return new VisDebitCard();
    }

    @Override
    public CreditCard createCreditCard() {
        return new VisaCreditCard();
    }
}
