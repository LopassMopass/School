package Animals;

import java.util.ArrayList;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    ArrayList<Animal> animal = new ArrayList<>();

    @Override
    public String toString() {
        return "Animals[" + animal + ']';
    }
}
