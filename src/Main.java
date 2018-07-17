public class Main {
    public static void main(String[] args) {

        //zad. 8
        String[] names = {"Jan", "Anna", "Adam"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        //zad. 9
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
        }
        System.out.println("Suma nieparzystych pozycji: "+sum);

        //zad. 10
        double i = 0;
        while (i < 3.1) {// dla i<=3 nie wyświetla się 3
            System.out.printf("%.1f ", i);
            i += 0.1;
        }

        System.out.println();
        i = 0;
        do {
            System.out.printf("%.1f ", i);
            i += 0.1;
        } while (i < 3.1);

    }
}
