package org.example;

import java.util.ArrayList;
import java.util.Objects;


public class UI {
    public static void displayHelp(){
        System.out.println("\n\t\t\tAVAILABLE COMMANDS");
        System.out.println();
        System.out.println("ADD INCOME");
        System.out.println("\tUsage:\taddIncome <amount> <source> <description>");
        System.out.println();
        System.out.println("ADD EXPENSE");
        System.out.println("\tUsage:\taddExpense <amount> <category> <description>");
        System.out.println();
        System.out.println("VIEW TRANSACTIONS");
        System.out.println("\tUsage:\tviewTransactions");
        System.out.println();
        System.out.println("VIEW BALANCE");
        System.out.println("\tUsage:\tviewBalance");
        System.out.println();
        System.out.println("VIEW CATEGORY");
        System.out.println("\tUsage:\tviewCategory <category>");
        System.out.println();
        System.out.println("VIEW CATEGORY BALANCE");
        System.out.println("\tUsage:\tviewCategoryBalance <category>");
        System.out.println();
        System.out.println("HELP");
        System.out.println("\tUsage:\thelp");
        System.out.println();
        System.out.println("EXIT");
        System.out.println("\tUsage:\texit");
        System.out.println();
    }


    public static void displayAddIncome(Income income){
        System.out.println("Added income.");
        System.out.println("Amount: " + income.getAmount());
        System.out.println("Category: " + income.getCategory());
        System.out.println("Description: " + income.getDescription());
        System.out.println();
    }


    public static void displayAddExpense(Expense expense){
        System.out.println("Added expense.");
        System.out.println("Amount: " + expense.getAmount());
        System.out.println("Category: " + expense.getCategory());
        System.out.println("Description: " + expense.getDescription());
        System.out.println();
    }


    public static void displayViewTransactions(Manager manager){
        System.out.println("Transactions:");
        System.out.println();
        ArrayList<Transaction> transactions = manager.getTransactions();
        for(Transaction t: transactions){
            System.out.println(t.toString());
        }
    }


    public static void displayViewCategory(Manager manager, String category){
        System.out.println("Transactions in the " + category + " category:");
        System.out.println();
        ArrayList<Transaction> transactions = manager.getCategoryExpenses(category);
        for(Transaction t: transactions){
            if(Objects.equals(t.getCategory(), category)){
                System.out.println(t.toString());
            }
        }
        System.out.println();
    }


    public static void displayBalance(Manager manager){
        System.out.println("Balance: " + manager.getBalance());
        System.out.println();
    }


    public static void displayViewCategoryBalance(Manager manager, String category){
        ArrayList<Transaction> transactions = manager.getCategoryExpenses(category);
        double balance = 0;
        for(Transaction t: transactions){
            if(Objects.equals(t.getCategory(), category)){
                balance += t.getAmount();
            }
        }
        System.out.println("Balance in the " + category + " category: " + balance);
        System.out.println();
    }
}
