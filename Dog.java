public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " szczeka.";
    }

    public void fetch() {
        System.out.println(getName() + " przynosi patyk.");
    }
}
