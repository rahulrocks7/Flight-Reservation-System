public abstract class Tickets {
    private static int ticketCounter;
    private Passenger passenger;
    private Flights flights;
    private String Pnr;
    private String departure;
    private String date;
    private String time;
    private String seatNumber;
    private boolean ticketStatus;

    public Tickets(Passenger passenger, String Pnr, String departure, String date, String time, String seatNumber, boolean ticketStatus) {
        this.passenger = passenger;
        this.Pnr = Pnr;
        this.departure = departure;
        this.date = date;
        this.time = time;
        this.seatNumber = seatNumber;
        this.ticketStatus = ticketStatus;
    }


    public static int getTicketCounter() {
        return ticketCounter;
    }

    public static void setTicketCounter(int ticketCounter) {
        Tickets.ticketCounter = ticketCounter;
    }


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flights getFlights() {
        return flights;
    }

    public void setFlights(Flights flights) {
        this.flights = flights;
    }

    public String getPnr() {
        return Pnr;
    }

    public void setPNR(String Pnr) {
        this.Pnr = Pnr;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }


    public String getTicketDetails() {
        return this.Pnr + ", " + this.seatNumber + ", " + this.date + ", " + this.time + ", " + this.ticketStatus;
    }

    public boolean checkStatus() {
        if (!ticketStatus) {
            return false;
        }
        else return true;
    }



}
