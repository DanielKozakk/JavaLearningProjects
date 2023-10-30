package archive.Animals;

public class Cat extends Feline{
    @Override
    public void makeNoise() {
        System.out.println("MEOW!");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
