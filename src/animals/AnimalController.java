package animals;

public class AnimalController{

    private Animal animal;

    public AnimalController(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void voice() {
        animal.voice();
    }
}
