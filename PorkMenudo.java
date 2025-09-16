import java.util.Scanner;

public class PorkMenudo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 10000.00;
        int choice = 0;

        do {
            System.out.println("\n===== Menudo Express =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            String userInput = input.nextLine();

            try {
                choice = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number from 1 to 4.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    while (true) {
                        System.out.print("Withdraw amount: ");
                        String withdrawInput = input.nextLine();

                        try {
                            double amount = Double.parseDouble(withdrawInput);

                            if (amount <= 0) {
                                System.out.println("Amount must be more than 0.");
                            } else if (amount > balance) {
                                System.out.println("Not enough balance.");
                            } else {
                                balance -= amount;
                                System.out.println("Withdrawn: " + amount);
                                System.out.println("New balance: " + balance);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Enter a valid number.");
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.print("Deposit amount: ");
                        String depositInput = input.nextLine();

                        try {
                            double amount = Double.parseDouble(depositInput);

                            if (amount <= 0) {
                                System.out.println("Amount must be more than 0.");
                            } else {
                                balance += amount;
                                System.out.println("Deposited: " + amount);
                                System.out.println("New balance: " + balance);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Enter a valid number.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    System.out.println("Have great day!");
                    break;

                default:
                    System.out.println("Choice must be between 1 and 4.");
            }

        } while (choice != 4);

        input.close();
    }
}
