package metro;
import java.util.*;

public class Metrobookingticket {
    static Scanner sc = new Scanner(System.in);
    static String username, password;
    static double balance = 0;
    static String lastTicket = "None";
    static int ticketsBooked = 0;

    public static void main(String[] args) {
        registerUser();
        if (login()) {
            showMenu();
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }
    }

    static void registerUser() {
        System.out.print("Register Username: ");
        username = sc.nextLine();
        System.out.print("Register Password: ");
        password = sc.nextLine();
    }

    static boolean login() {
        System.out.print("Login Username: ");
        String user = sc.nextLine();
        System.out.print("Login Password: ");
        String pass = sc.nextLine();
        return user.equals(username) && pass.equals(password);
    }

    static void showMenu() {
        while (true) {
            System.out.println("\n--- Metro Menu ---");
            System.out.println("1. Recharge Metro Card");
            System.out.println("2. Book Tickets");
            System.out.println("3. View Balance");
            System.out.println("4. View Last Ticket");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Clear newline

            switch (choice) {
                case 1 -> rechargeCard();
                case 2 -> bookTickets();
                case 3 -> System.out.println("Current Balance: ₹" + balance);
                case 4 -> System.out.println("Last Ticket: " + lastTicket);
                case 5 -> {
                    System.out.println("Logged out.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void rechargeCard() {
        System.out.print("Enter amount to recharge: ₹");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Recharge successful. New Balance: ₹" + balance);
    }

    static void bookTickets() {
        String[] lines = {"Red Line: L.B. Nagar - Miyapur", "Blue Line: Nagole - Raidurg", "Green Line: JBS - MGBS"};
        System.out.println("\nAvailable Lines:");
        for (int i = 0; i < lines.length; i++) {
            System.out.println((i + 1) + ". " + lines[i]);
        }

        System.out.print("Choose a line (1-3): ");
        int lineChoice = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter source station: ");
        String source = sc.nextLine();
        System.out.print("Enter destination station: ");
        String dest = sc.nextLine();
        System.out.print("Enter number of stations: ");
        int distance = sc.nextInt();
        System.out.print("How many tickets? ");
        int count = sc.nextInt();

        int fare = calculateFare(distance) * count;

        if (balance >= fare) {
            balance -= fare;
            ticketsBooked += count;
            lastTicket = source + " -> " + dest + " | Line " + lineChoice + " | Tickets: " + count + " | Fare: ₹" + fare;
            System.out.println("Booking successful. Fare: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance. Please recharge.");
        }
    }

    static int calculateFare(int stations) {
        if (stations <= 1) return 10;
        else if (stations == 2) return 15;
        else if (stations == 3) return 20;
        else if (stations == 4) return 25;
        else return 30;
    }
}