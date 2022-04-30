public class TouristTickets extends Tickets {
    private String hotelAddress;
    private String location;

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String location() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TouristTickets(Passenger passenger, String Pnr, String departure, String date, String time,
                          String seatNumber, boolean ticketStatus, String hotelAddress, String location) {
        super(passenger, Pnr, departure, date, time, seatNumber, ticketStatus);
        this.hotelAddress = hotelAddress;
        this.location = location;
    }

    public String selectedTouristLocation(String location) {
        return this.location = location;
    }
}
