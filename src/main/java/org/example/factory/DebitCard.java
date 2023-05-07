package org.example.factory;

public class DebitCard implements Card{
    @Override
    public void printCardName() {
        System.out.println("This card is Debit");
    }
}
