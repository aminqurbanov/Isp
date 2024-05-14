public class Main {
    public static void main(String[] args) {
        Breather breather = new Breather();

        Human man = new Human();
        breather.breathe(man);

        Animal dog = new Animal();
        breather.breathe(dog);
    }
}
