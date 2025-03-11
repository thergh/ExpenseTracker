package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {
    double amount1 = 123.23;
    String category1 = "cat1";
    String description1 = "des1";
    Income in1 = new Income(amount1, category1, description1);

    @Test
    void testGetAmount() {
        assertEquals(123.23, in1.getAmount());
    }

    @Test
    void testGetCategory() {
        assertEquals("cat1", in1.getCategory());
    }

    @Test
    void testGetDescription() {
        assertEquals("des1", in1.getDescription());
    }

    @Test
    void testToString() {
        assertEquals("[Income]\nAmount: 123.23\nCategory: cat1\nDescription: des1\n", in1.toString());
    }

    @Test
    void testGetType() {
        assertEquals("Income", in1.getType());
    }
}