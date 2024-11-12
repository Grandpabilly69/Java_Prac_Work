package Question1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mfair
 */
public class MovieTicketsTest {
    //ST10442155
    
    //Test class Makes sure Question 1 is running as intended
    public MovieTicketsTest() {
    }

    @Test
    public void testTotalMovieSales() {
        System.out.println("TotalMovieSales");
        int[] movieTicketSales = {100, 5, 15};
        MovieTickets instance = new MovieTickets();
        int expResult = 120;
        int result = instance.TotalMovieSales(movieTicketSales);
        assertEquals(expResult, result);
    }

    @Test
    public void testTopMovie() {
        System.out.println("TopMovie");
        String[] movies = {"Matt", "Sam"};
        int[] totalSales = {100, 5};
        MovieTickets instance = new MovieTickets();
        String expResult = "Matt";
        String result = instance.TopMovie(movies, totalSales);
        assertEquals(expResult, result);
    }
    
}
