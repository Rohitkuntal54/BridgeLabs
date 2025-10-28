<<<<<<< HEAD
package com.bridgelabz.oops.levelone;

class MovieTicket {
    
    String movieName;
    String seatNumber;
    double price;

    
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    
    public void displayTicketDetails() {
        System.out.println("----- Movie Ticket Details -----");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

    
        ticket.bookTicket("Inception", "A10", 350.00);

        
        ticket.displayTicketDetails();
    }
}
=======
package com.bridgelabz.oops.levelone;

class MovieTicket {
    
    String movieName;
    String seatNumber;
    double price;

    
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    
    public void displayTicketDetails() {
        System.out.println("----- Movie Ticket Details -----");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

    
        ticket.bookTicket("Inception", "A10", 350.00);

        
        ticket.displayTicketDetails();
    }
}
>>>>>>> 2a3bf8e (first)
