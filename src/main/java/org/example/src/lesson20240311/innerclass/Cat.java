package org.example.src.lesson20240311.innerclass;

public class Cat {

    private String name;

//    private List<Kitten> kittens;

    public Cat(String name) {
        this.name = name;
    }

    public class Kitten {

        private String kittenName;

        public Kitten(String kittenName) {
            this.kittenName = kittenName;
        }

        @Override
        public String toString() {
            return "Kitten{" +
                    "kittenName='" + kittenName + '\'' +
                    '}' + " Mother name: " + name;
        }
    }

}
