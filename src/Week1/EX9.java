package Week1;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number.");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number.");
        int number2 = Integer.parseInt(reader.nextLine());

        int result = number1 / number2;

        System.out.println("Division:" + number1 + "/" + number2 + "=" + result);

    }
}
    