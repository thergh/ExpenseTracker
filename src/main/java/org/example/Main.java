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
                case "addIncome":
                    double amount = Double.parseDouble(splitString[1]);
                    String category = splitString[2];
                    String description = splitString[3];
                    Income income = new Income(amount, category, description);
                    manager.addTransaction(income);
                    UI.displayAddIncome(income);
                    break;
                case "addExpense":
                    break;
                case "viewTransactions":
                    UI.displayViewTransactions(manager);
                    break;
                case "viewBalance":
                    break;
                case "help":
                    break;
                default:
                    UI.displayHelp();
            }
        }
    }
}