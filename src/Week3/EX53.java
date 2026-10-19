import java.util.Scanner;

public class EX53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String word = reader.nextLine();

        System.out.println("Lenght of the first part:");
        int wordlength = Integer.parseInt(reader.nextLine());

        String result = word.substring(0, wordlength);

        System.out.print("Result: " + result);

    }
}
