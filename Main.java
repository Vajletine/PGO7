public class Main {
    public static void main(String[] args) {
        Car mojSamochod = new Car(5);

        mojSamochod.start();
        mojSamochod.stop();

        System.out.println("Liczba miejsc: " + mojSamochod.getNumberOfSeats());
    }
}
