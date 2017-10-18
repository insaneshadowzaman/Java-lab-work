package com.learning.insane.vehicles;

import com.learning.insane.vehicletype.Land;

public class Car extends Land {

    public Car(int sp, boolean running) {
        super(sp, running);
    }

    public void carFunc() {
        System.out.println("\t\tCalled the car function");
    }
}
