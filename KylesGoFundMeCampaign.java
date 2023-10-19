import java.util.Scanner;

public class KylesGoFundMeCampaign {
    private static double totalAmountRaised = 0.0;
    private static final double FUNDRAISING_THRESHOLD = 100.00;

    public static void main(String[] args) {

        // Display a welcome message and options for the user.
        System.out.println("Welcome to Kyle's GoFundMe Campaign Page!");
        System.out.println("We want to free him from the darkness of New Jersey and keep him safe in Ohio....");
        System.out.println("Protect Kyle at all costs!");
        System.out.println("****************************************************************************************");

        // Create a loop for user interaction.
        while (true) {
            System.out.println("Please Select an option: ");
            System.out.println("1) Contribute Money");
            System.out.println("2) Check status of current funds");
            System.out.println("3) I don't wish to donate to Kyle's GoFundMe, he can stay in New Jersey");
            System.out.println("4) Check Out!");

            System.out.println("****************************************************************************************");
            // Read the user's choice.
            System.out.print("Enter your Choice: ");
            Scanner userInput = new Scanner(System.in);
            int choice = userInput.nextInt();

            // Process user's choice with if statements.
            if (choice == 1) {
                System.out.print("Enter the amount you would like to contribute: ");
                double contribution = userInput.nextDouble();
                if (contribution == 0) {
                    System.out.println("Invalid amount!");
                } else {
                    totalAmountRaised += contribution;
                    System.out.println("Kyle appreciates your contribution!");
                    System.out.println("****************************************************************************************");
                }
            } else if (choice == 2) {
                System.out.println("Current Funds Raised: $" + totalAmountRaised);
                System.out.println("Fundraising Threshold: $" + FUNDRAISING_THRESHOLD);
            } else if (choice == 3) {
                System.out.println("We hope you suffer now for not donating to Kyle's Fund....");
            } else if (choice == 4) {
                // Implement code to exit the program gracefully.
                System.out.println("Thank you for using Kyle's GoFundMe Campaign!");
                userInput.close(); // Close the Scanner before exiting.
                System.exit(0); // Terminate the program.
            } else {
                System.out.println("Invalid Choice!");
            }
            if (totalAmountRaised >= FUNDRAISING_THRESHOLD) {
                System.out.println("Enough funds have been raised to help Kyle move!");
            }
        }
    }
}
