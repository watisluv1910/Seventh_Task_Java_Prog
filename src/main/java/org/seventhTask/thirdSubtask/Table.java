package org.seventhTask.thirdSubtask;

public class Table extends Furniture {

    private Integer capacity;

    public Table(Integer price, Integer height, Integer width, Integer weight, Integer capacity) {
        super(price, height, width, weight);
        this.capacity = capacity;
    }

    public boolean isEnough(Integer neededCapacity) {
        return neededCapacity <= capacity;
    }

    @Override
    public String toString() {
        return "Table{" +
                "capacity=" + capacity +
                '}';
    }
}
