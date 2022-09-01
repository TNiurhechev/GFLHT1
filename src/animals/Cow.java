package animals;

public class Cow extends Animal{
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.print("Moo!");
    }
}
