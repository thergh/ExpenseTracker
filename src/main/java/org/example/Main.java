package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UI.displayHelp();
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        loop: while(true){
            System.out.print("> ");
            String line = scanner.nextLine();
            String[] splitString = line.trim().split("\\s+");
            String command = splitString[0];

            switch(command){
                case "exit":
                    break loop;
                case "addIncome": {
                    double amount = Double.parseDouble(splitString[1]);
                    String category = splitString[2];
                    String description = splitString[3];
                    if(amount < 0){
                        System.out.println("Amount can't be negative");
                        break;
                    }
                    Income income = new Income(amount, category, description);
                    manager.addTransaction(income);
                    UI.displayAddIncome(income);
                    break;
                }
                case "addExpense": {
                    double amount = Double.parseDouble(splitString[1]);
                    String category = splitString[2];
                    String description = splitString[3];
                    if(amount < 0){
                        System.out.println("Amount can't be negative");
                        break;
                    }
                    Expense expense = new Expense(amount, category, description);
                    manager.addTransaction(expense);
                    UI.displayAddExpense(expense);
                    break;
                }
                case "viewCategory": {
                    String category = splitString[1];
                    UI.displayViewCategory(manager, category);
                    break;
                }
                case "viewTransactions":
                    UI.displayViewTransactions(manager);
                    break;
                case "viewBalance":
                    UI.displayBalance(manager);
                    break;
                case "viewCategoryBalance": {
                    String category = splitString[1];
                    UI.displayViewCategoryBalance(manager, category);
                    break;
                }
                case "help":
                    UI.displayHelp();
                    break;
                default:
                    UI.displayHelp();
            }
        }
    }
}