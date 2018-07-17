public class Parzyste {
    public static void main(String[] args) {
        //zad. 12

        int i =0;
        int suma = 0;

        while(i<=100){
            System.out.println(i);
            i+=2;
            suma+=i;
        }

        System.out.println("Suma liczb parzystych: "+ suma);
    }
}
