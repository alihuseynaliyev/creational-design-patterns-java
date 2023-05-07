package org.example.prototype;

public class Application {
    public static void main(String[] args){

        var debitCard = new DebitCard("Card1", "1");
        var salaryCard = new SalaryCard("Card2", "2");

        var debitCardClone = debitCard.clone();
        var salaryCardClone = salaryCard.clone();

    }
}
