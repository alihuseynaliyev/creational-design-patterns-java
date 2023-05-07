package org.example.factory;

import java.util.Map;

import static org.example.factory.CardName.DEBIT;
import static org.example.factory.CardName.SALARY;

public enum CardUtil {
    CARD_UTIL;
    public static final Map<CardName, CardFactory> CARD_STORAGE = Map.of(
            DEBIT, new DebitCardFactory(),
            SALARY, new SalaryCardFactory()
    );

    public static CardFactory createCardByCardName(CardName cardName) {
        return CARD_STORAGE.get(cardName);
    }
}
