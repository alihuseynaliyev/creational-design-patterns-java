package org.example.factory;

import static org.example.factory.CardName.DEBIT;
import static org.example.factory.CardName.SALARY;
import static org.example.factory.CardUtil.createCardByCardName;

public class CardApplication {

    public static void main(String[] args) {
        var cardFactory = createCardByCardName(DEBIT); // change card name -> SALARY
        var card = cardFactory.createCard();
        card.printCardName();

        var cardFactory1 = createCardByCardName(SALARY);
        var card1 = cardFactory1.createCard();
        card1.printCardName();
    }

}
