public abstract class Customer {
    private char letter;
    private int ticketNum;
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;

    public Customer () {
        letter = 'X';
        ticketNum = 0;
    }

    public Customer (char letter) {
        if (letter == 'A') {
            a++;
            this.letter = 'A';
            ticketNum = a;
        }
        else if (letter == 'B') {
            b++;
            this.letter = 'B';
            ticketNum = b;
        }
        else if (letter == 'C') {
            c++;
            this.letter = 'C';
            ticketNum = c;
        }
        else if (letter == 'D') {
            d++;
            this.letter = 'D';
            ticketNum = d;
        }
        else {
            this.letter = 'X';
            ticketNum = 0;

            System.out.println ("Error, letter must be A, B, C, or D");
        }
    }

    protected String getTicketNumber () {
        return String.valueOf(letter) + ticketNum;
    }

    public abstract String getCustomerInfo ();

    @Override
    public String toString () {
        return getTicketNumber();
    }

}
