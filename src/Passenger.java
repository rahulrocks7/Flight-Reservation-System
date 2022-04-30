public class Passenger {
    private static int ticketCounter;
    private int ticketId;

    public static int getTicketCounter() {
        return ticketCounter;
    }

    public static void setTicketCounter(int ticketCounter) {
        Passenger.ticketCounter = ticketCounter;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    private static class Contact{
        String name, phoneNumber, emailId;

        public Contact(String name, String phoneNumber, String emailId) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }
    }
    private Contact contact;
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    static{
        ticketCounter = 0;
    }

    public Passenger(String contactName, String contactPhoneNumber, String contactEmailId, String addressStreet, String addressCity,
                     String addressState) {

        this.ticketId = ++ticketCounter;
        this.contact = new Contact(contactName,contactPhoneNumber,contactEmailId);
        this.address = new Address(addressStreet, addressCity, addressCity);
    }
    public int getPassengerCount(){
        return ticketCounter;
    }
    public int getTicketId(){
        return this.ticketId;
    }

    public String getContactDetails(){
        return contact.name + ", " + contact.phoneNumber + ", " + contact.emailId;
    }

    public String getAddressDetails(){
        return  address.street + ", " + address.city + ", " +address.state;
    }
}
