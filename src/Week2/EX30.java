import java.util.Scanner;

public class EX30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        System.out.println("Type a number.");
        int usernumber = Integer.parseInt(reader.nextLine());

        while (number <= usernumber){
            System.out.println(number);
            number++;
        }
    }
}