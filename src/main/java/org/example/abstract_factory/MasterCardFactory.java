package org.example.abstract_factory;

public class MasterCardFactory implements CardFactory{
    @Override
    public DebitCard createDebitCard() {
        return new MasterDebitCard();
    }

    @Override
    public CreditCard createCreditCard() {
        return new MasterCreditCard();
    }
}
