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
        RectangleValues rectangleValues = RectangleWarehouse.getInstance().get(rectangle.getId());
        if (rectangleValues != null){
            rectangleValues.setPerimeter(2 * (rectangle.getSideA() + rectangle.getSideB()));
            rectangleValues.setSquare(rectangle.getSideA() * rectangle.getSideB());
        }

        RectangleWarehouse.getInstance().put(rectangle.getId(), rectangleValues);
    }


}
