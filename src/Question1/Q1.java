package Question1;
//St10442155
import Question1.MovieTickets;
public class Q1 {


    
    public static void main(String[] args) {
        //instantiate object
        MovieTickets mt = new MovieTickets();
        
        //declare and initialise arrays
        String[] months = {"JAN", "Feb", "MAR"};
        String[] movie = {"Napolean","Oppenheimer"};
    
        int[][] ticketSales = {
            {3000, 1500, 1700},
            {3500, 1200, 1600}
        };
        
        //the below displays the ticket info
        System.out.println("Movie Ticket Sales:\n\n");
        
        String sout = "\t\t";
        for (int i = 0; i < months.length; i++) {
            sout += months[i] + "\t";
        }
        System.out.println(sout);     

        for (int i = 0; i < movie.length; i++) {
            sout = "";
            sout += movie[i] + "\t";
            for (int j = 0; j <= ticketSales.length; j++) {
                sout += ticketSales[i][j] + "\t";
            }
            System.out.println(sout);
        }
        /////////////////////////////////////
        System.out.println("\n");
        
        //this gets the total movie sales for both movies and initialises them into array to make it easy to work with
        int[] totalSales = {mt.TotalMovieSales(ticketSales[0]), mt.TotalMovieSales(ticketSales[1])};
        
        for (int i = 0; i < movie.length; i++) {
            //displays the info on movie sales
            System.out.println("Total movie ticket sales for " + movie[i] +" "+ mt.TotalMovieSales(ticketSales[i]));
        }
        
        //displays top performing movie
        System.out.println("\nTop preforming movie:\t" + mt.TopMovie(movie, totalSales));
    }
    
}
