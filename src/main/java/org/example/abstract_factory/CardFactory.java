package org.example.abstract_factory;

public interface CardFactory {
    DebitCard createDebitCard();
    CreditCard createCreditCard();
}
