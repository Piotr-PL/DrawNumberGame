import java.util.Random;
import java.util.Scanner;

public class DrawNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int drawNumber = random.nextInt(100) + 1; //  Range 100 is from 0 to 99 so we must add '+1' to range
        System.out.println("I choose a number from 1 to 100. Can You guess what?");

        int numberFromUser;
        int numberOfAttempts = 0;

        do {
            numberOfAttempts++;
            System.out.println("Enter Your number");
            numberFromUser = scanner.nextInt();

            if (numberFromUser < drawNumber) {
                System.out.println("To small... ");
            } else if (numberFromUser > drawNumber) {
                System.out.println("To big... ");
            } else {
                System.out.println("Congratulations! You gues the number for " + numberOfAttempts  +  " attempts");
            }
        }while (drawNumber != numberFromUser);
    }
}
