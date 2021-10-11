import java.util.*;
public class GuessRandomNumber {
    public static void main(String[] args)
    {

        int RandomNumber, guess;

        final int MAX = 5;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        boolean correct = false;

        RandomNumber = rand.nextInt(MAX) + 1;

        while (!correct) {

            System.out.println(
                    "Guess a number between 1 and 10: ");

            guess = in.nextInt();

            if (guess > RandomNumber) {
                System.out.println("Too high, try again");
            }


            else if (guess < RandomNumber) {
                System.out.println("Too low, try again");
            }

            else {

                System.out.println("Yes,The computer generated number is: "+RandomNumber);

                correct = true;
            }
        }
        System.exit(0);
    }
}