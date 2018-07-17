import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //zad. 13
        Scanner scan = new Scanner(System.in);
        int number;


        do {
            System.out.println("Podaj liczbę:");
            number = scan.nextInt();
            if (number < 100) {
                System.out.println("Twoja liczba jest za mała.");

            } else if (number > 200) {
                System.out.println("Twoja liczba jest za duża.");

            } else if (number % 3 != 0) {
                System.out.println("Twoja liczba nie jest podzielna przez 3.");
            }

        } while (number < 100 || number > 200 || number % 3 != 0);

        System.out.println("Twoja liczba jest ok.");
    }
}