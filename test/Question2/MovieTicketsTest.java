package Question2;
//ST10442155
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }

    @Test
    public void testCalculateTotalTicketPrice() {
        System.out.println("CalculateTotalTicketPrice");
        int numberOfTickets = 10;
        double ticketPrice = 100;
        MovieTickets instance = new MovieTickets();
        double expResult = 1140;
        double result = instance.CalculateTotalTicketPrice(numberOfTickets, ticketPrice);
        assertEquals(expResult, result, 0);
    }
//Testing if movieticketdata and validating data does the correct thing
    @Test
    public void testValidateData() {
        System.out.println("ValidateData");
        MovieTicketData movieTicketData = new MovieTicketData("Hello", 10, 22);
        MovieTickets instance = new MovieTickets();
        boolean expResult = true;
        boolean result = instance.ValidateData(movieTicketData);
        assertEquals(expResult, result);
    }
    
}
