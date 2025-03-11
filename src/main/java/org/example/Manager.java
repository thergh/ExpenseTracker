package org.example;


import java.util.*;


public class Manager{
    ArrayList<Transaction> transactions;
    double balance;

    public Manager(){
        transactions = new ArrayList<>();
        balance = 0;
    }

    public double getBalance(){ return balance; }

    public ArrayList<Transaction> getTransactions(){ return transactions; }

    public ArrayList<Transaction> getCategoryExpenses(String category){
        ArrayList<Transaction> categoryExpenses = new ArrayList<>();
        for(Transaction t: transactions){
            if(Objects.equals(t.getCategory(), category)){
                categoryExpenses.add(t);
            }
        }
        return categoryExpenses;
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);

        if(Objects.equals(transaction.getType(), "Income")){
            balance += transaction.getAmount();
        }
        else{
            balance -= transaction.getAmount();
        }
    }
}






