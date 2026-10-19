import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Type the password:");
            String command = reader.nextLine();
            if (command.equals("qwerty")) {
                break;
            } else {
                System.out.println("Wrong");
            }
        }

        System.out.println("Right");
    }
}