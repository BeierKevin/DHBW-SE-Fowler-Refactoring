package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import classes.*;

public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Movie Title", 0);
    }

    @Test
    public void getPriceCode() {
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        assertEquals("Movie Title", movie.getTitle());
    }

    @Test
    public void getFrequentRenterPoints() {
        assertEquals(1, movie.getFrequentRenterPoints(0));
    }

    @Test
    public void getCharge() {
        assertEquals(14.0, movie.getCharge(10), 0);
    }

}