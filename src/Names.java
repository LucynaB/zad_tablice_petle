import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        //zad. 14
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];



        for (int i = 0; i < names.length; i++) {
            System.out.println("Podaj imię:");
            names[i] = scan.nextLine();
        }

        for(int i =names.length-1;i>=0;i--){
            System.out.println("Cześć "+names[i]);

        }
    }
}
