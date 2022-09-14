package org.seventhTask.thirdSubtask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShopTest {

    Integer price, height, width, weight, capacity;
    FurnitureShop furnitureShop = new FurnitureShop();

    @Before
    public void setUp() {
        price = 20000;
        height = 150;
        width = 50;
        weight = 30;
        capacity = 4;
        furnitureShop.getTables().add(new Table(price, height, width, weight, capacity));
        furnitureShop.getChairs().add(new Chair(price, height, width, weight));
    }

    @Test
    public void testChair() {
        Assert.assertTrue("The chair should be comfortable", furnitureShop.getChairs().get(0).isComfortable());
    }

    @Test
    public void testTable() {
        Assert.assertFalse("The table's capacity shouldn't be enough", furnitureShop.getTables().get(0).isEnough(5));
    }
}
