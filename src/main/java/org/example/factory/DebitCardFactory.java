package org.example.factory;

public class DebitCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new DebitCard();
    }
}
