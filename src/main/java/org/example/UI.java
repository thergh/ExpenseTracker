package org.example;

import java.util.ArrayList;

public class UI {
    public static void displayHelp(){
        System.out.println("\n\t\t\tAVAILABLE COMMANDS");
        System.out.println("ADD INCOME");
        System.out.println("\tUsage:\taddIncome <amount> <source> <description>");
        System.out.println("ADD EXPENSE");
        System.out.println("\tUsage:\taddExpense <amount> <category> <description>");
        System.out.println("VIEW TRANSACTIONS");
        System.out.println("\tUsage:\tviewTransactions");
        System.out.println("VIEW BALANCE");
        System.out.println("\tUsage:\tviewBalance");
        System.out.println("VIEW CATEGORY");

        System.out.println("VIEW CATEGORY EXPENSES");

        System.out.println("EXPORT");

        System.out.println("HELP");
        System.out.println("\tUsage:\thelp");
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

    public static void displayViewTransactions(Manager manager){
        ArrayList<Transaction> transactions = manager.getTransactions();
        for(Transaction t: transactions){
            System.out.println(t.toString());
        }
    }
}
