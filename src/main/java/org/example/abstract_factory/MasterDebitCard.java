package org.example.abstract_factory;

public class MasterDebitCard implements DebitCard{
    @Override
    public void print() {
        System.out.println("Master debit card");
    }
}
