package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseTest {
    double amount1 = 123.23;
    String category1 = "cat1";
    String description1 = "des1";
    Expense ex1 = new Expense(amount1, category1, description1);

    @Test
    void testGetAmount() {
        assertEquals(123.23, ex1.getAmount());
    }

    @Test
    void testGetCategory() {
        assertEquals("cat1", ex1.getCategory());
    }

    @Test
    void testGetDescription() {
        assertEquals("des1", ex1.getDescription());
    }

    @Test
    void testToString() {
        assertEquals("[Expense]\nAmount: 123.23\nCategory: cat1\nDescription: des1\n", ex1.toString());
    }

    @Test
    void testGetType() {
        assertEquals("Expense", ex1.getType());
    }
}