package org.seventhTask.secondSubtask;

public class Alabai extends Dog {

    public Alabai(Integer age, Integer height, Integer weight) {
        super(age, height, weight);
    }

    public void graze() {
        System.out.println("Our boy did a great work last night! He must take a rest!");
        setTired(true);
    }
}
