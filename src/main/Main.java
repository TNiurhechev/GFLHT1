package main;

import animals.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run(){
        Animal[] animals = {new Cow("Maggie", 3), new PallasCat("Manulli", 7),
        new Dog("Jackson", 4), new Cat("Bobby",1), new Cheetah("Thunder", 5)};
        for(Animal a:animals) {
            System.out.print(a.getClass().getSimpleName()+" says ");
            a.voice();
            System.out.println();
        }
    }

}
