
//package prelim;

//import java.util.Scanner;

//import java.util.Random;

//public class Practice1 {

   // public static void main(String[] args) {

       // Scanner in = new Scanner(System.in);
        //Random rand = new Random();

        //System.out.println("GUESS THE RANDOM NUMBER GAME IN JAVA");

       // System.out.println("CAN YOU GUESS THE MAGIC NUMBER? (1-100)");

        //int randomInt = rand.nextInt(100) + 1;
        //int myGuessedNumber = 0;
        //int attemptGuess = 0;

          //System.out.println("Input a number: ");
         // int myGuesedNumber = in.nextInt();
          
          
       // if(myGuessedNumber > randomInt){
      // System.out.println("Too high, try again");
      //  } else if  (myGuessedNumber < randomInt) {
         //   System.out.println("Too low, try again");  
      //  } else {
    //System.out.println("Congratulations, you guessed the right number");

              
                
                      
            
           //do {
      

       // } while (myGuessedNumber > randomInt);
       // System.out.println("Too high, try again");

       // {
          //  do {
           //     System.out.println("Input a number: ");
           //     int myGuesedNumber = in.nextInt();
           // } while (myGuessedNumber < randomInt);
           // System.out.println("Too low, try again");

   
        
    //            } 
                
                
                

          
        
        
        
  //  }
//}
import java.util.Scanner;
import java.util.Random;

public class Practice1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Randomizer Game!");
        System.out.println("Guess the number between 1 and 100.");
        
        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        
        while (true) {
            System.out.print("Enter your guess: ");
            int guess;
            
            // Check if the input is a valid number
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;
                
                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts.");
                    break;
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        scanner.close();
    }
}
