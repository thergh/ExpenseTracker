package org.example;

public class UI {
    public static void displayHelp(){
        System.out.println("\n\t\tAVAILABLE COMMANDS");
        System.out.println("ADD INCOME");
        System.out.println("\tUsage:\taddIncome <amount> <source> <description>");
        System.out.println("ADD EXPENSE");
        System.out.println("\tUsage:\taddExpense <amount> <category> <description>");

        System.out.println("VIEW TRANSACTIONS");

        System.out.println("VIEW BALANCE");
        System.out.println("\tUsage:\tviewBalance");
        System.out.println("VIEW CATEGORY");

        System.out.println("VIEW CATEGORY EXPENSES");

        System.out.println("EXPORT");

        System.out.println("HELP");

        System.out.println("EXIT");
    }
}
