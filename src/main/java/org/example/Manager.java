package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;

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
        ArrayList<Transaction> categoryExpenses = new ArrayList<Transaction>();
        for(Transaction t: transactions){
            if(Objects.equals(t.getCategory(), category)){
                categoryExpenses.add(t);
            }
        }
        return categoryExpenses;
    }

    public HashMap<String, Double> getExpensesByCategory(){
        HashMap<String, Double> hMap = new HashMap<String, Double>();

        for(Transaction t: transactions){
            String transactionType = t.getType();
            String transactionCategory = t.getCategory();
            double transactionAmount = t.getAmount();

            if(!hMap.containsKey(transactionCategory)){
                if(Objects.equals(transactionType, "Expense")){
                    hMap.put(transactionCategory, -transactionAmount);
                }
                else{
                    hMap.put(transactionCategory, transactionAmount);
                }
            }
            else{
                if(Objects.equals(transactionType, "Expense")){
                    hMap.put(transactionCategory, hMap.get(transactionCategory) - transactionAmount);
                }
                else{
                    hMap.put(transactionCategory, hMap.get(transactionCategory) + transactionAmount);
                }
            }
        }
        return hMap;
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }



}






