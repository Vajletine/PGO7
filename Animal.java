public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeNoise() {
        return getName() + " wydaje jakiś dźwięk.";
    }

    public void move() {
        System.out.println(name + " porusza się.");
    }
}
