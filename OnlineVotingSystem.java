import java.util.Scanner;

public class OnlineVotingSystem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        int party1Votes = 0;
        int party2Votes = 0;
	int party3Votes = 0;

        //For person name
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();

        //To check the age of candidate
        System.out.print("Please enter your age: ");
        int userAge = input.nextInt();

        // To check whether the candidate is eligible to vote or not 
        if (userAge >= 18) {
            // Present the user with a list of candidates to vote for
            System.out.println("Please select a candidate to vote for:");
            System.out.println("1. Party 1");
            System.out.println("2. Party 2");
	    System.out.println("3. Party 3");

            // Get the user's selection
            int userSelection = input.nextInt();

            // Increment the vote count for the selected candidate
            if (userSelection == 1) {
                party1Votes++;
            } else if (userSelection == 2) {
                party2Votes++;
            }else if (userSelection == 3) {
                party3Votes++;
            }


            
            System.out.println("Thank you for voting, " + userName + "!");
        } else {
           
            System.out.println("I'm sorry, you are not eligible to vote.");
        }

        // Display the final vote count
        System.out.println("Party 1: " + party1Votes + " votes");
        System.out.println("party 2: " + party2Votes + " votes");
	System.out.println("party 3: " + party3Votes + " votes");
    }
}