package Question2;
//St10442155
public class MovieTickets implements IMovieTickets{

    //Calculates Total ticket price and adds the VAT on after
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        return (numberOfTickets * ticketPrice)*1.14;
    }
 
    //Validates object to make sure everthing has valid inputs
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        boolean check = true;
        if(movieTicketData.getMovie().length() <= 0){
            check = false;
        }else if(movieTicketData.getNumTickets() <= 0){
            check = false;
        }else if(movieTicketData.getPrice() <= 0){
            check = false;
        }
        return check;
    }
}
