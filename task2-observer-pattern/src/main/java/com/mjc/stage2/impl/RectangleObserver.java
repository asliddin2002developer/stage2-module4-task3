package com.mjc.stage2.impl;

import com.mjc.stage2.Observable;
import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;


public class RectangleObserver implements Observer {
    // Write your code here!
    @Override
    public void handleEvent(RectangleEvent event){
        Rectangle rectangle = event.getSource();
        int id = rectangle.getId();
        double sideA = rectangle.getSideA();
        double sideB = rectangle.getSideB();

        RectangleWarehouse warehouse = RectangleWarehouse.getInstance();
        warehouse.put(id, new RectangleValues(sideA, sideB));
    }


}
