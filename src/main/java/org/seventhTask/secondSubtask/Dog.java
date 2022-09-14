package org.seventhTask.secondSubtask;

public abstract class Dog {

    private Integer age, height, weight;
    private boolean isTired;

    public Dog(Integer age, Integer height, Integer weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void rest() {
        System.out.println("Our boy is full of energy! Let's go!");
        isTired = false;
    }

    public void setTired(boolean tired) {
        isTired = tired;
    }

    public boolean isTired() {
        return isTired;
    }

    public void givePow() {
        System.out.println("Am I a good boy?");
    }

    public Integer translateToHuman() {
        return age * 4;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
