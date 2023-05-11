public class Suspended extends Customer {
    private String name;
    private String violation;

    public Suspended (String newName, String offense) {
        super('D');
        name = newName;
        violation = offense;
    }

    @Override
    public String getCustomerInfo() {
        return "Violation: " +violation+ ". Ticket Number: " +getTicketNumber()+ ". Name: " +name;
    }
}
