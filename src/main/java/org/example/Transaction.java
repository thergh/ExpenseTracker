package org.example;


public abstract class Transaction {
    double amount;
    String category;
    String description;

    public Transaction(double amount, String category, String description){
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    public double getAmount(){ return amount; }
    public String getCategory(){ return category; }
    public String getDescription(){ return description; }

    public abstract double getType();

    @Override
    public String toString(){
        return "[ " + getType() + ", " + amount + ", " + category + ", " + description + " ]";
    }
}
