public class Move extends Customer {
    private String name;
    private String state;

    public Move (String newName, String newState) {
        super('C');
        name = newName;
        state = newState;
    }
    @Override
    public String getCustomerInfo() {
        return "Moved from " +state+ ". Ticket Number: " +getTicketNumber()+ ". Name: " +name;
    }
}
