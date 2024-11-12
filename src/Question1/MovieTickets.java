package Question1;
//ST10442155


public class MovieTickets implements IMovieTickets{

    //Gets total sales for each movie based on input
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int i = 0; i < movieTicketSales.length; i++) {
            total += movieTicketSales[i];
        }
        return total;
    }

    //Gets best preforming movie based on total movie sales
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        if (totalSales[1] > totalSales[0]) {
            return movies[1];
        }else{
            return  movies[0];
        }
    }
    
}
