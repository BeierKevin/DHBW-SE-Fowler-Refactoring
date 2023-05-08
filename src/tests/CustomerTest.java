package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import classes.*;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Sarah");
    }

    @Test
    public void getName() {
        assertEquals("Sarah", customer.getName());
    }

    @Test
    public void statement() {
        assertTrue(customer.statement().startsWith("Rental Record for Sarah"));
        assertTrue(customer.statement().endsWith(" frequent renter points"));
    }

}