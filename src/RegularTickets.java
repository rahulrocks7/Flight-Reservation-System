public class RegularTickets extends Tickets{
    private String specialService;
    private String food;
    private String water;
    private String Snacks;

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSnacks() {
        return Snacks;
    }

    public void setSnacks(String snacks){
        Snacks = snacks;
    }

    public RegularTickets(Passenger passenger, String Pnr, String departure, String date, String time,
                          String seatNumber, boolean ticketStatus, String specialService, String food, String water,
                          String snacks) {
        super(passenger, Pnr, departure, date, time, seatNumber, ticketStatus);
        this.specialService = specialService;
        this.food = food;
        this.water = water;
        this.Snacks = snacks;
    }
}
