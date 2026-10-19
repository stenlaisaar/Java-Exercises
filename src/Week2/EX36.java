import java.util.Scanner;

public class EX36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers:");
        while (true){
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }
        }

        int sum = 0;

        System.out.println("Thank you and see you later!");
    }
}