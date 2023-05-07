package org.example.factory;

public class SalaryCard implements Card{
    @Override
    public void printCardName() {
        System.out.println("This card is Salary");
    }
}
