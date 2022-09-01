package animals;

public class Cheetah extends Cat{
    public Cheetah(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" Grrr!");
    }
}
