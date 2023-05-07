package org.example.abstract_factory;

public class MasterCreditCard implements CreditCard{
    @Override
    public void print() {
        System.out.println("Master credit card");
    }
}
