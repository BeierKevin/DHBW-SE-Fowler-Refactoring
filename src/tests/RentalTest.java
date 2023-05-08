package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import classes.*;

public class RentalTest {

    private Rental rental;
    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Movie Title", 0);
        rental = new Rental(movie, 10);
    }

    @Test
    public void getDaysRented() {
        assertEquals(10, rental.getDaysRented());
    }

    @Test
    public void getMovie() {
        assertEquals(movie, rental.getMovie());
    }

    @Test
    public void getCharge() {
        assertEquals(14.0, rental.getCharge(), 0);
    }

    @Test
    public void getFrequentRenterPoints() {
        assertEquals(1, rental.getFrequentRenterPoints());
    }
}
