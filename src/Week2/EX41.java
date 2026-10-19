import java.util.Scanner;
import java.util.Random;

public class EX41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int target = drawNumber();
        int guesses = 0;
        System.out.println("Guess a number:");

        while(true){
            int input = Integer.valueOf(reader.nextLine());
            guesses++;

            if (input < target){
                System.out.println("The number is greater, guesses made: " + guesses);
            } else if (input > target){
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else if (input == target){
                System.out.println("You guessed right");
                break;
            }
        }
    }

    public static int drawNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
