import java.util.Scanner;

public class Laboratory3 {
    public static void main(String[] args) {
        
        
        // p -- principal
        // r -- rate of interest
        // t -- time period or term of loan
        // I -- interest
        // F -- maturity value
        

        Scanner input = new Scanner(System.in);
        
        float principal;

        // taking input for the interest
        System.out.print("Enter the interest(greater than 0): ");
        float interest = input.nextFloat();
        
        // taking input for the rate of unterest
        System.out.print("Enter the rate of interest(0.01% - 100%): ");
        float interestRate = input.nextFloat();
        
        // taking input for the time period
        float loanTerm;
        System.out.println("Select the type of period:");
        System.out.println("D for Day\nM for Month\nY for Year");
        char period = input.next().charAt(0);

        // will execute when user type d or D
        if ((period == 'd') || (period == 'D')) {
            System.out.print("Enter the number of day(greater than 0): ");
            loanTerm = input.nextFloat();
            principal = (interest / (interestRate * (loanTerm / 365)));
            System.out.printf("\nThe principal is Php %,.2f", principal);
        } 
        // will execute when user type m or M
        else if ((period == 'm') || (period == 'M')) {
            System.out.print("Enter the number of month(greater than 0): ");
            loanTerm = input.nextFloat();
            principal = (interest / (interestRate * (loanTerm / 12)));
            System.out.printf("\nThe principal is Php %,.2f", principal);
        } 
        // execute when user type y or Y
        else if ((period == 'y') || (period == 'Y')) {
            System.out.print("Enter the number of year(greater than 0): ");
            loanTerm = input.nextFloat();
            principal = (interest / (interestRate * loanTerm));
            System.out.printf("\nThe principal is Php %,.2f", principal);
        }
        
        input.close();
    }
}