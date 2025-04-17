public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " miauczy.";
    }

    public void scratch() {
        System.out.println(getName() + " drapie.");
    }
}
