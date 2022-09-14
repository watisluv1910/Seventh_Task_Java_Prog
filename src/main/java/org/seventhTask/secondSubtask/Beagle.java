package org.seventhTask.secondSubtask;

public class Beagle extends Dog {

    public Beagle(Integer age, Integer height, Integer weight) {
        super(age, height, weight);
    }

    public void chase() {
        System.out.println("Our boy caught us a bunny! He is very tired!");
        setTired(true);
    }
}
