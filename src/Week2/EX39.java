import java.util.Scanner;

public class EX39 {
    private static void printStars(int amount) {
        int i = 0;

        while (i < amount){
            System.out.print("*");
            i++;
        }

        System.out.println();
    }

    private static void printSquare(int sideSize) {
        int row = 0;

        while (row < sideSize){
            printStars(sideSize);
            row++;
        }
    }

    private static void printRectangle(int width, int height) {
        int rectangleRow = 0;

        while (rectangleRow < height){
            printStars(width);
            rectangleRow++;
        }
    }

    private static void printTriangle(int size) {
        int triangleHeight  = 1;

        while (triangleHeight <= size){
            printStars(triangleHeight);
            triangleHeight++;
        }
    }


    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17,3);
        printTriangle(4);
    }

}
