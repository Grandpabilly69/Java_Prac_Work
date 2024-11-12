package Question2;
//ST10442155
//Movie Ticket Data class is to use as obhect for testing data
class MovieTicketData {
    String movie;
    int numTickets;
    double price;

    public String getMovie() {
        return movie;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public double getPrice() {
        return price;
    }

    public MovieTicketData(String movie, int numTickets, double price) {
        this.movie = movie;
        this.numTickets = numTickets;
        this.price = price;
    }
}
