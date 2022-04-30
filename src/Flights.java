import java.awt.*;

public class Flights {
   private String flightNumber;
   private String airline;
   private int capacity;
   private int bookedSeatNumber;

    public Flights(String flightNumber, String airline, int capacity, int bookedSeatNumber) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeatNumber = bookedSeatNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeatNumber() {
        return bookedSeatNumber;
    }

    public void setBookedSeatNumber(int bookedSeatNumber) {
        this.bookedSeatNumber = bookedSeatNumber;
    }

    public String flightDetails(){
        return "Flight No: " + flightNumber + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeatNumber;
    }

    public boolean isAvailable(){
        return bookedSeatNumber <= capacity;
    }

    public void updateSeatBooked(){
        bookedSeatNumber = bookedSeatNumber + 1;
    }
    public String getFlightDetails(){
        return "Flight No: " + flightNumber + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeatNumber;
    }
}
