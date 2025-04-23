public class Main2 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ":");
            System.out.println(" - makeNoise(): " + animal.makeNoise());
            System.out.println(" - roam(): " + animal.roam());
            System.out.println();
        }
    }
}
