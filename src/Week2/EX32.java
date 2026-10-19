import java.util.Scanner;

public class EX32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int limit = Integer.parseInt(reader.nextLine());

        int count = 1;
        int sum = 0;
        String formula = "";

        while(count <= limit){
            sum += count;

            if (count == 1){
                formula += count;
            } else {
                formula += "+" + count;
            }

            count++;
        }

        System.out.println("Sum is " + sum);
    }
}