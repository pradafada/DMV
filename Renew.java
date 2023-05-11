public class Renew extends Customer {
    private String name;

    public Renew (String newName) {
        super('B');
        name = newName;
    }

    @Override
    public String getCustomerInfo() {
        return "Renewal License. Ticket Number: " +getTicketNumber()+ ". Name: " +name;
    }
}
