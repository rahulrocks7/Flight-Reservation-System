public class ClientCode {
    public static void main(String[] args) {
        Tickets regularTicket = new RegularTickets(null, "12343", "Pune to satara", "11 Dec 2021",
                "10:12 am", "5W", false, "Customer Service, Food, Water",
                "Dry Foods, Vegetable", "Mineral, Purifier", "Wafers");

        Tickets touristTickets = new TouristTickets(null, "45353", "Delhi to Pune", "1 jan 2021",
                "11:23 pm", "8A", true, "Hayat Hotel, Vimannagar", "Pune");

        printTicketDetails(regularTicket);
        printTicketDetails(touristTickets);
    }
    public static void printTicketDetails(Tickets tickets){
            System.out.println(tickets.getPnr());
        }
}