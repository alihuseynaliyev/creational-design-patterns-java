package org.example.abstract_factory;

public class VisDebitCard implements DebitCard{
    @Override
    public void print() {
        System.out.println("Visa debit card");
    }
}
