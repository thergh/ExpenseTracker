package org.example;


public abstract class Transaction{
    private final double amount;
    private final String category;
    private final String description;

    public Transaction(double amount, String category, String description){
        if(amount < 0){
            throw new ArithmeticException("Amount can't be negative");
        }
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    public double getAmount(){ return amount; }
    public String getCategory(){ return category; }
    public String getDescription(){ return description; }

    public abstract String getType();

    @Override
    public String toString(){
        return "[" + getType() + "]\n" +
                "Amount: " + amount + "\n" +
                "Category: " + category + "\n" +
                "Description: " + description + "\n";
    }
}
