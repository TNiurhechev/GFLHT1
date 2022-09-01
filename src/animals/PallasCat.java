package animals;

public class PallasCat extends Cat{
    public PallasCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" Purr!");
    }
}
