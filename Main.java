import java.util.*;
public class Main {
    public static void menu (ArrayList<Customer> newCustomer) {
        Scanner scan = new Scanner(System.in);

        int choice = 0;
        do {
        System.out.println ("""
                1. Take test for new license
                2. Renew existing license
                3. Move from out of state
                4. Answer citation/suspended license
                5. See current queue
                6. Quit
                """);
        choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 1:
                System.out.println ("What is your name?");
                String name = scan.nextLine();
                System.out.println ("What is your date of birth?");
                String birth = scan.nextLine();

                NewTest license = new NewTest(name, birth);
                newCustomer.add(license);
                break;

            case 2:
                System.out.println ("What is your name?");
                String name2 = scan.nextLine();

                Renew licenseR = new Renew (name2);
                newCustomer.add(licenseR);
                break;

            case 3:
                System.out.println ("What is your name?");
                String name3 = scan.nextLine();
                System.out.println ("What state did you move from?");
                String state = scan.nextLine();

                Move licenseM = new Move (name3, state);
                newCustomer.add(licenseM);
                break;

            case 4:
                System.out.println ("What is your name?");
                String name4 = scan.nextLine();
                System.out.println ("What violation did you commit?");
                String violation = scan.nextLine();

                Suspended licenseS = new Suspended (name4, violation);
                newCustomer.add(licenseS);
                break;

            case 5:
                for (int i = 0; i < newCustomer.size(); i++) {
                    System.out.println(newCustomer.get(i).getCustomerInfo());
                }
                break;
        }

        } while (choice != 6);

    }

    public static void main(String[] args) {

        ArrayList<Customer> customer = new ArrayList<Customer>();

        menu(customer);
    }
}