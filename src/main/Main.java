package main;

import animals.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run(){
        AnimalController[] animals = {new AnimalController(new Cow("Maggie", 3)),
                new AnimalController(new PallasCat("Manulli", 7)),
        new AnimalController(new Dog("Jackson", 4)), new AnimalController(new Cat("Bobby",1)),
                new AnimalController(new Cheetah("Thunder", 5))};
        for(AnimalController delegator:animals) {
            System.out.print(delegator.getAnimal().getClass().getSimpleName()+" says ");
            delegator.voice();
            System.out.println();
        }
    }

}
