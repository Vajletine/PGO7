public class Main2 {
    public static void main(String[] args) {

        Animal kot = new Cat("Kitty");
        Animal pies = new Dog("Burek");


        System.out.println(kot.makeNoise());
        System.out.println(pies.makeNoise());


        ((Cat) kot).scratch();
        ((Dog) pies).fetch();
    }
}
