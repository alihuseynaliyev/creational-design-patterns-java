package org.example.factory;

public class SalaryCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new SalaryCard();
    }
}
