package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager man1 = new Manager();

    @Test
    void getBalance() {
        Income inc1 = new Income(800, "cat1", "des1");
        man1.addTransaction(inc1);
        Income inc2 = new Income(200, "cat2", "des2");
        man1.addTransaction(inc2);
        Expense exp1 = new Expense(500, "cat1", "des1");
        man1.addTransaction(exp1);

        assertEquals(500, man1.getBalance());
    }
}