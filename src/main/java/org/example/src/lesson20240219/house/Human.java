package org.example.src.lesson20240219.house;

public class Human extends Creature {

    public Human(String name) {
        super(name);
    }

    public void feedAnimal(Animal animal) {
        animal.feed();
    }

    public void feedAnimal(Animal... animals) {
        for (Animal a : animals) {
            a.feed();
        }
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm human. My name is" + getName());
    }

    public void walk(Animal animal) {
        System.out.println("Human " + getName() + " walks with " + animal.getName());
        animal.setHungry(true);
    }
}
