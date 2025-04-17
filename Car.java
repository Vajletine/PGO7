class Car extends Vehile {
    private int numberOfSeats;
    private String brand;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        this.brand = brand;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void start() {
        System.out.println("Wkładam kluczyk do stacyjki...");
        System.out.println("Silnik samochodu marki " + brand + " został uruchomiony.");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuję samochód i wyłączam silnik...");
        System.out.println("Samochód marki " + brand + " został zatrzymany.");
    }
}