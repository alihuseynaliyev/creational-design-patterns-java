package org.example.abstract_factory;

public class VisaCreditCard implements CreditCard{
    @Override
    public void print() {
        System.out.println("Visa credit card");
    }
}
