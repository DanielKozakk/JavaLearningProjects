package archive.Animals;

public class Dog extends Canine implements Pet{
    @Override
    public void beFriendly() {
        System.out.println("hahu hauh");
    }


    @Override
    public void makeNoise() {
    System.out.println("hau hau");
    }

    @Override
    public void pee() {
        super.pee();
        System.out.println("Pee from Dog");
    }
}
